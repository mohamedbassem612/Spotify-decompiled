package p;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.widget.widget.widgetimpl.SpotifyWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class p2o1 {
    public static final g6f0 a = new g6f0((byte) 21);
    public static final tii b = new tii((byte) 2);
    public static b180 c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException */
    public static u2o1 A(Metadata metadata) throws InconsistentKotlinMetadataException {
        String string;
        if (metadata.mv().length == 0) {
            hhg1.n("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        joj0 joj0Var = new joj0((metadata.xi() & 8) != 0, metadata.mv());
        boolean zA = joj0Var.a(1, 1, 0);
        if (!zA) {
            if (zA) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(joj0Var.f ? joj0.g : joj0.h);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            hhg1.i("Provided Metadata instance has version ", joj0Var, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new i6b0(metadata);
            }
            if (iK == 2) {
                return new j6b0(metadata);
            }
            if (iK == 3) {
                return new m6b0(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new l6b0(metadata);
                }
                m6b0 m6b0Var = new m6b0();
                new hja0(metadata.mv());
                metadata.xi();
                return m6b0Var;
            }
            List listAsList = Arrays.asList(metadata.d1());
            new hja0(metadata.mv());
            metadata.xi();
            k6b0 k6b0Var = new k6b0();
            k6b0Var.c = listAsList;
            return k6b0Var;
        } catch (Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                throw th;
            }
            throw new InconsistentKotlinMetadataException("Exception occurred when reading Kotlin metadata", th);
        }
    }

    public static final rgy0 B(yfy0 yfy0Var, l141 l141Var) {
        int i = yfy0Var.c;
        if ((i & 32) == 32) {
            return yfy0Var.t;
        }
        if ((i & 64) == 64) {
            return l141Var.a(yfy0Var.X);
        }
        return null;
    }

    public static final rgy0 C(ggy0 ggy0Var, l141 l141Var) {
        int i = ggy0Var.c;
        if ((i & 32) == 32) {
            return ggy0Var.t;
        }
        if ((i & 64) == 64) {
            return l141Var.a(ggy0Var.X);
        }
        return null;
    }

    public static final boolean D(h3j1 h3j1Var, a7q0 a7q0Var, uxn uxnVar, pn30 pn30Var) {
        return ((h0p1.s(h3j1Var, a7q0Var, uxnVar) instanceof w2a) && h0p1.t(pn30Var) == null && (!((pn30Var != null ? pn30Var.a : 0) == 3) || h0p1.r(h3j1Var, uxnVar).isEmpty())) ? false : true;
    }

    public static final rgy0 E(yfy0 yfy0Var, l141 l141Var) {
        int i = yfy0Var.c;
        if ((i & 8) == 8) {
            return yfy0Var.g;
        }
        if ((i & 16) == 16) {
            return l141Var.a(yfy0Var.h);
        }
        eg.m("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final rgy0 F(ggy0 ggy0Var, l141 l141Var) {
        int i = ggy0Var.c;
        if ((i & 8) == 8) {
            return ggy0Var.g;
        }
        if ((i & 16) == 16) {
            return l141Var.a(ggy0Var.h);
        }
        eg.m("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final List G(hfy0 hfy0Var, l141 l141Var) {
        List arrayList = hfy0Var.h;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = hfy0Var.i;
            arrayList = new ArrayList(q7h.U(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(l141Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static void H(d2d d2dVar, ArrayList arrayList) {
        if (d2dVar instanceof e2d) {
            throw null;
        }
        if (d2dVar instanceof qnd) {
            arrayList.add(((qnd) d2dVar).a);
        } else {
            arrayList.add(new t1d(d2dVar));
        }
    }

    public static final String I(uwz0 uwz0Var) {
        if (uwz0Var instanceof swz0) {
            return "offline";
        }
        if (!(uwz0Var instanceof twz0)) {
            eg.o();
            return null;
        }
        Set set = ((twz0) uwz0Var).a;
        if (set != null) {
            return set.contains(a7o0.b) ? "cellular" : "wifi";
        }
        return null;
    }

    public static final rgy0 J(zgy0 zgy0Var, l141 l141Var) {
        int i = zgy0Var.c;
        if ((i & 4) == 4) {
            return zgy0Var.f;
        }
        if ((i & 8) == 8) {
            return l141Var.a(zgy0Var.g);
        }
        eg.m("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final List K(wgy0 wgy0Var, l141 l141Var) {
        List arrayList = wgy0Var.h;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = wgy0Var.i;
            arrayList = new ArrayList(q7h.U(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(l141Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final void L(Context context, vu30 vu30Var) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            try {
                int i = SpotifyWidget.j;
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) SpotifyWidget.class));
                appWidgetIds.getClass();
                vu30Var.invoke(appWidgetManager, appWidgetIds);
            } catch (RemoteException e) {
                Logger.e(e, "Failed to get AppWidgetManager", new Object[0]);
            }
        }
    }

    public static int M(byte[] bArr, int i, qhn1 qhn1Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return N(b2, i2, qhn1Var, bArr);
        }
        qhn1Var.a = b2;
        return i2;
    }

    public static int N(int i, int i2, qhn1 qhn1Var, byte[] bArr) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            qhn1Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            qhn1Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            qhn1Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            qhn1Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                qhn1Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int O(int i, int i2, qhn1 qhn1Var, byte[] bArr) {
        int iM = M(bArr, i, qhn1Var);
        int i3 = qhn1Var.a;
        if (i3 < 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 <= i2 - iM) {
            return iM;
        }
        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int P(byte[] bArr, int i, qhn1 qhn1Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            qhn1Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        qhn1Var.b = j2;
        return i3;
    }

    public static int Q(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long R(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int S(qjn1 qjn1Var, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        rin1 rin1VarZza = qjn1Var.zza();
        int iT = T(rin1VarZza, qjn1Var, bArr, i, i2, qhn1Var);
        qjn1Var.b(rin1VarZza);
        qhn1Var.c = rin1VarZza;
        return iT;
    }

    public static int T(Object obj, qjn1 qjn1Var, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        int iO = O(i, i2, qhn1Var, bArr);
        int i3 = qhn1Var.a;
        int i4 = qhn1Var.d + 1;
        qhn1Var.d = i4;
        if (i4 >= 100) {
            x4n1.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i5 = i3 + iO;
        qjn1Var.e(obj, bArr, iO, i5, qhn1Var);
        qhn1Var.d--;
        qhn1Var.c = obj;
        return i5;
    }

    public static int U(Object obj, qjn1 qjn1Var, byte[] bArr, int i, int i2, int i3, qhn1 qhn1Var) {
        ijn1 ijn1Var = (ijn1) qjn1Var;
        int i4 = qhn1Var.d + 1;
        qhn1Var.d = i4;
        if (i4 >= 100) {
            x4n1.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iU = ijn1Var.u(obj, bArr, i, i2, i3, qhn1Var);
        qhn1Var.d--;
        qhn1Var.c = obj;
        return iU;
    }

    public static int V(int i, byte[] bArr, int i2, int i3, win1 win1Var, qhn1 qhn1Var) {
        sin1 sin1Var = (sin1) win1Var;
        int iM = M(bArr, i2, qhn1Var);
        sin1Var.zzh(qhn1Var.a);
        while (iM < i3) {
            int iM2 = M(bArr, iM, qhn1Var);
            if (i != qhn1Var.a) {
                break;
            }
            iM = M(bArr, iM2, qhn1Var);
            sin1Var.zzh(qhn1Var.a);
        }
        return iM;
    }

    public static int W(byte[] bArr, int i, win1 win1Var, qhn1 qhn1Var) {
        sin1 sin1Var = (sin1) win1Var;
        int iO = O(i, bArr.length, qhn1Var, bArr);
        int i2 = qhn1Var.a + iO;
        while (iO < i2) {
            iO = M(bArr, iO, qhn1Var);
            sin1Var.zzh(qhn1Var.a);
        }
        if (iO == i2) {
            return iO;
        }
        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int X(qjn1 qjn1Var, int i, byte[] bArr, int i2, int i3, win1 win1Var, qhn1 qhn1Var) {
        int iS = S(qjn1Var, bArr, i2, i3, qhn1Var);
        win1Var.add(qhn1Var.c);
        while (iS < i3) {
            int iM = M(bArr, iS, qhn1Var);
            if (i != qhn1Var.a) {
                break;
            }
            iS = S(qjn1Var, bArr, iM, i3, qhn1Var);
            win1Var.add(qhn1Var.c);
        }
        return iS;
    }

    public static int Y(int i, byte[] bArr, int i2, int i3, bkn1 bkn1Var, qhn1 qhn1Var) {
        if ((i >>> 3) == 0) {
            x4n1.g("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iP = P(bArr, i2, qhn1Var);
            bkn1Var.d(i, Long.valueOf(qhn1Var.b));
            return iP;
        }
        if (i4 == 1) {
            bkn1Var.d(i, Long.valueOf(R(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iO = O(i2, bArr.length, qhn1Var, bArr);
            int i5 = qhn1Var.a;
            if (i5 == 0) {
                bkn1Var.d(i, ain1.b);
            } else {
                bkn1Var.d(i, ain1.x(iO, bArr, i5));
            }
            return iO + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                bkn1Var.d(i, Integer.valueOf(Q(bArr, i2)));
                return i2 + 4;
            }
            x4n1.g("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        bkn1 bkn1VarA = bkn1.a();
        int i7 = qhn1Var.d + 1;
        qhn1Var.d = i7;
        if (i7 >= 100) {
            x4n1.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM = M(bArr, i2, qhn1Var);
            int i9 = qhn1Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM;
                break;
            }
            i2 = Y(i9, bArr, iM, i3, bkn1VarA, qhn1Var);
            i8 = i9;
        }
        qhn1Var.d--;
        if (i2 > i3 || i8 != i6) {
            x4n1.g("Failed to parse the message.");
            return 0;
        }
        bkn1Var.d(i, bkn1VarA);
        return i2;
    }

    public static final void a(int i, h3h1 h3h1Var, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1244242943);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(h3h1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            h3h1 k3h1Var = new k3h1(i);
            h3h1 wchVar = q6x.b;
            if (h3h1Var.equals(wchVar) && k3h1Var.equals(wchVar)) {
                k3h1Var = wchVar;
            } else if (!h3h1Var.equals(wchVar)) {
                if (k3h1Var.equals(wchVar)) {
                    k3h1Var = h3h1Var;
                } else {
                    wchVar = new wch(h3h1Var, k3h1Var);
                    k3h1Var = wchVar;
                }
            }
            ago1.b(k3h1Var, apo.r(-1188736190, new pu2(j2iVar, (byte) 24), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, h3h1Var, j2iVar, i2, (byte) 6);
        }
    }

    public static final void b(k3h1 k3h1Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1290392921);
        int i2 = (x340Var.i(k3h1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ago1.b(k3h1Var, apo.r(430316422, new pu2(j2iVar, (byte) 23), x340Var), x340Var, (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(k3h1Var, j2iVar, i, (byte) 26);
        }
    }

    public static final void c(boolean z, iu30 iu30Var, j2e0 j2e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1220382599);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(j2e0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131958279);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new t4h0(j2e0Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            idx idxVar = new idx();
            if (z) {
                x340Var.i0(-261590675);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(-261588897);
                haxVar = new hax(cwl1.o0(x340Var, 2131958281));
                x340Var.r(false);
            }
            jax jaxVar = haxVar;
            gdx gdxVarS = yla.s(x340Var);
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, idxVar, anm1.N("martini-new-conversation-button", qim0Var3), jaxVar, gdxVarS, null, null, null, null, nzi.c, nzi.d, x340Var, 0, 54, 968);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u4h0(z, iu30Var, j2e0Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void d(iu30 iu30Var, j2e0 j2e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1982076672);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.g(j2e0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131958282);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new t4h0(j2e0Var, iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bzg0.U0;
                x340Var.s0(objT2);
            }
            hdx hdxVar = new hdx(0, (vu30) null, (vu30) objT2, (vu30) null, (hw61) null, 27);
            gdx gdxVarS = yla.s(x340Var);
            j2i j2iVar = nzi.a;
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, hdxVar, qim0Var3, null, gdxVarS, null, false, null, null, j2iVar, x340Var, 384, 6, 984);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(iu30Var, j2e0Var, qim0Var2, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:133:0x021c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0220  */
    /* JADX WARN: Code duplicated, block: B:138:0x0230  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc A[PHI: r16
      0x00cc: PHI (r16v22 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:73:0x00ca, B:83:0x00e7, B:82:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void e(boolean z, String str, boolean z2, iu30 iu30Var, j2e0 j2e0Var, qim0 qim0Var, boolean z3, boolean z4, be50 be50Var, long j, b0k b0kVar, int i, int i2) {
        int i3;
        String str2;
        iu30 iu30Var2;
        boolean z5;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        boolean zI;
        boolean z7;
        x340 x340Var;
        be50 be50Var2;
        boolean z8;
        boolean z9;
        long j2;
        h311 h311VarV;
        Throwable th;
        be50 be50Var3;
        int i8;
        long j3;
        be50 be50Var4;
        j2i j2iVarR;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1872291659);
        if ((i & 6) == 0) {
            i3 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= x340Var2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            iu30Var2 = iu30Var;
            i3 |= x340Var2.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? x340Var2.g(j2e0Var) : x340Var2.i(j2e0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 131072 : 65536;
        }
        int i9 = i2 & 64;
        if (i9 == 0) {
            if ((1572864 & i) == 0) {
                z5 = z3;
                i3 |= x340Var2.h(z5) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    z6 = z4;
                    if (x340Var2.h(z6)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 256;
                i7 = 100663296;
                if (i6 == 0) {
                    i3 |= i7;
                } else if ((i & 100663296) == 0) {
                    if ((i & 134217728) == 0) {
                        zI = x340Var2.g(be50Var);
                    } else {
                        zI = x340Var2.i(be50Var);
                    }
                    if (zI) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((i & 805306368) != 0) {
                    i3 |= ((i2 & 512) == 0 || !x340Var2.f(j)) ? 268435456 : 536870912;
                }
                if ((i3 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (x340Var2.Y(i3 & 1, z7)) {
                    x340Var2.d0();
                    th = null;
                    if ((i & 1) != 0 || x340Var2.E()) {
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        }
                        if (i6 != 0) {
                            be50Var3 = null;
                        } else {
                            be50Var3 = be50Var;
                        }
                        if ((i2 & 512) != 0) {
                            j3 = 0;
                            i8 = i3 & (-1879048193);
                        } else {
                            i8 = i3;
                            j3 = j;
                        }
                        be50Var4 = be50Var3;
                    } else {
                        x340Var2.b0();
                        if ((i2 & 512) != 0) {
                            i3 &= -1879048193;
                        }
                        i8 = i3;
                        z6 = z6;
                        th = null;
                        be50Var4 = be50Var;
                        j3 = j;
                    }
                    x340Var2.s();
                    iu30 iu30Var3 = iu30Var2;
                    z8 = z5;
                    j2iVarR = apo.r(-553211497, new z96(z, iu30Var3, j2e0Var, str2, z8, z2), x340Var2);
                    if (z6) {
                        x340Var2.i0(-1297500123);
                        xo30 xo30Var = new xo30(47);
                        qim0 qim0VarN = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                        ukb0 ukb0Var = be50.C;
                        e4p1.d(be50Var4, qim0VarN, j3, xo30Var, 0.0f, j2iVarR, x340Var2, ((i8 >> 24) & 14) | 196616 | ((i8 >> 21) & 896));
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var2;
                        x340Var.i0(-1297130386);
                        qim0 qim0VarN2 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarN2);
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw th;
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
                        k4s0.i(6, j2iVarR, x340Var, true, false);
                    }
                    z9 = z6;
                    be50Var2 = be50Var4;
                    j2 = j3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    be50Var2 = be50Var;
                    z8 = z5;
                    z9 = z6;
                    j2 = j;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new v4h0(z, str, z2, iu30Var, j2e0Var, qim0Var, z8, z9, be50Var2, j2, i, i2);
                }
            }
            i3 |= 12582912;
            z6 = z4;
            i6 = i2 & 256;
            i7 = 100663296;
            if (i6 == 0) {
                i3 |= i7;
            } else if ((i & 100663296) == 0) {
                if ((i & 134217728) == 0) {
                    zI = x340Var2.g(be50Var);
                } else {
                    zI = x340Var2.i(be50Var);
                }
                if (zI) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((i & 805306368) != 0) {
                i3 |= ((i2 & 512) == 0 || !x340Var2.f(j)) ? 268435456 : 536870912;
            }
            if ((i3 & 306783379) != 306783378) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (x340Var2.Y(i3 & 1, z7)) {
                x340Var2.d0();
                th = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    }
                    if (i6 != 0) {
                        be50Var3 = null;
                    } else {
                        be50Var3 = be50Var;
                    }
                    if ((i2 & 512) != 0) {
                        j3 = 0;
                        i8 = i3 & (-1879048193);
                    } else {
                        i8 = i3;
                        j3 = j;
                    }
                    be50Var4 = be50Var3;
                } else {
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    }
                    if (i6 != 0) {
                        be50Var3 = null;
                    } else {
                        be50Var3 = be50Var;
                    }
                    if ((i2 & 512) != 0) {
                        j3 = 0;
                        i8 = i3 & (-1879048193);
                    } else {
                        i8 = i3;
                        j3 = j;
                    }
                    be50Var4 = be50Var3;
                }
                x340Var2.s();
                iu30 iu30Var4 = iu30Var2;
                z8 = z5;
                j2iVarR = apo.r(-553211497, new z96(z, iu30Var4, j2e0Var, str2, z8, z2), x340Var2);
                if (z6) {
                    x340Var2.i0(-1297500123);
                    xo30 xo30Var2 = new xo30(47);
                    qim0 qim0VarN3 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                    ukb0 ukb0Var2 = be50.C;
                    e4p1.d(be50Var4, qim0VarN3, j3, xo30Var2, 0.0f, j2iVarR, x340Var2, ((i8 >> 24) & 14) | 196616 | ((i8 >> 21) & 896));
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    x340Var.i0(-1297130386);
                    qim0 qim0VarN4 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarN4);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw th;
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
                    k4s0.i(6, j2iVarR, x340Var, true, false);
                }
                z9 = z6;
                be50Var2 = be50Var4;
                j2 = j3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                be50Var2 = be50Var;
                z8 = z5;
                z9 = z6;
                j2 = j;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new v4h0(z, str, z2, iu30Var, j2e0Var, qim0Var, z8, z9, be50Var2, j2, i, i2);
            }
        }
        i3 |= 1572864;
        z5 = z3;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                z6 = z4;
                if (x340Var2.h(z6)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            i6 = i2 & 256;
            i7 = 100663296;
            if (i6 == 0) {
                i3 |= i7;
            } else if ((i & 100663296) == 0) {
                if ((i & 134217728) == 0) {
                    zI = x340Var2.g(be50Var);
                } else {
                    zI = x340Var2.i(be50Var);
                }
                if (zI) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((i & 805306368) != 0) {
                i3 |= ((i2 & 512) == 0 || !x340Var2.f(j)) ? 268435456 : 536870912;
            }
            if ((i3 & 306783379) != 306783378) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (x340Var2.Y(i3 & 1, z7)) {
                x340Var2.d0();
                th = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    }
                    if (i6 != 0) {
                        be50Var3 = null;
                    } else {
                        be50Var3 = be50Var;
                    }
                    if ((i2 & 512) != 0) {
                        j3 = 0;
                        i8 = i3 & (-1879048193);
                    } else {
                        i8 = i3;
                        j3 = j;
                    }
                    be50Var4 = be50Var3;
                } else {
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    }
                    if (i6 != 0) {
                        be50Var3 = null;
                    } else {
                        be50Var3 = be50Var;
                    }
                    if ((i2 & 512) != 0) {
                        j3 = 0;
                        i8 = i3 & (-1879048193);
                    } else {
                        i8 = i3;
                        j3 = j;
                    }
                    be50Var4 = be50Var3;
                }
                x340Var2.s();
                iu30 iu30Var5 = iu30Var2;
                z8 = z5;
                j2iVarR = apo.r(-553211497, new z96(z, iu30Var5, j2e0Var, str2, z8, z2), x340Var2);
                if (z6) {
                    x340Var2.i0(-1297500123);
                    xo30 xo30Var3 = new xo30(47);
                    qim0 qim0VarN5 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                    ukb0 ukb0Var3 = be50.C;
                    e4p1.d(be50Var4, qim0VarN5, j3, xo30Var3, 0.0f, j2iVarR, x340Var2, ((i8 >> 24) & 14) | 196616 | ((i8 >> 21) & 896));
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    x340Var.i0(-1297130386);
                    qim0 qim0VarN6 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarN6);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw th;
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
                    k4s0.i(6, j2iVarR, x340Var, true, false);
                }
                z9 = z6;
                be50Var2 = be50Var4;
                j2 = j3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                be50Var2 = be50Var;
                z8 = z5;
                z9 = z6;
                j2 = j;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new v4h0(z, str, z2, iu30Var, j2e0Var, qim0Var, z8, z9, be50Var2, j2, i, i2);
            }
        }
        i3 |= 12582912;
        z6 = z4;
        i6 = i2 & 256;
        i7 = 100663296;
        if (i6 == 0) {
            i3 |= i7;
        } else if ((i & 100663296) == 0) {
            if ((i & 134217728) == 0) {
                zI = x340Var2.g(be50Var);
            } else {
                zI = x340Var2.i(be50Var);
            }
            if (zI) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((i & 805306368) != 0) {
            i3 |= ((i2 & 512) == 0 || !x340Var2.f(j)) ? 268435456 : 536870912;
        }
        if ((i3 & 306783379) != 306783378) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (x340Var2.Y(i3 & 1, z7)) {
            x340Var2.d0();
            th = null;
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    z5 = false;
                }
                if (i4 != 0) {
                    z6 = false;
                }
                if (i6 != 0) {
                    be50Var3 = null;
                } else {
                    be50Var3 = be50Var;
                }
                if ((i2 & 512) != 0) {
                    j3 = 0;
                    i8 = i3 & (-1879048193);
                } else {
                    i8 = i3;
                    j3 = j;
                }
                be50Var4 = be50Var3;
            } else {
                if (i9 != 0) {
                    z5 = false;
                }
                if (i4 != 0) {
                    z6 = false;
                }
                if (i6 != 0) {
                    be50Var3 = null;
                } else {
                    be50Var3 = be50Var;
                }
                if ((i2 & 512) != 0) {
                    j3 = 0;
                    i8 = i3 & (-1879048193);
                } else {
                    i8 = i3;
                    j3 = j;
                }
                be50Var4 = be50Var3;
            }
            x340Var2.s();
            iu30 iu30Var6 = iu30Var2;
            z8 = z5;
            j2iVarR = apo.r(-553211497, new z96(z, iu30Var6, j2e0Var, str2, z8, z2), x340Var2);
            if (z6) {
                x340Var2.i0(-1297500123);
                xo30 xo30Var4 = new xo30(47);
                qim0 qim0VarN7 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                ukb0 ukb0Var4 = be50.C;
                e4p1.d(be50Var4, qim0VarN7, j3, xo30Var4, 0.0f, j2iVarR, x340Var2, ((i8 >> 24) & 14) | 196616 | ((i8 >> 21) & 896));
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(-1297130386);
                qim0 qim0VarN8 = anm1.N("martini-page-header", u291.f(qim0Var, 1.0f));
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarN8);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw th;
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
                k4s0.i(6, j2iVarR, x340Var, true, false);
            }
            z9 = z6;
            be50Var2 = be50Var4;
            j2 = j3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            be50Var2 = be50Var;
            z8 = z5;
            z9 = z6;
            j2 = j;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v4h0(z, str, z2, iu30Var, j2e0Var, qim0Var, z8, z9, be50Var2, j2, i, i2);
        }
    }

    public static final void f(boolean z, iu30 iu30Var, j2e0 j2e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        jax haxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(246722261);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(j2e0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131958279);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new t4h0(j2e0Var, iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bzg0.V0;
                x340Var.s0(objT2);
            }
            hdx hdxVar = new hdx(0, (vu30) null, (vu30) objT2, (vu30) null, (hw61) null, 27);
            if (z) {
                x340Var.i0(876908201);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(876909979);
                haxVar = new hax(cwl1.o0(x340Var, 2131958281));
                x340Var.r(false);
            }
            jax jaxVar = haxVar;
            gdx gdxVarS = yla.s(x340Var);
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, hdxVar, anm1.N("martini-new-conversation-button", qim0Var3), jaxVar, gdxVarS, null, false, null, null, nzi.b, x340Var, 0, 6, 968);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u4h0(z, iu30Var, j2e0Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void g(sy41 sy41Var, boolean z, s951 s951Var, boolean z2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-237873686);
        int i2 = i | (x340Var.i(sy41Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(s951Var) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (sy41Var instanceof qy41) {
            x340Var.i0(201258385);
            qy41 qy41Var = (qy41) sy41Var;
            otw.c(s951Var.a, new kxr0(qy41Var.e, z2, qy41Var.b, qy41Var.c, qy41Var.d), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        } else {
            if (!(sy41Var instanceof ry41)) {
                throw p3d1.k(x340Var, -963339866, false);
            }
            x340Var.i0(201620465);
            vyr0 vyr0Var = s951Var.b;
            ry41 ry41Var = (ry41) sy41Var;
            String str = ry41Var.b;
            String str2 = ry41Var.c;
            List list = ry41Var.g;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ej41.T0;
                x340Var.s0(objT);
            }
            otw.c(vyr0Var, new tyr0(str, str2, o7h.y0(list, ", ", (String) null, (String) null, (iu30) objT, 30), ry41Var.d, ry41Var.f, ry41Var.t, ry41Var.e, ry41Var.i, z, z2), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(sy41Var, z, s951Var, z2, i);
        }
    }

    public static final void h(c380 c380Var, boolean z, vu30 vu30Var, em0 em0Var, qim0 qim0Var, mlr0 mlr0Var, boolean z2, Function0 function0, int i, vzq0 vzq0Var, u380 u380Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        x340 x340Var;
        Object ja51Var;
        boolean z3;
        boolean z4;
        x340 x340Var2;
        swo swoVar = (swo) em0Var.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1561209040);
        if ((i2 & 6) == 0) {
            i3 = (x340Var3.i(c380Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var3.i(vu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var3.i(em0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var3.g(qim0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= x340Var3.g(mlr0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var3.h(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= x340Var3.i(function0) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= x340Var3.e(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 = i3 | (x340Var3.g(vzq0Var) ? 536870912 : 268435456);
        } else {
            i4 = i3;
        }
        char c2 = x340Var3.g(u380Var) ? (char) 4 : (char) 2;
        if (x340Var3.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            x340Var3.d0();
            if ((i2 & 1) != 0 && !x340Var3.E()) {
                x340Var3.b0();
            }
            x340Var3.s();
            xtb0 xtb0VarA = aub0.a(0, x340Var3, 3);
            int i5 = i4 >> 6;
            two twoVar = (two) em0Var.c;
            boolean zG = ((((i5 & 14) ^ 6) > 4 && x340Var3.g(vu30Var)) || (i5 & 6) == 4) | x340Var3.g(swoVar) | x340Var3.g(twoVar);
            Object objT = x340Var3.T();
            if (zG || objT == m4cVar) {
                objT = new s951(twoVar.a(new say0(vu30Var, (byte) 1)), swoVar.a(new say0(vu30Var, (byte) 2)));
                x340Var3.s0(objT);
            }
            s951 s951Var = (s951) objT;
            boolean zG2 = ((i4 & 29360128) == 8388608) | x340Var3.g(xtb0VarA) | ((i4 & 234881024) == 67108864) | ((i4 & 3670016) == 1048576) | ((((i4 & 458752) ^ 196608) > 131072 && x340Var3.g(mlr0Var)) || (i4 & 196608) == 131072);
            Object objT2 = x340Var3.T();
            if (zG2 || objT2 == m4cVar) {
                z3 = false;
                z4 = true;
                ja51Var = new ja51(function0, xtb0VarA, i, z2, mlr0Var, null, (byte) 0);
                xtb0VarA = xtb0VarA;
                x340Var3.s0(ja51Var);
            } else {
                ja51Var = objT2;
                z3 = false;
                z4 = true;
            }
            qxd0.t(xtb0VarA, x340Var3, (vu30) ja51Var);
            qim0 qim0VarN = anm1.N("search_results_list_test_tag", qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            d36 d36Var = new d36(4.0f, z4, new um5(z3));
            boolean zI = x340Var3.i(c380Var) | ((i4 & 112) == 32 ? z4 : z3) | x340Var3.g(s951Var) | ((c2 & 14) == 4 ? z4 : z3);
            Object objT3 = x340Var3.T();
            if (zI || objT3 == m4cVar) {
                x340Var2 = x340Var3;
                gh1 gh1Var = new gh1(c380Var, z, s951Var, u380Var, (byte) 25);
                x340Var2.s0(gh1Var);
                objT3 = gh1Var;
            } else {
                x340Var2 = x340Var3;
            }
            x340Var = x340Var2;
            ujo1.d(qim0VarN, xtb0VarA, vzq0Var, false, d36Var, null, null, true, null, (iu30) objT3, x340Var, ((i4 >> 21) & 896) | 12582912, 360);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ka51(c380Var, z, vu30Var, em0Var, qim0Var, mlr0Var, z2, function0, i, vzq0Var, u380Var, i2);
        }
    }

    public static final void i(hob1 hob1Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        vu30 vu30Var2;
        vu30 vu30Var3;
        llj lljVar;
        h2c h2cVar;
        Function0 function0;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(269404053);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.i(hob1Var) ? 4 : 2) | 48 | (b0kVar3.i(vu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            dr00 dr00Var = hob1Var.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(zr7.i(u291.f(qim0Var3, 1.0f), o40.W0), u7h.b, d4o1.a);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                b0kVar3.l(function1);
            } else {
                b0kVar3.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar2);
            vu30 vu30Var4 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, vu30Var4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            vu30 vu30Var5 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, vu30Var5);
            cbx.a.getClass();
            qim0 qim0VarR = d7e.r(uwr.d().a, qim0Var3, true);
            gra graVar2 = een.h;
            h2c h2cVar2 = h2c.a;
            qim0 qim0VarA = h2cVar2.a(qim0VarR, graVar2);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarA);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(function1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC2, b0kVar3, lljVar2);
            nko1.H(xos0VarM2, b0kVar3, vu30Var4);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, vu30Var5);
            bth.l(6, dr00Var.d, b0kVar3, (qim0) null);
            if (hob1Var.f) {
                b0kVar3.i0(-425520991);
                b0kVar2 = b0kVar3;
                h2cVar = h2cVar2;
                vu30Var3 = vu30Var5;
                lljVar = lljVar3;
                vu30Var2 = vu30Var4;
                function0 = function1;
                bth.i(false, (qim0) null, 0L, (String) null, (Function0) null, b0kVar2, 54, 30);
                b0kVar2.r(false);
            } else {
                vu30Var2 = vu30Var4;
                vu30Var3 = vu30Var5;
                lljVar = lljVar3;
                h2cVar = h2cVar2;
                function0 = function1;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-425467175);
                b0kVar2.r(false);
            }
            if (vu30Var != null) {
                b0kVar2.i0(-425420272);
                sgc1.n(!hob1Var.a(), uyn1.B(h2cVar.a(qim0Var3, graVar), 16.0f, 12.0f, 0.0f, 0.0f, 12), vu30Var, b0kVar2, i2 & 896);
                b0kVar2.r(false);
                z = true;
            } else if (hob1Var.D) {
                b0kVar2.i0(-425139381);
                qim0 qim0VarA2 = h2cVar.a(qim0Var3, (tl3) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0172: INVOKE (r0v8 'qim0VarA2' p.qim0) = (r0v6 'h2cVar' p.h2c), (r15v0 'qim0Var3' p.qim0), (wrap p.tl3:?: CAST (p.tl3) (r17v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.h2c.a(p.qim0, p.tl3):p.qim0 A[DECLARE_VAR] (LINE:371) in method: p.p2o1.i(p.hob1, p.qim0, p.vu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 502
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.p2o1.i(p.hob1, p.qim0, p.vu30, p.b0k, int):void");
            }

            public static final Next j(s1m1 s1m1Var, li20 li20Var) {
                int i = s1m1Var.b;
                if (i == 5 || i == 1) {
                    return Next.j();
                }
                int i2 = i == 4 ? s1m1Var.i : 0;
                xj61 xj61Var = new xj61();
                String str = s1m1Var.j;
                if (str != null) {
                    if (s1m1Var.k) {
                        xj61Var.add(new f0m1(str));
                    }
                    xj61Var.add(new szl1(str, i2, 1));
                    xj61Var.add(x(s1m1Var, 12, new veo(0, (Integer) null, (Integer) null, i2, 1, 7)));
                }
                xj61Var.add(new a0m1(5));
                xj61Var.add(zzl1.a);
                xj61Var.add(new wzl1(s1m1Var.a, li20Var, s1m1Var.c));
                xj61 xj61VarJ = cwl1.j(xj61Var);
                s1m1 s1m1VarL = l(s1m1Var);
                z6x z6xVar = z6x.a;
                return Next.i(s1m1.a(s1m1VarL, 5, 0, (Long) null, (i5u0) null, (wa0) null, (e58) null, (String) null, 0, (String) null, false, (String) null, false, z6xVar, 0, z6xVar, (Integer) null, false, 0, 7282685), xj61VarJ);
            }

            public static final mmr0 k(s1m1 s1m1Var, int i) {
                xj61 xj61Var = new xj61();
                String str = s1m1Var.j;
                if (str != null) {
                    xj61Var.add(new szl1(str, s1m1Var.i, i));
                    if (s1m1Var.k) {
                        xj61Var.add(new f0m1(str));
                    }
                    xj61Var.add(x(s1m1Var, 12, new veo(0, (Integer) null, (Integer) null, s1m1Var.i, i, 7)));
                }
                return new mmr0(l(s1m1Var), cwl1.j(xj61Var));
            }

            public static final s1m1 l(s1m1 s1m1Var) {
                return s1m1.a(s1m1Var, 0, 0, (Long) null, (i5u0) null, (wa0) null, (e58) null, (String) null, 1, (String) null, false, (String) null, false, (List) null, 0, (List) null, (Integer) null, false, 0, 8386591);
            }

            public static final List m(hfy0 hfy0Var, l141 l141Var) {
                List arrayList = hfy0Var.Z;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    List<Integer> list = hfy0Var.N0;
                    arrayList = new ArrayList(q7h.U(list, 10));
                    for (Integer num : list) {
                        num.getClass();
                        arrayList.add(l141Var.a(num.intValue()));
                    }
                }
                return arrayList;
            }

            public static final List n(yfy0 yfy0Var, l141 l141Var) {
                List arrayList = yfy0Var.Y;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    List<Integer> list = yfy0Var.Z;
                    arrayList = new ArrayList(q7h.U(list, 10));
                    for (Integer num : list) {
                        num.getClass();
                        arrayList.add(l141Var.a(num.intValue()));
                    }
                }
                return arrayList;
            }

            public static final List o(ggy0 ggy0Var, l141 l141Var) {
                List arrayList = ggy0Var.Y;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    List<Integer> list = ggy0Var.Z;
                    arrayList = new ArrayList(q7h.U(list, 10));
                    for (Integer num : list) {
                        num.getClass();
                        arrayList.add(l141Var.a(num.intValue()));
                    }
                }
                return arrayList;
            }

            public static final float p(jkr0 jkr0Var) {
                return jkr0Var.k().e == qqq0.b ? Float.intBitsToFloat((int) (jkr0Var.p() >> 32)) : Float.intBitsToFloat((int) (jkr0Var.p() & 4294967295L));
            }

            public static final i6h1 q(ContextTrack contextTrack) {
                String str = (String) contextTrack.metadata().get("ad_id");
                if (str == null) {
                    str = "";
                }
                return new i6h1("spotify:ad:".concat(str), "");
            }

            public static final i6h1 r(ji0 ji0Var) {
                return new i6h1(gq0.e(ji0Var.a), ji0Var.h);
            }

            public static final boolean s(zkm zkmVar, String str) {
                if (zkmVar != null) {
                    return str.equals(zkmVar.a) || str.equals(zkmVar.b);
                }
                return false;
            }

            public static final boolean t(zkm zkmVar, String str, String str2, String str3) {
                String str4 = zkmVar.b;
                String str5 = zkmVar.a;
                boolean z = (str == null || str.equals(str2) || !str.equals(str5)) ? false : true;
                if (str2 == null || !(str2.equals(str5) || str2.equals(str4))) {
                    return (str3 != null && (str3.equals(str5) || str3.equals(str4))) || z;
                }
                return true;
            }

            public static final boolean u(s1m1 s1m1Var, String str, int i) {
                return s1m1Var.b == 4 && s1m1Var.i == i && u890.j(s1m1Var.j, str);
            }

            public static final boolean v(zkm zkmVar, String str) {
                if (zkmVar != null) {
                    return (str.equals(zkmVar.a) || str.equals(zkmVar.b)) && zkmVar.d;
                }
                return false;
            }

            public static final boolean w(jkr0 jkr0Var, float f) {
                jkr0Var.k().getClass();
                return !(((jkr0Var.q() ? -f : p(jkr0Var)) > 0.0f ? 1 : ((jkr0Var.q() ? -f : p(jkr0Var)) == 0.0f ? 0 : -1)) > 0);
            }

            public static final vzl1 x(s1m1 s1m1Var, int i, veo veoVar) {
                iyl1 iyl1VarA;
                String strName;
                ryl1 ryl1Var = s1m1Var.t;
                String str = s1m1Var.j;
                if (str == null) {
                    str = "";
                }
                wa0 wa0Var = s1m1Var.f;
                String lowerCase = (wa0Var == null || (iyl1VarA = wa0Var.a()) == null || (strName = iyl1VarA.c.name()) == null) ? "" : strName.toLowerCase(Locale.ROOT);
                xvj1.x(ryl1Var.a);
                String lowerCase2 = "RUNNING".toLowerCase(Locale.ROOT);
                String str2 = s1m1Var.u;
                int i2 = s1m1Var.c;
                String str3 = ryl1Var.c;
                String str4 = ryl1Var.b;
                String str5 = s1m1Var.l;
                return new vzl1(i, str, lowerCase, lowerCase2, str2, i2, str3, str4, str5 == null ? "" : str5, s1m1Var.a, veoVar);
            }

            public static final rgy0 z(rgy0 rgy0Var, l141 l141Var) {
                int i = rgy0Var.c;
                if ((i & 256) == 256) {
                    return rgy0Var.Z;
                }
                if ((i & 512) == 512) {
                    return l141Var.a(rgy0Var.N0);
                }
                return null;
            }
        }
