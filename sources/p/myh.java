package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class myh implements lnm {
    public static final myh b = new myh(0);
    public static final myh c = new myh(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ myh(byte b2) {
        this.a = b2;
    }

    @Override // p.lnm
    public final o8n getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return o6x.a;
        }
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
