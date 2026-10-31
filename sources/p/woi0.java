package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class woi0 implements Update {
    public static final woi0 a = new woi0();

    public final Next a(Object obj, Object obj2) {
        fpi0 fpi0Var = (fpi0) obj;
        voi0 voi0Var = (voi0) obj2;
        String str = fpi0Var.a;
        if (voi0Var instanceof toi0) {
            return Next.i(fpi0.a(fpi0Var, lpi0.a), Collections.singleton(new boi0(str, ((toi0) voi0Var).a)));
        }
        if (voi0Var instanceof uoi0) {
            return si1.p(fpi0Var, ((uoi0) voi0Var).a);
        }
        boolean z = voi0Var instanceof qoi0;
        mpi0 mpi0Var = mpi0.a;
        if (z) {
            return Next.i(fpi0.a(fpi0Var, mpi0Var), Collections.singleton(new zni0(((qoi0) voi0Var).a)));
        }
        if (voi0Var.equals(roi0.a)) {
            return Next.i(fpi0.a(fpi0Var, mpi0Var), Collections.singleton(new coi0(new r521(2131956219))));
        }
        if (voi0Var.equals(poi0.a)) {
            int iOrdinal = fpi0Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return Next.a(Collections.singleton(yni0.a));
            }
            if (iOrdinal == 2) {
                return Next.i(fpi0Var, Collections.singleton(new aoi0(cfm0.i("spotify:account-management:member-details:", str, nik1.h0).a, false)));
            }
            eg.o();
            return null;
        }
        if (voi0Var.equals(soi0.a)) {
            return Next.i(fpi0.a(fpi0Var, mpi0Var), Collections.singleton(new coi0(new r521(2131959110))));
        }
        if (!(voi0Var instanceof ooi0)) {
            eg.o();
            return null;
        }
        ywf ywfVar = ((ooi0) voi0Var).a;
        if (u890.j(ywfVar, vwf.a)) {
            return Next.j();
        }
        if (u890.j(ywfVar, wwf.a)) {
            return Next.j();
        }
        if (ywfVar instanceof twf) {
            return Next.j();
        }
        if (ywfVar instanceof xwf) {
            return si1.p(fpi0Var, ((xwf) ywfVar).a);
        }
        if (u890.j(ywfVar, uwf.a)) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
