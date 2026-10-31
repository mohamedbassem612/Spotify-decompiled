package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.Xml;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.player.model.Restrictions;
import com.spotify.voting.proto.v1.PostVotePageElement;
import com.spotify.voting.proto.v1.PremiumUpsell;
import com.spotify.voting.proto.v1.ShareElement;
import com.spotify.voting.proto.v1.ShareElements;
import com.spotify.voting.proto.v1.TextSectionElement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class zr7 {
    public static final Object a = new Object();
    public static b180 b;
    public static b180 c;

    public static ArrayList A(String str, h290 h290Var) {
        lye1 s271Var;
        lye1 bv50Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            PostVotePageElement postVotePageElement = (PostVotePageElement) it.next();
            int iN = postVotePageElement.n();
            int i = iN == 0 ? -1 : jyk1.a[l1d.C(iN)];
            if (i != 1) {
                if (i == 2) {
                    TextSectionElement textSectionElementO = postVotePageElement.o();
                    bv50Var = new bv50(textSectionElementO.getTitle(), textSectionElementO.getSubtitle());
                } else if (i == 3) {
                    TextSectionElement textSectionElementQ = postVotePageElement.q();
                    bv50Var = new lye1(textSectionElementQ.getTitle(), textSectionElementQ.getSubtitle());
                } else if (i != 4) {
                    s271Var = null;
                } else {
                    PremiumUpsell premiumUpsellR = postVotePageElement.r();
                    bv50Var = new vwv0(premiumUpsellR.getTitle(), premiumUpsellR.p(), premiumUpsellR.o());
                }
                s271Var = bv50Var;
            } else {
                ShareElements shareElementsP = postVotePageElement.p();
                h290<ShareElement> h290VarR = shareElementsP.r();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarR, 10));
                for (ShareElement shareElement : h290VarR) {
                    arrayList2.add(new r271(shareElement.p(), shareElement.getImageUrl(), shareElement.o(), shareElement.getTitle(), shareElement.getSubtitle(), shareElement.n()));
                }
                String strQ = shareElementsP.q();
                String strT = shareElementsP.t();
                s271Var = new s271(strQ, strT.length() == 0 ? str : strT, shareElementsP.s(), shareElementsP.p(), shareElementsP.o(), arrayList2);
            }
            pf51 pf51Var = (pf51) s271Var;
            if (pf51Var != null) {
                arrayList.add(pf51Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(d0r d0rVar, o3r o3rVar, sr7 sr7Var, onm onmVar) {
        yr7 yr7Var;
        if (onmVar instanceof yr7) {
            yr7Var = (yr7) onmVar;
            int i = yr7Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yr7Var.b = i - Integer.MIN_VALUE;
            } else {
                yr7Var = new yr7(onmVar);
            }
        } else {
            yr7Var = new yr7(onmVar);
        }
        Object objJ = yr7Var.a;
        int i2 = yr7Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, sr7Var);
            s4 s4Var = new s4(2, (lnm) null, (byte) 19);
            yr7Var.b = 1;
            objJ = b5p1.j(ay8VarF, s4Var, yr7Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (u890.j(i1rVar, j1r.a) || (i1rVar instanceof h1r)) {
            return null;
        }
        if (i1rVar instanceof i1r) {
            return (js7) i1rVar.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object C(d0r d0rVar, dc31 dc31Var, as7 as7Var, onm onmVar) throws Throwable {
        xr7 xr7Var;
        d0r d0rVar2;
        js7 js7Var;
        Throwable th;
        as7 as7Var2;
        llg m231Var;
        Throwable thA;
        llg llgVar;
        io70 io70Var;
        Object objB;
        llg llgVar2;
        js7 js7Var2;
        if (onmVar instanceof xr7) {
            xr7Var = (xr7) onmVar;
            int i = xr7Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xr7Var.g = i - Integer.MIN_VALUE;
            } else {
                xr7Var = new xr7(onmVar);
            }
        } else {
            xr7Var = new xr7(onmVar);
        }
        Object objB2 = xr7Var.f;
        int i2 = xr7Var.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB2);
            o3r o3rVar = ls7.g;
            sr7 sr7Var = as7Var.a;
            xr7Var.a = d0rVar;
            xr7Var.b = dc31Var;
            xr7Var.c = as7Var;
            xr7Var.g = 1;
            objB2 = B(d0rVar, o3rVar, sr7Var, xr7Var);
            if (objB2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            as7Var = xr7Var.c;
            dc31Var = xr7Var.b;
            d0rVar = xr7Var.a;
            hm5.M(objB2);
        } else {
            if (i2 == 2) {
                js7Var = xr7Var.d;
                as7Var2 = xr7Var.c;
                d0rVar2 = xr7Var.a;
                try {
                    hm5.M(objB2);
                    m231Var = (llg) objB2;
                } catch (Throwable th2) {
                    th = th2;
                    m231Var = new m231(th);
                }
                thA = e331.a(m231Var);
                if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                llgVar = m231Var;
                if (llgVar != null && (io70Var = js7Var.a.e) != null) {
                    String str = io70Var.b;
                    o3r o3rVar2 = ls7.g;
                    sr7 sr7Var2 = new sr7(as7Var2.a.b, str);
                    xr7Var.a = null;
                    xr7Var.b = null;
                    xr7Var.c = null;
                    xr7Var.d = null;
                    xr7Var.e = llgVar;
                    xr7Var.g = 3;
                    objB = B(d0rVar2, o3rVar2, sr7Var2, xr7Var);
                    if (objB != d9nVar) {
                        objB2 = objB;
                        llgVar2 = llgVar;
                    }
                    return d9nVar;
                }
                return bs7.a;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            llgVar2 = xr7Var.e;
            hm5.M(objB2);
        }
        js7Var2 = (js7) objB2;
        if (js7Var2 != null) {
            return new cs7(js7Var2, llgVar2);
        }
        return bs7.a;
        js7 js7Var3 = (js7) objB2;
        if (js7Var3 != null) {
            String str2 = as7Var.a.a;
            Set set = s4b1.f;
            if (!uic.g(str2, blc0.M3)) {
                return new cs7(js7Var3, null);
            }
            try {
                String str3 = as7Var.a.a;
                xr7Var.a = d0rVar;
                xr7Var.b = null;
                xr7Var.c = as7Var;
                xr7Var.d = js7Var3;
                xr7Var.g = 2;
                Object objN = dc31Var.n(str3, xr7Var);
                if (objN != d9nVar) {
                    as7 as7Var3 = as7Var;
                    d0rVar2 = d0rVar;
                    js7Var = js7Var3;
                    objB2 = objN;
                    as7Var2 = as7Var3;
                    m231Var = (llg) objB2;
                    thA = e331.a(m231Var);
                    if (thA == null) {
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    llgVar = m231Var;
                    if (llgVar != null) {
                        String str4 = io70Var.b;
                        o3r o3rVar3 = ls7.g;
                        sr7 sr7Var3 = new sr7(as7Var2.a.b, str4);
                        xr7Var.a = null;
                        xr7Var.b = null;
                        xr7Var.c = null;
                        xr7Var.d = null;
                        xr7Var.e = llgVar;
                        xr7Var.g = 3;
                        objB = B(d0rVar2, o3rVar3, sr7Var3, xr7Var);
                        if (objB != d9nVar) {
                            objB2 = objB;
                            llgVar2 = llgVar;
                            js7Var2 = (js7) objB2;
                            if (js7Var2 != null) {
                                return new cs7(js7Var2, llgVar2);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                as7 as7Var4 = as7Var;
                d0rVar2 = d0rVar;
                js7Var = js7Var3;
                th = th3;
                as7Var2 = as7Var4;
                m231Var = new m231(th);
            }
            return d9nVar;
        }
        return bs7.a;
    }

    public static final qim0 D(b0k b0kVar, qim0 qim0Var) {
        if (qim0Var.all(new u1c((byte) 10))) {
            return qim0Var;
        }
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(1219399079);
        qim0 qim0Var2 = (qim0) qim0Var.foldIn(nim0.a, new w9(x340Var, (byte) 3));
        x340Var.r(false);
        return qim0Var2;
    }

    public static final qim0 E(b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(439770924);
        qim0 qim0VarD = D(x340Var, qim0Var);
        x340Var.r(false);
        return qim0VarD;
    }

    public static h4l0 F(int i) {
        r6h1 r6h1Var = r6h1.c;
        return new h4l0(i);
    }

    public static void G(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Exception unused2) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static String H(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static final o131 I(Restrictions restrictions) {
        return new o131(!restrictions.disallowSkippingNextReasons().isEmpty(), restrictions.disallowSkippingNextReasons().size() == 1 && restrictions.disallowSkippingNextReasons().contains("mft_disallow"), !restrictions.disallowSkippingPrevReasons().isEmpty(), !restrictions.disallowPeekingNextReasons().isEmpty(), !restrictions.disallowPeekingPrevReasons().isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0526  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    public static final void a(llt lltVar, boolean z, boolean z2, float f, float f2, mic0 mic0Var, hlt hltVar, b0k b0kVar, int i) {
        int i2;
        float f3;
        boolean z3;
        Object obj;
        Function0 function0;
        vu30 vu30Var;
        llj lljVar;
        g36 g36Var;
        nl3 nl3Var;
        gra graVar;
        qim0 qim0Var;
        float f4;
        float f5;
        float f6;
        qim0 qim0Var2;
        int i3;
        Object objT;
        Object obj2;
        Object obj3;
        boolean z4;
        llt lltVar2 = lltVar;
        hlt hltVar2 = hltVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(445102630);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lltVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(mic0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (i & 2097152) == 0 ? x340Var.g(hltVar2) : x340Var.i(hltVar2) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 599187) != 599186)) {
            float f7 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp / 2.0f;
            ArrayList arrayList = lltVar2.g;
            String str = lltVar2.b;
            boolean zIsEmpty = arrayList.isEmpty();
            if (zIsEmpty) {
                x340Var.i0(-1753088627);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f3 = 12.0f;
            } else {
                x340Var.i0(-1753089752);
                x340Var.r(false);
                f3 = 0.0f;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, f3, 7);
            nl3 nl3Var2 = een.P0;
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, nl3Var2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z5) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar4);
            nko1.F(x340Var);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var2);
            qim0 qim0VarR = i1p1.r(u291.j(0.0f, f7, 1, u291.f(qim0Var3, 1.0f)));
            boolean zI = x340Var.i(lltVar2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                z3 = false;
                mlt mltVar = new mlt(lltVar2, (byte) 0);
                x340Var.s0(mltVar);
                obj = mltVar;
            } else {
                z3 = false;
                obj = objT2;
            }
            qim0 qim0VarU = lrn1.u(qim0VarR, (iu30) obj);
            gra graVar2 = een.d;
            gfh0 gfh0VarC = t1c.c(graVar2, z3);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar4, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            x340Var.i0(933252984);
            ?? r4 = 0;
            x340Var.r(false);
            h2c h2cVar = h2c.a;
            if (z) {
                x340Var.i0(933309187);
                Uri uri = Uri.parse(lltVar2.c);
                boolean zI2 = x340Var.i(lltVar2);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    mlt mltVar2 = new mlt(lltVar2, (byte) 1);
                    x340Var.s0(mltVar2);
                    obj3 = mltVar2;
                } else {
                    obj3 = objT3;
                }
                graVar = graVar2;
                qim0Var = qim0Var3;
                vu30Var = vu30Var2;
                lljVar = lljVar4;
                g36Var = g36Var2;
                nl3Var = nl3Var2;
                function0 = function1;
                ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) obj3, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 126974);
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                boolean z6 = (i4 & 57344) == 16384;
                Object objT4 = x340Var.T();
                Object obj4 = objT4;
                if (z6 || objT4 == m4cVar) {
                    jc5 jc5Var = new jc5((byte) 19, f2);
                    x340Var.s0(jc5Var);
                    obj4 = jc5Var;
                }
                qim0 qim0VarC = i541.C(qim0VarF, (iu30) obj4);
                as80 as80Var = mif1.P0;
                cbx.a.getClass();
                eso1.h(ni7VarA, isl.a, qim0VarC, (p3v) null, (zvx) null, uwr.d(), as80Var, (tl3) null, (ColorFilter) null, x340Var, 27696, 384);
                x340Var = x340Var;
                if (z2) {
                    x340Var.i0(933836528);
                    qim0 qim0VarB2 = h2cVar.b(qim0Var);
                    Float fValueOf = Float.valueOf(0.0f);
                    long j = u7h.j;
                    f4 = 1.0f;
                    z4 = false;
                    t1c.a(dug.e(qim0VarB2, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(j)), new mmr0(Float.valueOf(0.55f), new u7h(j)), new mmr0(Float.valueOf(0.75f), new u7h(u7h.b(u7h.b, 0.16f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(((vex) zex.a.e).e))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
                    x340Var.r(false);
                } else {
                    f4 = 1.0f;
                    z4 = false;
                    x340Var.i0(934397752);
                    x340Var.r(false);
                }
                x340Var.r(z4);
                r4 = z4;
            } else {
                function0 = function1;
                vu30Var = vu30Var2;
                lljVar = lljVar4;
                g36Var = g36Var2;
                nl3Var = nl3Var2;
                graVar = graVar2;
                qim0Var = qim0Var3;
                f4 = 1.0f;
                m4cVar = m4cVar;
                x340Var.i0(934405688);
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(934518094);
                x340Var.r((boolean) r4);
                f5 = 0.0f;
            } else {
                x340Var.i0(934567012);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                f5 = f + 16.0f;
                x340Var.r((boolean) r4);
            }
            if (z) {
                x340Var.i0(-939679278);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r((boolean) r4);
                f6 = 8.0f;
            } else {
                x340Var.i0(-939678772);
                x340Var.r((boolean) r4);
                f6 = 0.0f;
            }
            uwr uwrVar4 = cbx.a;
            qim0 qim0VarA = h2cVar.a(u291.f(uyn1.A(qim0Var, cbx.b(x340Var).e.b, f5, cbx.b(x340Var).e.b, f6), f4), z ? een.t : graVar);
            mbh mbhVarA2 = jbh.a(g36Var, nl3Var, x340Var, (int) r4);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar2);
            nko1.H(xos0VarM3, x340Var, lljVar3);
            x0d.q(iHashCode3, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var);
            lltVar2 = lltVar;
            x340 x340Var2 = x340Var;
            uwo1.e(lltVar2.a, (qim0) null, cbx.d(x340Var).c, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
            x340Var = x340Var2;
            if (z || ihc1.y0(str)) {
                qim0Var2 = qim0Var;
                x340Var.i0(1922655822);
                x340Var.r((boolean) r4);
            } else {
                x340Var.i0(1922400847);
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0Var2 = qim0Var;
                uwo1.e(lltVar2.b, u291.f(uyn1.B(qim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r((boolean) r4);
            }
            x340Var.r(true);
            x340Var.r(true);
            if (!z || ihc1.y0((CharSequence) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1392
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.zr7.a(p.llt, boolean, boolean, float, float, p.mic0, p.hlt, p.b0k, int):void");
        }

        public static final void b(long j, long j2, b0k b0kVar, int i) {
            llj lljVar = y580.Y;
            llj lljVar2 = y580.R0;
            llj lljVar3 = y580.N0;
            llj lljVar4 = y580.O0;
            nl3 nl3Var = een.P0;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(639337440);
            j06 j06Var = x340Var.a;
            int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cr31 cr31VarB = er31.b(4.0f);
                qim0 qim0Var = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
                cvx cvxVar2 = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), nl3Var, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = E(x340Var, qim0VarZ);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                x340Var.i0(-1428984867);
                int i3 = 0;
                while (i3 < 3) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), nl3Var, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = E(x340Var, qim0Var);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    int i4 = i2 & 126;
                    nl3 nl3Var2 = nl3Var;
                    qim0 qim0Var2 = qim0Var;
                    int i5 = i3;
                    e(j, j2, cr31VarB, u291.h(u291.v(qim0Var, 120.0f), 16.0f), x340Var, i4);
                    qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = E(x340Var, qim0VarF2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    x340Var.i0(-2125509555);
                    int i6 = 0;
                    for (int i7 = 3; i6 < i7; i7 = i7) {
                        e(j, j2, cr31VarB, u291.h(new wnb0(1.0f, true), 140.0f), x340Var, i4);
                        i6++;
                    }
                    x340Var.r(false);
                    x340Var.r(true);
                    x340Var.r(true);
                    i3 = i5 + 1;
                    qim0Var = qim0Var2;
                    nl3Var = nl3Var2;
                }
                x340Var.r(false);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new kz0(j, j2, i, (byte) 4);
            }
        }

        public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(39930214);
            int i2 = i | 6;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                qim0Var2 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = bc30.Z;
                    x340Var.s0(objT);
                }
                qim0 qim0VarX = bin.x(qim0VarD, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                uwr uwrVar = cbx.a;
                qim0 qim0VarN = anm1.N("add-account-progress-indicator", dug.f(qim0VarX, u7h.b(cbx.a(x340Var).a.c, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = E(x340Var, qim0VarN);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                xto1.e((qim0) null, 5, 0L, 0L, x340Var, 48, 13);
                x340Var.r(true);
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ns30(qim0Var2, i, (byte) 0);
            }
        }

        public static final jdn0 d() {
            return new jdn0();
        }

        public static final void e(long j, long j2, hw61 hw61Var, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(615915);
            int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16) | (x340Var.i(hw61Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                qim0 qim0VarQ = i1p1.q(qim0Var, hw61Var);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = E(x340Var, qim0VarQ);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nim0 nim0Var = nim0.a;
                t1c.a(dug.f(u291.d(nim0Var, 1.0f), j2, d4o1.a), x340Var, 0);
                t1c.a(cwl1.l0(u291.d(nim0Var, 1.0f), j, hw61Var, 12), x340Var, 0);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new p87(j, j2, hw61Var, qim0Var, i, (byte) 4);
            }
        }

        public static final void f(long j, long j2, b0k b0kVar, int i) {
            vu30 vu30Var = y580.Y;
            llj lljVar = y580.R0;
            llj lljVar2 = y580.N0;
            llj lljVar3 = y580.O0;
            fra fraVar = een.Z;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1245190968);
            j06 j06Var = x340Var.a;
            int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cr31 cr31VarB = er31.b(4.0f);
                cr31 cr31VarA = er31.a(50);
                qim0 qim0Var = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar3);
                nko1.H(xos0VarM, x340Var, lljVar2);
                x0d.q(iHashCode, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE, x340Var, vu30Var);
                x340Var.i0(1687707902);
                int i3 = 0;
                while (i3 < 4) {
                    qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
                    qim0 qim0Var2 = qim0Var;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = E(x340Var, qim0VarF2);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar3);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE2, x340Var, vu30Var);
                    x340Var.i0(-2076193396);
                    int i4 = 0;
                    for (int i5 = 2; i4 < i5; i5 = 2) {
                        e(j, j2, cr31VarB, u291.h(new wnb0(1.0f, true), 48.0f), x340Var, i2 & 126);
                        i4++;
                        qim0Var2 = qim0Var2;
                        i3 = i3;
                        vu30Var = vu30Var;
                    }
                    x340Var.r(false);
                    x340Var.r(true);
                    i3++;
                    qim0Var = qim0Var2;
                    vu30Var = vu30Var;
                }
                vu30 vu30Var2 = vu30Var;
                qim0 qim0Var3 = qim0Var;
                x340Var.r(false);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarO = ab80.o(qim0Var3, 4.0f, x340Var, qim0Var3, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var).b;
                jw31 jw31VarA2 = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = E(x340Var, qim0VarO);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                int i6 = i2 & 126;
                e(j, j2, er31.a, u291.r(qim0Var3, 40.0f), x340Var, i6);
                e(j, j2, cr31VarA, u291.h(new wnb0(1.0f, true), 40.0f), x340Var, i6);
                x340Var.r(true);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new kz0(j, j2, i, (byte) 5);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        public static final void g(ef91 ef91Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-626119316);
            int i2 = (x340Var.e(ef91Var.ordinal()) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var).a.b.a();
                long j = cbx.a(x340Var).a.c;
                int iOrdinal = ef91Var.ordinal();
                if (iOrdinal == 0) {
                    x340Var.i0(322775796);
                    x340Var.r(false);
                } else if (iOrdinal == 1) {
                    x340Var.i0(-405234758);
                    f(jA, j, x340Var, 0);
                    x340Var.r(false);
                } else if (iOrdinal == 2) {
                    x340Var.i0(322775796);
                    x340Var.r(false);
                } else {
                    if (iOrdinal != 3) {
                        throw p3d1.k(x340Var, -405235977, false);
                    }
                    x340Var.i0(-405232586);
                    b(jA, j, x340Var, 0);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dj71(ef91Var, i, (byte) 29);
            }
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0140  */
        /* JADX WARN: Code duplicated, block: B:106:0x0149 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:110:0x0158  */
        /* JADX WARN: Code duplicated, block: B:113:0x0161  */
        /* JADX WARN: Code duplicated, block: B:116:0x016b  */
        /* JADX WARN: Code duplicated, block: B:121:0x0183  */
        /* JADX WARN: Code duplicated, block: B:125:0x0190  */
        /* JADX WARN: Code duplicated, block: B:128:0x0199  */
        /* JADX WARN: Code duplicated, block: B:130:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:151:0x01f5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:152:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:153:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:155:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:158:0x0205  */
        /* JADX WARN: Code duplicated, block: B:160:0x020b  */
        /* JADX WARN: Code duplicated, block: B:161:0x020e  */
        /* JADX WARN: Code duplicated, block: B:164:0x0214  */
        /* JADX WARN: Code duplicated, block: B:166:0x0219  */
        /* JADX WARN: Code duplicated, block: B:169:0x0224  */
        /* JADX WARN: Code duplicated, block: B:172:0x0233  */
        /* JADX WARN: Code duplicated, block: B:175:0x023c  */
        /* JADX WARN: Code duplicated, block: B:176:0x023f  */
        /* JADX WARN: Code duplicated, block: B:179:0x0247  */
        /* JADX WARN: Code duplicated, block: B:180:0x0254  */
        /* JADX WARN: Code duplicated, block: B:183:0x025a  */
        /* JADX WARN: Code duplicated, block: B:184:0x0269  */
        /* JADX WARN: Code duplicated, block: B:187:0x0273  */
        /* JADX WARN: Code duplicated, block: B:188:0x028f  */
        /* JADX WARN: Code duplicated, block: B:191:0x02be  */
        /* JADX WARN: Code duplicated, block: B:193:0x02ca  */
        /* JADX WARN: Code duplicated, block: B:195:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:197:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:200:0x031b  */
        /* JADX WARN: Code duplicated, block: B:201:0x031d  */
        /* JADX WARN: Code duplicated, block: B:204:0x0326 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:205:0x0328 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:206:0x032a  */
        /* JADX WARN: Code duplicated, block: B:217:0x0387  */
        /* JADX WARN: Code duplicated, block: B:221:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:223:0x03c4  */
        /* JADX WARN: Code duplicated, block: B:224:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:227:0x03f4  */
        /* JADX WARN: Code duplicated, block: B:229:0x0406 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:232:0x040c  */
        /* JADX WARN: Code duplicated, block: B:234:0x0423  */
        /* JADX WARN: Code duplicated, block: B:236:0x0431  */
        /* JADX WARN: Code duplicated, block: B:240:0x045b  */
        /* JADX WARN: Code duplicated, block: B:242:0x0462  */
        /* JADX WARN: Code duplicated, block: B:243:0x0466  */
        /* JADX WARN: Code duplicated, block: B:246:0x0484  */
        /* JADX WARN: Code duplicated, block: B:248:0x0487  */
        /* JADX WARN: Code duplicated, block: B:251:0x0495  */
        /* JADX WARN: Code duplicated, block: B:252:0x0497  */
        /* JADX WARN: Code duplicated, block: B:255:0x049e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:256:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:259:0x04b8  */
        /* JADX WARN: Code duplicated, block: B:262:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:264:0x04d8  */
        /* JADX WARN: Code duplicated, block: B:270:0x04e5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:273:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:276:0x0520  */
        /* JADX WARN: Code duplicated, block: B:278:0x0525  */
        /* JADX WARN: Code duplicated, block: B:281:0x0537  */
        /* JADX WARN: Code duplicated, block: B:282:0x0544  */
        /* JADX WARN: Code duplicated, block: B:285:0x0551  */
        /* JADX WARN: Code duplicated, block: B:286:0x0553  */
        /* JADX WARN: Code duplicated, block: B:289:0x055a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:292:0x0560  */
        /* JADX WARN: Code duplicated, block: B:295:0x057c  */
        /* JADX WARN: Code duplicated, block: B:298:0x0586  */
        /* JADX WARN: Code duplicated, block: B:301:0x058d A[PHI: r8 r10
          0x058d: PHI (r8v31 long) = (r8v28 long), (r8v32 long) binds: [B:300:0x058b, B:296:0x0583] A[DONT_GENERATE, DONT_INLINE]
          0x058d: PHI (r10v45 float) = (r10v42 float), (r10v46 float) binds: [B:300:0x058b, B:296:0x0583] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:302:0x0590  */
        /* JADX WARN: Code duplicated, block: B:305:0x0598 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:306:0x059a  */
        /* JADX WARN: Code duplicated, block: B:309:0x05d4  */
        /* JADX WARN: Code duplicated, block: B:310:0x05d7  */
        /* JADX WARN: Code duplicated, block: B:312:0x0632  */
        /* JADX WARN: Code duplicated, block: B:314:0x0636  */
        /* JADX WARN: Code duplicated, block: B:316:0x063a  */
        /* JADX WARN: Code duplicated, block: B:319:0x0659  */
        /* JADX WARN: Code duplicated, block: B:324:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:61:0x00be  */
        /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:81:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:83:0x0102  */
        /* JADX WARN: Code duplicated, block: B:84:0x0105  */
        /* JADX WARN: Code duplicated, block: B:87:0x010b  */
        /* JADX WARN: Code duplicated, block: B:89:0x0114  */
        /* JADX WARN: Code duplicated, block: B:91:0x0119  */
        /* JADX WARN: Code duplicated, block: B:95:0x0127  */
        /* JADX WARN: Code duplicated, block: B:96:0x012d  */
        /* JADX WARN: Code duplicated, block: B:98:0x0135  */
        /* JADX WARN: Code duplicated, block: B:99:0x0138  */
        public static final void h(i2c i2cVar, vu30 vu30Var, vu30 vu30Var2, iec iecVar, boolean z, boolean z2, qim0 qim0Var, int i, float f, long j, float f2, long j2, iu30 iu30Var, iu30 iu30Var2, String str, float f3, float f4, djc0 djc0Var, b0k b0kVar, int i2, int i3) {
            int i4;
            int i5;
            float f5;
            int i6;
            long j3;
            int i7;
            int i8;
            j06 j06Var;
            j06 j06Var2;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z3;
            x340 x340Var;
            qim0 qim0Var2;
            int i16;
            iu30 iu30Var3;
            iu30 iu30Var4;
            String str2;
            float f6;
            float f7;
            djc0 djc0Var2;
            long j4;
            float f8;
            long j5;
            h311 h311VarV;
            int i17;
            qim0 qim0Var3;
            int i18;
            long j6;
            float f9;
            int i19;
            int i20;
            Object objT;
            iu30 iu30Var5;
            Object objT2;
            iu30 iu30Var6;
            float f10;
            float f11;
            float f12;
            int i21;
            iu30 iu30Var7;
            iu30 iu30Var8;
            float f13;
            float f14;
            qim0 qim0Var4;
            int i22;
            int i23;
            long j7;
            djc0 cjc0Var;
            long j8;
            boolean z4;
            vnr0 vnr0Var;
            int i24;
            vnr0 vnr0Var2;
            boolean z5;
            boolean z6;
            Object objT3;
            String str3;
            qim0 qim0Var5;
            boolean z7;
            mbh mbhVarA;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            boolean z8;
            n4k n4kVar;
            llj lljVar;
            llj lljVar2;
            float f15;
            llj lljVar3;
            llj lljVar4;
            Object objT4;
            qim0 qim0VarB;
            int i25;
            long j9;
            mbh mbhVarA2;
            int iHashCode2;
            xos0 xos0VarM2;
            qim0 qim0VarE2;
            float f16;
            boolean z9;
            Object objT5;
            Object objT6;
            byte b2;
            boolean z10;
            Object objT7;
            int i26;
            float f17;
            Object objT8;
            iu30 iu30Var9;
            boolean z11;
            Object objT9;
            float f18;
            float f19;
            long j10;
            boolean z12;
            Object objT10;
            float f20;
            boolean zG;
            Object objT11;
            boolean z13;
            int i27;
            m4c m4cVar = fkj0.X;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(1958201915);
            j06 j06Var3 = x340Var2.a;
            if ((i2 & 6) == 0) {
                i4 = (x340Var2.g(i2cVar) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= x340Var2.i(vu30Var) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= x340Var2.i(vu30Var2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= x340Var2.i(iecVar) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i4 |= x340Var2.h(z) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                i4 |= x340Var2.h(z2) ? 131072 : 65536;
            }
            int i28 = i4 | 1572864;
            int i29 = i3 & 64;
            int i30 = 4194304;
            if (i29 == 0) {
                if ((12582912 & i2) == 0) {
                    i28 |= x340Var2.e(i) ? 8388608 : 4194304;
                }
                i5 = i3 & 128;
                if (i5 != 0) {
                    i28 |= 100663296;
                    f5 = f;
                } else {
                    f5 = f;
                    if ((i2 & 100663296) == 0) {
                        if (x340Var2.d(f5)) {
                            i6 = 67108864;
                        } else {
                            i6 = 33554432;
                        }
                        i28 |= i6;
                    }
                }
                if ((i2 & 805306368) == 0) {
                    j3 = j;
                    if ((i3 & 256) == 0 || !x340Var2.f(j3)) {
                        i27 = 268435456;
                    } else {
                        i27 = 536870912;
                    }
                    i28 |= i27;
                } else {
                    j3 = j;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i8 = 6;
                } else if (x340Var2.d(f2)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                if ((i3 & 1024) == 0) {
                    j06Var = j06Var3;
                    int i31 = x340Var2.f(j2) ? 32 : 16;
                    j06Var2 = j06Var;
                    i9 = i8 | i31;
                    i10 = i9 | 3456;
                    i11 = i3 & 8192;
                    if (i11 != 0) {
                        i13 = i9 | 28032;
                    } else {
                        if (x340Var2.g(str)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i13 = i10 | i12;
                    }
                    int i32 = i13 | (((i3 & 16384) == 0 || !x340Var2.d(f3)) ? 65536 : 131072);
                    if ((i3 & 32768) == 0 || !x340Var2.d(f4)) {
                        i14 = 524288;
                    } else {
                        i14 = 1048576;
                    }
                    int i33 = i32 | i14;
                    if ((i3 & 65536) == 0 && x340Var2.g(djc0Var)) {
                        i30 = 8388608;
                    }
                    i15 = i33 | i30;
                    if ((i28 & 306783379) == 306783378 || (i15 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i28 & 1, z3)) {
                        x340Var2.d0();
                        i17 = i2 & 1;
                        qim0Var3 = nim0.a;
                        if (i17 != 0 || x340Var2.E()) {
                            if (i29 != 0) {
                                i18 = 0;
                            } else {
                                i18 = i;
                            }
                            if (i5 != 0) {
                                f5 = 1.0f;
                            }
                            j6 = 0;
                            if ((i3 & 256) != 0) {
                                i28 &= -1879048193;
                                j3 = 0;
                            }
                            if (i7 != 0) {
                                f9 = 1.0f;
                            } else {
                                f9 = f2;
                            }
                            if ((i3 & 1024) != 0) {
                                i19 = i15 & (-113);
                            } else {
                                j6 = j2;
                                i19 = i15;
                            }
                            i20 = i18;
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = nhe1.Q0;
                                x340Var2.s0(objT);
                            }
                            iu30Var5 = (iu30) objT;
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = nhe1.R0;
                                x340Var2.s0(objT2);
                            }
                            iu30Var6 = (iu30) objT2;
                            if (i11 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if ((i3 & 16384) != 0) {
                                uwr uwrVar = cbx.a;
                                cvx cvxVar = cbx.b(x340Var2).b;
                                i19 &= -458753;
                                f10 = 16.0f;
                            } else {
                                f10 = f3;
                            }
                            if ((i3 & 32768) != 0) {
                                uwr uwrVar2 = cbx.a;
                                f11 = cbx.b(x340Var2).b.b;
                                i19 &= -3670017;
                            } else {
                                f11 = f4;
                            }
                            f12 = f11;
                            if ((i3 & 65536) != 0) {
                                i21 = i20;
                                iu30Var8 = iu30Var6;
                                f13 = f10;
                                f14 = f12;
                                i22 = i19 & (-29360129);
                                i23 = i28;
                                j7 = j6;
                                iu30Var7 = iu30Var5;
                                cjc0Var = new cjc0(1);
                                qim0Var4 = qim0Var3;
                            } else {
                                i21 = i20;
                                iu30Var7 = iu30Var5;
                                iu30Var8 = iu30Var6;
                                f13 = f10;
                                f14 = f12;
                                qim0Var4 = qim0Var3;
                                i22 = i19;
                                i23 = i28;
                                j7 = j6;
                            }
                            x340Var2.s();
                            hon1.v(x340Var2);
                            j8 = j7;
                            if (((wat) x340Var2.k(t4k.h)).U0() > 1.5d) {
                                x340Var2.i0(636396904);
                                if (dhe0.a(x340Var2) != 3) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                x340Var2.r(false);
                                z4 = z13;
                            } else {
                                x340Var2.i0(-1746531219);
                                x340Var2.r(false);
                                z4 = false;
                            }
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar2 = cbx.b(x340Var2).b;
                            vnr0Var = (vnr0) vu30Var.invoke(x340Var2, Integer.valueOf((i23 >> 3) & 14));
                            i24 = i23 >> 6;
                            vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var2, Integer.valueOf(i24 & 14));
                            boolean zG2 = x340Var2.g(vnr0Var) | x340Var2.g(vnr0Var2);
                            if ((i22 & 57344) == 16384) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = zG2 | z5;
                            objT3 = x340Var2.T();
                            if (z6 || objT3 == m4cVar) {
                                if (str2 != null || ihc1.y0(str2)) {
                                    objT3 = null;
                                } else {
                                    List listM = p7h.M(new String[]{qgo1.x(vnr0Var).b, qgo1.x(vnr0Var2).b});
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = listM.iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = it;
                                        Object next = it2.next();
                                        if (!ihc1.y0((String) next)) {
                                            arrayList.add(next);
                                        }
                                        it = it2;
                                    }
                                    objT3 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
                                }
                                x340Var2.s0(objT3);
                            }
                            str3 = (String) objT3;
                            qim0 qim0VarA = i2cVar.a(qim0Var4, een.h);
                            qim0Var5 = qim0Var4;
                            z7 = z4;
                            mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
                            iHashCode = Long.hashCode(x340Var2.T);
                            xos0VarM = x340Var2.m();
                            qim0VarE = E(x340Var2, qim0VarA);
                            hzj.A.getClass();
                            if (j06Var2 == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            z8 = x340Var2.S;
                            n4kVar = hmb0.t1;
                            if (z8) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            lljVar = y580.O0;
                            nko1.H(mbhVarA, x340Var2, lljVar);
                            lljVar2 = y580.N0;
                            nko1.H(xos0VarM, x340Var2, lljVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            f15 = f9;
                            lljVar3 = y580.R0;
                            nko1.H(numValueOf, x340Var2, lljVar3);
                            nko1.F(x340Var2);
                            lljVar4 = y580.Y;
                            nko1.H(qim0VarE, x340Var2, lljVar4);
                            op71.g(x340Var2, u291.c(qim0Var3, 0.13f));
                            if (str3 != null) {
                                x340Var2.i0(-1241088744);
                                zG = x340Var2.g(str3);
                                objT11 = x340Var2.T();
                                if (zG || objT11 == m4cVar) {
                                    objT11 = new hqa1(str3, (byte) 25);
                                    x340Var2.s0(objT11);
                                }
                                qim0VarB = s161.a(qim0Var3, (iu30) objT11);
                                i25 = 0;
                                x340Var2.r(false);
                            } else {
                                iu30Var8 = iu30Var8;
                                x340Var2.i0(-1240983623);
                                objT4 = x340Var2.T();
                                if (objT4 == m4cVar) {
                                    objT4 = nhe1.S0;
                                    x340Var2.s0(objT4);
                                }
                                qim0VarB = s161.b(qim0Var3, true, (iu30) objT4);
                                i25 = 0;
                                x340Var2.r(false);
                            }
                            j9 = j3;
                            mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, i25);
                            iHashCode2 = Long.hashCode(x340Var2.T);
                            xos0VarM2 = x340Var2.m();
                            qim0VarE2 = E(x340Var2, qim0VarB);
                            if (j06Var2 == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(mbhVarA2, x340Var2, lljVar);
                            nko1.H(xos0VarM2, x340Var2, lljVar2);
                            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                            nko1.H(qim0VarE2, x340Var2, lljVar4);
                            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                            if (vnr0Var.c instanceof jor0) {
                                f16 = 0.0f;
                            } else {
                                f16 = 24.0f;
                            }
                            qim0 qim0VarZ = uyn1.z(f16, 0.0f, 2, qim0VarF);
                            if ((i23 & 234881024) == 67108864) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT5 = x340Var2.T();
                            if (z9 || objT5 == m4cVar) {
                                objT5 = new vbk0((byte) 25, f5);
                                x340Var2.s0(objT5);
                            }
                            qim0 qim0VarC = i541.C(qim0VarZ, (iu30) objT5);
                            objT6 = x340Var2.T();
                            b2 = 18;
                            if (objT6 == m4cVar) {
                                objT6 = new b1c1(iu30Var7, b2);
                                x340Var2.s0(objT6);
                            }
                            qim0 qim0VarU = lrn1.u(qim0VarC, (iu30) objT6);
                            z10 = (((i23 & 1879048192) ^ 805306368) <= 536870912 && x340Var2.f(j9)) || (i23 & 805306368) == 536870912;
                            objT7 = x340Var2.T();
                            if (!z10 || objT7 == m4cVar) {
                                i26 = 3;
                                objT7 = new vfe1((byte) 3, j9);
                                x340Var2.s0(objT7);
                            } else {
                                i26 = 3;
                            }
                            qgo1.f(vnr0Var, eqr0.B(qim0VarU, (iu30) objT7), new a0e1(i26), 0, false, (iu30) null, x340Var2, 8, 56);
                            x340Var = x340Var2;
                            if (z7) {
                                f17 = 8.0f;
                            } else {
                                f17 = f13;
                            }
                            qim0 qim0VarZ2 = uyn1.z(24.0f, 0.0f, 2, ab80.o(qim0Var3, f17, x340Var, qim0Var3, 1.0f));
                            objT8 = x340Var.T();
                            if (objT8 == m4cVar) {
                                iu30Var9 = iu30Var8;
                                objT8 = new b1c1(iu30Var9, (byte) 19);
                                x340Var.s0(objT8);
                            } else {
                                iu30Var9 = iu30Var8;
                            }
                            qim0 qim0VarU2 = lrn1.u(qim0VarZ2, (iu30) objT8);
                            if ((i22 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objT9 = x340Var.T();
                            if (!z11 || objT9 == m4cVar) {
                                f18 = f15;
                                objT9 = new vbk0((byte) 26, f18);
                                x340Var.s0(objT9);
                            } else {
                                f18 = f15;
                            }
                            qim0 qim0VarC2 = i541.C(qim0VarU2, (iu30) objT9);
                            if (((i22 & 112) ^ 48) > 32) {
                                f19 = f5;
                                j10 = j8;
                                if (x340Var.f(j10)) {
                                    z12 = true;
                                }
                                objT10 = x340Var.T();
                                if (z12 || objT10 == m4cVar) {
                                    objT10 = new vfe1((byte) 4, j10);
                                    x340Var.s0(objT10);
                                }
                                qgo1.f(vnr0Var2, eqr0.B(qim0VarC2, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                                x340Var.r(true);
                                if (z7) {
                                    f20 = 8.0f;
                                } else {
                                    f20 = f14;
                                }
                                op71.g(x340Var, u291.h(qim0Var3, f20));
                                int i34 = i21;
                                djc0 djc0Var3 = cjc0Var;
                                don1.i(iecVar, i34, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var3, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                                x0d.s(qim0Var3, 16.0f, x340Var, true);
                                djc0Var2 = djc0Var3;
                                f7 = f14;
                                qim0Var2 = qim0Var5;
                                f6 = f13;
                                iu30Var4 = iu30Var9;
                                long j11 = j10;
                                i16 = i34;
                                f5 = f19;
                                j4 = j9;
                                f8 = f18;
                                iu30Var3 = iu30Var7;
                                j5 = j11;
                            } else {
                                f19 = f5;
                                j10 = j8;
                            }
                            if ((i22 & 48) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objT10 = x340Var.T();
                            if (z12) {
                                objT10 = new vfe1((byte) 4, j10);
                                x340Var.s0(objT10);
                            } else {
                                objT10 = new vfe1((byte) 4, j10);
                                x340Var.s0(objT10);
                            }
                            qgo1.f(vnr0Var2, eqr0.B(qim0VarC2, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                            x340Var.r(true);
                            if (z7) {
                                f20 = 8.0f;
                            } else {
                                f20 = f14;
                            }
                            op71.g(x340Var, u291.h(qim0Var3, f20));
                            int i35 = i21;
                            djc0 djc0Var4 = cjc0Var;
                            don1.i(iecVar, i35, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var4, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                            x0d.s(qim0Var3, 16.0f, x340Var, true);
                            djc0Var2 = djc0Var4;
                            f7 = f14;
                            qim0Var2 = qim0Var5;
                            f6 = f13;
                            iu30Var4 = iu30Var9;
                            long j12 = j10;
                            i16 = i35;
                            f5 = f19;
                            j4 = j9;
                            f8 = f18;
                            iu30Var3 = iu30Var7;
                            j5 = j12;
                        } else {
                            x340Var2.b0();
                            if ((i3 & 256) != 0) {
                                i28 &= -1879048193;
                            }
                            int i36 = (i3 & 1024) != 0 ? i15 & (-113) : i15;
                            if ((i3 & 16384) != 0) {
                                i36 &= -458753;
                            }
                            if ((i3 & 32768) != 0) {
                                i36 &= -3670017;
                            }
                            if ((i3 & 65536) != 0) {
                                i36 &= -29360129;
                            }
                            f9 = f2;
                            j7 = j2;
                            iu30Var7 = iu30Var;
                            iu30Var8 = iu30Var2;
                            str2 = str;
                            f13 = f3;
                            f14 = f4;
                            i22 = i36;
                            i23 = i28;
                            qim0Var4 = qim0Var;
                            i21 = i;
                        }
                        cjc0Var = djc0Var;
                        x340Var2.s();
                        hon1.v(x340Var2);
                        j8 = j7;
                        if (((wat) x340Var2.k(t4k.h)).U0() > 1.5d) {
                            x340Var2.i0(636396904);
                            if (dhe0.a(x340Var2) != 3) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            x340Var2.r(false);
                            z4 = z13;
                        } else {
                            x340Var2.i0(-1746531219);
                            x340Var2.r(false);
                            z4 = false;
                        }
                        uwr uwrVar4 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        vnr0Var = (vnr0) vu30Var.invoke(x340Var2, Integer.valueOf((i23 >> 3) & 14));
                        i24 = i23 >> 6;
                        vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var2, Integer.valueOf(i24 & 14));
                        boolean zG3 = x340Var2.g(vnr0Var) | x340Var2.g(vnr0Var2);
                        if ((i22 & 57344) == 16384) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zG3 | z5;
                        objT3 = x340Var2.T();
                        if (z6) {
                            if (str2 != null) {
                                objT3 = null;
                            } else {
                                objT3 = null;
                            }
                            x340Var2.s0(objT3);
                        } else {
                            if (str2 != null) {
                                objT3 = null;
                            } else {
                                objT3 = null;
                            }
                            x340Var2.s0(objT3);
                        }
                        str3 = (String) objT3;
                        qim0 qim0VarA2 = i2cVar.a(qim0Var4, een.h);
                        qim0Var5 = qim0Var4;
                        z7 = z4;
                        mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
                        iHashCode = Long.hashCode(x340Var2.T);
                        xos0VarM = x340Var2.m();
                        qim0VarE = E(x340Var2, qim0VarA2);
                        hzj.A.getClass();
                        if (j06Var2 == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        z8 = x340Var2.S;
                        n4kVar = hmb0.t1;
                        if (z8) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        lljVar = y580.O0;
                        nko1.H(mbhVarA, x340Var2, lljVar);
                        lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var2, lljVar2);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        f15 = f9;
                        lljVar3 = y580.R0;
                        nko1.H(numValueOf2, x340Var2, lljVar3);
                        nko1.F(x340Var2);
                        lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var2, lljVar4);
                        op71.g(x340Var2, u291.c(qim0Var3, 0.13f));
                        if (str3 != null) {
                            x340Var2.i0(-1241088744);
                            zG = x340Var2.g(str3);
                            objT11 = x340Var2.T();
                            if (zG) {
                                objT11 = new hqa1(str3, (byte) 25);
                                x340Var2.s0(objT11);
                            } else {
                                objT11 = new hqa1(str3, (byte) 25);
                                x340Var2.s0(objT11);
                            }
                            qim0VarB = s161.a(qim0Var3, (iu30) objT11);
                            i25 = 0;
                            x340Var2.r(false);
                        } else {
                            iu30Var8 = iu30Var8;
                            x340Var2.i0(-1240983623);
                            objT4 = x340Var2.T();
                            if (objT4 == m4cVar) {
                                objT4 = nhe1.S0;
                                x340Var2.s0(objT4);
                            }
                            qim0VarB = s161.b(qim0Var3, true, (iu30) objT4);
                            i25 = 0;
                            x340Var2.r(false);
                        }
                        j9 = j3;
                        mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, i25);
                        iHashCode2 = Long.hashCode(x340Var2.T);
                        xos0VarM2 = x340Var2.m();
                        qim0VarE2 = E(x340Var2, qim0VarB);
                        if (j06Var2 == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(mbhVarA2, x340Var2, lljVar);
                        nko1.H(xos0VarM2, x340Var2, lljVar2);
                        x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE2, x340Var2, lljVar4);
                        qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                        if (vnr0Var.c instanceof jor0) {
                            f16 = 0.0f;
                        } else {
                            f16 = 24.0f;
                        }
                        qim0 qim0VarZ3 = uyn1.z(f16, 0.0f, 2, qim0VarF2);
                        if ((i23 & 234881024) == 67108864) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT5 = x340Var2.T();
                        if (z9) {
                            objT5 = new vbk0((byte) 25, f5);
                            x340Var2.s0(objT5);
                        } else {
                            objT5 = new vbk0((byte) 25, f5);
                            x340Var2.s0(objT5);
                        }
                        qim0 qim0VarC3 = i541.C(qim0VarZ3, (iu30) objT5);
                        objT6 = x340Var2.T();
                        b2 = 18;
                        if (objT6 == m4cVar) {
                            objT6 = new b1c1(iu30Var7, b2);
                            x340Var2.s0(objT6);
                        }
                        qim0 qim0VarU3 = lrn1.u(qim0VarC3, (iu30) objT6);
                        if (((i23 & 1879048192) ^ 805306368) <= 536870912) {
                        }
                        objT7 = x340Var2.T();
                        if (z10) {
                            i26 = 3;
                            objT7 = new vfe1((byte) 3, j9);
                            x340Var2.s0(objT7);
                        } else {
                            i26 = 3;
                            objT7 = new vfe1((byte) 3, j9);
                            x340Var2.s0(objT7);
                        }
                        qgo1.f(vnr0Var, eqr0.B(qim0VarU3, (iu30) objT7), new a0e1(i26), 0, false, (iu30) null, x340Var2, 8, 56);
                        x340Var = x340Var2;
                        if (z7) {
                            f17 = 8.0f;
                        } else {
                            f17 = f13;
                        }
                        qim0 qim0VarZ4 = uyn1.z(24.0f, 0.0f, 2, ab80.o(qim0Var3, f17, x340Var, qim0Var3, 1.0f));
                        objT8 = x340Var.T();
                        if (objT8 == m4cVar) {
                            iu30Var9 = iu30Var8;
                            objT8 = new b1c1(iu30Var9, (byte) 19);
                            x340Var.s0(objT8);
                        } else {
                            iu30Var9 = iu30Var8;
                        }
                        qim0 qim0VarU4 = lrn1.u(qim0VarZ4, (iu30) objT8);
                        if ((i22 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objT9 = x340Var.T();
                        if (z11) {
                            f18 = f15;
                            objT9 = new vbk0((byte) 26, f18);
                            x340Var.s0(objT9);
                        } else {
                            f18 = f15;
                            objT9 = new vbk0((byte) 26, f18);
                            x340Var.s0(objT9);
                        }
                        qim0 qim0VarC4 = i541.C(qim0VarU4, (iu30) objT9);
                        if (((i22 & 112) ^ 48) > 32) {
                            f19 = f5;
                            j10 = j8;
                            if (x340Var.f(j10)) {
                                z12 = true;
                            }
                            objT10 = x340Var.T();
                            if (z12) {
                                objT10 = new vfe1((byte) 4, j10);
                                x340Var.s0(objT10);
                            } else {
                                objT10 = new vfe1((byte) 4, j10);
                                x340Var.s0(objT10);
                            }
                            qgo1.f(vnr0Var2, eqr0.B(qim0VarC4, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                            x340Var.r(true);
                            if (z7) {
                                f20 = 8.0f;
                            } else {
                                f20 = f14;
                            }
                            op71.g(x340Var, u291.h(qim0Var3, f20));
                            int i37 = i21;
                            djc0 djc0Var5 = cjc0Var;
                            don1.i(iecVar, i37, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var5, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                            x0d.s(qim0Var3, 16.0f, x340Var, true);
                            djc0Var2 = djc0Var5;
                            f7 = f14;
                            qim0Var2 = qim0Var5;
                            f6 = f13;
                            iu30Var4 = iu30Var9;
                            long j13 = j10;
                            i16 = i37;
                            f5 = f19;
                            j4 = j9;
                            f8 = f18;
                            iu30Var3 = iu30Var7;
                            j5 = j13;
                        } else {
                            f19 = f5;
                            j10 = j8;
                        }
                        if ((i22 & 48) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objT10 = x340Var.T();
                        if (z12) {
                            objT10 = new vfe1((byte) 4, j10);
                            x340Var.s0(objT10);
                        } else {
                            objT10 = new vfe1((byte) 4, j10);
                            x340Var.s0(objT10);
                        }
                        qgo1.f(vnr0Var2, eqr0.B(qim0VarC4, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                        x340Var.r(true);
                        if (z7) {
                            f20 = 8.0f;
                        } else {
                            f20 = f14;
                        }
                        op71.g(x340Var, u291.h(qim0Var3, f20));
                        int i38 = i21;
                        djc0 djc0Var6 = cjc0Var;
                        don1.i(iecVar, i38, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var6, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                        x0d.s(qim0Var3, 16.0f, x340Var, true);
                        djc0Var2 = djc0Var6;
                        f7 = f14;
                        qim0Var2 = qim0Var5;
                        f6 = f13;
                        iu30Var4 = iu30Var9;
                        long j14 = j10;
                        i16 = i38;
                        f5 = f19;
                        j4 = j9;
                        f8 = f18;
                        iu30Var3 = iu30Var7;
                        j5 = j14;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        i16 = i;
                        iu30Var3 = iu30Var;
                        iu30Var4 = iu30Var2;
                        str2 = str;
                        f6 = f3;
                        f7 = f4;
                        djc0Var2 = djc0Var;
                        j4 = j3;
                        f8 = f2;
                        j5 = j2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new nye1(i2cVar, vu30Var, vu30Var2, iecVar, z, z2, qim0Var2, i16, f5, j4, f8, j5, iu30Var3, iu30Var4, str2, f6, f7, djc0Var2, i2, i3);
                    }
                }
                j06Var = j06Var3;
                j06Var2 = j06Var;
                i9 = i8 | i31;
                i10 = i9 | 3456;
                i11 = i3 & 8192;
                if (i11 != 0) {
                    i13 = i9 | 28032;
                } else {
                    if (x340Var2.g(str)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i13 = i10 | i12;
                }
                int i39 = i13 | (((i3 & 16384) == 0 || !x340Var2.d(f3)) ? 65536 : 131072);
                if ((i3 & 32768) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                int i310 = i39 | i14;
                if ((i3 & 65536) == 0) {
                    i30 = 8388608;
                }
                i15 = i310 | i30;
                if ((i28 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i28 & 1, z3)) {
                    x340Var2.d0();
                    i17 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i17 != 0) {
                        if (i29 != 0) {
                            i18 = 0;
                        } else {
                            i18 = i;
                        }
                        if (i5 != 0) {
                            f5 = 1.0f;
                        }
                        j6 = 0;
                        if ((i3 & 256) != 0) {
                            i28 &= -1879048193;
                            j3 = 0;
                        }
                        if (i7 != 0) {
                            f9 = 1.0f;
                        } else {
                            f9 = f2;
                        }
                        if ((i3 & 1024) != 0) {
                            i19 = i15 & (-113);
                        } else {
                            j6 = j2;
                            i19 = i15;
                        }
                        i20 = i18;
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = nhe1.Q0;
                            x340Var2.s0(objT);
                        }
                        iu30Var5 = (iu30) objT;
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = nhe1.R0;
                            x340Var2.s0(objT2);
                        }
                        iu30Var6 = (iu30) objT2;
                        if (i11 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if ((i3 & 16384) != 0) {
                            uwr uwrVar5 = cbx.a;
                            cvx cvxVar4 = cbx.b(x340Var2).b;
                            i19 &= -458753;
                            f10 = 16.0f;
                        } else {
                            f10 = f3;
                        }
                        if ((i3 & 32768) != 0) {
                            uwr uwrVar6 = cbx.a;
                            f11 = cbx.b(x340Var2).b.b;
                            i19 &= -3670017;
                        } else {
                            f11 = f4;
                        }
                        f12 = f11;
                        if ((i3 & 65536) != 0) {
                            i21 = i20;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            i22 = i19 & (-29360129);
                            i23 = i28;
                            j7 = j6;
                            iu30Var7 = iu30Var5;
                            cjc0Var = new cjc0(1);
                            qim0Var4 = qim0Var3;
                        } else {
                            i21 = i20;
                            iu30Var7 = iu30Var5;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            qim0Var4 = qim0Var3;
                            i22 = i19;
                            i23 = i28;
                            j7 = j6;
                            cjc0Var = djc0Var;
                        }
                    } else {
                        if (i29 != 0) {
                            i18 = 0;
                        } else {
                            i18 = i;
                        }
                        if (i5 != 0) {
                            f5 = 1.0f;
                        }
                        j6 = 0;
                        if ((i3 & 256) != 0) {
                            i28 &= -1879048193;
                            j3 = 0;
                        }
                        if (i7 != 0) {
                            f9 = 1.0f;
                        } else {
                            f9 = f2;
                        }
                        if ((i3 & 1024) != 0) {
                            i19 = i15 & (-113);
                        } else {
                            j6 = j2;
                            i19 = i15;
                        }
                        i20 = i18;
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = nhe1.Q0;
                            x340Var2.s0(objT);
                        }
                        iu30Var5 = (iu30) objT;
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = nhe1.R0;
                            x340Var2.s0(objT2);
                        }
                        iu30Var6 = (iu30) objT2;
                        if (i11 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if ((i3 & 16384) != 0) {
                            uwr uwrVar7 = cbx.a;
                            cvx cvxVar5 = cbx.b(x340Var2).b;
                            i19 &= -458753;
                            f10 = 16.0f;
                        } else {
                            f10 = f3;
                        }
                        if ((i3 & 32768) != 0) {
                            uwr uwrVar8 = cbx.a;
                            f11 = cbx.b(x340Var2).b.b;
                            i19 &= -3670017;
                        } else {
                            f11 = f4;
                        }
                        f12 = f11;
                        if ((i3 & 65536) != 0) {
                            i21 = i20;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            i22 = i19 & (-29360129);
                            i23 = i28;
                            j7 = j6;
                            iu30Var7 = iu30Var5;
                            cjc0Var = new cjc0(1);
                            qim0Var4 = qim0Var3;
                        } else {
                            i21 = i20;
                            iu30Var7 = iu30Var5;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            qim0Var4 = qim0Var3;
                            i22 = i19;
                            i23 = i28;
                            j7 = j6;
                            cjc0Var = djc0Var;
                        }
                    }
                    x340Var2.s();
                    hon1.v(x340Var2);
                    j8 = j7;
                    if (((wat) x340Var2.k(t4k.h)).U0() > 1.5d) {
                        x340Var2.i0(636396904);
                        if (dhe0.a(x340Var2) != 3) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        x340Var2.r(false);
                        z4 = z13;
                    } else {
                        x340Var2.i0(-1746531219);
                        x340Var2.r(false);
                        z4 = false;
                    }
                    uwr uwrVar9 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var2).b;
                    vnr0Var = (vnr0) vu30Var.invoke(x340Var2, Integer.valueOf((i23 >> 3) & 14));
                    i24 = i23 >> 6;
                    vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var2, Integer.valueOf(i24 & 14));
                    boolean zG4 = x340Var2.g(vnr0Var) | x340Var2.g(vnr0Var2);
                    if ((i22 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zG4 | z5;
                    objT3 = x340Var2.T();
                    if (z6) {
                        if (str2 != null) {
                            objT3 = null;
                        } else {
                            objT3 = null;
                        }
                        x340Var2.s0(objT3);
                    } else {
                        if (str2 != null) {
                            objT3 = null;
                        } else {
                            objT3 = null;
                        }
                        x340Var2.s0(objT3);
                    }
                    str3 = (String) objT3;
                    qim0 qim0VarA3 = i2cVar.a(qim0Var4, een.h);
                    qim0Var5 = qim0Var4;
                    z7 = z4;
                    mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = E(x340Var2, qim0VarA3);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    z8 = x340Var2.S;
                    n4kVar = hmb0.t1;
                    if (z8) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf3 = Integer.valueOf(iHashCode);
                    f15 = f9;
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf3, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    op71.g(x340Var2, u291.c(qim0Var3, 0.13f));
                    if (str3 != null) {
                        x340Var2.i0(-1241088744);
                        zG = x340Var2.g(str3);
                        objT11 = x340Var2.T();
                        if (zG) {
                            objT11 = new hqa1(str3, (byte) 25);
                            x340Var2.s0(objT11);
                        } else {
                            objT11 = new hqa1(str3, (byte) 25);
                            x340Var2.s0(objT11);
                        }
                        qim0VarB = s161.a(qim0Var3, (iu30) objT11);
                        i25 = 0;
                        x340Var2.r(false);
                    } else {
                        iu30Var8 = iu30Var8;
                        x340Var2.i0(-1240983623);
                        objT4 = x340Var2.T();
                        if (objT4 == m4cVar) {
                            objT4 = nhe1.S0;
                            x340Var2.s0(objT4);
                        }
                        qim0VarB = s161.b(qim0Var3, true, (iu30) objT4);
                        i25 = 0;
                        x340Var2.r(false);
                    }
                    j9 = j3;
                    mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, i25);
                    iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0VarM2 = x340Var2.m();
                    qim0VarE2 = E(x340Var2, qim0VarB);
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                    if (vnr0Var.c instanceof jor0) {
                        f16 = 0.0f;
                    } else {
                        f16 = 24.0f;
                    }
                    qim0 qim0VarZ5 = uyn1.z(f16, 0.0f, 2, qim0VarF3);
                    if ((i23 & 234881024) == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT5 = x340Var2.T();
                    if (z9) {
                        objT5 = new vbk0((byte) 25, f5);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = new vbk0((byte) 25, f5);
                        x340Var2.s0(objT5);
                    }
                    qim0 qim0VarC5 = i541.C(qim0VarZ5, (iu30) objT5);
                    objT6 = x340Var2.T();
                    b2 = 18;
                    if (objT6 == m4cVar) {
                        objT6 = new b1c1(iu30Var7, b2);
                        x340Var2.s0(objT6);
                    }
                    qim0 qim0VarU5 = lrn1.u(qim0VarC5, (iu30) objT6);
                    if (((i23 & 1879048192) ^ 805306368) <= 536870912) {
                    }
                    objT7 = x340Var2.T();
                    if (z10) {
                        i26 = 3;
                        objT7 = new vfe1((byte) 3, j9);
                        x340Var2.s0(objT7);
                    } else {
                        i26 = 3;
                        objT7 = new vfe1((byte) 3, j9);
                        x340Var2.s0(objT7);
                    }
                    qgo1.f(vnr0Var, eqr0.B(qim0VarU5, (iu30) objT7), new a0e1(i26), 0, false, (iu30) null, x340Var2, 8, 56);
                    x340Var = x340Var2;
                    if (z7) {
                        f17 = 8.0f;
                    } else {
                        f17 = f13;
                    }
                    qim0 qim0VarZ6 = uyn1.z(24.0f, 0.0f, 2, ab80.o(qim0Var3, f17, x340Var, qim0Var3, 1.0f));
                    objT8 = x340Var.T();
                    if (objT8 == m4cVar) {
                        iu30Var9 = iu30Var8;
                        objT8 = new b1c1(iu30Var9, (byte) 19);
                        x340Var.s0(objT8);
                    } else {
                        iu30Var9 = iu30Var8;
                    }
                    qim0 qim0VarU6 = lrn1.u(qim0VarZ6, (iu30) objT8);
                    if ((i22 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objT9 = x340Var.T();
                    if (z11) {
                        f18 = f15;
                        objT9 = new vbk0((byte) 26, f18);
                        x340Var.s0(objT9);
                    } else {
                        f18 = f15;
                        objT9 = new vbk0((byte) 26, f18);
                        x340Var.s0(objT9);
                    }
                    qim0 qim0VarC6 = i541.C(qim0VarU6, (iu30) objT9);
                    if (((i22 & 112) ^ 48) > 32) {
                        f19 = f5;
                        j10 = j8;
                        if (x340Var.f(j10)) {
                            z12 = true;
                        }
                        objT10 = x340Var.T();
                        if (z12) {
                            objT10 = new vfe1((byte) 4, j10);
                            x340Var.s0(objT10);
                        } else {
                            objT10 = new vfe1((byte) 4, j10);
                            x340Var.s0(objT10);
                        }
                        qgo1.f(vnr0Var2, eqr0.B(qim0VarC6, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                        x340Var.r(true);
                        if (z7) {
                            f20 = 8.0f;
                        } else {
                            f20 = f14;
                        }
                        op71.g(x340Var, u291.h(qim0Var3, f20));
                        int i311 = i21;
                        djc0 djc0Var7 = cjc0Var;
                        don1.i(iecVar, i311, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var7, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                        x0d.s(qim0Var3, 16.0f, x340Var, true);
                        djc0Var2 = djc0Var7;
                        f7 = f14;
                        qim0Var2 = qim0Var5;
                        f6 = f13;
                        iu30Var4 = iu30Var9;
                        long j15 = j10;
                        i16 = i311;
                        f5 = f19;
                        j4 = j9;
                        f8 = f18;
                        iu30Var3 = iu30Var7;
                        j5 = j15;
                    } else {
                        f19 = f5;
                        j10 = j8;
                    }
                    if ((i22 & 48) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objT10 = x340Var.T();
                    if (z12) {
                        objT10 = new vfe1((byte) 4, j10);
                        x340Var.s0(objT10);
                    } else {
                        objT10 = new vfe1((byte) 4, j10);
                        x340Var.s0(objT10);
                    }
                    qgo1.f(vnr0Var2, eqr0.B(qim0VarC6, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                    x340Var.r(true);
                    if (z7) {
                        f20 = 8.0f;
                    } else {
                        f20 = f14;
                    }
                    op71.g(x340Var, u291.h(qim0Var3, f20));
                    int i312 = i21;
                    djc0 djc0Var8 = cjc0Var;
                    don1.i(iecVar, i312, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var8, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                    x0d.s(qim0Var3, 16.0f, x340Var, true);
                    djc0Var2 = djc0Var8;
                    f7 = f14;
                    qim0Var2 = qim0Var5;
                    f6 = f13;
                    iu30Var4 = iu30Var9;
                    long j16 = j10;
                    i16 = i312;
                    f5 = f19;
                    j4 = j9;
                    f8 = f18;
                    iu30Var3 = iu30Var7;
                    j5 = j16;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    i16 = i;
                    iu30Var3 = iu30Var;
                    iu30Var4 = iu30Var2;
                    str2 = str;
                    f6 = f3;
                    f7 = f4;
                    djc0Var2 = djc0Var;
                    j4 = j3;
                    f8 = f2;
                    j5 = j2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new nye1(i2cVar, vu30Var, vu30Var2, iecVar, z, z2, qim0Var2, i16, f5, j4, f8, j5, iu30Var3, iu30Var4, str2, f6, f7, djc0Var2, i2, i3);
                }
            }
            i28 = i4 | 14155776;
            i5 = i3 & 128;
            if (i5 != 0) {
                i28 |= 100663296;
                f5 = f;
            } else {
                f5 = f;
                if ((i2 & 100663296) == 0) {
                    if (x340Var2.d(f5)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i28 |= i6;
                }
            }
            if ((i2 & 805306368) == 0) {
                j3 = j;
                if ((i3 & 256) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i28 |= i27;
            } else {
                j3 = j;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                i8 = 6;
            } else if (x340Var2.d(f2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            if ((i3 & 1024) == 0) {
                j06Var = j06Var3;
                if (x340Var2.f(j2)) {
                }
                j06Var2 = j06Var;
                i9 = i8 | i31;
                i10 = i9 | 3456;
                i11 = i3 & 8192;
                if (i11 != 0) {
                    i13 = i9 | 28032;
                } else {
                    if (x340Var2.g(str)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i13 = i10 | i12;
                }
                int i313 = i13 | (((i3 & 16384) == 0 || !x340Var2.d(f3)) ? 65536 : 131072);
                if ((i3 & 32768) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                int i314 = i313 | i14;
                if ((i3 & 65536) == 0) {
                    i30 = 8388608;
                }
                i15 = i314 | i30;
                if ((i28 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i28 & 1, z3)) {
                    x340Var2.d0();
                    i17 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i17 != 0) {
                        if (i29 != 0) {
                            i18 = 0;
                        } else {
                            i18 = i;
                        }
                        if (i5 != 0) {
                            f5 = 1.0f;
                        }
                        j6 = 0;
                        if ((i3 & 256) != 0) {
                            i28 &= -1879048193;
                            j3 = 0;
                        }
                        if (i7 != 0) {
                            f9 = 1.0f;
                        } else {
                            f9 = f2;
                        }
                        if ((i3 & 1024) != 0) {
                            i19 = i15 & (-113);
                        } else {
                            j6 = j2;
                            i19 = i15;
                        }
                        i20 = i18;
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = nhe1.Q0;
                            x340Var2.s0(objT);
                        }
                        iu30Var5 = (iu30) objT;
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = nhe1.R0;
                            x340Var2.s0(objT2);
                        }
                        iu30Var6 = (iu30) objT2;
                        if (i11 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if ((i3 & 16384) != 0) {
                            uwr uwrVar10 = cbx.a;
                            cvx cvxVar7 = cbx.b(x340Var2).b;
                            i19 &= -458753;
                            f10 = 16.0f;
                        } else {
                            f10 = f3;
                        }
                        if ((i3 & 32768) != 0) {
                            uwr uwrVar11 = cbx.a;
                            f11 = cbx.b(x340Var2).b.b;
                            i19 &= -3670017;
                        } else {
                            f11 = f4;
                        }
                        f12 = f11;
                        if ((i3 & 65536) != 0) {
                            i21 = i20;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            i22 = i19 & (-29360129);
                            i23 = i28;
                            j7 = j6;
                            iu30Var7 = iu30Var5;
                            cjc0Var = new cjc0(1);
                            qim0Var4 = qim0Var3;
                        } else {
                            i21 = i20;
                            iu30Var7 = iu30Var5;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            qim0Var4 = qim0Var3;
                            i22 = i19;
                            i23 = i28;
                            j7 = j6;
                            cjc0Var = djc0Var;
                        }
                    } else {
                        if (i29 != 0) {
                            i18 = 0;
                        } else {
                            i18 = i;
                        }
                        if (i5 != 0) {
                            f5 = 1.0f;
                        }
                        j6 = 0;
                        if ((i3 & 256) != 0) {
                            i28 &= -1879048193;
                            j3 = 0;
                        }
                        if (i7 != 0) {
                            f9 = 1.0f;
                        } else {
                            f9 = f2;
                        }
                        if ((i3 & 1024) != 0) {
                            i19 = i15 & (-113);
                        } else {
                            j6 = j2;
                            i19 = i15;
                        }
                        i20 = i18;
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = nhe1.Q0;
                            x340Var2.s0(objT);
                        }
                        iu30Var5 = (iu30) objT;
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = nhe1.R0;
                            x340Var2.s0(objT2);
                        }
                        iu30Var6 = (iu30) objT2;
                        if (i11 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if ((i3 & 16384) != 0) {
                            uwr uwrVar12 = cbx.a;
                            cvx cvxVar8 = cbx.b(x340Var2).b;
                            i19 &= -458753;
                            f10 = 16.0f;
                        } else {
                            f10 = f3;
                        }
                        if ((i3 & 32768) != 0) {
                            uwr uwrVar13 = cbx.a;
                            f11 = cbx.b(x340Var2).b.b;
                            i19 &= -3670017;
                        } else {
                            f11 = f4;
                        }
                        f12 = f11;
                        if ((i3 & 65536) != 0) {
                            i21 = i20;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            i22 = i19 & (-29360129);
                            i23 = i28;
                            j7 = j6;
                            iu30Var7 = iu30Var5;
                            cjc0Var = new cjc0(1);
                            qim0Var4 = qim0Var3;
                        } else {
                            i21 = i20;
                            iu30Var7 = iu30Var5;
                            iu30Var8 = iu30Var6;
                            f13 = f10;
                            f14 = f12;
                            qim0Var4 = qim0Var3;
                            i22 = i19;
                            i23 = i28;
                            j7 = j6;
                            cjc0Var = djc0Var;
                        }
                    }
                    x340Var2.s();
                    hon1.v(x340Var2);
                    j8 = j7;
                    if (((wat) x340Var2.k(t4k.h)).U0() > 1.5d) {
                        x340Var2.i0(636396904);
                        if (dhe0.a(x340Var2) != 3) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        x340Var2.r(false);
                        z4 = z13;
                    } else {
                        x340Var2.i0(-1746531219);
                        x340Var2.r(false);
                        z4 = false;
                    }
                    uwr uwrVar14 = cbx.a;
                    cvx cvxVar9 = cbx.b(x340Var2).b;
                    vnr0Var = (vnr0) vu30Var.invoke(x340Var2, Integer.valueOf((i23 >> 3) & 14));
                    i24 = i23 >> 6;
                    vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var2, Integer.valueOf(i24 & 14));
                    boolean zG5 = x340Var2.g(vnr0Var) | x340Var2.g(vnr0Var2);
                    if ((i22 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zG5 | z5;
                    objT3 = x340Var2.T();
                    if (z6) {
                        if (str2 != null) {
                            objT3 = null;
                        } else {
                            objT3 = null;
                        }
                        x340Var2.s0(objT3);
                    } else {
                        if (str2 != null) {
                            objT3 = null;
                        } else {
                            objT3 = null;
                        }
                        x340Var2.s0(objT3);
                    }
                    str3 = (String) objT3;
                    qim0 qim0VarA4 = i2cVar.a(qim0Var4, een.h);
                    qim0Var5 = qim0Var4;
                    z7 = z4;
                    mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = E(x340Var2, qim0VarA4);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    z8 = x340Var2.S;
                    n4kVar = hmb0.t1;
                    if (z8) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf4 = Integer.valueOf(iHashCode);
                    f15 = f9;
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf4, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    op71.g(x340Var2, u291.c(qim0Var3, 0.13f));
                    if (str3 != null) {
                        x340Var2.i0(-1241088744);
                        zG = x340Var2.g(str3);
                        objT11 = x340Var2.T();
                        if (zG) {
                            objT11 = new hqa1(str3, (byte) 25);
                            x340Var2.s0(objT11);
                        } else {
                            objT11 = new hqa1(str3, (byte) 25);
                            x340Var2.s0(objT11);
                        }
                        qim0VarB = s161.a(qim0Var3, (iu30) objT11);
                        i25 = 0;
                        x340Var2.r(false);
                    } else {
                        iu30Var8 = iu30Var8;
                        x340Var2.i0(-1240983623);
                        objT4 = x340Var2.T();
                        if (objT4 == m4cVar) {
                            objT4 = nhe1.S0;
                            x340Var2.s0(objT4);
                        }
                        qim0VarB = s161.b(qim0Var3, true, (iu30) objT4);
                        i25 = 0;
                        x340Var2.r(false);
                    }
                    j9 = j3;
                    mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, i25);
                    iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0VarM2 = x340Var2.m();
                    qim0VarE2 = E(x340Var2, qim0VarB);
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
                    if (vnr0Var.c instanceof jor0) {
                        f16 = 0.0f;
                    } else {
                        f16 = 24.0f;
                    }
                    qim0 qim0VarZ7 = uyn1.z(f16, 0.0f, 2, qim0VarF4);
                    if ((i23 & 234881024) == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT5 = x340Var2.T();
                    if (z9) {
                        objT5 = new vbk0((byte) 25, f5);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = new vbk0((byte) 25, f5);
                        x340Var2.s0(objT5);
                    }
                    qim0 qim0VarC7 = i541.C(qim0VarZ7, (iu30) objT5);
                    objT6 = x340Var2.T();
                    b2 = 18;
                    if (objT6 == m4cVar) {
                        objT6 = new b1c1(iu30Var7, b2);
                        x340Var2.s0(objT6);
                    }
                    qim0 qim0VarU7 = lrn1.u(qim0VarC7, (iu30) objT6);
                    if (((i23 & 1879048192) ^ 805306368) <= 536870912) {
                    }
                    objT7 = x340Var2.T();
                    if (z10) {
                        i26 = 3;
                        objT7 = new vfe1((byte) 3, j9);
                        x340Var2.s0(objT7);
                    } else {
                        i26 = 3;
                        objT7 = new vfe1((byte) 3, j9);
                        x340Var2.s0(objT7);
                    }
                    qgo1.f(vnr0Var, eqr0.B(qim0VarU7, (iu30) objT7), new a0e1(i26), 0, false, (iu30) null, x340Var2, 8, 56);
                    x340Var = x340Var2;
                    if (z7) {
                        f17 = 8.0f;
                    } else {
                        f17 = f13;
                    }
                    qim0 qim0VarZ8 = uyn1.z(24.0f, 0.0f, 2, ab80.o(qim0Var3, f17, x340Var, qim0Var3, 1.0f));
                    objT8 = x340Var.T();
                    if (objT8 == m4cVar) {
                        iu30Var9 = iu30Var8;
                        objT8 = new b1c1(iu30Var9, (byte) 19);
                        x340Var.s0(objT8);
                    } else {
                        iu30Var9 = iu30Var8;
                    }
                    qim0 qim0VarU8 = lrn1.u(qim0VarZ8, (iu30) objT8);
                    if ((i22 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objT9 = x340Var.T();
                    if (z11) {
                        f18 = f15;
                        objT9 = new vbk0((byte) 26, f18);
                        x340Var.s0(objT9);
                    } else {
                        f18 = f15;
                        objT9 = new vbk0((byte) 26, f18);
                        x340Var.s0(objT9);
                    }
                    qim0 qim0VarC8 = i541.C(qim0VarU8, (iu30) objT9);
                    if (((i22 & 112) ^ 48) > 32) {
                        f19 = f5;
                        j10 = j8;
                        if (x340Var.f(j10)) {
                            z12 = true;
                        }
                        objT10 = x340Var.T();
                        if (z12) {
                            objT10 = new vfe1((byte) 4, j10);
                            x340Var.s0(objT10);
                        } else {
                            objT10 = new vfe1((byte) 4, j10);
                            x340Var.s0(objT10);
                        }
                        qgo1.f(vnr0Var2, eqr0.B(qim0VarC8, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                        x340Var.r(true);
                        if (z7) {
                            f20 = 8.0f;
                        } else {
                            f20 = f14;
                        }
                        op71.g(x340Var, u291.h(qim0Var3, f20));
                        int i315 = i21;
                        djc0 djc0Var9 = cjc0Var;
                        don1.i(iecVar, i315, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var9, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                        x0d.s(qim0Var3, 16.0f, x340Var, true);
                        djc0Var2 = djc0Var9;
                        f7 = f14;
                        qim0Var2 = qim0Var5;
                        f6 = f13;
                        iu30Var4 = iu30Var9;
                        long j17 = j10;
                        i16 = i315;
                        f5 = f19;
                        j4 = j9;
                        f8 = f18;
                        iu30Var3 = iu30Var7;
                        j5 = j17;
                    } else {
                        f19 = f5;
                        j10 = j8;
                    }
                    if ((i22 & 48) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objT10 = x340Var.T();
                    if (z12) {
                        objT10 = new vfe1((byte) 4, j10);
                        x340Var.s0(objT10);
                    } else {
                        objT10 = new vfe1((byte) 4, j10);
                        x340Var.s0(objT10);
                    }
                    qgo1.f(vnr0Var2, eqr0.B(qim0VarC8, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                    x340Var.r(true);
                    if (z7) {
                        f20 = 8.0f;
                    } else {
                        f20 = f14;
                    }
                    op71.g(x340Var, u291.h(qim0Var3, f20));
                    int i316 = i21;
                    djc0 djc0Var10 = cjc0Var;
                    don1.i(iecVar, i316, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var10, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                    x0d.s(qim0Var3, 16.0f, x340Var, true);
                    djc0Var2 = djc0Var10;
                    f7 = f14;
                    qim0Var2 = qim0Var5;
                    f6 = f13;
                    iu30Var4 = iu30Var9;
                    long j18 = j10;
                    i16 = i316;
                    f5 = f19;
                    j4 = j9;
                    f8 = f18;
                    iu30Var3 = iu30Var7;
                    j5 = j18;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    i16 = i;
                    iu30Var3 = iu30Var;
                    iu30Var4 = iu30Var2;
                    str2 = str;
                    f6 = f3;
                    f7 = f4;
                    djc0Var2 = djc0Var;
                    j4 = j3;
                    f8 = f2;
                    j5 = j2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new nye1(i2cVar, vu30Var, vu30Var2, iecVar, z, z2, qim0Var2, i16, f5, j4, f8, j5, iu30Var3, iu30Var4, str2, f6, f7, djc0Var2, i2, i3);
                }
            }
            j06Var = j06Var3;
            j06Var2 = j06Var;
            i9 = i8 | i31;
            i10 = i9 | 3456;
            i11 = i3 & 8192;
            if (i11 != 0) {
                i13 = i9 | 28032;
            } else {
                if (x340Var2.g(str)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i13 = i10 | i12;
            }
            int i317 = i13 | (((i3 & 16384) == 0 || !x340Var2.d(f3)) ? 65536 : 131072);
            if ((i3 & 32768) == 0) {
                i14 = 524288;
            } else {
                i14 = 524288;
            }
            int i318 = i317 | i14;
            if ((i3 & 65536) == 0) {
                i30 = 8388608;
            }
            i15 = i318 | i30;
            if ((i28 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var2.Y(i28 & 1, z3)) {
                x340Var2.d0();
                i17 = i2 & 1;
                qim0Var3 = nim0.a;
                if (i17 != 0) {
                    if (i29 != 0) {
                        i18 = 0;
                    } else {
                        i18 = i;
                    }
                    if (i5 != 0) {
                        f5 = 1.0f;
                    }
                    j6 = 0;
                    if ((i3 & 256) != 0) {
                        i28 &= -1879048193;
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        f9 = 1.0f;
                    } else {
                        f9 = f2;
                    }
                    if ((i3 & 1024) != 0) {
                        i19 = i15 & (-113);
                    } else {
                        j6 = j2;
                        i19 = i15;
                    }
                    i20 = i18;
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = nhe1.Q0;
                        x340Var2.s0(objT);
                    }
                    iu30Var5 = (iu30) objT;
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = nhe1.R0;
                        x340Var2.s0(objT2);
                    }
                    iu30Var6 = (iu30) objT2;
                    if (i11 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if ((i3 & 16384) != 0) {
                        uwr uwrVar15 = cbx.a;
                        cvx cvxVar10 = cbx.b(x340Var2).b;
                        i19 &= -458753;
                        f10 = 16.0f;
                    } else {
                        f10 = f3;
                    }
                    if ((i3 & 32768) != 0) {
                        uwr uwrVar16 = cbx.a;
                        f11 = cbx.b(x340Var2).b.b;
                        i19 &= -3670017;
                    } else {
                        f11 = f4;
                    }
                    f12 = f11;
                    if ((i3 & 65536) != 0) {
                        i21 = i20;
                        iu30Var8 = iu30Var6;
                        f13 = f10;
                        f14 = f12;
                        i22 = i19 & (-29360129);
                        i23 = i28;
                        j7 = j6;
                        iu30Var7 = iu30Var5;
                        cjc0Var = new cjc0(1);
                        qim0Var4 = qim0Var3;
                    } else {
                        i21 = i20;
                        iu30Var7 = iu30Var5;
                        iu30Var8 = iu30Var6;
                        f13 = f10;
                        f14 = f12;
                        qim0Var4 = qim0Var3;
                        i22 = i19;
                        i23 = i28;
                        j7 = j6;
                        cjc0Var = djc0Var;
                    }
                } else {
                    if (i29 != 0) {
                        i18 = 0;
                    } else {
                        i18 = i;
                    }
                    if (i5 != 0) {
                        f5 = 1.0f;
                    }
                    j6 = 0;
                    if ((i3 & 256) != 0) {
                        i28 &= -1879048193;
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        f9 = 1.0f;
                    } else {
                        f9 = f2;
                    }
                    if ((i3 & 1024) != 0) {
                        i19 = i15 & (-113);
                    } else {
                        j6 = j2;
                        i19 = i15;
                    }
                    i20 = i18;
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = nhe1.Q0;
                        x340Var2.s0(objT);
                    }
                    iu30Var5 = (iu30) objT;
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = nhe1.R0;
                        x340Var2.s0(objT2);
                    }
                    iu30Var6 = (iu30) objT2;
                    if (i11 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if ((i3 & 16384) != 0) {
                        uwr uwrVar17 = cbx.a;
                        cvx cvxVar11 = cbx.b(x340Var2).b;
                        i19 &= -458753;
                        f10 = 16.0f;
                    } else {
                        f10 = f3;
                    }
                    if ((i3 & 32768) != 0) {
                        uwr uwrVar18 = cbx.a;
                        f11 = cbx.b(x340Var2).b.b;
                        i19 &= -3670017;
                    } else {
                        f11 = f4;
                    }
                    f12 = f11;
                    if ((i3 & 65536) != 0) {
                        i21 = i20;
                        iu30Var8 = iu30Var6;
                        f13 = f10;
                        f14 = f12;
                        i22 = i19 & (-29360129);
                        i23 = i28;
                        j7 = j6;
                        iu30Var7 = iu30Var5;
                        cjc0Var = new cjc0(1);
                        qim0Var4 = qim0Var3;
                    } else {
                        i21 = i20;
                        iu30Var7 = iu30Var5;
                        iu30Var8 = iu30Var6;
                        f13 = f10;
                        f14 = f12;
                        qim0Var4 = qim0Var3;
                        i22 = i19;
                        i23 = i28;
                        j7 = j6;
                        cjc0Var = djc0Var;
                    }
                }
                x340Var2.s();
                hon1.v(x340Var2);
                j8 = j7;
                if (((wat) x340Var2.k(t4k.h)).U0() > 1.5d) {
                    x340Var2.i0(636396904);
                    if (dhe0.a(x340Var2) != 3) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    x340Var2.r(false);
                    z4 = z13;
                } else {
                    x340Var2.i0(-1746531219);
                    x340Var2.r(false);
                    z4 = false;
                }
                uwr uwrVar19 = cbx.a;
                cvx cvxVar12 = cbx.b(x340Var2).b;
                vnr0Var = (vnr0) vu30Var.invoke(x340Var2, Integer.valueOf((i23 >> 3) & 14));
                i24 = i23 >> 6;
                vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var2, Integer.valueOf(i24 & 14));
                boolean zG6 = x340Var2.g(vnr0Var) | x340Var2.g(vnr0Var2);
                if ((i22 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zG6 | z5;
                objT3 = x340Var2.T();
                if (z6) {
                    if (str2 != null) {
                        objT3 = null;
                    } else {
                        objT3 = null;
                    }
                    x340Var2.s0(objT3);
                } else {
                    if (str2 != null) {
                        objT3 = null;
                    } else {
                        objT3 = null;
                    }
                    x340Var2.s0(objT3);
                }
                str3 = (String) objT3;
                qim0 qim0VarA5 = i2cVar.a(qim0Var4, een.h);
                qim0Var5 = qim0Var4;
                z7 = z4;
                mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 54);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = E(x340Var2, qim0VarA5);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z8 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z8) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf5 = Integer.valueOf(iHashCode);
                f15 = f9;
                lljVar3 = y580.R0;
                nko1.H(numValueOf5, x340Var2, lljVar3);
                nko1.F(x340Var2);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                op71.g(x340Var2, u291.c(qim0Var3, 0.13f));
                if (str3 != null) {
                    x340Var2.i0(-1241088744);
                    zG = x340Var2.g(str3);
                    objT11 = x340Var2.T();
                    if (zG) {
                        objT11 = new hqa1(str3, (byte) 25);
                        x340Var2.s0(objT11);
                    } else {
                        objT11 = new hqa1(str3, (byte) 25);
                        x340Var2.s0(objT11);
                    }
                    qim0VarB = s161.a(qim0Var3, (iu30) objT11);
                    i25 = 0;
                    x340Var2.r(false);
                } else {
                    iu30Var8 = iu30Var8;
                    x340Var2.i0(-1240983623);
                    objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = nhe1.S0;
                        x340Var2.s0(objT4);
                    }
                    qim0VarB = s161.b(qim0Var3, true, (iu30) objT4);
                    i25 = 0;
                    x340Var2.r(false);
                }
                j9 = j3;
                mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, i25);
                iHashCode2 = Long.hashCode(x340Var2.T);
                xos0VarM2 = x340Var2.m();
                qim0VarE2 = E(x340Var2, qim0VarB);
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                qim0 qim0VarF5 = u291.f(qim0Var3, 1.0f);
                if (vnr0Var.c instanceof jor0) {
                    f16 = 0.0f;
                } else {
                    f16 = 24.0f;
                }
                qim0 qim0VarZ9 = uyn1.z(f16, 0.0f, 2, qim0VarF5);
                if ((i23 & 234881024) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objT5 = x340Var2.T();
                if (z9) {
                    objT5 = new vbk0((byte) 25, f5);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new vbk0((byte) 25, f5);
                    x340Var2.s0(objT5);
                }
                qim0 qim0VarC9 = i541.C(qim0VarZ9, (iu30) objT5);
                objT6 = x340Var2.T();
                b2 = 18;
                if (objT6 == m4cVar) {
                    objT6 = new b1c1(iu30Var7, b2);
                    x340Var2.s0(objT6);
                }
                qim0 qim0VarU9 = lrn1.u(qim0VarC9, (iu30) objT6);
                if (((i23 & 1879048192) ^ 805306368) <= 536870912) {
                }
                objT7 = x340Var2.T();
                if (z10) {
                    i26 = 3;
                    objT7 = new vfe1((byte) 3, j9);
                    x340Var2.s0(objT7);
                } else {
                    i26 = 3;
                    objT7 = new vfe1((byte) 3, j9);
                    x340Var2.s0(objT7);
                }
                qgo1.f(vnr0Var, eqr0.B(qim0VarU9, (iu30) objT7), new a0e1(i26), 0, false, (iu30) null, x340Var2, 8, 56);
                x340Var = x340Var2;
                if (z7) {
                    f17 = 8.0f;
                } else {
                    f17 = f13;
                }
                qim0 qim0VarZ10 = uyn1.z(24.0f, 0.0f, 2, ab80.o(qim0Var3, f17, x340Var, qim0Var3, 1.0f));
                objT8 = x340Var.T();
                if (objT8 == m4cVar) {
                    iu30Var9 = iu30Var8;
                    objT8 = new b1c1(iu30Var9, (byte) 19);
                    x340Var.s0(objT8);
                } else {
                    iu30Var9 = iu30Var8;
                }
                qim0 qim0VarU10 = lrn1.u(qim0VarZ10, (iu30) objT8);
                if ((i22 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objT9 = x340Var.T();
                if (z11) {
                    f18 = f15;
                    objT9 = new vbk0((byte) 26, f18);
                    x340Var.s0(objT9);
                } else {
                    f18 = f15;
                    objT9 = new vbk0((byte) 26, f18);
                    x340Var.s0(objT9);
                }
                qim0 qim0VarC10 = i541.C(qim0VarU10, (iu30) objT9);
                if (((i22 & 112) ^ 48) > 32) {
                    f19 = f5;
                    j10 = j8;
                    if (x340Var.f(j10)) {
                        z12 = true;
                    }
                    objT10 = x340Var.T();
                    if (z12) {
                        objT10 = new vfe1((byte) 4, j10);
                        x340Var.s0(objT10);
                    } else {
                        objT10 = new vfe1((byte) 4, j10);
                        x340Var.s0(objT10);
                    }
                    qgo1.f(vnr0Var2, eqr0.B(qim0VarC10, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                    x340Var.r(true);
                    if (z7) {
                        f20 = 8.0f;
                    } else {
                        f20 = f14;
                    }
                    op71.g(x340Var, u291.h(qim0Var3, f20));
                    int i319 = i21;
                    djc0 djc0Var11 = cjc0Var;
                    don1.i(iecVar, i319, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var11, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                    x0d.s(qim0Var3, 16.0f, x340Var, true);
                    djc0Var2 = djc0Var11;
                    f7 = f14;
                    qim0Var2 = qim0Var5;
                    f6 = f13;
                    iu30Var4 = iu30Var9;
                    long j19 = j10;
                    i16 = i319;
                    f5 = f19;
                    j4 = j9;
                    f8 = f18;
                    iu30Var3 = iu30Var7;
                    j5 = j19;
                } else {
                    f19 = f5;
                    j10 = j8;
                }
                if ((i22 & 48) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objT10 = x340Var.T();
                if (z12) {
                    objT10 = new vfe1((byte) 4, j10);
                    x340Var.s0(objT10);
                } else {
                    objT10 = new vfe1((byte) 4, j10);
                    x340Var.s0(objT10);
                }
                qgo1.f(vnr0Var2, eqr0.B(qim0VarC10, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                x340Var.r(true);
                if (z7) {
                    f20 = 8.0f;
                } else {
                    f20 = f14;
                }
                op71.g(x340Var, u291.h(qim0Var3, f20));
                int i3110 = i21;
                djc0 djc0Var12 = cjc0Var;
                don1.i(iecVar, i3110, z, z2, uyn1.z(24.0f, 0.0f, 2, qim0Var3), djc0Var12, x340Var, ((i23 >> 9) & 14) | 24576 | ((i23 >> 18) & 112) | (i24 & 896) | (i24 & 7168) | (458752 & (i22 >> 6)), 0);
                x0d.s(qim0Var3, 16.0f, x340Var, true);
                djc0Var2 = djc0Var12;
                f7 = f14;
                qim0Var2 = qim0Var5;
                f6 = f13;
                iu30Var4 = iu30Var9;
                long j110 = j10;
                i16 = i3110;
                f5 = f19;
                j4 = j9;
                f8 = f18;
                iu30Var3 = iu30Var7;
                j5 = j110;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                i16 = i;
                iu30Var3 = iu30Var;
                iu30Var4 = iu30Var2;
                str2 = str;
                f6 = f3;
                f7 = f4;
                djc0Var2 = djc0Var;
                j4 = j3;
                f8 = f2;
                j5 = j2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nye1(i2cVar, vu30Var, vu30Var2, iecVar, z, z2, qim0Var2, i16, f5, j4, f8, j5, iu30Var3, iu30Var4, str2, f6, f7, djc0Var2, i2, i3);
            }
        }

        public static final qim0 i(qim0 qim0Var, xu30 xu30Var) {
            return qim0Var.then(new a0k(xu30Var));
        }

        public static qim0 j(qim0 qim0Var, xu30 xu30Var) {
            return i(qim0Var, xu30Var);
        }

        public static o1q0 k(xy50 xy50Var, cnp0 cnp0Var, u6j0 u6j0Var, ckj ckjVar) {
            return new o1q0(xy50Var, cnp0Var, u6j0Var, ckjVar);
        }

        public static final s171 l(String str, Long l, vr51 vr51Var) {
            String strF = l != null ? vr51Var.f(l.longValue()) : null;
            if (strF == null) {
                strF = "";
            }
            List listM = p7h.M(new String[]{str, strF});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            return new s171(o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62), null);
        }

        public static final Long m(js7 js7Var) {
            hll hllVar = js7Var.c;
            if (hllVar != null) {
                long j = hllVar.a;
                jfv jfvVar = new jfv(j);
                if (jfv.f(j, 0L)) {
                    jfvVar = null;
                }
                if (jfvVar != null) {
                    return Long.valueOf(jfv.h(jfvVar.a));
                }
            }
            return null;
        }

        public static final String n(hpe0 hpe0Var) {
            if (hpe0Var.equals(gpe0.a)) {
                return "spotify:windowed-song:click";
            }
            if (hpe0Var.equals(fpe0.a)) {
                return "spotify:gated-song:click";
            }
            eg.o();
            return null;
        }

        public static void o(LoginActivity loginActivity, jgu jguVar) {
            loginActivity.c1 = jguVar;
        }

        public static void p(LoginActivity loginActivity, a2k a2kVar) {
            loginActivity.a1 = a2kVar;
        }

        public static void q(LoginActivity loginActivity, a0m a0mVar) {
            loginActivity.e1 = a0mVar;
        }

        public static void r(LoginActivity loginActivity) {
            loginActivity.g1 = j5.a;
        }

        public static void s(LoginActivity loginActivity, bwe0 bwe0Var) {
            loginActivity.k1 = bwe0Var;
        }

        public static void t(LoginActivity loginActivity, f1f0 f1f0Var) {
            loginActivity.d1 = f1f0Var;
        }

        public static void u(LoginActivity loginActivity, ppn0 ppn0Var) {
            loginActivity.l1 = ppn0Var;
        }

        public static void v(LoginActivity loginActivity, ohv0 ohv0Var) {
            loginActivity.h1 = ohv0Var;
        }

        public static void w(LoginActivity loginActivity, hj01 hj01Var) {
            loginActivity.i1 = hj01Var;
        }

        public static void x(LoginActivity loginActivity, dp21 dp21Var) {
            loginActivity.f1 = dp21Var;
        }

        public static void y(LoginActivity loginActivity) {
            loginActivity.j1 = gp41.b;
        }

        public static void z(LoginActivity loginActivity, kg0 kg0Var) {
            loginActivity.b1 = kg0Var;
        }
    }
