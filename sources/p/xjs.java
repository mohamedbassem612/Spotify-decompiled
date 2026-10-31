package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xjs {
    public String b() {
        return "android_auto";
    }

    public abstract boolean d();

    public final boolean equals(Object obj) {
        return (obj instanceof xjs) && u890.j(((xjs) obj).b(), b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public void a() {
    }

    public void c() {
    }
}
