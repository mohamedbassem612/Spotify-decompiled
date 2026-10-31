package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class j331 {
    public final j331 a(Object obj) {
        if (this instanceof v231) {
            return new v231(obj);
        }
        if ((this instanceof c331) || (this instanceof i231)) {
            return this;
        }
        eg.o();
        return null;
    }
}
