package p;

import android.os.Bundle;
import com.spotify.encoremobile.facepile.FaceView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lz6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz6(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                return new kz6(mz6.d((mz6) obj3).c(((rm6) obj4).getData().a((im6) obj2)), (byte) 0);
            case 1:
                uff uffVar = (uff) obj4;
                it0 it0Var = new it0(uffVar, (ncf) obj2, (byte) 3);
                iac0 iac0Var = (iac0) obj3;
                iac0Var.getLifecycle().a(it0Var);
                return new zef(iac0Var, it0Var, uffVar);
            case 2:
                FaceView.c((FaceView) obj3, (gw70) obj4, (td10) obj2, (mww0) obj);
                return rih1Var;
            case 3:
                kex kexVar = (kex) obj;
                c380 c380Var = (c380) obj3;
                ja20 ja20Var = (ja20) obj4;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : c380Var) {
                    if (((qa20) obj5).a().a() == ja20Var) {
                        arrayList.add(obj5);
                    }
                }
                kexVar.b(arrayList.size(), apo.j(-1673449743, new cy00(arrayList, c380Var, (uny) obj2, (byte) 4), true), new ib5(arrayList, (byte) 17));
                return rih1Var;
            case 4:
                foo1.v((qtr) obj, (lo60) obj3, (vgm) obj4, (dnc) obj2);
                return rih1Var;
            case 5:
                gxc gxcVar = (gxc) obj;
                ry21 ry21Var = (ry21) obj3;
                mxc mxcVar = gxcVar.b;
                if (mxcVar.c) {
                    return null;
                }
                mxcVar.f = ry21Var.f;
                yon1.K5(mxcVar, new ozp0((wzp0) obj2, ry21Var, (byte) 6));
                return fae1.l(gxcVar, ((uf01) obj4).e, ry21Var);
            case 6:
                return new sg((ven0) obj3, (gpv0) obj4, (Bundle) obj2, (byte) 16);
            default:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, (Object) null, apo.j(-1480114363, new ec3((j2i) obj4, (byte) 11), true), 3);
                c380 c380Var2 = (c380) obj3;
                rtb0Var.e(c380Var2.size(), (iu30) null, new vse1(c380Var2, (byte) 16), apo.j(802480018, new oh50(c380Var2, (j2i) obj2, (byte) 1), true));
                return rih1Var;
        }
    }
}
