package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.view.ViewStructure;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ghk1 implements Function, vy11, np5, ebn1 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ghk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static final String n() {
        l8p1 l8p1Var = q8p1.c;
        int[] iArr = {491705403, 818579176, 1201981447, 810223592, 1243973908, -593404049, 554701476, 1889947178, 1780695788};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr[7] % 1780695788) ^ xvj1.i((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) 5);
        byteBufferAllocate.putInt(78977249);
        byte[] bArrArray = byteBufferAllocate.array();
        return l8p1Var.d(bArrArray, bArrArray.length);
    }

    public zen1 a() {
        u311 u311Var = (u311) this.b;
        if (u311Var != null) {
            return new zen1(u311Var);
        }
        eg.m("Missing required properties: status");
        return null;
    }

    public void accept(Object obj, Object obj2) {
        sjn1 sjn1Var = new sjn1((non1) this.b, (bsd1) obj2, (byte) 2);
        ngn1 ngn1VarN = ((cfn1) obj).n();
        Parcel parcelA1 = ngn1VarN.a1();
        osn1.c(parcelA1, sjn1Var);
        ngn1VarN.c1(3, parcelA1);
    }

    public Object apply(Object obj) {
        int streamMaxVolume;
        switch (this.a) {
            case 1:
                nrk1 nrk1Var = (nrk1) obj;
                xl61 xl61Var = nrk1Var.a;
                onr onrVar = (onr) this.b;
                double dA = onrVar.a();
                uw7 uw7Var = onrVar.a;
                double d = xl61Var.a;
                iu30 iu30Var = xl61Var.d;
                if (!bno1.r(Double.valueOf(d), dA)) {
                    if (iu30Var != null) {
                        iu30Var.invoke(Boolean.FALSE);
                    }
                    return new osk1(xl61Var, false, dA, (Double) null);
                }
                boolean z = false;
                try {
                    streamMaxVolume = uw7Var.a.getStreamMaxVolume(3);
                    break;
                } catch (NullPointerException unused) {
                    streamMaxVolume = 0;
                }
                try {
                    try {
                        uw7Var.a.setStreamVolume(3, jch0.S(((double) streamMaxVolume) * d), nrk1Var.b ? 1 : 0);
                        break;
                    } catch (NullPointerException unused2) {
                    }
                    z = true;
                } catch (SecurityException e) {
                    Logger.e(e, "Volume adjustment not allowed to toggle Do Not Disturb", new Object[0]);
                }
                Double dValueOf = z ? Double.valueOf(onrVar.a()) : null;
                if (iu30Var != null) {
                    iu30Var.invoke(Boolean.valueOf(z));
                }
                return new osk1(xl61Var, z, dA, dValueOf);
            case 2:
                l2u0 l2u0Var = (l2u0) this.b;
                return Long.valueOf((long) ((((Long) obj).longValue() * 50 * l2u0Var.f) + l2u0Var.j));
            case 3:
            default:
                mmr0 mmr0Var = (mmr0) obj;
                return ((vxm1) this.b).a.b((YourLibraryRequest) mmr0Var.a).map(new f2g1(mmr0Var.b, (byte) 17));
            case 4:
                ypm1 ypm1Var = (ypm1) obj;
                return ypm1Var.a ? ((Single) ((dqm1) this.b).h.c.getValue()).flatMapCompletable(s321.X).x(ypm1Var) : Single.just(ypm1Var);
        }
    }

    public void b(long j, String str, String str2, Bundle bundle) {
        String str3;
        zxl1 zxl1Var = (zxl1) this.b;
        if (((HashSet) zxl1Var.b).contains(str2)) {
            Bundle bundle2 = new Bundle();
            t380 t380Var = dtn1.a;
            String[] strArr = u890.e;
            String[] strArr2 = u890.d;
            int iMin = Math.min(33, 33);
            int i = 0;
            while (true) {
                if (i >= iMin) {
                    str3 = null;
                    break;
                }
                String str4 = strArr[i];
                if ((str2 == null && str4 == null) || (str2 != null && str2.equals(str4))) {
                    str3 = strArr2[i];
                    break;
                }
                i++;
            }
            if (str3 != null) {
                str2 = str3;
            }
            bundle2.putString("events", str2);
            ((oql) zxl1Var.c).l(bundle2);
        }
    }

    public Bundle c() {
        return ((ViewStructure) this.b).getExtras();
    }

    public void d(Bitmap bitmap) {
        pue0 pue0Var = a8p1.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        ((a8p1) this.b).d(0, bitmap2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:31:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008f -> B:33:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Enum e(p.nmx0 r14, p.onm r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p.dpl1
            if (r0 == 0) goto L13
            r0 = r15
            p.dpl1 r0 = (p.dpl1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            p.dpl1 r0 = new p.dpl1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f
            int r1 = r0.h
            p.mys0 r2 = p.mys0.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L4c
            if (r1 == r5) goto L3a
            if (r1 != r4) goto L33
            int r14 = r0.c
            int r1 = r0.b
            p.nmx0 r7 = r0.a
            p.hm5.M(r15)
            goto L8d
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            r13 = 0
            return r13
        L3a:
            int r14 = r0.e
            int r1 = r0.d
            int r7 = r0.c
            int r8 = r0.b
            p.nmx0 r9 = r0.a
            p.hm5.M(r15)
            r12 = r15
            r15 = r14
            r14 = r7
            r7 = r12
            goto L6e
        L4c:
            p.hm5.M(r15)
            r15 = 4
            r1 = r3
        L51:
            if (r1 >= r15) goto L95
            java.lang.Object r7 = r13.b
            p.rx5 r7 = (p.rx5) r7
            r0.a = r14
            r0.b = r15
            r0.c = r1
            r0.d = r1
            r0.e = r3
            r0.h = r5
            java.lang.Enum r7 = r7.b(r14, r0)
            if (r7 != r6) goto L6a
            goto L8a
        L6a:
            r9 = r14
            r8 = r15
            r14 = r1
            r15 = r3
        L6e:
            p.mys0 r7 = (p.mys0) r7
            if (r7 == r2) goto L73
            return r7
        L73:
            r7 = 3
            if (r1 >= r7) goto L8f
            r0.a = r9
            r0.b = r8
            r0.c = r14
            r0.d = r1
            r0.e = r15
            r0.h = r4
            r10 = 200(0xc8, double:9.9E-322)
            java.lang.Object r15 = p.hap1.i(r10, r0)
            if (r15 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r1 = r8
            r7 = r9
        L8d:
            r15 = r1
            goto L91
        L8f:
            r15 = r8
            r7 = r9
        L91:
            int r1 = r14 + 1
            r14 = r7
            goto L51
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ghk1.e(p.nmx0, p.onm):java.lang.Enum");
    }

    public void f(String str) {
        ((ViewStructure) this.b).setClassName(str);
    }

    public void g(String str) {
        ((ViewStructure) this.b).setContentDescription(str);
    }

    public void h(int i, int i2, int i3, int i4) {
        ((ViewStructure) this.b).setDimens(i, i2, 0, 0, i3, i4);
    }

    public void i(int i, String str) {
        ((ViewStructure) this.b).setId(i, null, null, str);
    }

    public void j(u311 u311Var) {
        this.b = u311Var;
    }

    public void k(CharSequence charSequence) {
        ((ViewStructure) this.b).setText(charSequence);
    }

    public void l(float f) {
        ((ViewStructure) this.b).setTextStyle(f, 0, 0, 0);
    }

    public ViewStructure m() {
        return (ViewStructure) this.b;
    }

    public ghk1() {
        this.a = (byte) 6;
    }
}
