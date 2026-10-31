package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xho implements xpw {
    public final kko a;
    public final ljm0 b;
    public final ia00 c;
    public final f70 d;

    public xho(kko kkoVar, o8n o8nVar) {
        this.a = kkoVar;
        this.b = h7w.B(kfo.Q0, o8nVar, (iu30) null, new cml(this, (byte) 20), 4);
        this.c = new ia00("CurationButtonElement", cnn.e1, zho.b);
        this.d = new f70((byte) 7);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xho(kko kkoVar) {
        this(kkoVar, pyf0.a);
        fns fnsVar = igu.a;
    }
}
