package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wjm implements vjm {
    public final Float a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public wjm(String str, Boolean bool, Float f) {
        this.a = f;
        this.b = str == null ? "" : str;
        this.c = bool != null ? bool.booleanValue() : false;
        this.d = (str == null && bool == null) ? false : true;
    }
}
