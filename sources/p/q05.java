package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q05 implements rua0 {
    public final /* synthetic */ byte a;

    @Override // p.rua0
    public final String a(Object obj, dqq0 dqq0Var) {
        String str;
        mbh0 mbh0Var;
        String strM;
        String strY;
        switch (this.a) {
            case 0:
                j2i1 j2i1Var = (j2i1) obj;
                if (!u890.j(j2i1Var.c, "android.resource")) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(j2i1Var);
                sb.append(':');
                Configuration configuration = dqq0Var.a.getResources().getConfiguration();
                Bitmap.Config[] configArr = aqi1.a;
                sb.append(configuration.uiMode & 48);
                return sb.toString();
            case 1:
                bvc bvcVar = (hvc) obj;
                if (bvcVar instanceof bvc) {
                    return l1d.m("avatar:", bvcVar.a);
                }
                if (bvcVar instanceof dvc) {
                    dvc dvcVar = (dvc) bvcVar;
                    String str2 = dvcVar.a;
                    if (str2 == null) {
                        str2 = "default";
                    }
                    return "placeholder:" + str2 + ":" + dvcVar.b;
                }
                if (bvcVar instanceof evc) {
                    evc evcVar = (evc) bvcVar;
                    return "qrcode:" + evcVar.a + ":" + evcVar.b;
                }
                if (bvcVar instanceof avc) {
                    avc avcVar = (avc) bvcVar;
                    int i = avcVar.a;
                    Integer num = avcVar.b;
                    float f = avcVar.c;
                    float f2 = avcVar.d;
                    int i2 = avcVar.e;
                    StringBuilder sb2 = new StringBuilder("encircled:");
                    sb2.append(i);
                    sb2.append(":");
                    sb2.append(num);
                    sb2.append(":");
                    gvg.t(sb2, f, ":", f2, ":");
                    sb2.append(i2);
                    return sb2.toString();
                }
                if (bvcVar instanceof fvc) {
                    fvc fvcVar = (fvc) bvcVar;
                    return "resource:" + fvcVar.a + ":" + fvcVar.b + ":" + fvcVar.c + ":" + fvcVar.d;
                }
                if (!(bvcVar instanceof gvc)) {
                    if (!(bvcVar instanceof cvc)) {
                        eg.o();
                        return null;
                    }
                    cvc cvcVar = (cvc) bvcVar;
                    String str3 = cvcVar.a;
                    String str4 = cvcVar.b;
                    String str5 = cvcVar.c;
                    StringBuilder sbN = gvg.n("gradient:", str3, ":", str4, ":");
                    sbN.append(str5);
                    return sbN.toString();
                }
                gvc gvcVar = (gvc) bvcVar;
                String str6 = gvcVar.a;
                String str7 = gvcVar.b;
                int i3 = gvcVar.c;
                StringBuilder sbN2 = gvg.n("uri:", str6, ":", str7, ":");
                if (i3 == 1) {
                    str = "CIRCULAR";
                } else if (i3 != 2) {
                    str = i3 != 3 ? "null" : "NONE";
                } else {
                    str = "ROUNDED_CORNER";
                }
                sbN2.append(str);
                return sbN2.toString();
            case 2:
                String str8 = ((j2i1) obj).a;
                List listK0 = z561.k0(se11.b(gbr.a, str8));
                if (listK0.size() > 1 || (mbh0Var = (mbh0) o7h.s0(listK0)) == null) {
                    return str8;
                }
                String strGroup = mbh0Var.a.group();
                k291 k291Var = dqq0Var.b;
                w4u w4uVar = k291Var.a;
                int i4 = w4uVar instanceof w4u ? w4uVar.a : 0;
                w4u w4uVar2 = k291Var.b;
                int i5 = w4uVar2 instanceof w4u ? w4uVar2.a : 0;
                if (i4 <= 0 || i5 <= 0) {
                    strM = "original";
                } else {
                    strM = ab80.m(i4 <= 1 ? 1 : Integer.highestOneBit(i4 - 1) << 1, i5 > 1 ? Integer.highestOneBit(i5 - 1) << 1 : 1, "x");
                }
                return f4i1.f(strGroup, "#", strM);
            default:
                j2i1 j2i1Var2 = (j2i1) obj;
                String str9 = j2i1Var2.c;
                if ((str9 != null && !str9.equals("file")) || j2i1Var2.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = aqi1.a;
                if ((u890.j(j2i1Var2.c, "file") && u890.j(o7h.s0(jch0.z(j2i1Var2)), "android_asset")) || !((Boolean) kto1.v(dqq0Var, cz70.c)).booleanValue() || (strY = jch0.y(j2i1Var2)) == null) {
                    return null;
                }
                i520 i520Var = dqq0Var.f;
                String str10 = s8s0.b;
                s8s0 s8s0VarF = gtv0.f(strY);
                i520Var.getClass();
                Long l = (Long) ero1.k(i520Var, s8s0VarF).g;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(j2i1Var2);
                sb3.append('-');
                sb3.append(l);
                return sb3.toString();
        }
    }
}
