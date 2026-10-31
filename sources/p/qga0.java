package p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.geometry.Offset;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qga0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qga0(oae1 oae1Var, ze5 ze5Var, f65 f65Var) {
        this.a = (byte) 22;
        this.b = ze5Var;
        this.c = f65Var;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0383 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0385 A[LOOP:1: B:156:0x0352->B:166:0x0385, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:272:0x0388 A[SYNTHETIC] */
    public final Object invoke() {
        String[] strArrNames;
        long j;
        z9e1 z9e1VarD;
        r1c0 r1c0Var;
        af5 af5Var;
        rjc0 rjc0Var;
        egg1 egg1Var;
        int i = 2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                h661 h661Var = (h661) this.b;
                nfa0 nfa0Var = (nfa0) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                vfa0 vfa0Var = nfa0Var.a;
                mue1.P(nfa0Var, h661Var);
                int iD = h661Var.d();
                for (int i3 = 0; i3 < iD; i3++) {
                    List listF = h661Var.f(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listF) {
                        if (obj instanceof pga0) {
                            arrayList.add(obj);
                        }
                    }
                    pga0 pga0Var = (pga0) o7h.X0(arrayList);
                    if (pga0Var != null && (strArrNames = pga0Var.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = u890.j(h661Var.getKind(), l661.h) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new JsonDecodingException(vvm1.w(-1, "The suggested name '" + str + "' for " + str2 + ' ' + h661Var.e(i3) + " is already one of the names for " + str2 + ' ' + h661Var.e(((Number) sqg0.G(str, linkedHashMap)).intValue()) + " in " + h661Var, (String) null, (String) null, (String) null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i3));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? b7x.a : linkedHashMap;
            case 1:
                hmb0 hmb0Var = (hmb0) this.b;
                p811 p811Var = (p811) this.c;
                jdo0 jdo0Var = hmb0Var.e1;
                if ((((pim0) jdo0Var.g).d & 8) != 0) {
                    for (pim0 pim0Var = (gpd1) jdo0Var.f; pim0Var != null; pim0Var = pim0Var.e) {
                        if ((pim0Var.c & 8) != 0) {
                            pim0 pim0VarS = pim0Var;
                            bfn0 bfn0Var = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof t161) {
                                    t161 t161Var = (t161) pim0VarS;
                                    if (t161Var.H()) {
                                        o161 o161Var = new o161();
                                        p811Var.a = o161Var;
                                        o161Var.d = true;
                                    }
                                    if (t161Var.q1()) {
                                        ((o161) p811Var.a).c = true;
                                    }
                                    t161Var.g((e261) p811Var.a);
                                } else if ((pim0VarS.c & 8) != 0 && (pim0VarS instanceof l5t)) {
                                    int i4 = 0;
                                    for (pim0 pim0Var2 = ((l5t) pim0VarS).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                        if ((pim0Var2.c & 8) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                pim0VarS = pim0Var2;
                                            } else {
                                                if (bfn0Var == null) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var.b(pim0Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var);
                            }
                        }
                    }
                }
                return rih1.a;
            case 2:
                mdt mdtVar = (mdt) this.b;
                upb0 upb0Var = (upb0) this.c;
                epb0 epb0Var = (epb0) mdtVar.getValue();
                return new fpb0(upb0Var, epb0Var, new mgc((tr80) ((ksb0) upb0Var.d.f).getValue(), epb0Var));
            case 3:
                mdt mdtVar2 = (mdt) this.b;
                jkr0 jkr0Var = (jkr0) this.c;
                rjr0 rjr0Var = (rjr0) mdtVar2.getValue();
                return new sjr0(jkr0Var, rjr0Var, new mgc((tr80) ((ksb0) jkr0Var.d.f).getValue(), (mmo1) rjr0Var));
            case 4:
                return new hub0((nd41) this.b, b7x.a, (kd41) this.c);
            case 5:
                mdt mdtVar3 = (mdt) this.b;
                fvb0 fvb0Var = (fvb0) this.c;
                pub0 pub0Var = (pub0) mdtVar3.getValue();
                return new qub0(fvb0Var, pub0Var, new mgc((tr80) ((ksb0) fvb0Var.c.h).getValue(), pub0Var));
            case 6:
                ((x8c0) this.b).d((uzs) this.c);
                return rih1.a;
            case 7:
                swg0 swg0Var = (swg0) this.b;
                vug0 vug0Var = (vug0) this.c;
                wat watVar = oap1.B(vug0Var).Z0;
                vug0Var.S0.s();
                int iS = vug0Var.T0.s();
                swg0Var.getClass();
                return Integer.valueOf(jch0.U(0.33333334f * iS));
            case 8:
                kqi0 kqi0Var = (kqi0) this.b;
                j311 j311Var = (j311) this.c;
                if (((uj7) kqi0Var.b).get() == 0) {
                    j311Var.invoke();
                }
                return rih1.a;
            case 9:
                String str3 = (String) this.b;
                pfp0 pfp0Var = (pfp0) this.c;
                uic1 uic1Var = uic1.j;
                h661[] h661VarArr = new h661[0];
                if (ihc1.y0(str3)) {
                    hhg1.n("Blank serial names are prohibited");
                    return null;
                }
                if (uic1Var == uic1.h) {
                    hhg1.n("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                neg negVar = new neg(str3);
                negVar.b = pfp0Var.b;
                return new j661(str3, uic1Var, negVar.c.size(), f46.Q0(h661VarArr), negVar);
            case 10:
                oen0 oen0Var = (oen0) this.b;
                h4k h4kVar = (h4k) this.c;
                Object[] objArr = oen0Var.b;
                long[] jArr = oen0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j2 = jArr[i5];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j2) < 128) {
                                    h4kVar.z(objArr[(i5 << 3) + i7]);
                                }
                                j2 >>= 8;
                            }
                            if (i6 == 8) {
                                if (i5 != length) {
                                    i5++;
                                }
                            }
                        } else if (i5 != length) {
                            i5++;
                        }
                    }
                }
                return rih1.a;
            case 11:
                se11 se11Var = (se11) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                return mno1.m(se11Var.a.matcher(charSequence), 0, charSequence);
            case 12:
                return omo1.k((String) this.b, rcv0.h, new h661[0], new ev41((fv41) this.c, (byte) 0));
            case 13:
                gub0 gub0Var = (gub0) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (gt71.b) {
                    LinkedHashMap linkedHashMap2 = gt71.c;
                    linkedHashMap2.remove(gub0Var);
                    if (linkedHashMap2.isEmpty()) {
                        qs10 qs10VarA = qs10.a();
                        int i8 = mvl1.a;
                        qs10VarA.getClass();
                        connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) gt71.a);
                        gt71.f = null;
                        gt71.d = null;
                        gt71.e = false;
                    }
                    break;
                }
                return rih1.a;
            case 14:
                xr91 xr91Var = (xr91) this.b;
                wg10 wg10Var = (wg10) this.c;
                if (!u890.j(xr91Var, wg10Var.a)) {
                    r7h.a0(wg10Var.b, new waq0(xr91Var, (byte) 23));
                    h311 h311Var = wg10Var.c;
                    if (h311Var != null) {
                        h311Var.b();
                    }
                }
                return rih1.a;
            case 15:
                wr91 wr91Var = (wr91) this.b;
                vg10 vg10Var = (vg10) this.c;
                if (!u890.j(wr91Var, vg10Var.a)) {
                    r7h.a0(vg10Var.b, new waq0(wr91Var, (byte) 24));
                    h311 h311Var2 = vg10Var.c;
                    if (h311Var2 != null) {
                        h311Var2.b();
                    }
                }
                return rih1.a;
            case 16:
                return ((iu30) this.b).invoke((WorkDatabase) this.c);
            case 17:
                return Float.valueOf((((i3d1) this.b).a == null || ((Number) ((o95) this.c).e()).floatValue() < 0.5f) ? 0.0f : 1.0f);
            case 18:
                kw7.G((Context) this.b, (TextClassification) this.c);
                return rih1.a;
            case 19:
                n4e1 n4e1Var = (n4e1) this.b;
                n811 n811Var = (n811) this.c;
                n4e1Var.T0.h();
                if (((pim0) n4e1Var).N0 && ((crl1) lcc.z(n4e1Var, t4k.u)).b()) {
                    i = 1;
                }
                int i9 = n811Var.a;
                int i10 = i * i9;
                n811Var.a = i9 * (-1);
                return Integer.valueOf(i10);
            case 20:
                r7e1 r7e1Var = (r7e1) this.b;
                z4e1 z4e1Var = (z4e1) this.c;
                if (!r7e1Var.h) {
                    l030 l030Var = z4e1Var.b1;
                    if (((pim0) l030Var).N0) {
                        d030.O1(l030Var.V0);
                    }
                }
                return rih1.a;
            case 21:
                x6e1 x6e1Var = (x6e1) this.b;
                long j3 = ((yr80) ((ven0) this.c).getValue()).a;
                Offset offsetG = x6e1Var.g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (offsetG != null) {
                    long j4 = offsetG.a;
                    af5 af5VarK = x6e1Var.k();
                    if (af5VarK != null && af5VarK.b.length() != 0) {
                        qr50 qr50Var = (qr50) x6e1Var.q.getValue();
                        int i11 = qr50Var == null ? -1 : a7e1.a[qr50Var.ordinal()];
                        if (i11 != -1) {
                            if (i11 == 1 || i11 == 2) {
                                long j5 = x6e1Var.l().b;
                                int i12 = nbe1.c;
                                j = j5 >> 32;
                            } else {
                                if (i11 != 3) {
                                    eg.o();
                                    return null;
                                }
                                long j6 = x6e1Var.l().b;
                                int i13 = nbe1.c;
                                j = j6 & 4294967295L;
                            }
                            int i14 = (int) j;
                            r1c0 r1c0Var2 = x6e1Var.d;
                            if (r1c0Var2 != null && (z9e1VarD = r1c0Var2.d()) != null && (r1c0Var = x6e1Var.d) != null && (af5Var = (af5) r1c0Var.a.b) != null) {
                                int iP = yoi1.p(x6e1Var.b.o(i14), 0, af5Var.b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (z9e1VarD.d(j4) >> 32));
                                y9e1 y9e1Var = z9e1VarD.a;
                                zrm0 zrm0Var = y9e1Var.b;
                                int iD2 = zrm0Var.d(iP);
                                float fG = y9e1Var.g(iD2);
                                float fH = y9e1Var.h(iD2);
                                float fO = yoi1.o(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
                                if (yr80.b(j3, 0L) || Math.abs(fIntBitsToFloat - fO) <= ((int) (j3 >> 32)) / 2) {
                                    float f = zrm0Var.f(iD2);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fO)) << 32) | (((long) Float.floatToRawIntBits(((zrm0Var.b(iD2) - f) / 2.0f) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new Offset(jFloatToRawIntBits);
            case 22:
                ze5 ze5Var = (ze5) this.b;
                f65 f65Var = (f65) this.c;
                mjc0 mjc0Var = (mjc0) ze5Var.a;
                if (mjc0Var instanceof ljc0) {
                    rjc0 rjc0Var2 = ((ljc0) mjc0Var).c;
                    if (rjc0Var2 != null) {
                        rjc0Var2.a(mjc0Var);
                    } else {
                        try {
                            f65Var.a(((ljc0) mjc0Var).a);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((mjc0Var instanceof kjc0) && (rjc0Var = ((kjc0) mjc0Var).c) != null) {
                    rjc0Var.a(mjc0Var);
                }
                return rih1.a;
            case 23:
                ggg1 ggg1Var = (ggg1) this.b;
                return j1e1.n(ggg1Var.a.d(), (uwg) this.c, ggg1Var.f());
            case 24:
                ggg1 ggg1Var2 = (ggg1) this.b;
                p5x0 p5x0Var = (p5x0) this.c;
                mdt mdtVar4 = ggg1Var2.e;
                i4e1 i4e1VarD = (mdtVar4 == null || (egg1Var = (egg1) mdtVar4.getValue()) == null) ? ggg1Var2.a.d() : egg1Var.a;
                y061 y061VarF = ggg1Var2.f();
                h4u h4uVar = new h4u();
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                while (i2 < i4e1VarD.d.length()) {
                    int iCodePointAt = Character.codePointAt((CharSequence) i4e1VarD, i2);
                    p5x0Var.getClass();
                    int i15 = iCodePointAt == 10 ? 32 : iCodePointAt == 13 ? 65279 : iCodePointAt;
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (i15 != iCodePointAt) {
                        h4uVar.h(sb.length(), sb.length() + iCharCount, Character.charCount(i15));
                        z = true;
                    }
                    sb.appendCodePoint(i15);
                    i2 += iCharCount;
                }
                i4e1 string = z ? sb.toString() : i4e1VarD;
                if (string == i4e1VarD) {
                    return null;
                }
                long jZ = j1e1.z(i4e1VarD.e, h4uVar, y061VarF);
                nbe1 nbe1Var = i4e1VarD.f;
                return new egg1(new i4e1(string, jZ, nbe1Var != null ? new nbe1(j1e1.z(nbe1Var.a, h4uVar, y061VarF)) : null, (mmr0) null, (List) null, (List) null, (b8e1) null, 120), h4uVar);
            case 25:
                ((o6) this.b).removeOnAttachStateChangeListener((ri30) this.c);
                return rih1.a;
            case 26:
                ((o6) this.b).removeOnAttachStateChangeListener((c9s) this.c);
                return rih1.a;
            default:
                ((x8c0) this.b).d((rg) this.c);
                return rih1.a;
        }
    }

    public /* synthetic */ qga0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
