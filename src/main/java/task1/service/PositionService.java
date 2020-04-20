package task1.service;

import task1.bean.Position;

import java.util.HashSet;
import java.util.Set;

public class PositionService {
    private Set<Position> positions = new HashSet<>();

    public void create(Position position) {
        positions.add(position);
    }

    public Position read(String name) {
        Position result = null;
        for (Position position: positions) {
            if (position.getName().equals(name)) {
                result = position;
            }
        }
        return result;
    }

    public void delete(Position position) {
        positions.remove(position);
    }

    public void update(Position oldPosition, Position newPosition) {
        positions.remove(oldPosition);
        positions.add(newPosition);
    }

    public Set<Position> getPositions() {
        return positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "PositionService{" +
                "positions=" + positions +
                '}';
    }
}
