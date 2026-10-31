package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kf21 implements omv0 {
    public static final kf21 b = new kf21();
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ kf21() {
    }

    public final boolean apply(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                i1z i1zVar = (i1z) obj;
                return i1zVar != null && ((str = i1zVar.b) == null || str.length() == 0);
            default:
                i1z i1zVar2 = (i1z) obj;
                if (i1zVar2 != null) {
                    Integer num = i1zVar2.r;
                    String str2 = i1zVar2.b;
                    if ((str2 != null && str2.length() != 0) || num == null || i1zVar2.q - num.intValue() < 30) {
                        return true;
                    }
                }
                return false;
        }
    }

    public kf21(jma jmaVar) {
    }
}
