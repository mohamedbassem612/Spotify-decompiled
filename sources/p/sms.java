package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sms implements flc0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ sms(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.flc0
    public final kmv0 a(kqu0 kqu0Var) {
        kmv0 kmv0Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iOrdinal = ((ak3) obj).ordinal();
                osm1 osm1Var = osm1.d;
                if (iOrdinal == 0) {
                    kmv0Var = new kmv0(osm1Var, (osm1) null, (osm1) null, 14);
                } else if (iOrdinal == 1) {
                    kmv0Var = new kmv0((osm1) null, osm1Var, (osm1) null, 13);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    kmv0Var = new kmv0((osm1) null, (osm1) null, (osm1) null, 15);
                }
                return kmv0Var;
            default:
                return kmv0.a(((flc0) obj).a(kqu0Var), 7);
        }
    }
}
