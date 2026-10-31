package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ez3 implements ign0 {
    public final /* synthetic */ byte a;
    public final bpb1 b;

    public ez3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = gio1.b(Boolean.FALSE);
                break;
            case 2:
                this.b = gio1.b(Boolean.TRUE);
                break;
            case 3:
                this.b = gio1.b(Boolean.FALSE);
                break;
            default:
                this.b = gio1.b(Boolean.TRUE);
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case 2:
                this.b.m((Object) null, Boolean.TRUE);
                break;
        }
    }

    public final bpb1 e() {
        byte b = this.a;
        return this.b;
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return false;
            case 2:
                this.b.m((Object) null, Boolean.FALSE);
            case 1:
                return true;
            default:
                return false;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
