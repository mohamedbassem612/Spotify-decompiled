package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class yoi1 {
    public static voi1 b = null;
    public static boolean c = false;
    public static final xat d = new xat(1.0f, 1.0f);
    public static final d261 e = new d261("TestTagsAsResourceId", false, new ff41((byte) 29));
    public static final d261 f = new d261("AccessibilityClassName", true, new ff41((byte) 21));
    public static final d261 g = new d261("CredentialRequest", false, new a261((byte) 0));
    public final /* synthetic */ byte a;

    public /* synthetic */ yoi1(byte b2) {
        this.a = b2;
    }

    public static fhe0 A(Configuration configuration) {
        return fhe0.d(up30.q(configuration));
    }

    public static boolean B(Uri uri, String str) {
        return (uri.getPathSegments().size() >= 1 && u890.j(uri.getPathSegments().get(0), str)) || (uri.getPathSegments().size() >= 2 && u890.j(uri.getPathSegments().get(1), str));
    }

    public static final boolean C(qka0 qka0Var) {
        rzc caller;
        rzc rzcVarG;
        if (qka0Var instanceof zla0) {
            mma0 mma0Var = (mma0) qka0Var;
            Field fieldX = m5n1.x(mma0Var);
            if (!(fieldX != null ? fieldX.isAccessible() : true)) {
                return false;
            }
            Method methodY = m5n1.y(mma0Var.b());
            if (!(methodY != null ? methodY.isAccessible() : true)) {
                return false;
            }
            Method methodY2 = m5n1.y(((zla0) qka0Var).c());
            if (!(methodY2 != null ? methodY2.isAccessible() : true)) {
                return false;
            }
        } else if (qka0Var instanceof mma0) {
            mma0 mma0Var2 = (mma0) qka0Var;
            Field fieldX2 = m5n1.x(mma0Var2);
            if (!(fieldX2 != null ? fieldX2.isAccessible() : true)) {
                return false;
            }
            Method methodY3 = m5n1.y(mma0Var2.b());
            if (!(methodY3 != null ? methodY3.isAccessible() : true)) {
                return false;
            }
        } else if (qka0Var instanceof gma0) {
            Field fieldX3 = m5n1.x(((gma0) qka0Var).e());
            if (!(fieldX3 != null ? fieldX3.isAccessible() : true)) {
                return false;
            }
            Method methodY4 = m5n1.y((nla0) qka0Var);
            if (!(methodY4 != null ? methodY4.isAccessible() : true)) {
                return false;
            }
        } else if (qka0Var instanceof tla0) {
            Field fieldX4 = m5n1.x(((tla0) qka0Var).e());
            if (!(fieldX4 != null ? fieldX4.isAccessible() : true)) {
                return false;
            }
            Method methodY5 = m5n1.y((nla0) qka0Var);
            if (!(methodY5 != null ? methodY5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(qka0Var instanceof nla0)) {
                StringBuilder sb = new StringBuilder("Unknown callable: ");
                sb.append(qka0Var);
                Class<?> cls = qka0Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            nla0 nla0Var = (nla0) qka0Var;
            Method methodY6 = m5n1.y(nla0Var);
            if (!(methodY6 != null ? methodY6.isAccessible() : true)) {
                return false;
            }
            dc11 dc11VarB = bpi1.b(qka0Var);
            Object objB = (dc11VarB == null || (rzcVarG = dc11VarB.g()) == null) ? null : rzcVarG.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            dc11 dc11VarB2 = bpi1.b(nla0Var);
            Member memberB = (dc11VarB2 == null || (caller = dc11VarB2.getCaller()) == null) ? null : caller.b();
            Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean D(n3x n3xVar) {
        List list;
        String str = null;
        q161 q161Var = (q161) n3xVar.b().foldIn((Object) null, g070.t);
        n161 n161VarD = q161Var != null ? q161Var.d() : null;
        if (n161VarD != null && (list = (List) n161VarD.a()) != null) {
            str = (String) list.get(0);
        }
        return str == null || str.length() == 0;
    }

    public static boolean E(Uri uri) {
        List list = s6d.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (u890.j((String) it.next(), uri.getHost())) {
                return true;
            }
        }
        return false;
    }

    public static bid0 F(ExecutorService executorService) {
        if (executorService instanceof bid0) {
            return (bid0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new gkm0((ScheduledExecutorService) executorService) : new dkm0(executorService);
    }

    public static que0 G(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zY = nhc1.Y(str, "HTTP/1.", false);
        bjy0 bjy0Var = bjy0.HTTP_1_0;
        bjy0 bjy0Var2 = bjy0.HTTP_1_1;
        if (zY) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                bjy0Var = bjy0Var2;
            }
        } else if (nhc1.Y(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!nhc1.Y(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            bjy0Var = bjy0Var2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numC0 = nhc1.c0(str.substring(i, i2));
        if (numC0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numC0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new que0(bjy0Var, iIntValue, strSubstring);
    }

    public static int H(tr80 tr80Var, dqz0 dqz0Var) {
        try {
            if (tr80Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + tr80Var);
            }
            int i = tr80Var.b;
            int i2 = tr80Var.a;
            if (i < Integer.MAX_VALUE) {
                return dqz0Var.h(i2, i + 1);
            }
            return i2 > Integer.MIN_VALUE ? dqz0Var.h(i2 - 1, i) + 1 : dqz0Var.f();
        } catch (IllegalArgumentException e2) {
            bhn0.t(e2.getMessage());
            return 0;
        }
    }

    public static long I(n5f0 n5f0Var) {
        cqz0 cqz0Var = dqz0.a;
        try {
            if (n5f0Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + n5f0Var);
            }
            long j = n5f0Var.b;
            long j2 = n5f0Var.a;
            if (j < Long.MAX_VALUE) {
                return dqz0.b.k(j2, j + 1);
            }
            if (j2 <= Long.MIN_VALUE) {
                return dqz0.b.i();
            }
            return dqz0.b.k(j2 - 1, j) + 1;
        } catch (IllegalArgumentException e2) {
            bhn0.t(e2.getMessage());
            return 0L;
        }
    }

    public static jsg J(float f2, float f3) {
        return new jsg(f2, f3);
    }

    public static Executor K(Executor executor, nw20 nw20Var) {
        executor.getClass();
        return executor == l5u.a ? executor : new u8a0(executor, nw20Var, (byte) 1);
    }

    public static final void L(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static rr80 M(tr80 tr80Var) {
        return ebp1.m(tr80Var.b, tr80Var.a, -tr80Var.c);
    }

    public static final void N(qka0 qka0Var) {
        rzc caller;
        rzc rzcVarG;
        if (qka0Var instanceof zla0) {
            mma0 mma0Var = (mma0) qka0Var;
            Field fieldX = m5n1.x(mma0Var);
            if (fieldX != null) {
                fieldX.setAccessible(true);
            }
            Method methodY = m5n1.y(mma0Var.b());
            if (methodY != null) {
                methodY.setAccessible(true);
            }
            Method methodY2 = m5n1.y(((zla0) qka0Var).c());
            if (methodY2 != null) {
                methodY2.setAccessible(true);
                return;
            }
            return;
        }
        if (qka0Var instanceof mma0) {
            mma0 mma0Var2 = (mma0) qka0Var;
            Field fieldX2 = m5n1.x(mma0Var2);
            if (fieldX2 != null) {
                fieldX2.setAccessible(true);
            }
            Method methodY3 = m5n1.y(mma0Var2.b());
            if (methodY3 != null) {
                methodY3.setAccessible(true);
                return;
            }
            return;
        }
        if (qka0Var instanceof gma0) {
            Field fieldX3 = m5n1.x(((gma0) qka0Var).e());
            if (fieldX3 != null) {
                fieldX3.setAccessible(true);
            }
            Method methodY4 = m5n1.y((nla0) qka0Var);
            if (methodY4 != null) {
                methodY4.setAccessible(true);
                return;
            }
            return;
        }
        if (qka0Var instanceof tla0) {
            Field fieldX4 = m5n1.x(((tla0) qka0Var).e());
            if (fieldX4 != null) {
                fieldX4.setAccessible(true);
            }
            Method methodY5 = m5n1.y((nla0) qka0Var);
            if (methodY5 != null) {
                methodY5.setAccessible(true);
                return;
            }
            return;
        }
        if (!(qka0Var instanceof nla0)) {
            StringBuilder sb = new StringBuilder("Unknown callable: ");
            sb.append(qka0Var);
            Class<?> cls = qka0Var.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new UnsupportedOperationException(sb.toString());
        }
        nla0 nla0Var = (nla0) qka0Var;
        Method methodY6 = m5n1.y(nla0Var);
        if (methodY6 != null) {
            methodY6.setAccessible(true);
        }
        dc11 dc11VarB = bpi1.b(qka0Var);
        Object objB = (dc11VarB == null || (rzcVarG = dc11VarB.g()) == null) ? null : rzcVarG.b();
        AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        dc11 dc11VarB2 = bpi1.b(nla0Var);
        Member memberB = (dc11VarB2 == null || (caller = dc11VarB2.getCaller()) == null) ? null : caller.b();
        Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }

    public static rr80 O(rr80 rr80Var, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            nkx0.m("Step must be positive, was: ", numValueOf, 46);
        }
        int i2 = rr80Var.a;
        int i3 = rr80Var.b;
        if (rr80Var.c <= 0) {
            i = -i;
        }
        return ebp1.m(i2, i3, i);
    }

    public static final zgx P(h0f0 h0f0Var, Function0 function0) {
        String strA = h0f0Var.a();
        String strA2 = h0f0Var.a();
        ft0 ft0Var = new ft0(function0, h0f0Var, (byte) 13);
        if (!ihc1.y0(strA2)) {
            return new zgx(strA, new gbx(new y50(strA2), ft0Var));
        }
        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
        return null;
    }

    public static tr80 Q(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new tr80(i, i2 - 1, 1);
        }
        tr80 tr80Var = tr80.d;
        return tr80.d;
    }

    public static n5f0 R(long j, long j2) {
        return j2 <= Long.MIN_VALUE ? n5f0.c : new n5f0(j, j2 - 1);
    }

    public static final void S(h6b h6bVar, bw61 bw61Var) {
        h6bVar.N1(h6bVar.h() * bw61Var.f());
        h6bVar.O1(h6bVar.h() * bw61Var.g());
        float fH = h6bVar.h() * r3v.a(bw61Var.e());
        float fH2 = h6bVar.h() * r3v.b(bw61Var.e());
        h6bVar.M1((((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH2)) & 4294967295L));
        h6bVar.L1(bw61Var.d());
        h6bVar.K1(bw61Var.c());
        h6bVar.I1(bw61Var.a());
        h6bVar.J1(bw61Var.b());
    }

    public static mw40 T(Context context, CharSequence charSequence, CharSequence charSequence2) {
        sp00 sp00Var = new sp00((byte) 24);
        charSequence.getClass();
        sp00Var.y(charSequence);
        charSequence2.getClass();
        sp00Var.x(charSequence2);
        return new mw40(context, sp00Var);
    }

    public static ByteBuffer U(String str, List list) {
        int iRemaining = 8;
        for (int i = 0; i < list.size(); i++) {
            iRemaining += ((ByteBuffer) list.get(i)).remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put((ByteBuffer) list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer V(String str, ByteBuffer byteBuffer) {
        return W(byteBuffer, str.getBytes(StandardCharsets.UTF_8));
    }

    public static ByteBuffer W(ByteBuffer byteBuffer, byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static byte[] X(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        hhg1.n("n must not be negative");
        return null;
    }

    public static byte[] Y(BigInteger bigInteger, int i) {
        if (bigInteger.signum() == -1) {
            hhg1.n("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            k220.r("integer too large");
            return null;
        }
        if (length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - length, length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        }
        k220.r("integer too large");
        return null;
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1837451710);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            gdx gdxVarA = yla.r(x340Var).a();
            j2i j2iVar = a5i.a;
            j2i j2iVarR = apo.r(-1133938398, new nl(str, (byte) 12), x340Var);
            qim0 qim0Var3 = nim0.a;
            foo1.h(gbxVar, qim0Var3, (max) null, gdxVarA, (idn0) null, j2iVar, j2iVarR, x340Var, 14155824, 52);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, qim0Var2, function0, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z, Function0 function0, qim0 qim0Var, boolean z2, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        b0k b0kVar2;
        idn0 idn0Var2;
        qim0 qim0Var3;
        boolean z5;
        h311 h311VarV;
        qim0 qim0Var4;
        int i6;
        qim0 qim0Var5;
        boolean z6;
        idn0 idn0VarY;
        soz0 soz0Var;
        long jB;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2007444714);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (b0kVar3.h(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                if ((i3 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b0kVar3.Y(i3 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        i6 = i3 & (-57345);
                        qim0Var5 = qim0Var4;
                        z6 = i4 == 0 ? z3 : true;
                        idn0VarY = zso1.Y(b0kVar3);
                    } else {
                        b0kVar3.b0();
                        qim0 qim0Var6 = qim0Var2;
                        i6 = i3 & (-57345);
                        qim0Var5 = qim0Var6;
                        idn0VarY = idn0Var;
                        z6 = z3;
                    }
                    b0kVar3.s();
                    uwr uwrVar = cbx.a;
                    boolean z7 = z6;
                    soz0Var = new soz0(cbx.a(b0kVar3).b.f, cbx.a(b0kVar3).c.b, u7h.b(cbx.a(b0kVar3).b.f, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(cbx.a(b0kVar3).c.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
                    mta mtaVar = cbx.b(b0kVar3).d;
                    qim0 qim0VarR = u291.r(qim0Var5, 32.0f);
                    if (z) {
                        jB = soz0Var.a();
                    } else {
                        jB = soz0Var.b();
                    }
                    b0kVar2 = b0kVar3;
                    idn0Var2 = idn0VarY;
                    kno1.n(z, function0, py20.b(qim0VarR, idn0VarY, jB, er31.a, new p3v(-6.0f), b0kVar2, 0, 16), z7, soz0Var, idn0Var2, b0kVar3, i6 & 7294, 0);
                    z5 = z7;
                    qim0Var3 = qim0Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    idn0Var2 = idn0Var;
                    qim0Var3 = qim0Var2;
                    z5 = z3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new pwx(z, function0, qim0Var3, z5, idn0Var2, i, i2);
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i3 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    z6 = i4 == 0 ? z3 : true;
                    idn0VarY = zso1.Y(b0kVar3);
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    z6 = i4 == 0 ? z3 : true;
                    idn0VarY = zso1.Y(b0kVar3);
                }
                b0kVar3.s();
                uwr uwrVar2 = cbx.a;
                boolean z8 = z6;
                soz0Var = new soz0(cbx.a(b0kVar3).b.f, cbx.a(b0kVar3).c.b, u7h.b(cbx.a(b0kVar3).b.f, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(cbx.a(b0kVar3).c.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
                mta mtaVar2 = cbx.b(b0kVar3).d;
                qim0 qim0VarR2 = u291.r(qim0Var5, 32.0f);
                if (z) {
                    jB = soz0Var.a();
                } else {
                    jB = soz0Var.b();
                }
                b0kVar2 = b0kVar3;
                idn0Var2 = idn0VarY;
                kno1.n(z, function0, py20.b(qim0VarR2, idn0VarY, jB, er31.a, new p3v(-6.0f), b0kVar2, 0, 16), z8, soz0Var, idn0Var2, b0kVar3, i6 & 7294, 0);
                z5 = z8;
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                idn0Var2 = idn0Var;
                qim0Var3 = qim0Var2;
                z5 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new pwx(z, function0, qim0Var3, z5, idn0Var2, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (b0kVar3.h(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i3 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    z6 = i4 == 0 ? z3 : true;
                    idn0VarY = zso1.Y(b0kVar3);
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    i6 = i3 & (-57345);
                    qim0Var5 = qim0Var4;
                    z6 = i4 == 0 ? z3 : true;
                    idn0VarY = zso1.Y(b0kVar3);
                }
                b0kVar3.s();
                uwr uwrVar3 = cbx.a;
                boolean z9 = z6;
                soz0Var = new soz0(cbx.a(b0kVar3).b.f, cbx.a(b0kVar3).c.b, u7h.b(cbx.a(b0kVar3).b.f, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(cbx.a(b0kVar3).c.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
                mta mtaVar3 = cbx.b(b0kVar3).d;
                qim0 qim0VarR3 = u291.r(qim0Var5, 32.0f);
                if (z) {
                    jB = soz0Var.a();
                } else {
                    jB = soz0Var.b();
                }
                b0kVar2 = b0kVar3;
                idn0Var2 = idn0VarY;
                kno1.n(z, function0, py20.b(qim0VarR3, idn0VarY, jB, er31.a, new p3v(-6.0f), b0kVar2, 0, 16), z9, soz0Var, idn0Var2, b0kVar3, i6 & 7294, 0);
                z5 = z9;
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                idn0Var2 = idn0Var;
                qim0Var3 = qim0Var2;
                z5 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new pwx(z, function0, qim0Var3, z5, idn0Var2, i, i2);
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i3 & 1, z4)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                i6 = i3 & (-57345);
                qim0Var5 = qim0Var4;
                z6 = i4 == 0 ? z3 : true;
                idn0VarY = zso1.Y(b0kVar3);
            } else {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                i6 = i3 & (-57345);
                qim0Var5 = qim0Var4;
                z6 = i4 == 0 ? z3 : true;
                idn0VarY = zso1.Y(b0kVar3);
            }
            b0kVar3.s();
            uwr uwrVar4 = cbx.a;
            boolean z10 = z6;
            soz0Var = new soz0(cbx.a(b0kVar3).b.f, cbx.a(b0kVar3).c.b, u7h.b(cbx.a(b0kVar3).b.f, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(cbx.a(b0kVar3).c.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
            mta mtaVar4 = cbx.b(b0kVar3).d;
            qim0 qim0VarR4 = u291.r(qim0Var5, 32.0f);
            if (z) {
                jB = soz0Var.a();
            } else {
                jB = soz0Var.b();
            }
            b0kVar2 = b0kVar3;
            idn0Var2 = idn0VarY;
            kno1.n(z, function0, py20.b(qim0VarR4, idn0VarY, jB, er31.a, new p3v(-6.0f), b0kVar2, 0, 16), z10, soz0Var, idn0Var2, b0kVar3, i6 & 7294, 0);
            z5 = z10;
            qim0Var3 = qim0Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            idn0Var2 = idn0Var;
            qim0Var3 = qim0Var2;
            z5 = z3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pwx(z, function0, qim0Var3, z5, idn0Var2, i, i2);
        }
    }

    public static final void c(int i, int i2, int i3, Function0 function0, b0k b0kVar, int i4) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(955403777);
        j06 j06Var = x340Var2.a;
        int i5 = i4 | (x340Var2.e(i) ? 4 : 2) | (x340Var2.e(i2) ? 32 : 16) | (x340Var2.e(i3) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024);
        if (x340Var2.Y(i5 & 1, (i5 & 1171) != 1170)) {
            gra graVar = een.h;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarG = dug.g(u7h.b(cbx.a(x340Var2).a.c, 0.5f, 0.0f, 0.0f, 0.0f, 14), qim0VarD);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var2));
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarG);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(tgp1.l(x340Var2));
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(cwl1.o0(x340Var2, i), (qim0) null, cbx.d(x340Var2).c, cbx.a(x340Var2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2018);
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(cwl1.o0(x340Var2, i2), uyn1.y(u291.f(nim0Var, 1.0f), 8.0f, 8.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, nim0Var);
            boolean z2 = (i5 & 7168) == 2048;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new in00(function0, (byte) 3);
                x340Var2.s0(objT);
            }
            foo1.c(smo1.C((Function0) objT), new idx(6), qim0VarZ, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1694587226, new vx1(i3, (byte) 18), x340Var2), x340Var2, 0, 48, 2040);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wt00(i, i2, i3, function0, i4);
        }
    }

    public static final void d(yx70 yx70Var, String str, gt40 gt40Var, int i, u8h u8hVar, b0k b0kVar, int i2, int i3) {
        int i4;
        gt40 gt40VarX;
        int i5;
        u8h u8hVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(491792371);
        if ((i2 & 6) == 0) {
            int i6 = i2 & 8;
            i4 = (x340Var.g(yx70Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.g(str) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= x340Var.g(gt40Var) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= x340Var.e(i) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            int i10 = 32768 & i2;
            i4 |= x340Var.g(u8hVar) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && x340Var.H()) {
            x340Var.b0();
            i5 = i;
            u8hVar2 = u8hVar;
        } else {
            if (i7 != 0) {
                gt40Var = et40.a;
            }
            int i11 = i8 != 0 ? 1 : i;
            u8h u8hVar3 = i9 != 0 ? null : u8hVar;
            x340Var.j0(135631275);
            if (str != null) {
                x340Var.j0(135633130);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new xfa(str, (byte) 5);
                    x340Var.s0(objT);
                }
                x340Var.r(false);
                gt40VarX = iko1.x(gt40Var, (iu30) objT);
            } else {
                gt40VarX = gt40Var;
            }
            x340Var.r(false);
            ut70 ut70Var = ut70.a;
            x340Var.j0(-1115894518);
            x340Var.j0(1886828752);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(new zg20(ut70Var, (byte) 18));
            } else {
                x340Var.v0();
            }
            nko1.H(yx70Var, x340Var, g070.f);
            nko1.H(gt40VarX, x340Var, g070.g);
            nko1.H(i6m.a(i11), x340Var, g070.h);
            nko1.H(u8hVar3, x340Var, g070.i);
            x340Var.r(true);
            x340Var.r(false);
            x340Var.r(false);
            i5 = i11;
            u8hVar2 = u8hVar3;
        }
        gt40 gt40Var2 = gt40Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(yx70Var, str, gt40Var2, i5, u8hVar2, i2, i3);
        }
    }

    public static final void e(j0f0 j0f0Var, Function0 function0, int i, b0k b0kVar, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-277648334);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(j0f0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(263019909, new d0e0(j0f0Var, function0, (byte) 10), x340Var), x340Var, ((i5 >> 6) & 14) | 3072, 6);
            i4 = 2;
        } else {
            x340Var.b0();
            i4 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(j0f0Var, function0, i4, i2, (byte) 10);
        }
    }

    public static final void f(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-409104272);
        int i2 = i | (x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(huxVar, isl.a, null, 0L, 0L, false, x340Var, 56 | (i2 & 14), 60);
            op71.g(x340Var, u291.v(nim0.a, 8.0f));
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2042);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l42(huxVar, str, qim0Var, i, (byte) 0);
        }
    }

    public static final ezc g(ObservableSource observableSource) {
        return h4p1.f(new k53(observableSource, (lnm) null, (byte) 24));
    }

    public static final Flowable h(mr20 mr20Var, o8n o8nVar) {
        vbm[] vbmVarArr = q601.a;
        bhh1 bhh1Var = igu.b;
        bhh1Var.getClass();
        return Flowable.F(new rr20(mr20Var, ilo1.B(bhh1Var, o8nVar)));
    }

    public static final Observable i(mr20 mr20Var, o8n o8nVar) {
        return Observable.create(new zpq0(o8nVar, mr20Var));
    }

    public static int k(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static Comparable l(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static Comparable m(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    public static double n(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            return d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float o(float f2, float f3, float f4) {
        if (f3 <= f4) {
            if (f2 < f3) {
                return f3;
            }
            return f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int p(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int q(int i, lsg lsgVar) {
        if (lsgVar instanceof ksg) {
            return ((Number) u(Integer.valueOf(i), (ksg) lsgVar)).intValue();
        }
        if (lsgVar.isEmpty()) {
            nkx0.m("Cannot coerce value to an empty range: ", lsgVar, 46);
            return 0;
        }
        if (i < ((Number) lsgVar.m()).intValue()) {
            return ((Number) lsgVar.m()).intValue();
        }
        return i > ((Number) lsgVar.n()).intValue() ? ((Number) lsgVar.n()).intValue() : i;
    }

    public static long r(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbS = cy30.s(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbS.append(j2);
        sbS.append('.');
        throw new IllegalArgumentException(sbS.toString());
    }

    public static long s(long j, n5f0 n5f0Var) {
        long j2 = n5f0Var.b;
        long j3 = n5f0Var.a;
        if (n5f0Var instanceof ksg) {
            return ((Number) u(Long.valueOf(j), (ksg) n5f0Var)).longValue();
        }
        if (n5f0Var.isEmpty()) {
            nkx0.m("Cannot coerce value to an empty range: ", n5f0Var, 46);
            return 0L;
        }
        if (j < Long.valueOf(j3).longValue()) {
            return Long.valueOf(j3).longValue();
        }
        return j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
    }

    public static Comparable t(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static Comparable u(Comparable comparable, ksg ksgVar) {
        if (ksgVar.isEmpty()) {
            nkx0.m("Cannot coerce value to an empty range: ", ksgVar, 46);
            return null;
        }
        if (!ksgVar.b(comparable, ksgVar.m()) || ksgVar.b(ksgVar.m(), comparable)) {
            return (!ksgVar.b(ksgVar.n(), comparable) || ksgVar.b(comparable, ksgVar.n())) ? comparable : ksgVar.n();
        }
        return ksgVar.m();
    }

    public static ByteBuffer v(ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static View w(Context context, Class cls, int i) {
        return x(context, (n8s0) o8s0.c.get(cls), null, i);
    }

    public static View x(Context context, n8s0 n8s0Var, AttributeSet attributeSet, int i) {
        n8s0Var.getClass();
        if (i == 0) {
            i = n8s0Var.b();
        }
        View viewA = n8s0Var.a(context, attributeSet, i);
        if ((viewA instanceof TextView) && !(viewA instanceof EncoreTextView)) {
            fa30.a((TextView) viewA, context);
        }
        return viewA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static tye1 y(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return tye1.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return tye1.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return tye1.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return tye1.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return tye1.SSL_3_0;
        }
        hhg1.n("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final uvl1 z(vwl1 vwl1Var) {
        return new uvl1(vwl1Var.a, vwl1Var.t);
    }

    public int hashCode() {
        switch (this.a) {
            case 18:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 18:
                String strR = rc11.a.b(getClass()).r();
                strR.getClass();
                return strR;
            default:
                return super.toString();
        }
    }
}
