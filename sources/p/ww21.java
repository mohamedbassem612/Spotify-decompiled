package p;

import android.app.RemoteAction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.scrollsita.v1.Section;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ww21 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ww21(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x025c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0260 A[Catch: all -> 0x0275, LOOP:5: B:102:0x022d->B:113:0x0260, LOOP_END, TryCatch #0 {all -> 0x0275, blocks: (B:99:0x021a, B:102:0x022d, B:104:0x023b, B:106:0x0245, B:108:0x024b, B:109:0x0254, B:113:0x0260, B:114:0x0266), top: B:209:0x021a }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        int iB0;
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        Function0 function0;
        char c;
        boolean z;
        long j;
        y5e1 y5e1Var;
        long j2 = -9187201950435737472L;
        char c2 = 7;
        int i = 2;
        boolean z2 = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                xw21 xw21Var = (xw21) this.b;
                ClassLoader classLoader = xw21Var.c;
                i520 i520Var = xw21Var.d;
                ArrayList<URL> list = Collections.list(classLoader.getResources(""));
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (u890.j(url.getProtocol(), "file")) {
                        String str = s8s0.b;
                        mmr0Var2 = new mmr0(i520Var, gtv0.e(new File(url.toURI())));
                    } else {
                        mmr0Var2 = null;
                    }
                    if (mmr0Var2 != null) {
                        arrayList.add(mmr0Var2);
                    }
                }
                ArrayList<URL> list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String string = url2.toString();
                    if (nhc1.Y(string, "jar:file:", false) && (iB0 = ihc1.B0(string, "!", 0, 6)) != -1) {
                        String str2 = s8s0.b;
                        mmr0Var = new mmr0(rrn1.D(gtv0.e(new File(URI.create(string.substring(4, iB0)))), i520Var, new cix0((byte) 1)), xw21.f);
                    } else {
                        mmr0Var = null;
                    }
                    if (mmr0Var != null) {
                        arrayList2.add(mmr0Var);
                    }
                }
                return o7h.N0(arrayList2, arrayList);
            case 1:
                return ((Callable) this.b).call();
            case 2:
                id41 id41Var = (id41) this.b;
                cf41 cf41Var = id41Var.a;
                Object obj = id41Var.d;
                if (obj != null) {
                    return cf41Var.b(id41Var, obj);
                }
                hhg1.n("Value should be initialized");
                return null;
            case 3:
                nt21 nt21Var = ((qd41) this.b).c;
                if (nt21Var == null) {
                    return null;
                }
                Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
                nt21Var.o(bundleH);
                if (bundleH.isEmpty()) {
                    return null;
                }
                return bundleH;
            case 4:
                qe41 qe41Var = (qe41) this.b;
                qe41Var.getLifecycle().a(new d411(qe41Var, (byte) 0));
                return rih1.a;
            case 5:
                rs41 rs41Var = (rs41) this.b;
                ixq0 ixq0Var = (ixq0) lcc.z(rs41Var, jxq0.a);
                rs41Var.b1 = ixq0Var;
                rs41Var.c1 = ixq0Var != null ? ixq0Var.a() : null;
                return rih1.a;
            case 6:
                jo51 jo51Var = (jo51) this.b;
                mhg1 mhg1Var = jo51Var.f;
                jo51Var.g = mhg1Var != null ? ((Number) mhg1Var.m.getValue()).longValue() : 0L;
                return rih1.a;
            case 7:
                return this.b;
            case 8:
                return ((oma0) ((ArrayList) this.b).get(0)).k();
            case 9:
                aw61 aw61Var = (aw61) this.b;
                hrr0 hrr0Var = aw61Var.c;
                if (((Size) hrr0Var.getValue()).a == 9205357640488583168L || Size.g(((Size) hrr0Var.getValue()).a)) {
                    return null;
                }
                return aw61Var.a.c(((Size) hrr0Var.getValue()).a);
            case 10:
                return ((vy71) this.b).d;
            case 11:
                tb91 tb91Var = (tb91) this.b;
                if (!((Boolean) tb91Var.n.getValue()).booleanValue() && (function0 = tb91Var.b) != null) {
                    function0.invoke();
                }
                return rih1.a;
            case 12:
                ((wr91) this.b).a();
                return Boolean.TRUE;
            case 13:
                long j3 = 128;
                gw91 gw91Var = (gw91) this.b;
                while (true) {
                    synchronized (gw91Var.g) {
                        try {
                            if (gw91Var.c) {
                                c = c2;
                            } else {
                                gw91Var.c = z2;
                                try {
                                    bfn0 bfn0Var = gw91Var.f;
                                    Object[] objArr = bfn0Var.a;
                                    int i3 = bfn0Var.c;
                                    int i4 = i2;
                                    while (i4 < i3) {
                                        try {
                                            fw91 fw91Var = (fw91) objArr[i4];
                                            oen0 oen0Var = fw91Var.g;
                                            iu30 iu30Var = fw91Var.a;
                                            Object[] objArr2 = oen0Var.b;
                                            long[] jArr = oen0Var.a;
                                            int length = jArr.length - i;
                                            char c3 = c2;
                                            if (length >= 0) {
                                                int i5 = i2;
                                                while (true) {
                                                    long j4 = jArr[i5];
                                                    int i6 = length;
                                                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8 - ((~(i5 - i6)) >>> 31);
                                                        int i8 = 0;
                                                        while (i8 < i7) {
                                                            if ((j4 & 255) < j3) {
                                                                iu30Var.invoke(objArr2[(i5 << 3) + i8]);
                                                            }
                                                            j4 >>= 8;
                                                            i8++;
                                                            j3 = 128;
                                                        }
                                                        if (i7 == 8) {
                                                            length = i6;
                                                            if (i5 != length) {
                                                                i5++;
                                                                j3 = 128;
                                                            }
                                                        }
                                                    } else {
                                                        length = i6;
                                                        if (i5 != length) {
                                                            i5++;
                                                            j3 = 128;
                                                        }
                                                    }
                                                }
                                            }
                                            oen0Var.b();
                                            i4++;
                                            c2 = c3;
                                            i = 2;
                                            i2 = 0;
                                            j3 = 128;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = 0;
                                            gw91Var.c = z;
                                            throw th;
                                        }
                                    }
                                    c = c2;
                                    gw91Var.c = i2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = i2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!gw91Var.c()) {
                        return rih1.a;
                    }
                    c2 = c;
                    i = 2;
                    z2 = true;
                    i2 = 0;
                    j3 = 128;
                }
                break;
            case 14:
                String string2 = ((SharedPreferences) ((r2a1) this.b).b).getString("pref_key_sticky_variant", null);
                if (string2 == null) {
                    return new LinkedHashMap();
                }
                List listQ0 = ihc1.Q0(string2, new String[]{"|"}, 0, 6);
                int iS = zno1.s(q7h.U(listQ0, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                Iterator it = listQ0.iterator();
                while (it.hasNext()) {
                    List listQ1 = ihc1.Q0((String) it.next(), new String[]{"="}, 2, 2);
                    if (listQ1.size() != 2) {
                        listQ1 = null;
                    }
                    mmr0 mmr0Var3 = listQ1 != null ? new mmr0(listQ1.get(0), listQ1.get(1)) : new mmr0("", "");
                    linkedHashMap.put(mmr0Var3.a, mmr0Var3.b);
                }
                return new LinkedHashMap(linkedHashMap);
            case 15:
                vmb0 vmb0VarA = ((slc1) this.b).a();
                hmb0 hmb0Var = vmb0VarA.a;
                if (vmb0VarA.N0 != hmb0Var.p().a.c) {
                    nen0 nen0Var = vmb0VarA.f;
                    Object[] objArr3 = nen0Var.c;
                    long[] jArr2 = nen0Var.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j5 = jArr2[i9];
                            if ((((~j5) << 7) & j5 & j2) != j2) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j5 & 255) < 128) {
                                        ((nmb0) objArr3[(i9 << 3) + i11]).d = true;
                                    }
                                    j5 >>= 8;
                                    i11++;
                                    j2 = j2;
                                }
                                j = j2;
                                if (i10 == 8) {
                                }
                            } else {
                                j = j2;
                            }
                            if (i9 != length2) {
                                i9++;
                                j2 = j;
                            }
                        }
                    }
                    if (hmb0Var.i != null) {
                        if (!hmb0Var.f1.e) {
                            hmb0.U(hmb0Var, false, 7);
                        }
                    } else if (!hmb0Var.r()) {
                        hmb0.W(hmb0Var, false, 7);
                    }
                }
                return rih1.a;
            case 16:
                return Float.valueOf(((Number) ((o95) this.b).e()).floatValue());
            case 17:
                g0e1 g0e1Var = (g0e1) this.b;
                g0e1Var.e1 = null;
                nko1.C(g0e1Var);
                dio1.y(g0e1Var);
                ha71.x(g0e1Var);
                return Boolean.TRUE;
            case 18:
                ykb0.m((RemoteAction) this.b);
                return rih1.a;
            case 19:
                u3e1 u3e1Var = (u3e1) this.b;
                return ((pim0) u3e1Var).N0 ? o2p1.g(u3e1Var) : f3e1.b;
            case 20:
                j6e1 j6e1Var = (j6e1) this.b;
                return new Offset(w3p1.e(j6e1Var.Q0, j6e1Var.R0, j6e1Var.S0, ((yr80) j6e1Var.U0.getValue()).a));
            case 21:
                return Float.valueOf(((j8e1) this.b).b);
            case 22:
                return new BaseInputConnection(((b9e1) this.b).a, false);
            case 23:
                a6e1 a6e1Var = ((aae1) this.b).a;
                z5e1 z5e1Var = (z5e1) a6e1Var.a.getValue();
                if (z5e1Var == null || (y5e1Var = (y5e1) a6e1Var.b.getValue()) == null) {
                    return null;
                }
                return a6e1Var.c(z5e1Var, y5e1Var);
            case 24:
                return new qr80(((ur80) this.b).c());
            case 25:
                jee1 jee1Var = (jee1) this.b;
                jee1Var.Z0 = null;
                nko1.C(jee1Var);
                dio1.y(jee1Var);
                ha71.x(jee1Var);
                return Boolean.TRUE;
            case 26:
                qze1 qze1Var = (qze1) this.b;
                qze1Var.n1.invoke(Boolean.valueOf(!qze1Var.m1));
                return rih1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                TooltipContainer tooltipContainer = (TooltipContainer) this.b;
                int i12 = TooltipContainer.P0;
                tooltipContainer.b();
                return rih1.a;
            case 28:
                dui1 dui1Var = (dui1) this.b;
                rih1 rih1Var = rih1.a;
                dui1Var.i.setValue(rih1Var);
                return rih1Var;
            default:
                hay.a((nvl1) this.b);
                return rih1.a;
        }
    }
}
