package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n74 extends xjs {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ n74(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "automobile_connected";
            default:
                return "music_stream_is_active";
        }
    }

    public final boolean d() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                l0l l0lVarC = ((g0l) obj).c();
                return l0lVarC != null && l0lVarC.getType() == f0u.Z;
            default:
                return ((mw7) obj).a.isMusicActive();
        }
    }
}
