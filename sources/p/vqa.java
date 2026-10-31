package p;

import android.graphics.Bitmap;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vqa extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(String str, int i, tff tffVar, ven0 ven0Var, ven0 ven0Var2) {
        super(2);
        this.a = (byte) 19;
        this.d = str;
        this.c = i;
        this.e = tffVar;
        this.b = ven0Var;
        this.f = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((f70) obj6).i((nqa) obj5, (iu30) obj4, (ksw) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                pdp1.c((aua) obj6, (iu30) obj4, (ffe1) obj5, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                pdp1.d((aua) obj6, (iu30) obj4, (ffe1) obj5, (vzq0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                w2b.i((euc1) obj6, (it8) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                ((b7b) obj6).a((String) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                ((ttb) obj6).c((btb) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                ((p2c) obj6).c((l2c) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                cev0.b((j3f1) obj6, (xpw) obj5, (g9c) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                ((vxc) obj6).c((uxc) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                ((vxc) obj6).d((zxc) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                ((j2a) obj6).d((dyc) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                ((fyc) obj6).c((eyc) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                ((a4d) obj6).g((Bitmap) obj5, (v3d) obj4, (ur80) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                ((qid) obj6).c((oid) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                zgo1.b((rb81) obj6, (u961) obj5, (s24) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                d1e.b((c380) obj6, this.c, (iu30) obj4, (iu30) obj5, (qim0) obj3, (b0k) obj, iP);
                break;
            case 16:
                ((Number) obj2).intValue();
                nko1.b((rde) obj6, (iu30) obj4, (cce) obj5, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 17:
                ((Number) obj2).intValue();
                ((fyc) obj6).d((oje) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 18:
                ((Number) obj2).intValue();
                rqo1.f(czo1.p(i | 1), (j2i) obj5, (b0k) obj, (vu30) obj6, (vu30) obj4, (qim0) obj3);
                break;
            case 19:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    tff tffVar = (tff) obj5;
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = tffVar.g.a((i8h1) tffVar.e.get(), nve.Z);
                        x340Var2.s0(objT);
                    }
                    s0f s0fVar = (s0f) objT;
                    r3s0 r3s0Var = (r3s0) ((ven0) obj4).getValue();
                    otw.c(s0fVar, new whf((String) obj6, r3s0Var != null ? r3s0Var.b : ugf.b, ((Boolean) ((tob1) obj3).getValue()).booleanValue(), true, this.c), u291.d(nim0.a, 1.0f), (ipb1) null, x340Var2, 0, 8);
                }
                break;
            case 20:
                ((Number) obj2).intValue();
                xto1.a((up71) obj6, (gw70) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 21:
                ((Number) obj2).intValue();
                ((inf) obj6).e((vmf) obj5, (Function0) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                dxo1.e((ev51) obj6, (iu30) obj4, (gw70) obj5, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                ((ulc) obj6).c((ubg) obj5, (Function0) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 24:
                ((Number) obj2).intValue();
                t2p1.b((String) obj6, (Integer) obj5, (Integer) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                c4p1.f((String) obj6, (String) obj5, (String) obj4, (sxq0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 26:
                ((Number) obj2).intValue();
                ((f70) obj6).j((s6h) obj5, (iu30) obj4, (ksw) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 27:
                ((Number) obj2).intValue();
                ((oih) obj6).h(czo1.p(i | 1), (String) obj5, (String) obj4, (b0k) obj, (qim0) obj3);
                break;
            case 28:
                ((Number) obj2).intValue();
                ((mjh) obj6).c((ljh) obj5, (o0i) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                i8p1.c((ulh) obj6, (Function0) obj5, (Function0) obj4, (j2i) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqa(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqa(byte b, int i, Object obj, Object obj2, iu30 iu30Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = iu30Var;
        this.e = obj2;
        this.f = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(aua auaVar, iu30 iu30Var, ffe1 ffe1Var, vzq0 vzq0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.d = auaVar;
        this.b = iu30Var;
        this.e = ffe1Var;
        this.f = vzq0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(ulc ulcVar, ubg ubgVar, Function0 function0, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 23;
        this.d = ulcVar;
        this.e = ubgVar;
        this.f = function0;
        this.b = iu30Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(inf infVar, vmf vmfVar, Function0 function0, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 21;
        this.d = infVar;
        this.e = vmfVar;
        this.f = function0;
        this.b = iu30Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(ulh ulhVar, Function0 function0, Function0 function1, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 29;
        this.d = ulhVar;
        this.e = function0;
        this.b = function1;
        this.f = j2iVar;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(c380 c380Var, int i, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 15;
        this.d = c380Var;
        this.c = i;
        this.b = iu30Var;
        this.e = iu30Var2;
        this.f = qim0Var;
    }
}
