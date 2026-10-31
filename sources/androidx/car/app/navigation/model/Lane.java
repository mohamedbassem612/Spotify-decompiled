package androidx.car.app.navigation.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.e4p1;
import p.gvg;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Lane {
    private final List<LaneDirection> mDirections;

    public Lane(List<LaneDirection> list) {
        this.mDirections = e4p1.w(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lane) {
            return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
        }
        return false;
    }

    public List<LaneDirection> getDirections() {
        List<LaneDirection> list = this.mDirections;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[direction count: ");
        List<LaneDirection> list = this.mDirections;
        return gvg.j(sb, list != null ? list.size() : 0, "]");
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
