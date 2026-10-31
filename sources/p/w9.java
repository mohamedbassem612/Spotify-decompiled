package p;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.ComposeView;
import androidx.xr.projected.permissions.RequestPermissionsOnHostActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class w9 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0266  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x03d6 A[Catch: all -> 0x03f6, LOOP:6: B:169:0x03aa->B:179:0x03d6, LOOP_END, TryCatch #1 {, blocks: (B:166:0x0395, B:169:0x03aa, B:171:0x03b6, B:173:0x03c0, B:175:0x03c6, B:176:0x03ce, B:179:0x03d6, B:180:0x03d9, B:182:0x03df, B:184:0x03e8), top: B:304:0x0395 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x047c  */
    /* JADX WARN: Code duplicated, block: B:308:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0160 A[LOOP:0: B:38:0x012a->B:51:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x021f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:93:0x0235  */
    /* JADX WARN: Code duplicated, block: B:95:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0250  */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01c1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        boolean zL;
        nd41 nd41Var;
        char c;
        char c2;
        kp21 kp21Var;
        x340 x340Var;
        String str;
        boolean zI;
        Object obj3;
        boolean zI2;
        Object obj4;
        char c3 = 7;
        byte b = 2;
        r261 r261VarD = null;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (this.a) {
            case 0:
                bt41 bt41Var = (bt41) this.b;
                fn31.T(bt41Var.v1(), null, 0, new x9(bt41Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 1:
                t8e1 t8e1Var = (t8e1) this.b;
                n511 n511VarX = l0p1.x((RectF) obj);
                n511 n511VarX2 = l0p1.x((RectF) obj2);
                switch (t8e1Var.a) {
                    case 0:
                        zL = n511VarX.l(n511VarX2);
                        break;
                    default:
                        zL = n511VarX2.a(n511VarX.f());
                        break;
                }
                return Boolean.valueOf(zL);
            case 2:
                ((Integer) obj2).getClass();
                int i = ComposeView.P0;
                ((ComposeView) this.b).a((b0k) obj, czo1.p(1));
                return rih1.a;
            case 3:
                b0k b0kVar = (b0k) this.b;
                qim0 qim0Var = (qim0) obj;
                qim0 qim0VarD = (oim0) obj2;
                if (qim0VarD instanceof a0k) {
                    xu30 xu30Var = ((a0k) qim0VarD).c;
                    w0h1.o(3, xu30Var);
                    qim0VarD = zr7.D(b0kVar, (qim0) xu30Var.invoke(nim0.a, b0kVar, 0));
                }
                return qim0Var.then(qim0VarD);
            case 4:
                h72 h72Var = (h72) this.b;
                ((Integer) obj).getClass();
                if (obj2 instanceof wvj) {
                    wvj wvjVar = (wvj) obj2;
                    oen0 oen0Var = (oen0) h72Var.i;
                    if (oen0Var == null) {
                        oen0 oen0Var2 = ij41.a;
                        oen0Var = new oen0();
                        h72Var.i = oen0Var;
                    }
                    oen0Var.j(wvjVar);
                    ((bfn0) h72Var.g).b(wvjVar);
                }
                if (obj2 instanceof b440) {
                    h72Var.D((b440) obj2);
                }
                if (obj2 instanceof h311) {
                    ((h311) obj2).d();
                }
                return rih1.a;
            case 5:
                ((Integer) obj2).getClass();
                eko1.q((x6e1) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 6:
                m3e1 m3e1Var = (m3e1) this.b;
                ((Integer) obj2).getClass();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(666084174);
                String str2 = m3e1Var.b;
                x340Var2.r(false);
                return str2;
            case 7:
                ((Integer) obj2).getClass();
                ((c3u) this.b).a((b0k) obj, czo1.p(1));
                return rih1.a;
            case 8:
                b5x b5xVar = (b5x) this.b;
                p5x p5xVar = (p5x) obj2;
                dkl dklVar = b5xVar.N0;
                if (dklVar != null) {
                    dklVar.accept(p5xVar);
                }
                b5xVar.e.a(p5xVar.a);
                b5xVar.f = true;
                return rih1.a;
            case 9:
                ((Integer) obj2).getClass();
                ((db80) this.b).a((b0k) obj, czo1.p(1));
                return rih1.a;
            case 10:
                List list = (List) this.b;
                x340 x340Var3 = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        vu30 vu30Var = (vu30) list.get(i2);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        hzj.A.getClass();
                        ya4 ya4Var = y580.X;
                        if (x340Var4.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(ya4Var);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                        vu30Var.invoke(x340Var4, 0);
                        x340Var4.r(true);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            case 11:
                id41 id41Var = (id41) obj;
                List list2 = (List) ((vu30) this.b).invoke(id41Var, obj2);
                List list3 = list2;
                int size2 = list3.size();
                while (b2 < size2) {
                    Object obj5 = list2.get(b2);
                    if (obj5 != null && (nd41Var = id41Var.b) != null && !nd41Var.d(obj5)) {
                        throw new IllegalArgumentException(("item at index " + ((int) b2) + " can't be saved: " + obj5).toString());
                    }
                    b2++;
                }
                if (list3.isEmpty()) {
                    return null;
                }
                return new ArrayList(list3);
            case 12:
                ((b4e1) this.b).e(((Offset) obj2).a);
                return rih1.a;
            case 13:
                ((Integer) obj2).getClass();
                ((qdm0) this.b).a((b0k) obj, czo1.p(1));
                return rih1.a;
            case 14:
                vy71 vy71Var = (vy71) this.b;
                xy71 xy71Var = xy71.b;
                xy71 xy71Var2 = xy71.a;
                zmg0 zmg0VarC = lm5.c(new hc4(hjl.h(((hjl) obj2).a), (yr80) obj, vy71Var, b));
                Map map = zmg0VarC.a;
                int iOrdinal = ((xy71) ((mdt) vy71Var.e.X).getValue()).ordinal();
                if (iOrdinal == 0) {
                    xy71Var = xy71Var2;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    xy71 xy71Var3 = xy71.c;
                    if (map.containsKey(xy71Var3)) {
                        xy71Var = xy71Var3;
                    } else if (!map.containsKey(xy71Var)) {
                        xy71Var = xy71Var2;
                    }
                } else if (!map.containsKey(xy71Var)) {
                    xy71Var = xy71Var2;
                }
                return new mmr0(zmg0VarC, xy71Var);
            case 15:
                xnm0 xnm0Var = (xnm0) this.b;
                x340 x340Var5 = (b0k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var6.J(xnm0Var, x340Var6.m(), (Object) null, false);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
            case 16:
                bvm0 bvm0Var = (bvm0) this.b;
                Set set = (Set) obj;
                p811 p811Var = new p811();
                synchronized (bvm0Var.b) {
                    nen0 nen0Var = bvm0Var.c;
                    pg pgVar = new pg((Object) set, (Object) bvm0Var, (Object) p811Var, (byte) 23);
                    w0h1.o(1, pgVar);
                    Object[] objArr = nen0Var.b;
                    long[] jArr = nen0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        pgVar.invoke(objArr[(i3 << 3) + i5]);
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            } else if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    List list4 = (List) p811Var.a;
                    if (list4 != null) {
                        int size3 = list4.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            ((r261) list4.get(i6)).l(rih1.a);
                        }
                    }
                }
                return rih1.a;
            case 17:
                ((Integer) obj2).getClass();
                ((ifv0) this.b).a((b0k) obj, czo1.p(1));
                return rih1.a;
            case 18:
                p311 p311Var = (p311) this.b;
                jj41 jj41Var = (Set) obj;
                synchronized (p311Var.d) {
                    try {
                        if (((l311) p311Var.v.getValue()).compareTo(l311.e) >= 0) {
                            oen0 oen0Var3 = p311Var.i;
                            if (jj41Var instanceof jj41) {
                                oen0 oen0Var4 = jj41Var.a;
                                Object[] objArr2 = oen0Var4.b;
                                long[] jArr2 = oen0Var4.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j2 = jArr2[i7];
                                        if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj6 = objArr2[(i7 << 3) + i9];
                                                    c2 = c3;
                                                    if (!(obj6 instanceof zpb1) || ((zpb1) obj6).j(1)) {
                                                        oen0Var3.a(obj6);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j2 >>= 8;
                                                i9++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i8 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i7 != length2) {
                                            i7++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : (Iterable) jj41Var) {
                                    if (!(obj7 instanceof zpb1) || ((zpb1) obj7).j(1)) {
                                        oen0Var3.a(obj7);
                                    }
                                }
                            }
                            r261VarD = p311Var.D();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (r261VarD != null) {
                    ((ohd) r261VarD).resumeWith(rih1.a);
                }
                return rih1.a;
            case 19:
                cf41 cf41Var = (cf41) this.b;
                id41 id41Var2 = (id41) obj;
                uv91 uv91Var = (ven0) obj2;
                if (!(uv91Var instanceof uv91)) {
                    hhg1.n("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                uv91 uv91Var2 = uv91Var;
                Object objB = cf41Var.b(id41Var2, uv91Var2.getValue());
                if (objB != null) {
                    return new hrr0(objB, uv91Var2.g());
                }
                return null;
            case 20:
                final RequestPermissionsOnHostActivity requestPermissionsOnHostActivity = (RequestPermissionsOnHostActivity) this.b;
                x340 x340Var7 = (b0k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue3 & 3) == 2) {
                    int i10 = RequestPermissionsOnHostActivity.i1;
                    x340 x340Var8 = x340Var7;
                    if (x340Var8.H()) {
                        x340Var8.b0();
                    } else {
                        kp21Var = (kp21) requestPermissionsOnHostActivity.h1.getValue();
                        if (kp21Var == null) {
                            x340 x340Var9 = x340Var7;
                            x340Var9.i0(736952055);
                            x340Var9.r(false);
                        } else {
                            x340Var = x340Var7;
                            x340Var.i0(736952056);
                            str = kp21Var.b;
                            if (str == null) {
                                str = "";
                            }
                            zI = x340Var.i(requestPermissionsOnHostActivity);
                            Object objT = x340Var.T();
                            obj3 = objT;
                            if (zI || objT == m4cVar) {
                                Function0 function0 = new Function0() { // from class: p.jp21
                                    public final Object invoke() {
                                        byte b4 = b2;
                                        rih1 rih1Var = rih1.a;
                                        RequestPermissionsOnHostActivity requestPermissionsOnHostActivity2 = requestPermissionsOnHostActivity;
                                        switch (b4) {
                                            case 0:
                                                RequestPermissionsOnHostActivity.o0(requestPermissionsOnHostActivity2);
                                                return rih1Var;
                                            default:
                                                int i11 = RequestPermissionsOnHostActivity.i1;
                                                requestPermissionsOnHostActivity2.h1.setValue((Object) null);
                                                requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                requestPermissionsOnHostActivity2.d1++;
                                                while (true) {
                                                    int i12 = requestPermissionsOnHostActivity2.d1;
                                                    ArrayList arrayList = requestPermissionsOnHostActivity2.a1;
                                                    if (arrayList == null) {
                                                        u890.C("requests");
                                                        throw null;
                                                    }
                                                    if (i12 < arrayList.size()) {
                                                        ArrayList arrayList2 = requestPermissionsOnHostActivity2.a1;
                                                        if (arrayList2 == null) {
                                                            u890.C("requests");
                                                            throw null;
                                                        }
                                                        if (((kp21) arrayList2.get(requestPermissionsOnHostActivity2.d1)).b == null) {
                                                            requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                            requestPermissionsOnHostActivity2.d1++;
                                                        }
                                                    }
                                                    requestPermissionsOnHostActivity2.m0();
                                                    return rih1Var;
                                                }
                                        }
                                    }
                                };
                                x340Var.s0(function0);
                                obj3 = function0;
                            }
                            Function0 function1 = (Function0) obj3;
                            zI2 = x340Var.i(requestPermissionsOnHostActivity);
                            Object objT2 = x340Var.T();
                            obj4 = objT2;
                            if (zI2 || objT2 == m4cVar) {
                                Function0 function2 = new Function0() { // from class: p.jp21
                                    public final Object invoke() {
                                        byte b4 = b3;
                                        rih1 rih1Var = rih1.a;
                                        RequestPermissionsOnHostActivity requestPermissionsOnHostActivity2 = requestPermissionsOnHostActivity;
                                        switch (b4) {
                                            case 0:
                                                RequestPermissionsOnHostActivity.o0(requestPermissionsOnHostActivity2);
                                                return rih1Var;
                                            default:
                                                int i11 = RequestPermissionsOnHostActivity.i1;
                                                requestPermissionsOnHostActivity2.h1.setValue((Object) null);
                                                requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                requestPermissionsOnHostActivity2.d1++;
                                                while (true) {
                                                    int i12 = requestPermissionsOnHostActivity2.d1;
                                                    ArrayList arrayList = requestPermissionsOnHostActivity2.a1;
                                                    if (arrayList == null) {
                                                        u890.C("requests");
                                                        throw null;
                                                    }
                                                    if (i12 < arrayList.size()) {
                                                        ArrayList arrayList2 = requestPermissionsOnHostActivity2.a1;
                                                        if (arrayList2 == null) {
                                                            u890.C("requests");
                                                            throw null;
                                                        }
                                                        if (((kp21) arrayList2.get(requestPermissionsOnHostActivity2.d1)).b == null) {
                                                            requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                            requestPermissionsOnHostActivity2.d1++;
                                                        }
                                                    }
                                                    requestPermissionsOnHostActivity2.m0();
                                                    return rih1Var;
                                                }
                                        }
                                    }
                                };
                                x340Var.s0(function2);
                                obj4 = function2;
                            }
                            requestPermissionsOnHostActivity.l0(0, str, function1, (Function0) obj4, x340Var, null);
                            x340Var.r(false);
                        }
                    }
                } else {
                    kp21Var = (kp21) requestPermissionsOnHostActivity.h1.getValue();
                    if (kp21Var == null) {
                        x340 x340Var10 = x340Var7;
                        x340Var10.i0(736952055);
                        x340Var10.r(false);
                    } else {
                        x340Var = x340Var7;
                        x340Var.i0(736952056);
                        str = kp21Var.b;
                        if (str == null) {
                            str = "";
                        }
                        zI = x340Var.i(requestPermissionsOnHostActivity);
                        Object objT3 = x340Var.T();
                        obj3 = objT3;
                        if (zI) {
                            Function0 function3 = new Function0() { // from class: p.jp21
                                public final Object invoke() {
                                    byte b4 = b2;
                                    rih1 rih1Var = rih1.a;
                                    RequestPermissionsOnHostActivity requestPermissionsOnHostActivity2 = requestPermissionsOnHostActivity;
                                    switch (b4) {
                                        case 0:
                                            RequestPermissionsOnHostActivity.o0(requestPermissionsOnHostActivity2);
                                            return rih1Var;
                                        default:
                                            int i11 = RequestPermissionsOnHostActivity.i1;
                                            requestPermissionsOnHostActivity2.h1.setValue((Object) null);
                                            requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                            requestPermissionsOnHostActivity2.d1++;
                                            while (true) {
                                                int i12 = requestPermissionsOnHostActivity2.d1;
                                                ArrayList arrayList = requestPermissionsOnHostActivity2.a1;
                                                if (arrayList == null) {
                                                    u890.C("requests");
                                                    throw null;
                                                }
                                                if (i12 < arrayList.size()) {
                                                    ArrayList arrayList2 = requestPermissionsOnHostActivity2.a1;
                                                    if (arrayList2 == null) {
                                                        u890.C("requests");
                                                        throw null;
                                                    }
                                                    if (((kp21) arrayList2.get(requestPermissionsOnHostActivity2.d1)).b == null) {
                                                        requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                        requestPermissionsOnHostActivity2.d1++;
                                                    }
                                                }
                                                requestPermissionsOnHostActivity2.m0();
                                                return rih1Var;
                                            }
                                    }
                                }
                            };
                            x340Var.s0(function3);
                            obj3 = function3;
                        } else {
                            Function0 function4 = new Function0() { // from class: p.jp21
                                public final Object invoke() {
                                    byte b4 = b2;
                                    rih1 rih1Var = rih1.a;
                                    RequestPermissionsOnHostActivity requestPermissionsOnHostActivity2 = requestPermissionsOnHostActivity;
                                    switch (b4) {
                                        case 0:
                                            RequestPermissionsOnHostActivity.o0(requestPermissionsOnHostActivity2);
                                            return rih1Var;
                                        default:
                                            int i11 = RequestPermissionsOnHostActivity.i1;
                                            requestPermissionsOnHostActivity2.h1.setValue((Object) null);
                                            requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                            requestPermissionsOnHostActivity2.d1++;
                                            while (true) {
                                                int i12 = requestPermissionsOnHostActivity2.d1;
                                                ArrayList arrayList = requestPermissionsOnHostActivity2.a1;
                                                if (arrayList == null) {
                                                    u890.C("requests");
                                                    throw null;
                                                }
                                                if (i12 < arrayList.size()) {
                                                    ArrayList arrayList2 = requestPermissionsOnHostActivity2.a1;
                                                    if (arrayList2 == null) {
                                                        u890.C("requests");
                                                        throw null;
                                                    }
                                                    if (((kp21) arrayList2.get(requestPermissionsOnHostActivity2.d1)).b == null) {
                                                        requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                        requestPermissionsOnHostActivity2.d1++;
                                                    }
                                                }
                                                requestPermissionsOnHostActivity2.m0();
                                                return rih1Var;
                                            }
                                    }
                                }
                            };
                            x340Var.s0(function4);
                            obj3 = function4;
                        }
                        Function0 function5 = (Function0) obj3;
                        zI2 = x340Var.i(requestPermissionsOnHostActivity);
                        Object objT4 = x340Var.T();
                        obj4 = objT4;
                        if (zI2) {
                            Function0 function6 = new Function0() { // from class: p.jp21
                                public final Object invoke() {
                                    byte b4 = b3;
                                    rih1 rih1Var = rih1.a;
                                    RequestPermissionsOnHostActivity requestPermissionsOnHostActivity2 = requestPermissionsOnHostActivity;
                                    switch (b4) {
                                        case 0:
                                            RequestPermissionsOnHostActivity.o0(requestPermissionsOnHostActivity2);
                                            return rih1Var;
                                        default:
                                            int i11 = RequestPermissionsOnHostActivity.i1;
                                            requestPermissionsOnHostActivity2.h1.setValue((Object) null);
                                            requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                            requestPermissionsOnHostActivity2.d1++;
                                            while (true) {
                                                int i12 = requestPermissionsOnHostActivity2.d1;
                                                ArrayList arrayList = requestPermissionsOnHostActivity2.a1;
                                                if (arrayList == null) {
                                                    u890.C("requests");
                                                    throw null;
                                                }
                                                if (i12 < arrayList.size()) {
                                                    ArrayList arrayList2 = requestPermissionsOnHostActivity2.a1;
                                                    if (arrayList2 == null) {
                                                        u890.C("requests");
                                                        throw null;
                                                    }
                                                    if (((kp21) arrayList2.get(requestPermissionsOnHostActivity2.d1)).b == null) {
                                                        requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                        requestPermissionsOnHostActivity2.d1++;
                                                    }
                                                }
                                                requestPermissionsOnHostActivity2.m0();
                                                return rih1Var;
                                            }
                                    }
                                }
                            };
                            x340Var.s0(function6);
                            obj4 = function6;
                        } else {
                            Function0 function7 = new Function0() { // from class: p.jp21
                                public final Object invoke() {
                                    byte b4 = b3;
                                    rih1 rih1Var = rih1.a;
                                    RequestPermissionsOnHostActivity requestPermissionsOnHostActivity2 = requestPermissionsOnHostActivity;
                                    switch (b4) {
                                        case 0:
                                            RequestPermissionsOnHostActivity.o0(requestPermissionsOnHostActivity2);
                                            return rih1Var;
                                        default:
                                            int i11 = RequestPermissionsOnHostActivity.i1;
                                            requestPermissionsOnHostActivity2.h1.setValue((Object) null);
                                            requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                            requestPermissionsOnHostActivity2.d1++;
                                            while (true) {
                                                int i12 = requestPermissionsOnHostActivity2.d1;
                                                ArrayList arrayList = requestPermissionsOnHostActivity2.a1;
                                                if (arrayList == null) {
                                                    u890.C("requests");
                                                    throw null;
                                                }
                                                if (i12 < arrayList.size()) {
                                                    ArrayList arrayList2 = requestPermissionsOnHostActivity2.a1;
                                                    if (arrayList2 == null) {
                                                        u890.C("requests");
                                                        throw null;
                                                    }
                                                    if (((kp21) arrayList2.get(requestPermissionsOnHostActivity2.d1)).b == null) {
                                                        requestPermissionsOnHostActivity2.q0(requestPermissionsOnHostActivity2.d1);
                                                        requestPermissionsOnHostActivity2.d1++;
                                                    }
                                                }
                                                requestPermissionsOnHostActivity2.m0();
                                                return rih1Var;
                                            }
                                    }
                                }
                            };
                            x340Var.s0(function7);
                            obj4 = function7;
                        }
                        requestPermissionsOnHostActivity.l0(0, str, function5, (Function0) obj4, x340Var, null);
                        x340Var.r(false);
                    }
                }
                return rih1.a;
            case 21:
                h441 h441Var = (h441) this.b;
                int iIntValue4 = ((Integer) obj).intValue();
                r261 r261Var = (m8n) obj2;
                fkj0 key = r261Var.getKey();
                r261 r261VarA = h441Var.b.A(key);
                if (key == fkj0.W0) {
                    r261 r261Var2 = (faa0) r261VarA;
                    r261 parent = (faa0) r261Var;
                    while (parent != null) {
                        if (parent != r261Var2 && (parent instanceof fn41)) {
                            m0g m0gVar = (m0g) avg.a.getObjectVolatile((fn41) parent, saa0.b);
                            parent = m0gVar != null ? m0gVar.getParent() : null;
                        } else {
                            r261VarD = parent;
                            if (r261VarD == r261Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r261VarD + ", expected child of " + r261Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (r261Var2 != null) {
                                iIntValue4++;
                            }
                        }
                    }
                    if (r261VarD == r261Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r261VarD + ", expected child of " + r261Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (r261Var2 != null) {
                        iIntValue4++;
                    }
                } else if (r261Var != r261VarA) {
                    iIntValue4 = os00.INVALID_ID;
                } else {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case 22:
                o811 o811Var = (o811) this.b;
                ((hav0) obj).a();
                o811Var.a = ((Offset) obj2).a;
                return rih1.a;
            case 23:
                n191 n191Var = (n191) this.b;
                Set set2 = (Set) obj;
                synchronized (n191Var.b) {
                    try {
                        oen0 oen0Var5 = n191Var.e;
                        if (oen0Var5 != null) {
                            Object[] objArr3 = oen0Var5.b;
                            long[] jArr3 = oen0Var5.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j3 = jArr3[i11];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length3)) >>> 31);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                if ((j3 & 255) >= 128 || !set2.contains(objArr3[(i11 << 3) + i13])) {
                                                    j3 >>= 8;
                                                    i13++;
                                                } else {
                                                    r261VarD = n191Var.g;
                                                }
                                            } else if (i12 == 8) {
                                                if (i11 != length3) {
                                                    i11++;
                                                }
                                            }
                                        }
                                    } else if (i11 != length3) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (o7h.i0(set2, n191Var.c)) {
                            r261VarD = n191Var.g;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (r261VarD != null) {
                    r261VarD.l(rih1.a);
                }
                return rih1.a;
            case 24:
                xr91 xr91Var = (xr91) this.b;
                x340 x340Var11 = (b0k) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    s9e1.b(xr91Var.a, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1.a;
            case 25:
                int iX0 = ihc1.x0((CharSequence) obj, (char[]) this.b, ((Integer) obj2).intValue(), false);
                if (iX0 < 0) {
                    return null;
                }
                return new mmr0(Integer.valueOf(iX0), 1);
            case 26:
                iad1 iad1Var = (iad1) this.b;
                z5v z5vVar = new z5v();
                float f = (int) (((yr80) obj).a >> 32);
                z5vVar.a(0.0f, jad1.c);
                z5vVar.a(f, jad1.a);
                z5vVar.a(-f, jad1.b);
                ArrayList arrayList = z5vVar.a;
                float[] fArr = z5vVar.b;
                int size4 = arrayList.size();
                zno1.f(size4, fArr.length);
                return new mmr0(new wvr(arrayList, Arrays.copyOfRange(fArr, 0, size4)), (jad1) iad1Var.a.i.getValue());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                return ykb0.k((TextClassification) this.b, (b0k) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                return ykb0.l((RemoteAction) this.b, (b0k) obj);
            default:
                ((Integer) obj2).getClass();
                ((oae1) this.b).a((b0k) obj, czo1.p(1));
                return rih1.a;
        }
    }

    public /* synthetic */ w9(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
    }
}
