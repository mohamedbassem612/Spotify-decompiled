package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tb41 implements Runnable {
    public final /* synthetic */ vb41 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Boolean f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ String h;

    public tb41(vb41 vb41Var, String str, String str2, String str3, String str4, Boolean bool, Integer num, String str5) {
        this.a = vb41Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bool;
        this.g = num;
        this.h = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.onNext(new hb41(this.f, this.g, this.b, this.c, this.d, this.e, this.h));
    }
}
