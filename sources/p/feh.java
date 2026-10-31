package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class feh {
    public static beh b(String str) {
        return new beh(str);
    }

    public static ceh f() {
        return new ceh();
    }

    public final beh a() {
        return (beh) this;
    }

    public final boolean c() {
        return this instanceof beh;
    }

    public final boolean d() {
        return this instanceof ceh;
    }

    public Object e(yu30 yu30Var, yu30 yu30Var2) {
        return yu30Var2.apply(this);
    }
}
