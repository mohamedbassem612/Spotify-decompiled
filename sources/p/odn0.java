package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class odn0 implements rzf0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public odn0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = v8r.q(new gfn0());
                this.c = v8r.q(new gfn0());
                this.d = v8r.q(new gfn0());
                this.e = v8r.q(new gfn0());
                break;
        }
    }

    public final gfn0 a() {
        switch (this.a) {
            case 0:
                return (gfn0) this.c;
            default:
                return (gfn0) ((hrr0) this.c).getValue();
        }
    }

    public final gfn0 b() {
        switch (this.a) {
            case 0:
                return (gfn0) this.e;
            default:
                return (gfn0) ((hrr0) this.e).getValue();
        }
    }

    public final gfn0 c() {
        switch (this.a) {
            case 0:
                return (gfn0) this.d;
            default:
                return (gfn0) ((hrr0) this.d).getValue();
        }
    }

    public final gfn0 d() {
        switch (this.a) {
            case 0:
                return (gfn0) this.b;
            default:
                return (gfn0) ((hrr0) this.b).getValue();
        }
    }
}
