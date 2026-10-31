package p;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.car.app.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nvc {
    public static final List e = p7h.M(new String[]{"com.google.android.projection.gearhead", "com.google.android.apps.automotive.templates.host"});
    public final k a;
    public final lvc b;
    public final llm c;
    public final rf01 d;

    public nvc(k kVar, pvc pvcVar, ivc ivcVar, lvc lvcVar) {
        this.a = kVar;
        this.b = lvcVar;
        String strE = f4i1.e(kVar.getPackageName(), ".calimage");
        List listM = p7h.M(new String[]{"avatar", "gradient_v3", "placeholder", "qrcode", "encircled"});
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse("content://" + strE + "/" + ((String) it.next())));
        }
        for (String str : e) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                kVar.grantUriPermission(str, (Uri) it2.next(), 129);
            }
        }
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.c = smo1.e(flo1.l(j0d1VarB, b3s.c));
        long memoryClass = (long) (((long) ((ActivityManager) this.a.getSystemService("activity")).getMemoryClass()) * 1048576 * 0.15d);
        u9c u9cVar = new u9c(this.a);
        u9cVar.b = new idd1(new mvc((byte) 0, memoryClass));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        q05 q05Var = new q05((byte) 1);
        jd11 jd11Var = rc11.a;
        arrayList4.add(new mmr0(q05Var, jd11Var.b(hvc.class)));
        arrayList5.add(new og(ivcVar, jd11Var.b(hvc.class), (byte) 17));
        u9cVar.d = new h1i(ila0.F(arrayList2), ila0.F(arrayList3), ila0.F(arrayList4), ila0.F(arrayList5), ila0.F(arrayList6));
        ((ic10) u9cVar.e).a(dz70.f, Boolean.FALSE);
        this.d = u9cVar.d();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ParcelFileDescriptor a(Uri uri) throws IOException {
        avc cvcVar;
        String queryParameter;
        avc bvcVar;
        String queryParameter2;
        String queryParameter3;
        Integer numC0;
        avc evcVar;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        Integer numC1;
        Integer numValueOf;
        Float fB0;
        Float fB1;
        String str = (String) o7h.s0(uri.getPathSegments());
        if (str != null) {
            switch (str.hashCode()) {
                case -1405959847:
                    if (!str.equals("avatar") || (queryParameter = uri.getQueryParameter("name")) == null) {
                        cvcVar = null;
                    } else {
                        bvcVar = new bvc(queryParameter);
                        cvcVar = bvcVar;
                    }
                    break;
                case -951532658:
                    if (!str.equals("qrcode") || (queryParameter2 = uri.getQueryParameter("content")) == null || (queryParameter3 = uri.getQueryParameter("size")) == null || (numC0 = nhc1.c0(queryParameter3)) == null) {
                        cvcVar = null;
                    } else {
                        evcVar = new evc(queryParameter2, numC0.intValue());
                        cvcVar = evcVar;
                    }
                    break;
                case -676860436:
                    cvcVar = (str.equals("gradient_v3") && (queryParameter4 = uri.getQueryParameter("imageLink")) != null && (queryParameter5 = uri.getQueryParameter("backgroundHexColor")) != null) ? new cvc(queryParameter4, queryParameter5, uri.getQueryParameter("entityUri")) : null;
                    break;
                case 598246771:
                    if (!str.equals("placeholder")) {
                        cvcVar = null;
                    } else {
                        String queryParameter7 = uri.getQueryParameter("uri");
                        String queryParameter8 = uri.getQueryParameter("darkMode");
                        evcVar = new dvc(queryParameter7, queryParameter8 != null ? ihc1.d1(queryParameter8) : null);
                        cvcVar = evcVar;
                    }
                    break;
                case 1349251275:
                    if (!str.equals("encircled") || (queryParameter6 = uri.getQueryParameter("iconRes")) == null || (numC1 = nhc1.c0(queryParameter6)) == null) {
                        cvcVar = null;
                    } else {
                        int iIntValue = numC1.intValue();
                        String queryParameter9 = uri.getQueryParameter("iconColor");
                        if (queryParameter9 != null) {
                            Long lD0 = nhc1.d0(16, queryParameter9);
                            numValueOf = Integer.valueOf(lD0 != null ? (int) lD0.longValue() : 0);
                        } else {
                            numValueOf = null;
                        }
                        String queryParameter10 = uri.getQueryParameter("iconSize");
                        if (queryParameter10 == null || (fB0 = nhc1.b0(queryParameter10)) == null) {
                            cvcVar = null;
                        } else {
                            float fFloatValue = fB0.floatValue();
                            String queryParameter11 = uri.getQueryParameter("circleSize");
                            if (queryParameter11 == null || (fB1 = nhc1.b0(queryParameter11)) == null) {
                                cvcVar = null;
                            } else {
                                float fFloatValue2 = fB1.floatValue();
                                String queryParameter12 = uri.getQueryParameter("circleColor");
                                if (queryParameter12 == null) {
                                    cvcVar = null;
                                } else {
                                    Long lD1 = nhc1.d0(16, queryParameter12);
                                    bvcVar = new avc(iIntValue, numValueOf, fFloatValue, fFloatValue2, lD1 != null ? (int) lD1.longValue() : 0);
                                    cvcVar = bvcVar;
                                }
                            }
                        }
                    }
                    break;
                default:
                    cvcVar = null;
                    break;
            }
        } else {
            cvcVar = null;
        }
        ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
        if (cvcVar != null) {
            fn31.T(this.c, (o8n) null, 0, new x4c(this, cvcVar, uri, parcelFileDescriptorArrCreateReliablePipe, null, (byte) 1), 3);
            return parcelFileDescriptorArrCreateReliablePipe[0];
        }
        String strD = h4b1.d(uri, "Failed to parse URI: ");
        this.b.c(uri.toString(), strD);
        parcelFileDescriptorArrCreateReliablePipe[1].closeWithError(strD);
        return parcelFileDescriptorArrCreateReliablePipe[0];
    }
}
