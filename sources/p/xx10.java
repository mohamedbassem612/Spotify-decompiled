package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface xx10 {
    String a();

    default boolean b() {
        if ((this instanceof sx10) || (this instanceof vx10) || (this instanceof wx10)) {
            return true;
        }
        if ((this instanceof tx10) || (this instanceof ux10) || (this instanceof rx10)) {
            return false;
        }
        eg.o();
        return false;
    }

    String getEventId();
}
