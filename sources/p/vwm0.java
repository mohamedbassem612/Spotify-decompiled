package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vwm0 implements d0u0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vwm0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str2 = m0u0Var.d;
                o2u0 o2u0Var = m0u0Var.a;
                return new poa((c2u0) obj2, (pjm0) obj, str2, (String) o2u0Var.d.get("endvideo_track_uri"), (String) o2u0Var.d.get("interaction_id"), (byte) 1);
            default:
                return new scj1((ymg1) ((vi11) obj2).f, new pw9((wen0) obj, (byte) 3));
        }
    }
}
