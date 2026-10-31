package p;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import android.view.animation.ScaleAnimation;
import com.google.protobuf.h;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.userinteractivityservice.usercomments.v1.proto.AuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionsRow;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ShowAuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.v1.proto.UserAuthorMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class s8p1 {
    public static b180 a;
    public static b180 b;

    public static final Next A(rph rphVar, aph aphVar) {
        u380 u380Var = rphVar.r;
        Set set = aphVar.a;
        return u380Var.containsAll(set) ? Next.j() : Next.h(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, mqo1.C(o7h.r1(u380Var, set)), false, 393215));
    }

    public static final Next B(rph rphVar) {
        return rphVar.s ? Next.i(rph.a(rphVar, new obe0(), null, null, null, null, null, null, null, false, null, null, null, false, null, null, dqs0.e, null, false, 196605), Collections.singleton(new enh(rphVar.a, null))) : Next.j();
    }

    public static final Next C(rph rphVar, cph cphVar) {
        return Next.i(rph.a(rphVar, new ebe0(cphVar.b), null, null, null, null, null, null, null, false, null, null, null, false, null, null, mqo1.t(new mmr0[]{new mmr0(cphVar.a, cphVar.c)}), null, false, 458749), w7x.a);
    }

    public static final Next D(rph rphVar, eph ephVar) {
        ace0 ace0Var = ephVar.a;
        ace0 ace0Var2 = rphVar.e;
        if (ace0Var.equals(ace0Var2)) {
            return Next.j();
        }
        xj61 xj61Var = new xj61();
        if (ace0Var2.a(Boolean.FALSE) && ace0Var.a(Boolean.TRUE)) {
            xj61Var.add(new inh(l9k1.a));
        }
        return K(Next.i(rph.a(rphVar, null, null, null, ace0Var, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 524271), cwl1.j(xj61Var)));
    }

    public static final Next E(rph rphVar, fph fphVar) {
        String str = fphVar.a;
        return str.equals(rphVar.i) ? Next.j() : Next.h(rph.a(rphVar, null, null, null, null, null, null, null, str, false, null, null, null, false, null, null, null, null, false, 524031));
    }

    public static final Next F(rph rphVar, gph gphVar) {
        kmh kmhVar = rphVar.h;
        jmh jmhVar = kmhVar instanceof jmh ? (jmh) kmhVar : null;
        if (jmhVar == null) {
            return Next.j();
        }
        int i = jmhVar.a;
        long j = i;
        int i2 = (int) (j / 3600);
        int i3 = ((int) (j / 60)) % 60;
        int i4 = i % 60;
        String str = i2 > 0 ? String.format(new Locale(upn1.m()), "%01d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3)) : String.format(new Locale(upn1.m()), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2));
        String str2 = rphVar.i;
        int iP = yoi1.p(gphVar.a, 0, str2.length());
        String strSubstring = str2.substring(0, iP);
        String strSubstring2 = str2.substring(iP);
        int length = strSubstring.length();
        StringBuilder sb = new StringBuilder(strSubstring);
        if (strSubstring.length() > 0 && !nhc1.R(strSubstring, " ", false) && !nhc1.R(strSubstring, "\n", false)) {
            sb.append(" ");
            length++;
        }
        sb.append(str);
        int length2 = str.length() + length;
        sb.append(" ");
        sb.append(strSubstring2);
        String string = sb.toString();
        return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, string, false, null, null, null, false, null, null, null, null, false, 524031), Collections.singleton(new inh(new n8k1(string, length2 + 1))));
    }

    public static v930 G(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i;
        List list;
        int i2;
        ArrayList arrayList;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            I(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), eoz0.b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), eoz0.c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            I(xmlResourceParser);
                        }
                        arrayList2.add(new x930(i5, i7, resourceId2, string7, string6, z));
                    } else {
                        I(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new w930((x930[]) arrayList2.toArray(new x930[0]));
        }
        List listH = H(resourceId, resources);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), eoz0.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i4) {
                            I(xmlResourceParser);
                        }
                        arrayList = arrayList3;
                        int i9 = integer;
                        list = listH;
                        i2 = i9;
                        typedArray = typedArrayObtainAttributes3;
                        try {
                            o930 o930Var = new o930(string, string2, string8, string9, string10, list);
                            typedArray.recycle();
                            arrayList.add(o930Var);
                        } catch (Throwable th) {
                            th = th;
                        }
                        th = th;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                int i10 = integer;
                list = listH;
                i2 = i10;
                arrayList = arrayList3;
                I(xmlResourceParser);
                List list2 = list;
                integer = i2;
                listH = list2;
                i4 = i4;
                arrayList3 = arrayList;
                i = 2;
                i3 = 0;
            }
        }
        int i11 = integer;
        List list3 = listH;
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            return new y930(i11, integer2, string5, arrayList4);
        }
        if (string3 == null) {
            hhg1.n("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new o930(string, string2, string3, (String) null, (String) null, list3));
        if (string4 != null) {
            arrayList4.add(new o930(string, string2, string4, (String) null, (String) null, list3));
        }
        return new y930(i11, integer2, string5, arrayList4);
    }

    public static List H(int i, Resources resources) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void I(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void J(l7m0 l7m0Var, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.95f, 1.05f, 0.95f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(150L);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(100L);
        l7m0Var.c(view, scaleAnimation);
        l7m0Var.c(view, scaleAnimation2);
        l7m0Var.c(view, scaleAnimation3);
    }

    public static final Next K(Next next) {
        mmr0 mmr0VarT = qgo1.t((rph) next.g());
        return Next.i((rph) mmr0VarT.a, dm61.y0(next.b(), (Set) mmr0VarT.b));
    }

    public static final c380 L(String str, c380 c380Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!u890.j(((Reply) obj).o(), str)) {
                arrayList.add(obj);
            }
        }
        return mqo1.A(arrayList);
    }

    public static final void a(ak3 ak3Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        int i2;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-319834578);
        j06 j06Var = ((x340) b0kVar3).a;
        int i4 = (b0kVar3.e(ak3Var.ordinal()) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i4 & 1, (i4 & 19) != 18)) {
            qim0 qim0VarX = bin.x(u291.f(nim0.a, 1.0f), false, (String) null, new pm31(0), (idn0) null, function0, 11);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            qim0 qim0VarA = uyn1.A(qim0VarX, 16.0f, 4.0f, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(b0kVar3, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, wnb0VarQ);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            int iOrdinal = ak3Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131961681;
            } else if (iOrdinal == 1) {
                i2 = 2131961679;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                i2 = 2131961677;
            }
            uwo1.e(cwl1.o0(b0kVar3, i2), (qim0) null, cbx.d(b0kVar3).h, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
            b0kVar2 = b0kVar3;
            int iOrdinal2 = ak3Var.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 2131961682;
            } else if (iOrdinal2 == 1) {
                i3 = 2131961680;
            } else {
                if (iOrdinal2 != 2) {
                    eg.o();
                    return;
                }
                i3 = 2131961678;
            }
            uwo1.e(cwl1.o0(b0kVar2, i3), (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            b0kVar2.r(true);
            w0h1.a(plx.c, isl.a, (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, plx.d | 48, 52);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g1o(ak3Var, function0, i, (byte) 20);
        }
    }

    public static final void b(Function0 function0, long j, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1021506164);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | (b0kVar3.d(8.0f) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j) ? 256 : 128;
        }
        int i3 = i2 | (b0kVar3.g(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String strO0 = cwl1.o0(b0kVar3, 2131956683);
            gdx gdxVarR = yla.r(b0kVar3);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            boolean z = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 14);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, anm1.N("insight-reaction", qim0Var), (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1159995509, new kk6(j, strO0, 8.0f), b0kVar3), b0kVar2, 48, 6, 984);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ll80(function0, j, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:82:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    public static final void c(pe21 pe21Var, Object obj, boolean z, qim0 qim0Var, boolean z2, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        m4c m4cVar;
        boolean z4;
        boolean zI;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1711839183);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(pe21Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= x340Var.h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT2 = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT2 == m4cVar2) {
                objT2 = kaa0.h(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar2) {
                objT3 = new r9y0(ven0Var, (byte) 7);
                x340Var.s0(objT3);
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | x340Var.g(obj);
            Object objT4 = x340Var.T();
            if (zG) {
                m4cVar = m4cVar2;
            } else {
                if (objT4 == m4cVar) {
                }
                m4cVar = m4cVar2;
                j2iVar.J((de21) objT4, Boolean.valueOf(z3), x340Var, Integer.valueOf(((i2 >> 3) & 112) | ((i2 >> 9) & 896)));
                x340Var.r(true);
                HashSet hashSet = pe21Var.t;
                Boolean boolValueOf = Boolean.valueOf(z2);
                if ((i2 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zI = z4 | (i3 == 4) | x340Var.i(obj);
                objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new d821(z2, pe21Var, obj, (lnm) null);
                    x340Var.s0(objT);
                }
                qxd0.s(hashSet, boolValueOf, (vu30) objT, x340Var);
            }
            m4cVar = m4cVar2;
            objT4 = new de21(pe21Var, obj, new g8y0(ven0Var, (byte) 8));
            x340Var.s0(objT4);
            m4cVar = m4cVar2;
            j2iVar.J((de21) objT4, Boolean.valueOf(z3), x340Var, Integer.valueOf(((i2 >> 3) & 112) | ((i2 >> 9) & 896)));
            x340Var.r(true);
            HashSet hashSet2 = pe21Var.t;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            if ((i2 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            zI = z4 | (i3 == 4) | x340Var.i(obj);
            objT = x340Var.T();
            if (zI) {
                objT = new d821(z2, pe21Var, obj, (lnm) null);
                x340Var.s0(objT);
            } else {
                objT = new d821(z2, pe21Var, obj, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.s(hashSet2, boolValueOf2, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(pe21Var, obj, z3, qim0Var, z2, j2iVar, i);
        }
    }

    public static final void d(int i, int i2, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1771884797);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            foo1.c(new gbx(z50.c, function0), ldx.c, (qim0) null, (max) null, yla.s(x340Var).a(), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1380600742, new vx1(i, (byte) 12), x340Var), x340Var, 0, 48, 2012);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(i, function0, i2, (byte) 6);
        }
    }

    public static final Locale e(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (u890.j(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    public static final ReactionsRow f(ReactionsRow reactionsRow, String str) {
        int iP;
        a301 a301Var = (a301) reactionsRow.toBuilder();
        if (reactionsRow.r().length() != 0 || str.length() <= 0) {
            iP = (reactionsRow.r().length() <= 0 || str.length() != 0) ? reactionsRow.p() : reactionsRow.p() - 1;
        } else {
            iP = reactionsRow.p() + 1;
        }
        a301Var.n(iP);
        a301Var.q(str);
        return (ReactionsRow) a301Var.build();
    }

    public static final Reply g(Reply reply, String str, String str2) {
        if (!u890.j(reply.o(), str)) {
            return reply;
        }
        dg21 builder = reply.toBuilder();
        builder.s(f(reply.t(), str2));
        Reply replyBuild = builder.build();
        replyBuild.getClass();
        return replyBuild;
    }

    public static final void h(ven0 ven0Var) {
        ven0Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:375:0x0bd7  */
    public static final Next i(rph rphVar, iph iphVar) {
        UserAuthorMetadata userAuthorMetadata;
        rph rphVar2;
        String str;
        rph rphVarA;
        rph rphVar3;
        Set setSingleton;
        rph rphVarA2;
        ijh ijhVar;
        uge1 uge1Var;
        rph rphVar4;
        rph rphVar5;
        Object next;
        Object next2;
        String str2;
        boolean z;
        Set set;
        rph rphVar6;
        rph rphVarA3;
        wgh xghVar;
        String strM;
        ijh ijhVar2;
        String str3;
        m7 m7Var = rphVar.o;
        ace0 ace0Var = rphVar.c;
        ace0 ace0Var2 = rphVar.f;
        String str4 = rphVar.k;
        cqs0 cqs0Var = rphVar.l;
        ace0 ace0Var3 = rphVar.b;
        cqs0 cqs0Var2 = rphVar.q;
        String str5 = rphVar.a;
        if (iphVar.equals(wnh.a)) {
            boolean z2 = ace0Var3 instanceof ebe0;
            if (z2 && u890.j(str4, ((ijh) ((ebe0) ace0Var3).a).e)) {
                return Next.j();
            }
            return (!z2 || (str3 = (ijhVar2 = (ijh) ((ebe0) ace0Var3).a).e) == null || str3.length() == 0) ? Next.j() : Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, ijhVar2.e, null, null, false, null, null, null, null, false, 523263), Collections.singleton(new enh(str5, ijhVar2.e)));
        }
        boolean z3 = iphVar instanceof xnh;
        l8k1 l8k1Var = l8k1.a;
        if (z3) {
            xnh xnhVar = (xnh) iphVar;
            kp8 kp8Var = xnhVar.a;
            if (kp8Var instanceof ip8) {
                strM = ((ip8) kp8Var).a.q();
            } else {
                if (!(kp8Var instanceof jp8)) {
                    eg.o();
                    return null;
                }
                strM = l1d.m("spotify:user:", ((jp8) kp8Var).a.getUsername());
            }
            inh inhVar = new inh(l8k1Var);
            strM.getClass();
            return Next.a(f46.S0(new snh[]{inhVar, new hnh(strM, xnhVar.b)}));
        }
        if (iphVar.equals(ynh.a)) {
            return Next.h(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 491519));
        }
        if (iphVar.equals(znh.a)) {
            return Next.a(Collections.singleton(new inh(l8k1Var)));
        }
        if (iphVar instanceof aoh) {
            String str6 = ((aoh) iphVar).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) cqs0Var);
            linkedHashMap.remove(str6);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) cqs0Var2);
            linkedHashMap2.remove(str6);
            rph rphVarA4 = rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, mqo1.B(linkedHashMap), null, false, null, null, mqo1.B(linkedHashMap2), null, false, 456703);
            return !rphVarA4.equals(rphVar) ? Next.h(rphVarA4) : Next.j();
        }
        if (iphVar instanceof boh) {
            boh bohVar = (boh) iphVar;
            kp8 kp8Var2 = bohVar.b;
            if (kp8Var2 instanceof ip8) {
                ShowAuthorMetadata showAuthorMetadata = ((ip8) kp8Var2).a;
                xghVar = new wgh(showAuthorMetadata.o(), showAuthorMetadata.p());
            } else {
                if (!(kp8Var2 instanceof jp8)) {
                    eg.o();
                    return null;
                }
                UserAuthorMetadata userAuthorMetadata2 = ((jp8) kp8Var2).a;
                xghVar = new xgh(userAuthorMetadata2.getUsername(), userAuthorMetadata2.q(), userAuthorMetadata2.p());
            }
            return Next.a(Collections.singleton(new mnh(rphVar.a, bohVar.a, xghVar, bohVar.c, bohVar.d)));
        }
        if (iphVar.equals(coh.a)) {
            Set setW0 = dm61.w0(new snh[]{new enh(str5, null)});
            if (ace0Var2.a(Boolean.FALSE)) {
                setW0.add(new nnh(str5));
            }
            return Next.a(setW0);
        }
        if (iphVar instanceof doh) {
            doh dohVar = (doh) iphVar;
            return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 523775), Collections.singleton(new pnh(new cnh(n(rphVar), str5, dohVar.b, s(rphVar)), dohVar.a.getMessage())));
        }
        boolean z4 = iphVar instanceof foh;
        Set set2 = w7x.a;
        if (z4) {
            ijh ijhVarA = ((foh) iphVar).a;
            String str7 = ijhVarA.f;
            tuw tuwVar = ijhVarA.d;
            if (tuwVar == tuw.d || tuwVar == tuw.e) {
                set = set2;
                rphVar6 = rphVar;
                rphVarA3 = rph.a(rphVar6, new obe0(), null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 522749);
            } else if (ace0Var3 instanceof obe0) {
                ebe0 ebe0Var = new ebe0(ijhVarA);
                set = set2;
                rphVar6 = rphVar;
                rphVarA3 = rph.a(rphVar6, ebe0Var, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 523773);
            } else if ((ace0Var3 instanceof ebe0) && u890.j(str7, str4)) {
                ijh ijhVar3 = (ijh) ((ebe0) ace0Var3).a;
                if (str7 != null && str7.length() != 0) {
                    ijhVarA = u890.j(str7, ijhVar3.e) ? ijh.a(ijhVar3, new uge1(o7h.N0(ijhVarA.b.a, ijhVar3.b.a)), ijhVar3.c + 1, ijhVarA.d, ijhVarA.e, ijhVarA.f, 1) : ijhVar3;
                }
                ebe0 ebe0Var2 = new ebe0(ijhVarA);
                set = set2;
                rphVar6 = rphVar;
                rphVarA3 = rph.a(rphVar6, ebe0Var2, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 522749);
            } else {
                set = set2;
                rphVar6 = rphVar;
                rphVarA3 = rphVar6;
            }
            return rphVarA3.equals(rphVar6) ? Next.j() : K(Next.i(rphVarA3, set));
        }
        if (iphVar instanceof eoh) {
            eoh eohVar = (eoh) iphVar;
            return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 523775), Collections.singleton(new pnh(new enh(eohVar.a, eohVar.b), eohVar.c.getMessage())));
        }
        if (iphVar instanceof goh) {
            enh enhVar = new enh(str5, null);
            tgh tghVar = ((goh) iphVar).a;
            if (tghVar.equals(rgh.a)) {
                obe0 obe0Var = new obe0();
                dqs0 dqs0Var = dqs0.e;
                return Next.i(rph.a(rphVar, obe0Var, null, null, null, null, null, null, null, true, null, dqs0Var, null, false, dqs0Var, null, dqs0Var, null, false, 438781), f46.S0(new snh[]{enhVar, new knh(str5, true)}));
            }
            if (tghVar.equals(sgh.a)) {
                return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, true, null, null, null, false, null, null, null, null, false, 522751), Collections.singleton(enhVar));
            }
            if (!(tghVar instanceof tgh)) {
                if (tghVar instanceof ugh) {
                    return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, dm61.x0(((ugh) tghVar).a, rphVar.m), false, null, null, null, null, false, 520191), Collections.singleton(enhVar));
                }
                eg.o();
                return null;
            }
            rph rphVarA5 = rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 523775);
            String str8 = tghVar.a;
            cqs0 cqs0VarB = rphVarA5.q;
            cqs0 cqs0VarB2 = rphVarA5.o;
            Iterator it = ((m7) cqs0VarB).a().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                c380 c380Var = ((cg21) ((Map.Entry) next).getValue()).b;
                if (c380Var == null || !c380Var.isEmpty()) {
                    Iterator it2 = c380Var.iterator();
                    while (it2.hasNext()) {
                        if (u890.j(((Reply) it2.next()).o(), str8)) {
                            break loop0;
                        }
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (str2 = (String) entry.getKey()) == null) {
                Iterator it3 = ((m7) cqs0VarB2).a().iterator();
                loop3: while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    Iterable iterable = (Iterable) ((Map.Entry) next2).getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            if (u890.j(((Reply) it4.next()).o(), str8)) {
                                break loop3;
                            }
                        }
                    }
                }
                Map.Entry entry2 = (Map.Entry) next2;
                str2 = entry2 != null ? (String) entry2.getKey() : null;
            }
            if (str2 != null) {
                cg21 cg21VarA = (cg21) cqs0VarB.get(str2);
                if (cg21VarA != null) {
                    c380 c380Var2 = cg21VarA.b;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap((Map) cqs0VarB);
                    if (c380Var2 == null || !c380Var2.isEmpty()) {
                        Iterator it5 = c380Var2.iterator();
                        while (it5.hasNext()) {
                            if (u890.j(((Reply) it5.next()).o(), str8)) {
                                c380 c380VarL = L(str8, c380Var2);
                                int i = cg21VarA.c - 1;
                                cg21VarA = cg21.a(cg21VarA, 0, c380VarL, i < 0 ? 0 : i, null, null, 57);
                                break;
                            }
                        }
                    }
                    linkedHashMap3.put(str2, cg21VarA);
                    cqs0VarB = mqo1.B(linkedHashMap3);
                }
                cqs0 cqs0Var3 = cqs0VarB;
                c380 c380Var3 = (c380) cqs0VarB2.get(str2);
                if (c380Var3 != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap((Map) cqs0VarB2);
                    linkedHashMap4.put(str2, L(str8, c380Var3));
                    cqs0VarB2 = mqo1.B(linkedHashMap4);
                }
                z = false;
                rphVarA5 = t(rph.a(rphVarA5, null, null, null, null, null, null, null, null, false, null, null, null, false, cqs0VarB2, null, cqs0Var3, null, false, 442367), str2, -1, false, null);
            } else {
                z = false;
            }
            return Next.i(rphVarA5, Collections.singleton(new knh(str5, z)));
        }
        int i2 = 1;
        boolean zEquals = iphVar.equals(hoh.a);
        qnh qnhVar = qnh.a;
        if (zEquals) {
            return Next.a(Collections.singleton(qnhVar));
        }
        if (iphVar instanceof ioh) {
            String str9 = ((ioh) iphVar).a;
            if (!cqs0Var.containsKey(str9)) {
                cg21 cg21Var = (cg21) cqs0Var2.get(str9);
                if ((cg21Var != null ? cg21Var.e : null) != null) {
                    cg21 cg21Var2 = (cg21) cqs0Var2.get(str9);
                    String str10 = cg21Var2 != null ? cg21Var2.e : null;
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap((Map) cqs0Var);
                    linkedHashMap5.put(str9, str10);
                    return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, mqo1.B(linkedHashMap5), null, false, null, null, null, null, false, 522239), Collections.singleton(new fnh(str9, str10, false)));
                }
            }
            return Next.j();
        }
        if (iphVar instanceof joh) {
            ace0 ace0Var4 = ((joh) iphVar).a;
            if (ace0Var4.equals(ace0Var)) {
                return Next.j();
            }
            ebe0 ebe0Var3 = ace0Var4 instanceof ebe0 ? (ebe0) ace0Var4 : null;
            qmy qmyVar = ebe0Var3 != null ? (qmy) ebe0Var3.a : null;
            rph rphVarA6 = rph.a(rphVar, null, ace0Var4, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 524283);
            xj61 xj61Var = new xj61();
            if (!(ace0Var instanceof ebe0) && qmyVar != null && qmyVar.e) {
                xj61Var.add(new rnh(str5));
            }
            return K(Next.i(rphVarA6, cwl1.j(xj61Var)));
        }
        if (iphVar.equals(koh.a)) {
            return Next.a(Collections.singleton(new inh(l8k1Var)));
        }
        if (iphVar instanceof loh) {
            ace0 ace0Var5 = ((loh) iphVar).a;
            return ace0Var5.equals(ace0Var2) ? Next.j() : K(Next.i(rph.a(rphVar, null, null, null, null, ace0Var5, null, null, null, false, null, null, null, false, null, null, null, null, false, 524255), set2));
        }
        if (iphVar instanceof moh) {
            ace0 ace0Var6 = ((moh) iphVar).a;
            if (ace0Var6 instanceof ebe0) {
                Object obj = ((ebe0) ace0Var6).a;
                if (!u890.j(obj, rphVar.h)) {
                    return Next.h(rph.a(rphVar, null, null, null, null, null, null, (kmh) obj, null, false, null, null, null, false, null, null, null, null, false, 524159));
                }
            }
            return Next.j();
        }
        if (iphVar instanceof noh) {
            ace0 ace0Var7 = ((noh) iphVar).a;
            return ace0Var7.equals(rphVar.d) ? Next.j() : K(Next.i(rph.a(rphVar, null, null, ace0Var7, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 524279), set2));
        }
        if (iphVar.equals(poh.a)) {
            return Next.i(rph.a(rphVar, new obe0(), null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 522749), Collections.singleton(new enh(str5, null)));
        }
        if (iphVar instanceof ooh) {
            ooh oohVar = (ooh) iphVar;
            String str11 = oohVar.b;
            String str12 = oohVar.a;
            if (ace0Var3 instanceof ebe0) {
                ijh ijhVar4 = (ijh) ((ebe0) ace0Var3).a;
                List<Comment> list = ijhVar4.b.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (Comment comment : list) {
                    if (u890.j(comment.r(), str12)) {
                        neh builder = comment.toBuilder();
                        builder.t(f(comment.A(), str11));
                        h hVarBuild = builder.build();
                        hVarBuild.getClass();
                        comment = (Comment) hVarBuild;
                    }
                    arrayList.add(comment);
                }
                ebe0 ebe0Var4 = new ebe0(ijh.a(ijhVar4, new uge1(arrayList), 0, null, null, null, 61));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(zno1.s(((m7) cqs0Var2).c()));
                for (Map.Entry entry3 : ((m7) cqs0Var2).a()) {
                    Object key = entry3.getKey();
                    cg21 cg21Var3 = (cg21) entry3.getValue();
                    c380 c380Var4 = cg21Var3.b;
                    ArrayList arrayList2 = new ArrayList(q7h.U(c380Var4, 10));
                    Iterator it6 = c380Var4.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(g((Reply) it6.next(), str12, str11));
                    }
                    linkedHashMap6.put(key, cg21.a(cg21Var3, 0, mqo1.A(arrayList2), 0, null, null, 61));
                }
                cqs0 cqs0VarB3 = mqo1.B(linkedHashMap6);
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(zno1.s(m7Var.c()));
                for (Map.Entry entry4 : m7Var.a()) {
                    Object key2 = entry4.getKey();
                    c380 c380Var5 = (c380) entry4.getValue();
                    ArrayList arrayList3 = new ArrayList(q7h.U(c380Var5, 10));
                    Iterator it7 = c380Var5.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(g((Reply) it7.next(), str12, str11));
                    }
                    linkedHashMap7.put(key2, mqo1.A(arrayList3));
                }
                rph rphVarA7 = rph.a(rphVar, ebe0Var4, null, null, null, null, null, null, null, false, null, null, null, false, mqo1.B(linkedHashMap7), null, cqs0VarB3, null, false, 442365);
                rphVar4 = rphVar;
                rphVar5 = rphVarA7;
            } else {
                rphVar4 = rphVar;
                rphVar5 = rphVar4;
            }
            return rphVar5.equals(rphVar4) ? Next.j() : Next.h(rphVar5);
        }
        m7 m7VarB = m7Var;
        if (iphVar instanceof qoh) {
            qoh qohVar = (qoh) iphVar;
            String str13 = qohVar.a;
            cg21 cg21VarA2 = (cg21) cqs0Var2.get(str13);
            cg21 cg21Var4 = qohVar.b;
            String str14 = cg21Var4.d;
            if (cg21VarA2 == null || str14 == null || str14.length() == 0) {
                cg21VarA2 = cg21Var4;
            } else if (u890.j(str14, cg21VarA2.e)) {
                cg21VarA2 = cg21.a(cg21VarA2, cg21VarA2.a + 1, mqo1.A(o7h.N0(cg21Var4.b, cg21VarA2.b)), cg21Var4.c, cg21Var4.d, cg21Var4.e, 32);
            }
            LinkedHashMap linkedHashMap8 = new LinkedHashMap((Map) cqs0Var2);
            linkedHashMap8.put(str13, cg21VarA2);
            LinkedHashMap linkedHashMap9 = new LinkedHashMap((Map) cqs0Var);
            if (u890.j(str14, linkedHashMap9.get(str13))) {
                linkedHashMap9.remove(str13);
            }
            if (m7VarB.containsKey(str13)) {
                LinkedHashMap linkedHashMap10 = new LinkedHashMap((Map) m7VarB);
                linkedHashMap10.remove(str13);
                m7VarB = mqo1.B(linkedHashMap10);
            }
            String str15 = str13;
            rph rphVarA8 = rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, mqo1.B(linkedHashMap9), null, false, m7VarB, null, mqo1.B(linkedHashMap8), null, false, 440319);
            ace0 ace0Var8 = rphVarA8.b;
            int i3 = cg21Var4.c;
            ebe0 ebe0Var5 = ace0Var8 instanceof ebe0 ? (ebe0) ace0Var8 : null;
            if (ebe0Var5 == null || (ijhVar = (ijh) ebe0Var5.a) == null || (uge1Var = ijhVar.b) == null) {
                rphVarA2 = rphVarA8;
            } else {
                List<Comment> list2 = uge1Var.a;
                ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                for (Comment comment2 : list2) {
                    String str16 = str15;
                    if (u890.j(comment2.r(), str16)) {
                        neh builder2 = comment2.toBuilder();
                        builder2.s(i3);
                        comment2 = (Comment) builder2.build();
                    }
                    arrayList4.add(comment2);
                    str15 = str16;
                }
                rphVarA2 = rph.a(rphVarA8, new ebe0(ijh.a((ijh) ((ebe0) ace0Var8).a, new uge1(arrayList4), 0, null, null, null, 61)), null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 524285);
            }
            return Next.h(rphVarA2);
        }
        rph rphVar7 = rphVar;
        if (iphVar instanceof roh) {
            String str17 = ((roh) iphVar).a;
            Comment commentB = rphVar7.b(str17);
            if (commentB != null && commentB.v()) {
                return Next.a(Collections.singleton(onh.a));
            }
            rph rphVarA9 = rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, commentB, null, null, false, 491519);
            Set setW1 = !rphVar.e.a(Boolean.TRUE) ? dm61.w0(new snh[]{qnhVar}) : dm61.w0(new snh[]{new inh(new n8k1("", 0)), new inh(l9k1.a)});
            if (!cqs0Var2.containsKey(str17)) {
                setW1.add(new fnh(str17, null, true));
            }
            return Next.i(rphVarA9, setW1);
        }
        if (!(iphVar instanceof soh)) {
            if (iphVar instanceof toh) {
                toh tohVar = (toh) iphVar;
                return Next.a(Collections.singleton(new pnh(new dnh(n(rphVar7), tohVar.b, tohVar.c, s(rphVar7), rphVar7.a), tohVar.a.getMessage())));
            }
            if (iphVar instanceof uoh) {
                uoh uohVar = (uoh) iphVar;
                return uohVar.c ? Next.j() : Next.a(Collections.singleton(new pnh(new fnh(uohVar.a, uohVar.b, false), uohVar.d.getMessage())));
            }
            if (iphVar instanceof voh) {
                return v(rphVar7, (voh) iphVar);
            }
            if (iphVar instanceof woh) {
                return w(rphVar7, (woh) iphVar);
            }
            if (iphVar instanceof xoh) {
                return x(rphVar7, (xoh) iphVar);
            }
            if (iphVar.equals(yoh.a)) {
                return y(rphVar7);
            }
            if (iphVar instanceof aph) {
                return A(rphVar7, (aph) iphVar);
            }
            if (iphVar instanceof zoh) {
                return z(rphVar7);
            }
            if (iphVar.equals(bph.a)) {
                return B(rphVar7);
            }
            if (iphVar instanceof cph) {
                return C(rphVar7, (cph) iphVar);
            }
            if (iphVar instanceof dph) {
                dph dphVar = (dph) iphVar;
                return Next.a(Collections.singleton(new pnh(new gnh(dphVar.a), dphVar.b.getMessage())));
            }
            if (iphVar instanceof fph) {
                return E(rphVar7, (fph) iphVar);
            }
            if (iphVar instanceof eph) {
                return D(rphVar7, (eph) iphVar);
            }
            if (iphVar instanceof gph) {
                return F(rphVar7, (gph) iphVar);
            }
            if (iphVar instanceof hph) {
                hph hphVar = (hph) iphVar;
                return Next.a(Collections.singleton(new jnh(hphVar.a, hphVar.b)));
            }
            eg.o();
            return null;
        }
        soh sohVar = (soh) iphVar;
        ace0 ace0Var9 = rphVar7.d;
        cqs0 cqs0Var4 = rphVar7.q;
        if (!(ace0Var9 instanceof ebe0)) {
            return Next.j();
        }
        s6i1 s6i1VarR = UserAuthorMetadata.r();
        ebe0 ebe0Var6 = (ebe0) ace0Var9;
        s6i1VarR.r(((eww0) ebe0Var6.a).a);
        s6i1VarR.q(((eww0) ebe0Var6.a).b);
        String str18 = ((eww0) ebe0Var6.a).f;
        if (str18 == null) {
            str18 = "";
        }
        s6i1VarR.n(str18);
        UserAuthorMetadata userAuthorMetadataBuild = s6i1VarR.build();
        dg21 dg21VarY = Reply.y();
        String str19 = sohVar.b;
        String str20 = sohVar.a;
        dg21VarY.n(str19);
        dg21VarY.q(sohVar.d);
        dg21VarY.t(sohVar.c);
        dg21VarY.u(userAuthorMetadataBuild);
        dg21VarY.r();
        Reply replyBuild = dg21VarY.build();
        cg21 cg21Var5 = (cg21) cqs0Var4.get(str20);
        if (cg21Var5 != null) {
            String str21 = cg21Var5.e;
            if (cg21Var5.f && str21 != null && str21.length() != 0) {
                userAuthorMetadata = userAuthorMetadataBuild;
                rphVar2 = rphVar7;
                str = str20;
                LinkedHashMap linkedHashMap11 = new LinkedHashMap((Map) rphVar2.o);
                linkedHashMap11.put(str, mqo1.s(new Reply[]{replyBuild}));
                rphVarA = rph.a(rphVar2, null, null, null, null, null, null, null, null, false, null, null, null, false, mqo1.B(linkedHashMap11), null, null, null, false, 507903);
            } else if (str21 == null) {
                LinkedHashMap linkedHashMap12 = new LinkedHashMap((Map) cqs0Var4);
                Object obj2 = linkedHashMap12.get(str20);
                obj2.getClass();
                cg21 cg21Var6 = (cg21) obj2;
                linkedHashMap12.put(str20, cg21.a(cg21Var6, 0, mqo1.A(o7h.O0(replyBuild, cg21Var6.b)), cg21Var6.c + 1, null, null, 25));
                str = str20;
                userAuthorMetadata = userAuthorMetadataBuild;
                rphVar2 = rphVar;
                rphVarA = rph.a(rphVar2, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, mqo1.B(linkedHashMap12), null, false, 458239);
            } else {
                i2 = 1;
                sohVar = sohVar;
                userAuthorMetadata = userAuthorMetadataBuild;
                rphVar3 = rphVar7;
                str = str20;
            }
            rphVar7 = rphVar2;
            rphVar3 = rphVarA;
        } else {
            userAuthorMetadata = userAuthorMetadataBuild;
            rphVar2 = rphVar7;
            str = str20;
            LinkedHashMap linkedHashMap13 = new LinkedHashMap((Map) rphVar2.o);
            linkedHashMap13.put(str, mqo1.s(new Reply[]{replyBuild}));
            rphVarA = rph.a(rphVar2, null, null, null, null, null, null, null, null, false, null, null, null, false, mqo1.B(linkedHashMap13), null, null, null, false, 507903);
            rphVar7 = rphVar2;
            rphVar3 = rphVarA;
        }
        boolean zA = rphVar7.f.a(Boolean.FALSE);
        String str22 = rphVar7.a;
        if (zA) {
            snh nnhVar = new nnh(str22);
            knh knhVar = new knh(str22, false);
            snh[] snhVarArr = new snh[2];
            snhVarArr[0] = nnhVar;
            snhVarArr[i2] = knhVar;
            setSingleton = f46.S0(snhVarArr);
        } else {
            setSingleton = Collections.singleton(new knh(str22, false));
        }
        return Next.i(t(rphVar3, str, i2, sohVar.e, userAuthorMetadata), setSingleton);
    }

    public static ven0 j() {
        return new hrr0(rih1.a, f331.X0);
    }

    public static final mqw k(em0 em0Var, kt11 kt11Var, boolean z, nu11 nu11Var, yt11 yt11Var, zob1 zob1Var, d0r d0rVar) {
        epb1 epb1Var = (epb1) em0Var.c;
        xu30 xu30Var = (xu30) em0Var.b;
        w0h1.o(3, xu30Var);
        xu30 xu30Var2 = (xu30) em0Var.i;
        w0h1.o(3, xu30Var2);
        vu30 vu30Var = (vu30) em0Var.t;
        w0h1.o(2, vu30Var);
        vu30 vu30Var2 = (vu30) em0Var.X;
        w0h1.o(2, vu30Var2);
        vu30 vu30Var3 = (vu30) em0Var.d;
        iu30 iu30Var = (iu30) em0Var.e;
        iu30 iu30Var2 = (iu30) em0Var.f;
        iu30 iu30Var3 = (iu30) em0Var.g;
        iu30 iu30Var4 = (iu30) em0Var.h;
        o3r o3rVar = js11.a;
        return c2p1.o(new v3r(epb1Var, vu30Var3, xu30Var2, iu30Var, iu30Var4, d0rVar, iu30Var2, iu30Var3, vu30Var, vu30Var2, zob1Var, xu30Var, (byte) 3), h211.a1, new wq01(yt11Var, z, nu11Var, (byte) 2), 4);
    }

    public static final fo1 l(tu1 tu1Var) {
        Object objPrevious;
        ru1 ru1VarT;
        ru1 ru1VarT2 = rwo1.t(tu1Var.a().b);
        List listB = tu1Var.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ru1 ru1VarT3 = rwo1.t(((su1) it.next()).b);
            String str = ru1VarT3 != null ? ru1VarT3.a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        List listJ0 = o7h.j0(arrayList);
        int iS = zno1.s(q7h.U(listJ0, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : listJ0) {
            String str2 = (String) obj;
            ud31 it2 = new wd31(tu1Var.b()).iterator();
            do {
                ListIterator listIterator = (ListIterator) it2.b;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                ru1VarT = rwo1.t(((su1) objPrevious).b);
            } while (!u890.j(ru1VarT != null ? ru1VarT.a : null, str2));
            su1 su1Var = (su1) objPrevious;
            vo1 vo1Var = su1Var != null ? su1Var.b : null;
            p030 p030Var = vo1Var instanceof p030 ? (p030) vo1Var : null;
            linkedHashMap.put(obj, p030Var != null ? p030Var.a : null);
        }
        return new fo1(ru1VarT2, linkedHashMap);
    }

    public static final long m() {
        return Thread.currentThread().getId();
    }

    public static final int n(rph rphVar) {
        qmy qmyVar;
        ace0 ace0Var = rphVar.c;
        ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
        if (ebe0Var == null || (qmyVar = (qmy) ebe0Var.a) == null) {
            return 0;
        }
        return qmyVar.d;
    }

    public static final boolean o(int i, int i2) {
        return i == i2;
    }

    public static ex30 p(View view) {
        return new ex30(new iyh1(view, (byte) 8));
    }

    public static final First q(rph rphVar) {
        mmr0 mmr0VarT = qgo1.t(rphVar);
        rph rphVar2 = (rph) mmr0VarT.a;
        Set set = (Set) mmr0VarT.b;
        return (rphVar2.c() || (rphVar.g instanceof hjb0)) ? First.c(rphVar2, set) : First.c(rphVar2, dm61.x0(new enh(rphVar.a, null), set));
    }

    public static final void r(ven0 ven0Var) {
        ven0Var.setValue(rih1.a);
    }

    public static final boolean s(rph rphVar) {
        qmy qmyVar;
        ace0 ace0Var = rphVar.c;
        ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
        if (ebe0Var == null || (qmyVar = (qmy) ebe0Var.a) == null) {
            return false;
        }
        return qmyVar.e;
    }

    public static final rph t(rph rphVar, String str, int i, boolean z, UserAuthorMetadata userAuthorMetadata) {
        ijh ijhVar;
        uge1 uge1Var;
        List listD;
        ace0 ace0Var = rphVar.b;
        ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
        if (ebe0Var == null || (ijhVar = (ijh) ebe0Var.a) == null || (uge1Var = ijhVar.b) == null) {
            return rphVar;
        }
        List<Comment> list = uge1Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (Comment comment : list) {
            if (u890.j(comment.r(), str)) {
                if (userAuthorMetadata == null || !comment.D().isEmpty()) {
                    listD = comment.D();
                } else {
                    ko8 ko8VarQ = AuthorMetadata.q();
                    ko8VarQ.n(userAuthorMetadata);
                    listD = Collections.singletonList(ko8VarQ.build());
                }
                neh builder = comment.toBuilder();
                int iZ = comment.z() + i;
                if (iZ < 0) {
                    iZ = 0;
                }
                builder.s(iZ);
                builder.r(z);
                builder.q();
                builder.n(listD);
                comment = (Comment) builder.build();
            }
            arrayList.add(comment);
        }
        return rph.a(rphVar, new ebe0(ijh.a((ijh) ((ebe0) ace0Var).a, new uge1(arrayList), 0, null, null, null, 61)), null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 524285);
    }

    public static ksk0 u() {
        return new ksk0((byte) 5);
    }

    public static final Next v(rph rphVar, voh vohVar) {
        cqs0 cqs0Var = rphVar.l;
        String str = vohVar.a;
        if (cqs0Var.containsKey(str)) {
            return Next.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) cqs0Var);
        linkedHashMap.put(str, null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) rphVar.q);
        linkedHashMap2.remove(str);
        return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, mqo1.B(linkedHashMap), null, false, null, null, mqo1.B(linkedHashMap2), null, false, 456703), Collections.singleton(new fnh(str, null, false)));
    }

    public static final Next w(rph rphVar, woh wohVar) {
        lnh lnhVar = wohVar.a;
        boolean z = lnhVar instanceof cnh;
        l9k1 l9k1Var = l9k1.a;
        if (z) {
            return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 523775), f46.S0(new inh[]{new inh(new n8k1(((cnh) lnhVar).b)), new inh(l9k1Var)}));
        }
        if (lnhVar instanceof dnh) {
            return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, rphVar.b(((dnh) lnhVar).a), null, null, false, 491007), f46.S0(new inh[]{new inh(new n8k1(((dnh) lnhVar).b)), new inh(l9k1Var)}));
        }
        if (lnhVar instanceof enh) {
            return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, ((enh) lnhVar).b, null, null, false, null, null, null, null, false, 522751), Collections.singleton(lnhVar));
        }
        if ((lnhVar instanceof fnh) || (lnhVar instanceof gnh)) {
            return Next.a(Collections.singleton(lnhVar));
        }
        eg.o();
        return null;
    }

    public static final Next x(rph rphVar, xoh xohVar) {
        lnh lnhVar = xohVar.a;
        if ((lnhVar instanceof cnh) || (lnhVar instanceof dnh)) {
            return Next.h(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 523775));
        }
        boolean z = lnhVar instanceof enh;
        l8k1 l8k1Var = l8k1.a;
        if (z) {
            return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 522751), Collections.singleton(rphVar.b instanceof obe0 ? new inh(l8k1Var) : new inh(r9k1.a)));
        }
        if (lnhVar instanceof fnh) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) rphVar.l);
            linkedHashMap.remove(((fnh) lnhVar).a);
            return Next.h(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, mqo1.B(linkedHashMap), null, false, null, null, null, null, false, 522239));
        }
        if (lnhVar instanceof gnh) {
            return Next.a(Collections.singleton(new inh(l8k1Var)));
        }
        eg.o();
        return null;
    }

    public static final Next y(rph rphVar) {
        Object cnhVar;
        String str = rphVar.i;
        Comment comment = rphVar.f12p;
        if (ihc1.y0(str)) {
            return Next.j();
        }
        String string = ihc1.e1(str).toString();
        String str2 = rphVar.a;
        if (comment != null) {
            cnhVar = new dnh(n(rphVar), comment.r(), string, s(rphVar), str2);
        } else {
            cnhVar = new cnh(n(rphVar), str2, string, s(rphVar));
        }
        return Next.i(rph.a(rphVar, null, null, null, null, null, null, null, null, comment == null, null, null, null, false, null, null, null, null, false, 491007), Collections.singleton(cnhVar));
    }

    public static final Next z(rph rphVar) {
        return rphVar.n ? Next.j() : Next.h(rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, true, null, null, null, null, false, 516095));
    }
}
