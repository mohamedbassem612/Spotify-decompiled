package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k67 implements l120 {
    public final /* synthetic */ byte a;
    public final j2i1 b;
    public final dqq0 c;

    public /* synthetic */ k67(j2i1 j2i1Var, dqq0 dqq0Var, byte b) {
        this.a = b;
        this.b = j2i1Var;
        this.c = dqq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    public final Object a(lnm lnmVar) throws XmlPullParserException, IOException {
        Integer numC0;
        String strL;
        Drawable drawable;
        byte b = this.a;
        j2i1 j2i1Var = this.b;
        dqq0 dqq0Var = this.c;
        String strL2 = null;
        switch (b) {
            case 0:
                String strY0 = o7h.y0(o7h.k0(jch0.z(j2i1Var), 1), "/", (String) null, (String) null, (iu30) null, 62);
                qka1 qka1Var = new qka1(new ff01(si1.v(dqq0Var.a.getAssets().open(strY0))), dqq0Var.f, new d67(strY0));
                if (!ihc1.y0(strY0)) {
                    String strA1 = ihc1.a1(ihc1.a1(strY0, '#'), '?');
                    String strV0 = ihc1.V0(ihc1.V0(strA1, '/', strA1), '.', "");
                    if (!ihc1.y0(strV0)) {
                        String lowerCase = strV0.toLowerCase(Locale.ROOT);
                        strL2 = (String) bsj0.a.get(lowerCase);
                        if (strL2 == null) {
                            strL2 = h1p1.l(lowerCase);
                        }
                    }
                }
                return new oka1(qka1Var, strL2, 3);
            case 1:
                String str = j2i1Var.a;
                int iW0 = ihc1.w0(str, ";base64,", 0, false, 6);
                if (iW0 == -1) {
                    bhn0.g(j2i1Var, "invalid data uri: ");
                    return null;
                }
                int iV0 = ihc1.v0(str, ':', 0, 6);
                if (iV0 == -1) {
                    bhn0.g(j2i1Var, "invalid data uri: ");
                    return null;
                }
                String strSubstring = str.substring(iV0 + 1, iW0);
                byte[] bArrA = n9a.a(n9a.e, str, iW0 + 8, 4);
                nac nacVar = new nac();
                nacVar.write(bArrA, 0, bArrA.length);
                return new oka1(jhc1.g(nacVar, dqq0Var.f), strSubstring, 2);
            case 2:
                String str2 = s8s0.b;
                String strY = jch0.y(j2i1Var);
                if (strY == null) {
                    eg.m("filePath == null");
                    return null;
                }
                s8s0 s8s0VarF = gtv0.f(strY);
                j420 j420VarF = jhc1.f(s8s0VarF, dqq0Var.f, (String) null, (lf01) null, 28);
                String strV1 = ihc1.V0(s8s0VarF.b(), '.', "");
                if (!ihc1.y0(strV1)) {
                    String lowerCase2 = strV1.toLowerCase(Locale.ROOT);
                    strL2 = (String) bsj0.a.get(lowerCase2);
                    if (strL2 == null) {
                        strL2 = h1p1.l(lowerCase2);
                    }
                }
                return new oka1(j420VarF, strL2, 3);
            case 3:
                String str3 = j2i1Var.e;
                if (str3 == null) {
                    str3 = "";
                }
                int iV1 = ihc1.v0(str3, '!', 0, 6);
                if (iV1 == -1) {
                    bhn0.g(j2i1Var, "Invalid jar:file URI: ");
                    return null;
                }
                String str4 = s8s0.b;
                s8s0 s8s0VarF2 = gtv0.f(str3.substring(0, iV1));
                s8s0 s8s0VarF3 = gtv0.f(str3.substring(iV1 + 1, str3.length()));
                j420 j420VarF2 = jhc1.f(s8s0VarF3, rrn1.D(s8s0VarF2, dqq0Var.f, new qti1((byte) 29)), (String) null, (lf01) null, 28);
                String strV2 = ihc1.V0(s8s0VarF3.b(), '.', "");
                if (!ihc1.y0(strV2)) {
                    String lowerCase3 = strV2.toLowerCase(Locale.ROOT);
                    strL2 = (String) bsj0.a.get(lowerCase3);
                    if (strL2 == null) {
                        strL2 = h1p1.l(lowerCase3);
                    }
                }
                return new oka1(j420VarF2, strL2, 3);
            default:
                String str5 = j2i1Var.d;
                if (str5 != null) {
                    if (ihc1.y0(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        String str6 = (String) o7h.C0(jch0.z(j2i1Var));
                        if (str6 == null || (numC0 = nhc1.c0(str6)) == null) {
                            bhn0.A(j2i1Var, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numC0.intValue();
                        Context context = dqq0Var.a;
                        Resources resources = str5.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str5);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string = typedValue.string.toString();
                        if (ihc1.y0(string)) {
                            strL = null;
                        } else {
                            String strA2 = ihc1.a1(ihc1.a1(string, '#'), '?');
                            String strV3 = ihc1.V0(ihc1.V0(strA2, '/', strA2), '.', "");
                            if (ihc1.y0(strV3)) {
                                strL = null;
                            } else {
                                String lowerCase4 = strV3.toLowerCase(Locale.ROOT);
                                strL = (String) bsj0.a.get(lowerCase4);
                                if (strL == null) {
                                    strL = h1p1.l(lowerCase4);
                                }
                            }
                        }
                        if (!u890.j(strL, "text/xml")) {
                            return new oka1(new qka1(new ff01(si1.v(resources.openRawResource(iIntValue, new TypedValue()))), dqq0Var.f, new fx21(str5, iIntValue)), strL, 3);
                        }
                        if (str5.equals(context.getPackageName())) {
                            drawable = zno1.p(context, iIntValue);
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = qx21.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                bhn0.f(f4i1.c(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = aqi1.a;
                        boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof zti1);
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), zno1.e(drawable, (Bitmap.Config) kto1.v(dqq0Var, dz70.b), dqq0Var.b, dqq0Var.c, dqq0Var.d == 2));
                        }
                        return new ss70(x2p1.h(drawable), z, 3);
                    }
                }
                bhn0.A(j2i1Var, "Invalid android.resource URI: ");
                return null;
        }
    }
}
