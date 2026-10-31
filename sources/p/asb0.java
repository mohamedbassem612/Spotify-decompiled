package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class asb0 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mgc b;

    public /* synthetic */ asb0(mgc mgcVar, byte b) {
        this.a = b;
        this.b = mgcVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        mgc mgcVar = this.b;
        switch (b) {
            case 0:
                return pap1.t(Integer.valueOf(mgcVar.x(((jsb0) obj).getKey())), Integer.valueOf(mgcVar.x(((jsb0) obj2).getKey())));
            case 1:
                return pap1.t(Integer.valueOf(mgcVar.x(((jsb0) obj).getKey())), Integer.valueOf(mgcVar.x(((jsb0) obj2).getKey())));
            case 2:
                return pap1.t(Integer.valueOf(mgcVar.x(((jsb0) obj2).getKey())), Integer.valueOf(mgcVar.x(((jsb0) obj).getKey())));
            default:
                return pap1.t(Integer.valueOf(mgcVar.x(((jsb0) obj2).getKey())), Integer.valueOf(mgcVar.x(((jsb0) obj).getKey())));
        }
    }
}
