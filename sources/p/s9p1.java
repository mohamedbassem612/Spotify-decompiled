package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.datasource.HttpDataSource;
import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import java.lang.reflect.Field;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class s9p1 {
    public static b180 a;
    public static b180 b;

    public static final void A(iie1 iie1Var, c380 c380Var, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1380206846);
        int i2 = i | (x340Var.g(iie1Var) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            oy11 oy11VarS = t5p1.s(iu30Var, x340Var);
            xtb0 xtb0Var = iie1Var.a;
            qim0 qim0VarL = bmq0.L(qim0Var, oy11VarS, (g6o0) null);
            zzq0 zzq0VarH = uyn1.h(2, ((p3v) iie1Var.g.getValue()).a, 0.0f);
            d36 d36Var = new d36(2.0f, true, new um5(false));
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new rsc1(c380Var, iie1Var, iu30Var2, (byte) 7);
                x340Var.s0(objT);
            }
            s3o1.e(qim0VarL, xtb0Var, zzq0VarH, d36Var, null, null, null, (iu30) objT, x340Var, 24576, 232);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(iie1Var, c380Var, qim0Var, iu30Var, iu30Var2, i);
        }
    }

    public static void B(View view, View view2, String str) {
        HashSet hashSet;
        Field declaredField;
        Field declaredField2;
        Object obj;
        int iHashCode = view.hashCode();
        HashSet hashSet2 = yck1.e;
        HashSet hashSet3 = null;
        if (dhn.a.contains(yck1.class)) {
            hashSet = null;
        } else {
            try {
                hashSet = yck1.e;
            } catch (Throwable th) {
                dhn.a(yck1.class, th);
                hashSet = null;
            }
        }
        if (hashSet.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        yck1 yck1Var = new yck1(view, view2, str);
        if (!dhn.a.contains(ibk1.class)) {
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(yck1Var);
                } else {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj == null) {
                        view.setOnClickListener(yck1Var);
                    } else {
                        declaredField2.set(obj, yck1Var);
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                dhn.a(ibk1.class, th2);
            }
        }
        if (!dhn.a.contains(yck1.class)) {
            try {
                hashSet3 = yck1.e;
            } catch (Throwable th3) {
                dhn.a(yck1.class, th3);
            }
        }
        hashSet3.add(Integer.valueOf(iHashCode));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[LOOP:0: B:22:0x006c->B:26:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[EDGE_INSN: B:31:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:22:0x006c->B:26:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object C(p.i8d1 r7, p.cav0 r8, p.faa r9) {
        /*
            boolean r0 = r9 instanceof p.yb30
            if (r0 == 0) goto L13
            r0 = r9
            p.yb30 r0 = (p.yb30) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.yb30 r0 = new p.yb30
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            p.cav0 r7 = r0.b
            p.i8d1 r8 = r0.a
            p.hm5.M(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L60
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L34:
            p.hm5.M(r9)
            p.j8d1 r9 = r7.e
            p.bav0 r9 = r9.T0
            java.util.List r9 = r9.a
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r4 = r2
        L45:
            if (r4 >= r1) goto L7f
            java.lang.Object r5 = r9.get(r4)
            p.hav0 r5 = (p.hav0) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L7c
        L51:
            r0.a = r7
            r0.b = r8
            r0.d = r3
            java.lang.Object r9 = r7.a(r8, r0)
            p.d9n r1 = p.d9n.a
            if (r9 != r1) goto L60
            return r1
        L60:
            p.bav0 r9 = (p.bav0) r9
            java.util.List r9 = r9.a
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r4 = r2
        L6c:
            if (r4 >= r1) goto L7f
            java.lang.Object r5 = r9.get(r4)
            p.hav0 r5 = (p.hav0) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L79
            goto L51
        L79:
            int r4 = r4 + 1
            goto L6c
        L7c:
            int r4 = r4 + 1
            goto L45
        L7f:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s9p1.C(p.i8d1, p.cav0, p.faa):java.lang.Object");
    }

    public static final Object D(nav0 nav0Var, vu30 vu30Var, lnm lnmVar) {
        Object objH1 = ((j8d1) nav0Var).H1(new mi6(lnmVar.getContext(), vu30Var, (lnm) null, (byte) 1), lnmVar);
        return objH1 == d9n.a ? objH1 : rih1.a;
    }

    public static final zxx E(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        return new zxx(cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.d, cbx.a(b0kVar).d.b, cbx.a(b0kVar).d.b, cbx.a(b0kVar).b.c, 0L, 896);
    }

    public static final zzq0 F(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        return new zzq0(12.0f, 8.0f, 12.0f, 8.0f);
    }

    public static final BetamaxDownloadException G(Throwable th, String str, long j) {
        int i;
        String str2;
        String str3 = "";
        if ((th instanceof SQLiteDiskIOException) || (th instanceof SQLiteFullException)) {
            i = 2;
        } else if (th instanceof HttpDataSource.InvalidResponseCodeException) {
            HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) th;
            i = invalidResponseCodeException.d == 403 ? 3 : 1;
            String str4 = invalidResponseCodeException.e;
            if (str4 != null) {
                str3 = str4;
            }
        } else {
            i = 1;
        }
        Locale locale = Locale.US;
        if (i == 1) {
            str2 = "Unknown";
        } else if (i == 2) {
            str2 = "Disk Full";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "Forbidden";
        }
        return new BetamaxDownloadException(String.format(locale, "%s error downloading media %s. bytesDownloaded=%dMB. responseMessage=%s", Arrays.copyOf(new Object[]{str2, str, Long.valueOf(j / 1048576), str3}, 4)), i, th);
    }

    public static int H(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << (i2 * 7);
            if ((b2 & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    public static ucl0 I() {
        return new ucl0();
    }

    public static void J(String str, String str2, float[] fArr) {
        boolean zContains;
        boolean zContains2;
        etc1 etc1Var = etc1.a;
        if (dhn.a.contains(etc1.class)) {
            zContains = false;
        } else {
            try {
                zContains = etc1.c.contains(str);
            } catch (Throwable th) {
                dhn.a(etc1.class, th);
                zContains = false;
            }
        }
        if (zContains) {
            rm5 rm5Var = new rm5(wf10.a(), (String) null);
            if (dhn.a.contains(rm5Var)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                rm5Var.y(bundle, str);
                return;
            } catch (Throwable th2) {
                dhn.a(rm5Var, th2);
                return;
            }
        }
        if (dhn.a.contains(etc1.class)) {
            zContains2 = false;
        } else {
            try {
                zContains2 = etc1.d.contains(str);
            } catch (Throwable th3) {
                dhn.a(etc1.class, th3);
                zContains2 = false;
            }
        }
        if (zContains2) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle2.putString("metadata", jSONObject.toString());
                String str3 = md50.j;
                md50 md50VarR = cwl1.R((xd) null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{wf10.b()}, 1)), (JSONObject) null, (id50) null);
                md50VarR.d = bundle2;
                md50VarR.c();
            } catch (JSONException unused) {
            }
        }
    }

    public static boolean K(String str, String str2) {
        fnv0 fnv0Var = fnv0.a;
        String str3 = null;
        if (!dhn.a.contains(fnv0.class)) {
            try {
                LinkedHashMap linkedHashMap = fnv0.b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th) {
                dhn.a(fnv0.class, th);
            }
        }
        if (str3 == null) {
            return false;
        }
        if (str3.equals("other")) {
            return true;
        }
        try {
            wf10.c().execute(new qub1(str3, str2, (byte) 13));
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static ArrayList L(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iH = ((b2 >> 1) & 1) != 0 ? H(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iH > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position());
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iH);
                arrayList.add(new xjp0(byteBufferDuplicate2, i));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iH);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x0208  */
    /* JADX WARN: Code duplicated, block: B:110:0x020a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0211  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:119:0x023f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:122:0x0264  */
    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:125:0x027a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0283  */
    /* JADX WARN: Code duplicated, block: B:132:0x0291  */
    /* JADX WARN: Code duplicated, block: B:133:0x0293  */
    /* JADX WARN: Code duplicated, block: B:137:0x029c  */
    /* JADX WARN: Code duplicated, block: B:140:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02df  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:150:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0302  */
    /* JADX WARN: Code duplicated, block: B:155:0x030b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0331  */
    /* JADX WARN: Code duplicated, block: B:159:0x033d  */
    /* JADX WARN: Code duplicated, block: B:160:0x033f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0348  */
    /* JADX WARN: Code duplicated, block: B:167:0x0367  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void a(g2c g2cVar, adj1 adj1Var, iu30 iu30Var, paj1 paj1Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        boolean z2;
        ?? r12;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int iOrdinal;
        ?? r5;
        int i3;
        m4c m4cVar;
        byte b2;
        int i4;
        int i5;
        boolean z3;
        Object obj;
        boolean z4;
        Object obj2;
        j2i j2iVarR;
        ?? r6;
        int iOrdinal2;
        byte b3;
        ?? r13;
        boolean z5;
        Object obj3;
        ?? r11;
        ?? r7;
        Object obj4;
        ?? r2;
        Object objT;
        gra graVar = een.h;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1317159345);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(adj1Var) : b0kVar3.i(adj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.e(paj1Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        int i6 = i2;
        if (b0kVar3.Y(i6 & 1, (i6 & 9363) != 9362)) {
            int iOrdinal3 = paj1Var.ordinal();
            w0o1.d((iOrdinal3 == 0 || iOrdinal3 == 2) ? 2 : 1, apo.r(-1124506987, new ef8(adj1Var, paj1Var, (byte) 22), b0kVar3), b0kVar3, 48);
            boolean z6 = b0kVar3.k(ibj1.f) == h44.b;
            paj1 paj1Var2 = paj1.a;
            nim0 nim0Var = nim0.a;
            if (paj1Var == paj1Var2) {
                b0kVar3.i0(673412945);
                qim0 qim0VarN = anm1.N(czd1.d, g2cVar.b(nim0Var));
                int i7 = i6 & 896;
                boolean z7 = i7 == 256;
                Object objT2 = b0kVar3.T();
                Object obj5 = objT2;
                if (z7 || objT2 == m4cVar2) {
                    thh thhVar = new thh(iu30Var, (byte) 24);
                    b0kVar3.s0(thhVar);
                    obj5 = thhVar;
                }
                op71.g(b0kVar3, bin.x(qim0VarN, false, null, null, null, (Function0) obj5, 15));
                if (z6) {
                    b0kVar3.i0(673610787);
                    qim0 qim0VarA = g2cVar.a(u291.B(nim0Var, (gra) null, 3), graVar);
                    boolean z8 = i7 == 256;
                    Object objT3 = b0kVar3.T();
                    Object obj6 = objT3;
                    if (z8 || objT3 == m4cVar2) {
                        thh thhVar2 = new thh(iu30Var, (byte) 25);
                        b0kVar3.s0(thhVar2);
                        obj6 = thhVar2;
                    }
                    s(g2cVar, adj1Var, qim0VarA, (Function0) obj6, b0kVar3, i6 & 126);
                    z2 = false;
                    b0kVar3.r(false);
                } else {
                    z2 = false;
                    b0kVar3.i0(673808753);
                    b0kVar3.r(false);
                }
                b0kVar3.r(z2);
            } else {
                z2 = false;
                if (paj1Var == paj1.c) {
                    b0kVar3.i0(673856989);
                    f2p1.n(g2cVar, adj1Var, iu30Var, b0kVar3, i6 & 1022);
                    b0kVar3.r(false);
                } else if (adj1Var instanceof ycj1) {
                    b0kVar3.i0(673946362);
                    idx idxVar = new idx(18);
                    qim0 qim0VarA2 = g2cVar.a(u291.B(nim0Var, (gra) null, 3), graVar);
                    boolean z9 = (i6 & 896) == 256;
                    Object objT4 = b0kVar3.T();
                    Object obj7 = objT4;
                    if (z9 || objT4 == m4cVar2) {
                        thh thhVar3 = new thh(iu30Var, (byte) 26);
                        b0kVar3.s0(thhVar3);
                        obj7 = thhVar3;
                    }
                    r12 = 0;
                    w8p1.j(idxVar, qim0VarA2, (Function0) obj7, b0kVar3, 0);
                    b0kVar3.r(false);
                } else {
                    r12 = 0;
                    b0kVar3.i0(674183729);
                    b0kVar3.r(false);
                }
                qim0 qim0VarB = g2cVar.b(nim0Var);
                mbhVarA = jbh.a(h36.g, een.P0, b0kVar3, (int) r12);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarB);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(hmb0.t1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                iOrdinal = paj1Var.ordinal();
                if (iOrdinal != 0) {
                    b2 = 1;
                    if (iOrdinal != 1) {
                        b0kVar2 = b0kVar3;
                        ?? r8 = r12;
                        i3 = i6;
                        m4cVar = m4cVar2;
                        i4 = 256;
                        b0kVar2.i0(-15507473);
                        e(adj1Var, iu30Var, b0kVar2, (i3 >> 3) & 126);
                        b0kVar2.r((boolean) r8);
                        r6 = r8;
                    } else {
                        if (iOrdinal == 2) {
                            throw p3d1.k(b0kVar3, -15508609, (boolean) r12);
                        }
                        b0kVar3.i0(-15492278);
                        if ((i6 & 896) == 256) {
                            r2 = 1;
                        } else {
                            r2 = r12;
                        }
                        objT = b0kVar3.T();
                        if (r2 == 0) {
                            m4cVar = m4cVar2;
                            if (objT == m4cVar) {
                            }
                            obj = objT;
                            Function0 function0 = (Function0) obj;
                            i4 = 256;
                            boolean z10 = r12 == true ? 1 : 0;
                            b0kVar2 = b0kVar3;
                            i3 = i6;
                            d(function0, null, null, b0kVar2, 0, 6);
                            b0kVar2.r(z10);
                            r6 = z10;
                        } else {
                            m4cVar = m4cVar2;
                        }
                        obj = objT;
                        thh thhVar4 = new thh(iu30Var, (byte) 29);
                        b0kVar3.s0(thhVar4);
                        Object obj8 = thhVar4;
                        obj8 = objT;
                        Function0 function1 = (Function0) obj8;
                        i4 = 256;
                        boolean z11 = r12 == true ? 1 : 0;
                        b0kVar2 = b0kVar3;
                        i3 = i6;
                        d(function1, null, null, b0kVar2, 0, 6);
                        b0kVar2.r(z11);
                        r6 = z11;
                    }
                } else {
                    b0kVar2 = b0kVar3;
                    r5 = r12;
                    i3 = i6;
                    m4cVar = m4cVar2;
                    b2 = 1;
                    i4 = 256;
                    b0kVar2.i0(-480645202);
                    i5 = i3 & 896;
                    if (i5 == 256) {
                        z3 = true;
                    } else {
                        z3 = r5 == true ? 1 : 0;
                    }
                    Object objT5 = b0kVar2.T();
                    obj = objT5;
                    if (z3 || objT5 == m4cVar) {
                        thh thhVar5 = new thh(iu30Var, (byte) 27);
                        b0kVar2.s0(thhVar5);
                        obj = thhVar5;
                    }
                    Function0 function2 = (Function0) obj;
                    if (i5 == 256) {
                        z4 = true;
                    } else {
                        z4 = r5 == true ? 1 : 0;
                    }
                    Object objT6 = b0kVar2.T();
                    obj2 = objT6;
                    if (z4 || objT6 == m4cVar) {
                        thh thhVar6 = new thh(iu30Var, (byte) 28);
                        b0kVar2.s0(thhVar6);
                        obj2 = thhVar6;
                    }
                    Function0 function3 = (Function0) obj2;
                    if (z) {
                        b0kVar2.i0(-480443299);
                        j2iVarR = apo.r(1203324691, new tth(adj1Var, iu30Var, (byte) 1), b0kVar2);
                        b0kVar2.r((boolean) r5);
                    } else {
                        b0kVar2.i0(-480345959);
                        b0kVar2.r((boolean) r5);
                        j2iVarR = null;
                    }
                    d(function2, function3, j2iVarR, b0kVar2, 0, 0);
                    b0kVar2.r((boolean) r5);
                    r6 = r5;
                }
                iOrdinal2 = paj1Var.ordinal();
                if (iOrdinal2 != 0) {
                    b3 = b2;
                    r13 = r6;
                    b0kVar2.i0(-15487840);
                    if ((i3 & 896) == i4) {
                        z5 = b3 == true ? 1 : 0;
                    } else {
                        z5 = r13 == true ? 1 : 0;
                    }
                    Object objT7 = b0kVar2.T();
                    obj3 = objT7;
                    if (z5 || objT7 == m4cVar) {
                        yth ythVar = new yth(iu30Var, r13 == true ? (byte) 1 : (byte) 0);
                        b0kVar2.s0(ythVar);
                        obj3 = ythVar;
                    }
                    b9p1.e(adj1Var, (Function0) obj3, null, 0, b0kVar2, (i3 >> 3) & 14, 12);
                    b0kVar2.r((boolean) r13);
                    r11 = b3;
                } else if (iOrdinal2 != 2) {
                    b0kVar2.i0(-15477949);
                    d9p1.g((i3 >> 3) & 126, b0kVar2, iu30Var, null, adj1Var);
                    b0kVar2.r((boolean) r6);
                    r11 = b2;
                } else {
                    b0kVar2.i0(-15483634);
                    if ((i3 & 896) == i4) {
                        r7 = b2;
                    } else {
                        r7 = r6;
                    }
                    Object objT8 = b0kVar2.T();
                    obj4 = objT8;
                    if (r7 == 0 || objT8 == m4cVar) {
                        yth ythVar2 = new yth(iu30Var, b2);
                        b0kVar2.s0(ythVar2);
                        obj4 = ythVar2;
                    }
                    r11 = b2;
                    b9p1.e(adj1Var, (Function0) obj4, null, 2, b0kVar2, ((i3 >> 3) & 14) | 3072, 4);
                    b0kVar2.r((boolean) r6);
                }
                b0kVar2.r((boolean) r11);
            }
            r12 = z2;
            qim0 qim0VarB2 = g2cVar.b(nim0Var);
            mbhVarA = jbh.a(h36.g, een.P0, b0kVar3, (int) r12);
            iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0VarM = b0kVar3.m();
            qim0VarE = zr7.E(b0kVar3, qim0VarB2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a != null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            iOrdinal = paj1Var.ordinal();
            if (iOrdinal != 0) {
                b2 = 1;
                if (iOrdinal != 1) {
                    b0kVar2 = b0kVar3;
                    ?? r9 = r12;
                    i3 = i6;
                    m4cVar = m4cVar2;
                    i4 = 256;
                    b0kVar2.i0(-15507473);
                    e(adj1Var, iu30Var, b0kVar2, (i3 >> 3) & 126);
                    b0kVar2.r((boolean) r9);
                    r6 = r9;
                } else {
                    if (iOrdinal == 2) {
                        throw p3d1.k(b0kVar3, -15508609, (boolean) r12);
                    }
                    b0kVar3.i0(-15492278);
                    if ((i6 & 896) == 256) {
                        r2 = 1;
                    } else {
                        r2 = r12;
                    }
                    objT = b0kVar3.T();
                    if (r2 == 0) {
                        m4cVar = m4cVar2;
                        if (objT == m4cVar) {
                        }
                        obj8 = objT;
                        Function0 function4 = (Function0) obj8;
                        i4 = 256;
                        boolean z12 = r12 == true ? 1 : 0;
                        b0kVar2 = b0kVar3;
                        i3 = i6;
                        d(function4, null, null, b0kVar2, 0, 6);
                        b0kVar2.r(z12);
                        r6 = z12;
                    } else {
                        m4cVar = m4cVar2;
                    }
                    obj8 = objT;
                    thh thhVar7 = new thh(iu30Var, (byte) 29);
                    b0kVar3.s0(thhVar7);
                    Object obj9 = thhVar7;
                    obj9 = objT;
                    Function0 function5 = (Function0) obj9;
                    i4 = 256;
                    boolean z13 = r12 == true ? 1 : 0;
                    b0kVar2 = b0kVar3;
                    i3 = i6;
                    d(function5, null, null, b0kVar2, 0, 6);
                    b0kVar2.r(z13);
                    r6 = z13;
                }
            } else {
                b0kVar2 = b0kVar3;
                r5 = r12;
                i3 = i6;
                m4cVar = m4cVar2;
                b2 = 1;
                i4 = 256;
                b0kVar2.i0(-480645202);
                i5 = i3 & 896;
                if (i5 == 256) {
                    z3 = true;
                } else {
                    z3 = r5 == true ? 1 : 0;
                }
                Object objT9 = b0kVar2.T();
                obj = objT9;
                if (z3) {
                    thh thhVar8 = new thh(iu30Var, (byte) 27);
                    b0kVar2.s0(thhVar8);
                    obj = thhVar8;
                } else {
                    thh thhVar9 = new thh(iu30Var, (byte) 27);
                    b0kVar2.s0(thhVar9);
                    obj = thhVar9;
                }
                Function0 function6 = (Function0) obj;
                if (i5 == 256) {
                    z4 = true;
                } else {
                    z4 = r5 == true ? 1 : 0;
                }
                Object objT10 = b0kVar2.T();
                obj2 = objT10;
                if (z4) {
                    thh thhVar10 = new thh(iu30Var, (byte) 28);
                    b0kVar2.s0(thhVar10);
                    obj2 = thhVar10;
                } else {
                    thh thhVar11 = new thh(iu30Var, (byte) 28);
                    b0kVar2.s0(thhVar11);
                    obj2 = thhVar11;
                }
                Function0 function7 = (Function0) obj2;
                if (z) {
                    b0kVar2.i0(-480443299);
                    j2iVarR = apo.r(1203324691, new tth(adj1Var, iu30Var, (byte) 1), b0kVar2);
                    b0kVar2.r((boolean) r5);
                } else {
                    b0kVar2.i0(-480345959);
                    b0kVar2.r((boolean) r5);
                    j2iVarR = null;
                }
                d(function6, function7, j2iVarR, b0kVar2, 0, 0);
                b0kVar2.r((boolean) r5);
                r6 = r5;
            }
            iOrdinal2 = paj1Var.ordinal();
            if (iOrdinal2 != 0) {
                b3 = b2;
                r13 = r6;
                b0kVar2.i0(-15487840);
                if ((i3 & 896) == i4) {
                    z5 = b3 == true ? 1 : 0;
                } else {
                    z5 = r13 == true ? 1 : 0;
                }
                Object objT11 = b0kVar2.T();
                obj3 = objT11;
                if (z5) {
                    yth ythVar3 = new yth(iu30Var, r13 == true ? (byte) 1 : (byte) 0);
                    b0kVar2.s0(ythVar3);
                    obj3 = ythVar3;
                } else {
                    yth ythVar4 = new yth(iu30Var, r13 == true ? (byte) 1 : (byte) 0);
                    b0kVar2.s0(ythVar4);
                    obj3 = ythVar4;
                }
                b9p1.e(adj1Var, (Function0) obj3, null, 0, b0kVar2, (i3 >> 3) & 14, 12);
                b0kVar2.r((boolean) r13);
                r11 = b3;
            } else if (iOrdinal2 != 2) {
                b0kVar2.i0(-15477949);
                d9p1.g((i3 >> 3) & 126, b0kVar2, iu30Var, null, adj1Var);
                b0kVar2.r((boolean) r6);
                r11 = b2;
            } else {
                b0kVar2.i0(-15483634);
                if ((i3 & 896) == i4) {
                    r7 = b2;
                } else {
                    r7 = r6;
                }
                Object objT12 = b0kVar2.T();
                obj4 = objT12;
                if (r7 == 0) {
                    yth ythVar5 = new yth(iu30Var, b2);
                    b0kVar2.s0(ythVar5);
                    obj4 = ythVar5;
                } else {
                    yth ythVar6 = new yth(iu30Var, b2);
                    b0kVar2.s0(ythVar6);
                    obj4 = ythVar6;
                }
                r11 = b2;
                b9p1.e(adj1Var, (Function0) obj4, null, 2, b0kVar2, ((i3 >> 3) & 14) | 3072, 4);
                b0kVar2.r((boolean) r6);
            }
            b0kVar2.r((boolean) r11);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((Object) g2cVar, (Object) adj1Var, (Object) iu30Var, (Object) paj1Var, z, i, (byte) 9);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1236244059);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131951935);
            fux fuxVar = fux.c;
            jsl jslVar = new jsl(strO0);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(fuxVar, jslVar, bin.x(u291.r(nim0.a, 16.0f), false, strO0, null, null, function0, 13), 0L, 0L, false, x340Var, fux.d, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 6);
        }
    }

    public static final void c(adj1 adj1Var, iu30 iu30Var, qim0 qim0Var, paj1 paj1Var, boolean z, b0k b0kVar, int i) {
        boolean z2;
        boolean zBooleanValue;
        qim0 qim0VarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(624869220);
        int i2 = i | (x340Var.g(adj1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.e(paj1Var == null ? -1 : paj1Var.ordinal()) ? 2048 : 1024) | 8192;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                zBooleanValue = ((Boolean) x340Var.k(ibj1.e)).booleanValue();
            } else {
                x340Var.b0();
                zBooleanValue = z;
            }
            x340Var.s();
            boolean z3 = paj1Var == paj1.c;
            qim0 qim0VarN = nim0.a;
            if (z3) {
                uwr uwrVar = cbx.a;
                qim0VarN = anm1.N(czd1.e, dug.f(qim0VarN, ((vex) zex.a.b).a, d4o1.a));
            }
            qim0 qim0Var2 = qim0VarN;
            if (z3) {
                x340Var.i0(1091298296);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = bmh.Y;
                    x340Var.s0(objT);
                }
                qim0VarB = s161.b(qim0Var, false, (iu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(1091464580);
                x340Var.r(false);
                qim0VarB = qim0Var;
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar2 = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cwl1.b(qim0Var2, (tl3) null, er31.b(16.0f), (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(731304199, new tf((Object) adj1Var, (Object) iu30Var, (Object) paj1Var, zBooleanValue, (byte) 5), x340Var), x340Var, 0, 48, 2026);
            x340Var.r(true);
            z2 = zBooleanValue;
        } else {
            x340Var.b0();
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((Object) adj1Var, (cv30) iu30Var, qim0Var, (Object) paj1Var, z2, i, (byte) 11);
        }
    }

    public static final void d(Function0 function0, Function0 function1, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1638264874);
        int i5 = (x340Var.i(function0) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
        } else {
            i3 = i5 | (x340Var.i(function1) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (x340Var.i(vu30Var) ? 256 : 128);
        }
        byte b2 = 1;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                function1 = null;
            }
            if (i7 != 0) {
                vu30Var = null;
            }
            gfx.b(18, apo.r(-497706603, new uth(function1, vu30Var, function0, b2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        Function0 function2 = function1;
        vu30 vu30Var2 = vu30Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vth(function0, function2, vu30Var2, i, i2, (byte) 1);
        }
    }

    public static final void e(adj1 adj1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1370832731);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(18, apo.r(-2057451558, new tth(adj1Var, iu30Var, (byte) 3), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(adj1Var, iu30Var, i, (byte) 2);
        }
    }

    public static final void f(nhe0 nhe0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1219797955);
        int i2 = i | (b0kVar3.i(nhe0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            ogx ogxVar = ogx.e;
            String str = nhe0Var.a;
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 25);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                ioo1.c(qim0VarZ, ogxVar, null, null, null, null, null, new gbx(new y50(str), function1), null, null, mxi.e, null, mxi.f, mxi.g, null, null, apo.r(-481496014, new kne0(nhe0Var, (byte) 0), b0kVar3), b0kVar2, 0, 1576326, 52092);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(nhe0Var, function0, qim0Var2, i, (byte) 3);
        }
    }

    public static final void g(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1840802404);
        int i2 = i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(u291.h(qim0Var2, 64.0f), 176.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarQ = i1p1.q(uyn1.z(0.0f, 16.0f, 1, qim0VarV), er31.b(32.0f));
            t1c.a(z ? cwl1.l0(qim0VarQ, jC, (hw61) null, 6) : dug.f(qim0VarQ, jC, d4o1.a), x340Var, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 7);
        }
    }

    public static final void h(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-599327396);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cjc0 cjc0Var = new cjc0(4);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0Var, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 2, false, cjc0Var, 0, null, x340Var, (i2 & 14) | 1572864 | (i2 & 112), 0, 1712);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 2);
        }
    }

    public static final void i(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1505582880);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 29);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            wro1.h(gbxVar, ldxVar, dug.f(u291.r(uyn1.A(nim0.a, 8.0f, 8.0f, 0.0f, 8.0f), cbx.b(x340Var).b.d), cbx.a(x340Var).a.c, er31.a), null, gdxVarS, null, false, null, null, vdi.a, x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 28);
        }
    }

    public static final void j(adj1 adj1Var, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1643572866);
        int i2 = (x340Var.g(adj1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new yth(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            kp0 kp0VarG = adj1Var.g((Function0) objT, true, z);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qp0.a(kp0VarG, uyn1.x(nim0.a, 8.0f), x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wth(adj1Var, iu30Var, z, i, (byte) 1);
        }
    }

    public static final void k(y7e1 y7e1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        byte b2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1944896155);
        int i2 = i | (x340Var2.g(y7e1Var) ? 4 : 2) | (x340Var2.g(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var = (lz20) objT;
            rwo1.b(y7e1Var, vby0.p(u291.f(qim0Var, 1.0f), lz20Var), null, null, r4i.a, apo.r(-531349830, new ex1(y7e1Var, (byte) 0), x340Var2), false, false, null, cbx.d(x340Var2).k, null, null, d6e1.b, null, null, null, null, F(x340Var2), 0.0f, false, E(x340Var2), x340Var2, (i2 & 14) | 221184, 384, 912844);
            x340Var = x340Var2;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                b2 = 0;
                objT2 = new fx1(lz20Var, null, (byte) 0);
                x340Var.s0(objT2);
            } else {
                b2 = 0;
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
        } else {
            x340Var = x340Var2;
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gx1(y7e1Var, qim0Var, i, b2);
        }
    }

    public static final void l(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        byte b2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(558553252);
        int i2 = i | (x340Var.g(qim0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            String strO0 = cwl1.o0(x340Var, 2131951936);
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            zxx zxxVarE = E(x340Var);
            lee1 lee1Var = cbx.d(x340Var).k;
            zzq0 zzq0VarF = F(x340Var);
            nim0 nim0Var = nim0.a;
            rwo1.b(y7e1VarD, u291.f(nim0Var, 1.0f), null, strO0, r4i.b, null, false, false, null, lee1Var, null, null, d6e1.b, null, null, null, null, zzq0VarF, 0.0f, false, zxxVarE, x340Var, 24624, 384, 912868);
            x340Var = x340Var;
            qim0 qim0VarN = anm1.N("find_playlist_placeholder", h2c.a.b(nim0Var));
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new v1(strO0, (byte) 14);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new y1(function0, (byte) 14);
                x340Var.s0(objT2);
            }
            t1c.a(bin.x(qim0VarB, false, strO0, null, null, (Function0) objT2, 13), x340Var, 0);
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var, function0, i, b2);
        }
    }

    public static final void m(ume0 ume0Var, iu30 iu30Var, yge0 yge0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1338100049);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(ume0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(yge0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(b0kVar3).g, 32), b0kVar3);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 8.0f, 0.0f, vk80VarX.a(), 5);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            boolean zI = b0kVar3.i(ume0Var) | ((i2 & 112) == 32) | b0kVar3.i(yge0Var);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new lb50(ume0Var, iu30Var, yge0Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarF, null, zzq0VarJ, false, d36Var, null, null, false, null, (iu30) objT, b0kVar2, 0, 490);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lne0(ume0Var, iu30Var, yge0Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void n(wo80 wo80Var, res resVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-444184966);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(wo80Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(resVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            t9p1.b(uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, 8.0f), x340Var, 0);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            h(0, wo80Var.a, x340Var, uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10));
            otw.c(resVar, wo80Var.b, (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
            x340Var.r(true);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar7 = cbx.b(x340Var).b;
            cvx cvxVar8 = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 16.0f, 5));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(wo80Var, resVar, qim0Var2, i, (byte) 8);
        }
    }

    public static final void o(lee1 lee1Var, float f, b0k b0kVar, int i) {
        float f2;
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1721262507);
        int i2 = i | (x340Var.i(lee1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwo1.e(" ", null, lee1Var, u7h.j, null, null, 0, false, new cjc0(1), 0, null, x340Var, ((i2 << 6) & 896) | 6, 0, 1778);
            f2 = f;
            t1c.a(cwl1.l0(dug.f(u291.h(u291.f(nim0Var, f2), ((wat) x340Var.k(t4k.h)).y(lee1Var.a.b)), cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            b2 = 1;
            x340Var.r(true);
        } else {
            f2 = f;
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lt9(lee1Var, f2, i, b2);
        }
    }

    public static final void p(nhe0 nhe0Var, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1021818082);
        byte b2 = 2;
        int i2 = (b0kVar3.i(nhe0Var) ? 4 : 2) | i | (b0kVar3.i(function0) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            xu30 xu30VarR = null;
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 2, (tvx) null, (p3v) null, 27);
            String str = nhe0Var.a;
            boolean z2 = (i3 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 26);
                b0kVar3.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function2);
            String str2 = nhe0Var.b;
            if (str2 == null) {
                b0kVar3.i0(1746089744);
            } else {
                b0kVar3.i0(1746089745);
                xu30VarR = apo.r(1265774786, new z3y(str2, (byte) 24), b0kVar3);
            }
            b0kVar3.r(false);
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVarB, null, false, null, null, gbxVar, null, null, null, null, xu30VarR, apo.r(1936425111, new xy30(z, function1, b2), b0kVar3), null, null, apo.r(790014298, new kne0(nhe0Var, (byte) 1), b0kVar3), b0kVar2, 64, 196992, 26556);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bk10(nhe0Var, z, function0, function1, qim0Var2, i);
        }
    }

    public static final void q(ume0 ume0Var, iu30 iu30Var, yge0 yge0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        boolean z;
        m4c m4cVar = fkj0.X;
        List list = ume0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2042842033);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ume0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(yge0Var) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            boolean zI = x340Var.i(yge0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new mne0(yge0Var, (lnm) null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            int i5 = i4 & 112;
            boolean zI2 = x340Var.i(y7e1VarD) | (i5 == 32);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.t(y7e1VarD, x340Var, (vu30) objT2);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean zI3 = (i5 == 32) | x340Var.i(yge0Var);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                i3 = 0;
                objT3 = new nne0(yge0Var, iu30Var, (byte) 0);
                x340Var.s0(objT3);
            } else {
                i3 = 0;
            }
            w(y7e1VarD, (Function0) objT3, null, x340Var, i3);
            int i6 = ume0Var.e;
            if (i6 == 4 || i6 == 5) {
                qim0Var3 = qim0Var4;
                z = true;
                x340Var.i0(-1134995458);
                qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                r(uyn1.B(qim0VarD2, 0.0f, cbx.b(x340Var).b.e, 0.0f, 0.0f, 13), x340Var, 0);
                x340Var.r(false);
            } else if (i6 == 2 && list.isEmpty()) {
                x340Var.i0(-1134765283);
                qim0 qim0VarD3 = u291.d(qim0Var4, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0VarD3, 0.0f, cbx.b(x340Var).b.e, 0.0f, 0.0f, 13);
                gfh0 gfh0VarC = t1c.c(een.e, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                z = true;
                rhx0.a((qim0) null, 0L, 0.0f, 0L, 0, 0.0f, x340Var, 0, 63);
                x340Var.r(true);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else {
                z = true;
                int length = ume0Var.c.length();
                pbh pbhVar = pbh.a;
                if (length == 0) {
                    x340Var.i0(-1134372172);
                    qim0Var3 = qim0Var4;
                    m(ume0Var, iu30Var, yge0Var, pbhVar.a(1.0f, qim0Var4, true), x340Var, i4 & 1022);
                    x340Var.r(false);
                } else {
                    qim0Var3 = qim0Var4;
                    x340Var.i0(-1134176500);
                    y(mqo1.A(list), iu30Var, yge0Var, pbhVar.a(1.0f, qim0Var3, true), x340Var, i4 & 1008);
                    x340Var.r(false);
                }
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lne0(ume0Var, iu30Var, yge0Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void r(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1449513288);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131963257);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 0);
        }
    }

    public static final void s(g2c g2cVar, adj1 adj1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(477622783);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (adj1Var instanceof ycj1) {
            x340Var.i0(-366165038);
            w8p1.j(ldx.c, qim0Var, function0, x340Var, (i2 >> 3) & 1008);
            x340Var.r(false);
        } else {
            x340Var.i0(-366014533);
            w0h1.a(xpx.c, isl.a, g2cVar.a(nim0.a, een.h), 0L, 0L, false, x340Var, xpx.d | 48, 56);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xth(g2cVar, adj1Var, qim0Var, function0, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void t(int i, b0k b0kVar, qim0 qim0Var, boolean z) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z2;
        zzq0 zzq0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(85574132);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            if (z) {
                b0kVar3.i0(-1871466954);
                b0kVar3.r(false);
                z2 = false;
            } else {
                b0kVar3.i0(632366719);
                af afVarA = ef.c(b0kVar3).a();
                z2 = afVarA.compareTo(af.e) >= 0 && afVarA.compareTo(af.i) <= 0;
                b0kVar3.r(false);
            }
            tvx tvxVarB = gto1.B(1, b0kVar3, z ? 2 : 5);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = o5v0.W0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 4.0f, 0.0f);
            if (z2) {
                b0kVar3.i0(632388535);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 0.0f);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1870557751);
                b0kVar3.r(false);
                zzq0Var = null;
            }
            zzq0 zzq0Var2 = zzq0Var;
            if (z2) {
                tvxVarB = tvx.a(tvxVarB, 0.0f, 3);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarA, new uvx(0, (pgx) null, 5, zzq0Var2, zzq0VarH, tvxVarB, (hw61) null, 0, (p3v) null, 451), null, false, null, null, null, null, null, a9j.a, null, a9j.b, null, null, null, a9j.c, b0kVar2, 805306432, 196656, 30204);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt9(z, qim0Var2, i, (byte) 2);
        }
    }

    public static final void u(Function0 function0, b0k b0kVar, int i) {
        dt30 dt30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2047119994);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && x340Var.H()) {
            x340Var.b0();
        } else {
            et30 et30VarH = (et30) x340Var.k(dfe0.a);
            if (et30VarH == null) {
                x340Var.i0(-1738308180);
                et30VarH = v9p1.H((View) x340Var.k(AndroidCompositionLocals_androidKt.f));
                x340Var.r(false);
            } else {
                x340Var.i0(-1738310474);
                x340Var.r(false);
            }
            if (et30VarH == null) {
                x340Var.i0(-1738306337);
                g0i baseContext = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof et30) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                et30VarH = (et30) baseContext;
                x340Var.r(false);
            } else {
                x340Var.i0(-1738310398);
                x340Var.r(false);
            }
            if (et30VarH == null || (dt30Var = (dt30) ((g0i) et30VarH).g.getValue()) == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new h621(function0, i, (byte) 2);
                    return;
                }
                return;
            }
            boolean zI = x340Var.i(dt30Var) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new nt01(dt30Var, function0, (byte) 21);
                x340Var.s0(objT);
            }
            qxd0.h(dt30Var, function0, (iu30) objT, x340Var);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new h621(function0, i, (byte) 1);
        }
    }

    public static final void v(y7e1 y7e1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        vu30 vu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(833632147);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.i(y7e1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT;
            boolean zI = b0kVar3.i(lz20Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fx1(lz20Var, null, (byte) 7);
                b0kVar3.s0(objT2);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarP = vby0.p(i1p1.q(qim0VarF, er31.b(8.0f)), lz20Var);
            String strO0 = cwl1.o0(b0kVar3, 2131963256);
            zxx zxxVar = new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, 0L, 896);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            if (y7e1Var.d().d.length() > 0) {
                b0kVar3.i0(1235832887);
                vu30 vu30VarR = apo.r(-862588971, new ex1(y7e1Var, (byte) 2), b0kVar3);
                b0kVar3.r(false);
                vu30Var = vu30VarR;
            } else {
                b0kVar3.i0(1236200857);
                b0kVar3.r(false);
                vu30Var = null;
            }
            b0kVar2 = b0kVar3;
            rwo1.b(y7e1Var, qim0VarP, null, strO0, mxi.d, vu30Var, false, false, null, null, null, null, d6e1.b, null, null, null, null, zzq0Var, 0.0f, false, zxxVar, b0kVar2, (i2 & 14) | 24576, 0, 913348);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(y7e1Var, qim0Var, i, (byte) 24);
        }
    }

    public static final void w(y7e1 y7e1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1425112583);
        int i2 = i | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            long j = ((yex) zscVar.d).b;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, j, u5j1Var);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF2 = u291.f(uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ti5.a(mxi.b, (qim0) null, apo.r(1146029398, new vgz(function0, (byte) 29), x340Var), (xu30) null, 0.0f, (erl1) null, kkn.C(((yex) zscVar.d).b, 0L, 0L, 0L, 0L, x340Var, 62), x340Var, 390, 186);
            cvx cvxVar2 = cbx.b(x340Var).b;
            v(y7e1Var, uyn1.z(16.0f, 0.0f, 2, qim0Var3), x340Var, i2 & 14);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(y7e1Var, function0, qim0Var2, i, (byte) 4);
        }
    }

    public static final void x(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1269383732);
        if (x340Var.Y(i & 1, i != 0)) {
            esx esxVar = esx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(esxVar, isl.a, u291.r(nim0.a, 16.0f), 0L, 0L, false, x340Var, esx.d | 48, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 12, i, false);
        }
    }

    public static final void y(c380 c380Var, iu30 iu30Var, yge0 yge0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-818186774);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(yge0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(b0kVar3).g, 32), b0kVar3);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 8.0f, 0.0f, vk80VarX.a(), 5);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            boolean zI = b0kVar3.i(c380Var) | b0kVar3.i(yge0Var) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new lb50(c380Var, yge0Var, iu30Var, (byte) 26);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarF, null, zzq0VarJ, false, d36Var, null, null, false, null, (iu30) objT, b0kVar2, 0, 490);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, c380Var, iu30Var, yge0Var, qim0Var, (byte) 16);
        }
    }

    public static final void z(int i, uhe1 uhe1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        aie1 yhe1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1175488000);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var.g(uhe1Var) : x340Var.i(uhe1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            cie1 cie1Var = (cie1) x340Var.k(ige0.c);
            if (uhe1Var instanceof she1) {
                yhe1Var = new yhe1(((she1) uhe1Var).a);
            } else {
                if (!(uhe1Var instanceof the1)) {
                    eg.o();
                    return;
                }
                yhe1Var = zhe1.a;
            }
            otw.c(cie1Var, new bie1(i, yhe1Var), qim0Var, (ipb1) null, x340Var, i3 & 896, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, (Object) uhe1Var, (Object) qim0Var, i2, (byte) 22);
        }
    }
}
