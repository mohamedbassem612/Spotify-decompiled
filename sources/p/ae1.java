package p;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.Formatter;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.offline_esperanto.proto.EsOffline;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ae1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(dkm1 dkm1Var, String str, String str2, q1m q1mVar, iu30 iu30Var, Function0 function0, vu30 vu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 28;
        this.c = dkm1Var;
        this.d = str;
        this.e = str2;
        this.f = q1mVar;
        this.g = iu30Var;
        this.h = function0;
        this.i = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0361 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x017b  */
    /* JADX WARN: Code duplicated, block: B:53:0x017d A[Catch: Exception -> 0x00cd, CancellationException -> 0x01ec, PHI: r0 r4
      0x017d: PHI (r0v11 java.lang.Object) = (r0v10 java.lang.Object), (r0v21 java.lang.Object) binds: [B:51:0x0179, B:33:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r4v17 p.z6x) = (r4v43 p.z6x), (r4v44 p.z6x) binds: [B:51:0x0179, B:33:0x00e0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {CancellationException -> 0x01ec, Exception -> 0x00cd, blocks: (B:27:0x00c8, B:32:0x00dd, B:53:0x017d, B:50:0x0164), top: B:127:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x027b  */
    /* JADX WARN: Code duplicated, block: B:81:0x027d A[Catch: Exception -> 0x008b, CancellationException -> 0x02e5, PHI: r0 r4
      0x027d: PHI (r0v33 java.lang.Object) = (r0v32 java.lang.Object), (r0v44 java.lang.Object) binds: [B:79:0x0279, B:21:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r4v29 ??) = (r4v39 ??), (r4v40 ??) binds: [B:79:0x0279, B:21:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x008b, blocks: (B:20:0x0084, B:81:0x027d, B:82:0x0291, B:84:0x0297, B:87:0x02ab, B:88:0x02af, B:78:0x0259), top: B:127:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0297 A[Catch: Exception -> 0x008b, CancellationException -> 0x02e5, TryCatch #2 {Exception -> 0x008b, blocks: (B:20:0x0084, B:81:0x027d, B:82:0x0291, B:84:0x0297, B:87:0x02ab, B:88:0x02af, B:78:0x0259), top: B:127:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02aa  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x033f, code lost:
    
        if (r0.b(r5, r2, r23) == r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019a, code lost:
    
        if (r3.emit(r0, r23) == r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c2, code lost:
    
        if (r3.emit(r6, r23) == r7) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ae1.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [byte, p.vgn0] */
    private final Object g(Object obj) {
        i590 i590Var;
        vgn0 vgn0Var;
        iu30 iu30Var;
        Throwable th;
        i590 i590Var2;
        vgn0 vgn0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        k590 k590Var = (k590) this.h;
        ?? r1 = this.b;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (r1 == 0) {
                    hm5.M(obj);
                    c9n c9nVar = (c9n) this.e;
                    hfn0 hfn0Var = (hfn0) this.g;
                    faa0 faa0VarA = c9nVar.J().A(fkj0.W0);
                    faa0VarA.getClass();
                    i590Var = new i590(hfn0Var, faa0VarA);
                    AtomicReference atomicReference3 = k590Var.a;
                    loop2: while (true) {
                        i590 i590Var3 = (i590) atomicReference3.get();
                        if (i590Var3 != null && i590Var.a.compareTo(i590Var3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(i590Var3, i590Var)) {
                                if (i590Var3 != null) {
                                    i590Var3.b.d((CancellationException) null);
                                }
                                vgn0Var = k590Var.b;
                                iu30Var = (iu30) this.i;
                                this.e = i590Var;
                                this.c = vgn0Var;
                                this.f = iu30Var;
                                this.d = k590Var;
                                this.b = (byte) 1;
                                if (vgn0Var.a(this) != d9nVar) {
                                    break loop2;
                                }
                                return d9nVar;
                            }
                        } while (atomicReference3.get() == i590Var3);
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k590Var = (k590) this.f;
                        vgn0Var2 = (vgn0) this.c;
                        i590Var2 = (i590) this.e;
                        try {
                            hm5.M(obj);
                            atomicReference2 = k590Var.a;
                            while (!atomicReference2.compareAndSet(i590Var2, null) && atomicReference2.get() == i590Var2) {
                            }
                            vgn0Var2.c((Object) null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = k590Var.a;
                            while (!atomicReference.compareAndSet(i590Var2, null) && atomicReference.get() == i590Var2) {
                            }
                            throw th;
                        }
                    }
                    k590Var = (k590) this.d;
                    iu30 iu30Var2 = (iu30) this.f;
                    vgn0 vgn0Var3 = (vgn0) this.c;
                    i590 i590Var4 = (i590) this.e;
                    hm5.M(obj);
                    iu30Var = iu30Var2;
                    i590Var = i590Var4;
                    vgn0Var = vgn0Var3;
                }
                this.e = i590Var;
                this.c = vgn0Var;
                this.f = k590Var;
                this.d = null;
                this.b = (byte) 2;
                Object objInvoke = iu30Var.invoke(this);
                if (objInvoke != d9nVar) {
                    vgn0 vgn0Var4 = vgn0Var;
                    obj = objInvoke;
                    i590Var2 = i590Var;
                    vgn0Var2 = vgn0Var4;
                    atomicReference2 = k590Var.a;
                    while (!atomicReference2.compareAndSet(i590Var2, null)) {
                    }
                    vgn0Var2.c((Object) null);
                    return obj;
                }
                return d9nVar;
            } catch (Throwable th3) {
                th = th3;
                i590Var2 = i590Var;
                atomicReference = k590Var.a;
                while (!atomicReference.compareAndSet(i590Var2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.c((Object) null);
            throw th4;
        }
    }

    private final Object h(Object obj) {
        iu30 iu30Var;
        wkt wktVar;
        iu30 iu30Var2;
        Uri uri;
        wkt wktVar2;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                wkt wktVar3 = (wkt) this.d;
                iu30 iu30Var3 = (iu30) this.c;
                hm5.M(obj);
                wktVar = wktVar3;
                iu30Var = iu30Var3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.e;
                wktVar2 = (wkt) this.d;
                iu30Var2 = (iu30) this.c;
                hm5.M(obj);
            }
            iu30Var2.invoke(new x6n0(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b, 0));
            return rih1Var;
        }
        hm5.M(obj);
        wkt wktVarG = ((h7n0) this.f).g();
        if (wktVarG == null) {
            return rih1Var;
        }
        iu30Var = (iu30) this.g;
        xwa xwaVar = (xwa) this.h;
        vwa[] vwaVarArr = {new vwa()};
        this.c = iu30Var;
        this.d = wktVarG;
        this.b = (byte) 1;
        Object objA = xwaVar.a(vwaVarArr, this);
        if (objA != d9nVar) {
            wktVar = wktVarG;
            obj = objA;
        }
        return d9nVar;
        Uri uri2 = ((wwa) o7h.V0((List) obj)).b;
        xwa xwaVar2 = (xwa) this.i;
        vwa[] vwaVarArr2 = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar;
        this.e = uri2;
        this.b = (byte) 2;
        Object objA2 = xwaVar2.a(vwaVarArr2, this);
        if (objA2 != d9nVar) {
            obj = objA2;
            iu30Var2 = iu30Var;
            uri = uri2;
            wktVar2 = wktVar;
            iu30Var2.invoke(new x6n0(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b, 0));
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [byte, p.vgn0] */
    private final Object i(Object obj) {
        mfn0 mfn0Var;
        vgn0 vgn0Var;
        iu30 iu30Var;
        Throwable th;
        mfn0 mfn0Var2;
        vgn0 vgn0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        pfn0 pfn0Var = (pfn0) this.h;
        ?? r1 = this.b;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (r1 == 0) {
                    hm5.M(obj);
                    c9n c9nVar = (c9n) this.e;
                    hfn0 hfn0Var = (hfn0) this.g;
                    faa0 faa0VarA = c9nVar.J().A(fkj0.W0);
                    faa0VarA.getClass();
                    mfn0Var = new mfn0(hfn0Var, faa0VarA);
                    pfn0Var.b(mfn0Var);
                    vgn0Var = pfn0Var.b;
                    iu30Var = (iu30) this.i;
                    this.e = mfn0Var;
                    this.c = vgn0Var;
                    this.f = iu30Var;
                    this.d = pfn0Var;
                    this.b = (byte) 1;
                    if (vgn0Var.a(this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pfn0Var = (pfn0) this.f;
                    vgn0Var2 = (vgn0) this.c;
                    mfn0Var2 = (mfn0) this.e;
                    try {
                        hm5.M(obj);
                        atomicReference2 = pfn0Var.a;
                        while (!atomicReference2.compareAndSet(mfn0Var2, null) && atomicReference2.get() == mfn0Var2) {
                        }
                        vgn0Var2.c((Object) null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = pfn0Var.a;
                        while (!atomicReference.compareAndSet(mfn0Var2, null) && atomicReference.get() == mfn0Var2) {
                        }
                        throw th;
                    }
                }
                pfn0Var = (pfn0) this.d;
                iu30 iu30Var2 = (iu30) this.f;
                vgn0 vgn0Var3 = (vgn0) this.c;
                mfn0 mfn0Var3 = (mfn0) this.e;
                hm5.M(obj);
                iu30Var = iu30Var2;
                mfn0Var = mfn0Var3;
                vgn0Var = vgn0Var3;
                this.e = mfn0Var;
                this.c = vgn0Var;
                this.f = pfn0Var;
                this.d = null;
                this.b = (byte) 2;
                Object objInvoke = iu30Var.invoke(this);
                if (objInvoke != d9nVar) {
                    vgn0 vgn0Var4 = vgn0Var;
                    obj = objInvoke;
                    mfn0Var2 = mfn0Var;
                    vgn0Var2 = vgn0Var4;
                    atomicReference2 = pfn0Var.a;
                    while (!atomicReference2.compareAndSet(mfn0Var2, null)) {
                    }
                    vgn0Var2.c((Object) null);
                    return obj;
                }
                return d9nVar;
            } catch (Throwable th3) {
                th = th3;
                mfn0Var2 = mfn0Var;
                atomicReference = pfn0Var.a;
                while (!atomicReference.compareAndSet(mfn0Var2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.c((Object) null);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f5 A[RETURN] */
    private final Object j(Object obj) {
        s2t s2tVarQ;
        Object objQ;
        Bitmap bitmap;
        Object objE;
        Bitmap.CompressFormat compressFormat;
        int i;
        Object objC;
        k3i0 k3i0Var = (k3i0) this.g;
        Paint paint = (Paint) k3i0Var.c;
        c9n c9nVar = (c9n) this.f;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new taw0(k3i0Var, (Uri) this.i, null, (byte) 0), 3);
            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new taw0(k3i0Var, (Uri) this.e, null, (byte) 1), 3);
            this.f = null;
            this.c = s2tVarQ;
            this.b = (byte) 1;
            objQ = s2tVarQ2.Q(this);
            if (objQ != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVarQ = (s2t) this.c;
            hm5.M(obj);
            objQ = obj;
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Bitmap bitmap2 = (Bitmap) this.d;
            hm5.M(obj);
            bitmap = bitmap2;
            objE = obj;
        }
        Bitmap bitmap3 = (Bitmap) objE;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        int width = (int) (bitmapCreateBitmap.getWidth() * (bitmap3.getWidth() / bitmap.getWidth()));
        int height = (int) (width * (bitmap3.getHeight() / bitmap3.getWidth()));
        int i2 = width / 2;
        int i3 = height / 2;
        canvas.drawBitmap(bitmap3, (Rect) null, new Rect((bitmapCreateBitmap.getWidth() / 2) - i2, (bitmapCreateBitmap.getHeight() / 2) - i3, (bitmapCreateBitmap.getWidth() / 2) + i2, (bitmapCreateBitmap.getHeight() / 2) + i3), paint);
        zxa zxaVar = (zxa) k3i0Var.a;
        compressFormat = (Bitmap.CompressFormat) this.h;
        if (compressFormat == Bitmap.CompressFormat.JPEG) {
            i = 80;
        } else {
            i = 100;
        }
        this.f = null;
        this.c = null;
        this.d = null;
        this.b = (byte) 3;
        objC = zxaVar.c(bitmapCreateBitmap, compressFormat, i, this);
        if (objC != d9nVar) {
            return d9nVar;
        }
        return objC;
        bitmap = (Bitmap) objQ;
        this.f = null;
        this.c = null;
        this.d = bitmap;
        this.b = (byte) 2;
        objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            Bitmap bitmap4 = (Bitmap) objE;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            int width2 = (int) (bitmapCreateBitmap2.getWidth() * (bitmap4.getWidth() / bitmap.getWidth()));
            int height2 = (int) (width2 * (bitmap4.getHeight() / bitmap4.getWidth()));
            int i4 = width2 / 2;
            int i5 = height2 / 2;
            canvas2.drawBitmap(bitmap4, (Rect) null, new Rect((bitmapCreateBitmap2.getWidth() / 2) - i4, (bitmapCreateBitmap2.getHeight() / 2) - i5, (bitmapCreateBitmap2.getWidth() / 2) + i4, (bitmapCreateBitmap2.getHeight() / 2) + i5), paint);
            zxa zxaVar2 = (zxa) k3i0Var.a;
            compressFormat = (Bitmap.CompressFormat) this.h;
            if (compressFormat == Bitmap.CompressFormat.JPEG) {
                i = 80;
            } else {
                i = 100;
            }
            this.f = null;
            this.c = null;
            this.d = null;
            this.b = (byte) 3;
            objC = zxaVar2.c(bitmapCreateBitmap2, compressFormat, i, this);
            if (objC != d9nVar) {
                return objC;
            }
        }
        return d9nVar;
    }

    private final Object m(Object obj) {
        iu30 iu30Var;
        wkt wktVar;
        iu30 iu30Var2;
        Uri uri;
        wkt wktVar2;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                wkt wktVar3 = (wkt) this.d;
                iu30 iu30Var3 = (iu30) this.c;
                hm5.M(obj);
                wktVar = wktVar3;
                iu30Var = iu30Var3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.e;
                wktVar2 = (wkt) this.d;
                iu30Var2 = (iu30) this.c;
                hm5.M(obj);
            }
            iu30Var2.invoke(new gay0(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1.a;
        }
        hm5.M(obj);
        wkt wktVar4 = ((qay0) this.f).d;
        if (wktVar4 != null) {
            iu30Var = (iu30) this.g;
            xwa xwaVar = (xwa) this.h;
            vwa[] vwaVarArr = {new vwa()};
            this.c = iu30Var;
            this.d = wktVar4;
            this.b = (byte) 1;
            Object objA = xwaVar.a(vwaVarArr, this);
            if (objA != d9nVar) {
                wktVar = wktVar4;
                obj = objA;
            }
            return d9nVar;
        }
        return rih1.a;
        Uri uri2 = ((wwa) o7h.V0((List) obj)).b;
        xwa xwaVar2 = (xwa) this.i;
        vwa[] vwaVarArr2 = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar;
        this.e = uri2;
        this.b = (byte) 2;
        Object objA2 = xwaVar2.a(vwaVarArr2, this);
        if (objA2 != d9nVar) {
            obj = objA2;
            iu30Var2 = iu30Var;
            uri = uri2;
            wktVar2 = wktVar;
            iu30Var2.invoke(new gay0(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1.a;
        }
        return d9nVar;
    }

    private final Object o(Object obj) {
        iu30 iu30Var;
        wkt wktVar;
        iu30 iu30Var2;
        Uri uri;
        wkt wktVar2;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                wkt wktVar3 = (wkt) this.d;
                iu30 iu30Var3 = (iu30) this.c;
                hm5.M(obj);
                wktVar = wktVar3;
                iu30Var = iu30Var3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.e;
                wktVar2 = (wkt) this.d;
                iu30Var2 = (iu30) this.c;
                hm5.M(obj);
            }
            iu30Var2.invoke(new dby0(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1Var;
        }
        hm5.M(obj);
        wkt wktVar4 = ((kby0) this.f).d;
        if (wktVar4 == null) {
            return rih1Var;
        }
        iu30Var = (iu30) this.g;
        xwa xwaVar = (xwa) this.h;
        vwa[] vwaVarArr = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar4;
        this.b = (byte) 1;
        Object objA = xwaVar.a(vwaVarArr, this);
        if (objA != d9nVar) {
            wktVar = wktVar4;
            obj = objA;
        }
        return d9nVar;
        Uri uri2 = ((wwa) o7h.V0((List) obj)).b;
        xwa xwaVar2 = (xwa) this.i;
        vwa[] vwaVarArr2 = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar;
        this.e = uri2;
        this.b = (byte) 2;
        Object objA2 = xwaVar2.a(vwaVarArr2, this);
        if (objA2 != d9nVar) {
            obj = objA2;
            iu30Var2 = iu30Var;
            uri = uri2;
            wktVar2 = wktVar;
            iu30Var2.invoke(new dby0(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:110:0x020b  */
    /* JADX WARN: Code duplicated, block: B:112:0x020f  */
    /* JADX WARN: Code duplicated, block: B:114:0x022a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0248  */
    /* JADX WARN: Code duplicated, block: B:127:0x024d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0252  */
    /* JADX WARN: Code duplicated, block: B:130:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025a  */
    /* JADX WARN: Code duplicated, block: B:134:0x025d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0273  */
    /* JADX WARN: Code duplicated, block: B:143:0x0276  */
    /* JADX WARN: Code duplicated, block: B:146:0x0296  */
    /* JADX WARN: Code duplicated, block: B:147:0x0299  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:164:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ae1.p(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        int i;
        s2t s2tVar;
        wz31 wz31Var;
        wz31 wz31Var2;
        hkm1 hkm1Var = (hkm1) this.i;
        String str = (String) this.h;
        jz31 jz31Var = (jz31) this.e;
        dc31 dc31Var = (dc31) this.g;
        l041 l041Var = (l041) dc31Var.b;
        c9n c9nVar = (c9n) this.f;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVar = (s2t) this.c;
                hm5.M(obj);
                wz31Var = (wz31) obj;
            } else if (b == 2) {
                s2tVar = (s2t) this.c;
                hm5.M(obj);
                wz31Var = (wz31) obj;
            } else {
                if (b != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz31Var2 = (wz31) this.d;
                hm5.M(obj);
            }
            return new tz31(wz31Var2, new n041(z4p1.e(((Number) obj).intValue())));
        }
        hm5.M(obj);
        s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new d821(dc31Var, str, (lnm) null, (byte) 23), 3);
        int iOrdinal = jz31Var.ordinal();
        if (iOrdinal == 0) {
            String str2 = (String) this.h;
            int iOrdinal2 = jz31Var.ordinal();
            if (iOrdinal2 == 0) {
                i = 5;
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                i = 9;
            }
            int i2 = i;
            this.f = null;
            this.c = s2tVarQ;
            this.b = (byte) 1;
            Object objS = smo1.s(new b9l(l041Var, str2, i2, hkm1Var, (lnm) null), this);
            if (objS != d9nVar) {
                s2tVar = s2tVarQ;
                obj = objS;
                wz31Var = (wz31) obj;
            }
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            this.f = null;
            this.c = s2tVarQ;
            this.b = (byte) 2;
            Object objS2 = smo1.s(new b041(l041Var, hkm1Var, str, (lnm) null), this);
            if (objS2 != d9nVar) {
                s2tVar = s2tVarQ;
                obj = objS2;
                wz31Var = (wz31) obj;
            }
        }
        return d9nVar;
        this.f = null;
        this.c = null;
        this.d = wz31Var;
        this.b = (byte) 3;
        Object objE = s2tVar.E(this);
        if (objE != d9nVar) {
            wz31 wz31Var3 = wz31Var;
            obj = objE;
            wz31Var2 = wz31Var3;
            return new tz31(wz31Var2, new n041(z4p1.e(((Number) obj).intValue())));
        }
        return d9nVar;
    }

    private final Object s(Object obj) throws Throwable {
        jq71 m231Var;
        Object objO;
        Object objO2;
        byte b = this.b;
        tq71 tq71Var = null;
        try {
            if (b == 0) {
                hm5.M(obj);
                tq71 tq71Var2 = (tq71) this.d;
                String str = (String) this.f;
                String str2 = (String) this.g;
                z771 z771Var = (z771) this.h;
                exy exyVar = (exy) this.i;
                r961 r961Var = tq71Var2.b;
                d9n d9nVar = d9n.a;
                try {
                    if (str != null) {
                        iq71 iq71Var = new iq71(str2, z771Var, (String) null, str, 4);
                        this.c = tq71Var2;
                        this.b = (byte) 1;
                        objO2 = r961Var.o(iq71Var, this);
                        if (objO2 == d9nVar) {
                            return d9nVar;
                        }
                        tq71Var = tq71Var2;
                        m231Var = (jq71) objO2;
                    } else {
                        int i = exyVar.c;
                        iq71 iq71Var2 = new iq71(str2, z771Var, i != 0 ? h4b1.c(i) : null, (String) null, 8);
                        this.c = tq71Var2;
                        this.b = (byte) 2;
                        objO = r961Var.o(iq71Var2, this);
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                        tq71Var = tq71Var2;
                        m231Var = (jq71) objO;
                    }
                } catch (Throwable th) {
                    th = th;
                    tq71Var = tq71Var2;
                    m231Var = new m231(th);
                }
            } else if (b == 1) {
                tq71Var = (tq71) this.c;
                hm5.M(obj);
                objO2 = obj;
                m231Var = (jq71) objO2;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tq71Var = (tq71) this.c;
                hm5.M(obj);
                objO = obj;
                m231Var = (jq71) objO;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        il71 il71Var = (il71) this.e;
        tq71Var.getClass();
        tq71.e(m231Var, il71Var, "fetching_sticker");
        hm5.M(m231Var);
        return m231Var;
    }

    private final Object t(Object obj) {
        iu30 iu30Var;
        wkt wktVar;
        iu30 iu30Var2;
        Uri uri;
        wkt wktVar2;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                wkt wktVar3 = (wkt) this.d;
                iu30 iu30Var3 = (iu30) this.c;
                hm5.M(obj);
                wktVar = wktVar3;
                iu30Var = iu30Var3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.e;
                wktVar2 = (wkt) this.d;
                iu30Var2 = (iu30) this.c;
                hm5.M(obj);
            }
            iu30Var2.invoke(new sgb1(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1Var;
        }
        hm5.M(obj);
        wkt wktVar4 = ((zgb1) this.f).e;
        if (wktVar4 == null) {
            return rih1Var;
        }
        iu30Var = (iu30) this.g;
        xwa xwaVar = (xwa) this.h;
        vwa[] vwaVarArr = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar4;
        this.b = (byte) 1;
        Object objA = xwaVar.a(vwaVarArr, this);
        if (objA != d9nVar) {
            wktVar = wktVar4;
            obj = objA;
        }
        return d9nVar;
        Uri uri2 = ((wwa) o7h.V0((List) obj)).b;
        xwa xwaVar2 = (xwa) this.i;
        vwa[] vwaVarArr2 = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar;
        this.e = uri2;
        this.b = (byte) 2;
        Object objA2 = xwaVar2.a(vwaVarArr2, this);
        if (objA2 != d9nVar) {
            obj = objA2;
            iu30Var2 = iu30Var;
            uri = uri2;
            wktVar2 = wktVar;
            iu30Var2.invoke(new sgb1(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (r1.emit(r2, r12) == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.h
            r3 = r0
            p.rvb1 r3 = (p.rvb1) r3
            java.lang.Object r0 = r12.g
            r2 = r0
            p.ayb1 r2 = (p.ayb1) r2
            java.lang.Object r0 = r12.f
            p.c9n r0 = (p.c9n) r0
            byte r1 = r12.b
            r7 = 3
            r8 = 2
            r9 = 1
            r5 = 0
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r9) goto L32
            if (r1 == r8) goto L2a
            if (r1 != r7) goto L23
            p.hm5.M(r13)
            goto L9f
        L23:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L2a:
            java.lang.Object r0 = r12.d
            p.rvb1 r0 = (p.rvb1) r0
            p.hm5.M(r13)
            goto L79
        L32:
            java.lang.Object r0 = r12.c
            p.s2t r0 = (p.s2t) r0
            p.hm5.M(r13)
            goto L65
        L3a:
            p.hm5.M(r13)
            p.bfb1 r1 = new p.bfb1
            java.lang.Object r13 = r12.i
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            r13 = 0
            p.s2t r1 = p.fn31.q(r0, r5, r13, r1, r7)
            p.sb91 r4 = new p.sb91
            r6 = 26
            r4.<init>(r2, r3, r5, r6)
            p.s2t r0 = p.fn31.q(r0, r5, r13, r4, r7)
            r12.f = r5
            r12.c = r0
            r12.b = r9
            java.lang.Object r13 = r1.Q(r12)
            if (r13 != r10) goto L65
            goto L9e
        L65:
            p.rvb1 r13 = (p.rvb1) r13
            r12.f = r5
            r12.c = r5
            r12.d = r13
            r12.b = r8
            java.lang.Object r0 = r0.E(r12)
            if (r0 != r10) goto L76
            goto L9e
        L76:
            r11 = r0
            r0 = r13
            r13 = r11
        L79:
            p.sxb1 r13 = (p.sxb1) r13
            java.lang.Object r1 = r12.e
            p.vr20 r1 = (p.vr20) r1
            p.ixb1 r2 = new p.ixb1
            if (r13 == 0) goto L86
            p.jo70 r3 = r13.a
            goto L87
        L86:
            r3 = r5
        L87:
            if (r13 == 0) goto L8c
            p.xkk1 r13 = r13.b
            goto L8d
        L8c:
            r13 = r5
        L8d:
            r2.<init>(r0, r3, r13)
            r12.f = r5
            r12.c = r5
            r12.d = r5
            r12.b = r7
            java.lang.Object r12 = r1.emit(r2, r12)
            if (r12 != r10) goto L9f
        L9e:
            return r10
        L9f:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ae1.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) {
        s2t s2tVarQ;
        String str;
        EsOffline.BulkRedownloadPreflightResponse bulkRedownloadPreflightResponse;
        xgc xgcVar;
        String str2;
        alg1 alg1Var = (alg1) this.h;
        Context context = (Context) alg1Var.d;
        c9n c9nVar = (c9n) this.f;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new k6g1((Object) alg1Var, lnmVar, (byte) 15), 3);
            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new b0f1((Object) alg1Var, lnmVar, (byte) 22), 3);
            this.f = null;
            this.c = s2tVarQ;
            this.b = (byte) 1;
            obj = s2tVarQ2.Q(this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVarQ = (s2t) this.c;
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgcVar = (xgc) this.g;
            str2 = (String) this.e;
            bulkRedownloadPreflightResponse = (EsOffline.BulkRedownloadPreflightResponse) this.d;
            hm5.M(obj);
        }
        String shortFileSize = Formatter.formatShortFileSize(context, bulkRedownloadPreflightResponse.o());
        String shortFileSize2 = Formatter.formatShortFileSize(context, bulkRedownloadPreflightResponse.s());
        xgcVar.getClass();
        Bundle bundleF = pzm.f("qualityName", (String) obj, "currentSize", shortFileSize);
        bundleF.putString("estimatedSize", shortFileSize2);
        km61 km61Var = (km61) this.i;
        alg1Var.e = km61Var;
        alg1Var.f = bundleF;
        km61.a(km61Var, str2, bundleF, false, 4);
        return rih1Var;
        EsOffline.BulkRedownloadPreflightResponse bulkRedownloadPreflightResponse2 = (EsOffline.BulkRedownloadPreflightResponse) obj;
        if (bulkRedownloadPreflightResponse2 == null) {
            wzu.c((kt91) alg1Var.c);
            return rih1Var;
        }
        xgc xgcVar2 = rm5.Y;
        if (bulkRedownloadPreflightResponse2.t() <= 0) {
            str = null;
        } else if (bulkRedownloadPreflightResponse2.q() && !bulkRedownloadPreflightResponse2.r()) {
            str = "bulkRedownloadCellularNotAllowed";
        } else if (bulkRedownloadPreflightResponse2.q() && !bulkRedownloadPreflightResponse2.p()) {
            str = "bulkRedownloadCellularLowStorage";
        } else if (bulkRedownloadPreflightResponse2.p()) {
            str = bulkRedownloadPreflightResponse2.q() ? "bulkRedownloadCellularAllowed" : "bulkRedownloadStandard";
        } else {
            str = "bulkRedownloadLowStorage";
        }
        if (str == null) {
            return rih1Var;
        }
        this.f = null;
        this.c = null;
        this.d = bulkRedownloadPreflightResponse2;
        this.e = str;
        this.g = xgcVar2;
        this.b = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            bulkRedownloadPreflightResponse = bulkRedownloadPreflightResponse2;
            obj = objE;
            xgcVar = xgcVar2;
            str2 = str;
            String shortFileSize3 = Formatter.formatShortFileSize(context, bulkRedownloadPreflightResponse.o());
            String shortFileSize4 = Formatter.formatShortFileSize(context, bulkRedownloadPreflightResponse.s());
            xgcVar.getClass();
            Bundle bundleF2 = pzm.f("qualityName", (String) obj, "currentSize", shortFileSize3);
            bundleF2.putString("estimatedSize", shortFileSize4);
            km61 km61Var2 = (km61) this.i;
            alg1Var.e = km61Var2;
            alg1Var.f = bundleF2;
            km61.a(km61Var2, str2, bundleF2, false, 4);
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
    private final Object w(Object obj) {
        l2t l2tVarQ;
        s2t s2tVar;
        jhm jhmVar;
        Object objE;
        jhm jhmVar2;
        Object objE2;
        jhm jhmVar3;
        jhm jhmVar4;
        z7i1 z7i1Var = (z7i1) this.i;
        e8i1 e8i1Var = (e8i1) this.h;
        c9n c9nVar = (c9n) this.f;
        byte b = this.b;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new b8i1(e8i1Var, z7i1Var, (lnm) null, (byte) 2), 3);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new b8i1(e8i1Var, z7i1Var, (lnm) null, (byte) 1), 3);
            l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new vxg1((Object) e8i1Var, (Object) z7i1Var, lnmVar, (byte) 10), 3);
            this.f = null;
            this.c = s2tVarQ2;
            this.d = l2tVarQ;
            this.b = (byte) 1;
            obj = s2tVarQ.Q(this);
            if (obj != d9nVar) {
                s2tVar = s2tVarQ2;
            }
            return d9nVar;
        }
        if (b == 1) {
            l2tVarQ = (l2t) this.d;
            s2tVar = (s2t) this.c;
            hm5.M(obj);
        } else {
            if (b == 2) {
                jhm jhmVar5 = (jhm) this.e;
                l2t l2tVar = (l2t) this.d;
                hm5.M(obj);
                objE = obj;
                jhmVar = jhmVar5;
                l2tVarQ = l2tVar;
                jhmVar2 = (jhm) objE;
                this.f = null;
                this.c = null;
                this.d = null;
                this.e = jhmVar;
                this.g = jhmVar2;
                this.b = (byte) 3;
                objE2 = l2tVarQ.E(this);
                if (objE2 != d9nVar) {
                    jhm jhmVar6 = jhmVar;
                    obj = objE2;
                    jhmVar3 = jhmVar6;
                    jhmVar4 = jhmVar2;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jhmVar4 = (jhm) this.g;
            jhmVar3 = (jhm) this.e;
            hm5.M(obj);
        }
        return new a8i1(((Boolean) obj).booleanValue(), jhmVar3, jhmVar4);
        jhmVar = (jhm) obj;
        this.f = null;
        this.c = null;
        this.d = l2tVarQ;
        this.e = jhmVar;
        this.b = (byte) 2;
        objE = s2tVar.E(this);
        if (objE != d9nVar) {
            jhmVar2 = (jhm) objE;
            this.f = null;
            this.c = null;
            this.d = null;
            this.e = jhmVar;
            this.g = jhmVar2;
            this.b = (byte) 3;
            objE2 = l2tVarQ.E(this);
            if (objE2 != d9nVar) {
                jhm jhmVar7 = jhmVar;
                obj = objE2;
                jhmVar3 = jhmVar7;
                jhmVar4 = jhmVar2;
                return new a8i1(((Boolean) obj).booleanValue(), jhmVar3, jhmVar4);
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r0 == r10) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object x(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ae1.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj) {
        iu30 iu30Var;
        wkt wktVar;
        iu30 iu30Var2;
        Uri uri;
        wkt wktVar2;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                wkt wktVar3 = (wkt) this.d;
                iu30 iu30Var3 = (iu30) this.c;
                hm5.M(obj);
                wktVar = wktVar3;
                iu30Var = iu30Var3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.e;
                wktVar2 = (wkt) this.d;
                iu30Var2 = (iu30) this.c;
                hm5.M(obj);
            }
            iu30Var2.invoke(new ghj1(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1.a;
        }
        hm5.M(obj);
        wkt wktVar4 = ((rhj1) this.f).Y;
        if (wktVar4 != null) {
            iu30Var = (iu30) this.g;
            xwa xwaVar = (xwa) this.h;
            vwa[] vwaVarArr = {new vwa()};
            this.c = iu30Var;
            this.d = wktVar4;
            this.b = (byte) 1;
            Object objA = xwaVar.a(vwaVarArr, this);
            if (objA != d9nVar) {
                wktVar = wktVar4;
                obj = objA;
            }
            return d9nVar;
        }
        return rih1.a;
        Uri uri2 = ((wwa) o7h.V0((List) obj)).b;
        xwa xwaVar2 = (xwa) this.i;
        vwa[] vwaVarArr2 = {new vwa()};
        this.c = iu30Var;
        this.d = wktVar;
        this.e = uri2;
        this.b = (byte) 2;
        Object objA2 = xwaVar2.a(vwaVarArr2, this);
        if (objA2 != d9nVar) {
            obj = objA2;
            iu30Var2 = iu30Var;
            uri = uri2;
            wktVar2 = wktVar;
            iu30Var2.invoke(new ghj1(wktVar2, uri, ((wwa) o7h.V0((List) obj)).b));
            return rih1.a;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001c, B:18:0x0050, B:22:0x0061, B:24:0x0069, B:14:0x0034, B:17:0x0047), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r6.emit(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008d -> B:8:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object z(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g
            p.p2a r0 = (p.p2a) r0
            java.lang.Object r1 = r10.d
            android.content.ContentResolver r1 = (android.content.ContentResolver) r1
            byte r2 = r10.b
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r2 == 0) goto L38
            if (r2 == r4) goto L2c
            if (r2 != r3) goto L25
            java.lang.Object r2 = r10.c
            p.uac r2 = (p.uac) r2
            java.lang.Object r6 = r10.f
            p.vr20 r6 = (p.vr20) r6
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L22
        L1f:
            r11 = r6
            r6 = r2
            goto L50
        L22:
            r10 = move-exception
            goto L96
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L2c:
            java.lang.Object r2 = r10.c
            p.uac r2 = (p.uac) r2
            java.lang.Object r6 = r10.f
            p.vr20 r6 = (p.vr20) r6
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L22
            goto L61
        L38:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.f
            p.vr20 r11 = (p.vr20) r11
            java.lang.Object r2 = r10.e
            android.net.Uri r2 = (android.net.Uri) r2
            r6 = 0
            r1.registerContentObserver(r2, r6, r0)
            java.lang.Object r2 = r10.h     // Catch: java.lang.Throwable -> L22
            p.bbc r2 = (p.bbc) r2     // Catch: java.lang.Throwable -> L22
            p.uac r6 = new p.uac     // Catch: java.lang.Throwable -> L22
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L22
        L50:
            r10.f = r11     // Catch: java.lang.Throwable -> L22
            r10.c = r6     // Catch: java.lang.Throwable -> L22
            r10.b = r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r6.a(r10)     // Catch: java.lang.Throwable -> L22
            if (r2 != r5) goto L5d
            goto L8f
        L5d:
            r9 = r6
            r6 = r11
            r11 = r2
            r2 = r9
        L61:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L22
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L22
            if (r11 == 0) goto L90
            r2.c()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r11 = r10.i     // Catch: java.lang.Throwable -> L22
            android.content.Context r11 = (android.content.Context) r11     // Catch: java.lang.Throwable -> L22
            p.nen0 r7 = p.gtl1.a     // Catch: java.lang.Throwable -> L22
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L22
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L22
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L22
            r10.f = r6     // Catch: java.lang.Throwable -> L22
            r10.c = r2     // Catch: java.lang.Throwable -> L22
            r10.b = r3     // Catch: java.lang.Throwable -> L22
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L22
            if (r11 != r5) goto L1f
        L8f:
            return r5
        L90:
            r1.unregisterContentObserver(r0)
            p.rih1 r10 = p.rih1.a
            return r10
        L96:
            r1.unregisterContentObserver(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ae1.z(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                ae1 ae1Var = new ae1((b97) this.g, (yd1) this.h, (xb7) obj2, lnmVar, (byte) 0);
                ae1Var.f = obj;
                return ae1Var;
            case 1:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 1);
            case 2:
                ae1 ae1Var2 = new ae1(this.e, this.g, this.h, obj2, lnmVar, (byte) 2);
                ae1Var2.d = obj;
                return ae1Var2;
            case 3:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 3);
            case 4:
                return new ae1(this.d, this.e, this.f, this.g, this.h, obj2, lnmVar, (byte) 4);
            case 5:
                ae1 ae1Var3 = new ae1((i9k) this.h, (h9k) obj2, lnmVar, (byte) 5);
                ae1Var3.f = obj;
                return ae1Var3;
            case 6:
                ae1 ae1Var4 = new ae1(this.g, (trm) this.h, (com.spotify.contribution.repositoryimpl.f) obj2, lnmVar, (byte) 6);
                ae1Var4.f = obj;
                return ae1Var4;
            case 7:
                ae1 ae1Var5 = new ae1((mxr) this.h, (wea1) obj2, lnmVar, (byte) 7);
                ae1Var5.f = obj;
                return ae1Var5;
            case 8:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 8);
            case 9:
                ae1 ae1Var6 = new ae1((d140) obj2, lnmVar);
                ae1Var6.f = obj;
                return ae1Var6;
            case 10:
                ae1 ae1Var7 = new ae1((hfn0) this.g, (j590) this.h, (iu30) obj2, lnmVar, (byte) 10);
                ae1Var7.e = obj;
                return ae1Var7;
            case 11:
                ae1 ae1Var8 = new ae1((hfn0) this.g, (k590) this.h, (iu30) obj2, lnmVar, (byte) 11);
                ae1Var8.e = obj;
                return ae1Var8;
            case 12:
                ae1 ae1Var9 = new ae1((d0r) this.g, (hti0) this.h, (pzx) obj2, lnmVar, (byte) 12);
                ae1Var9.f = obj;
                return ae1Var9;
            case 13:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 13);
            case 14:
                ae1 ae1Var10 = new ae1((hfn0) this.g, (pfn0) this.h, (iu30) obj2, lnmVar, (byte) 14);
                ae1Var10.e = obj;
                return ae1Var10;
            case 15:
                ae1 ae1Var11 = new ae1(this.e, this.g, this.h, obj2, lnmVar, (byte) 15);
                ae1Var11.f = obj;
                return ae1Var11;
            case 16:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 16);
            case 17:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ae1((k811) this.h, (String) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ae1 ae1Var12 = new ae1(this.e, this.g, this.h, obj2, lnmVar, (byte) 19);
                ae1Var12.f = obj;
                return ae1Var12;
            case 20:
                return new ae1(this.d, this.e, this.f, this.g, this.h, obj2, lnmVar, (byte) 20);
            case 21:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 21);
            case 22:
                ae1 ae1Var13 = new ae1(this.e, this.g, this.h, obj2, lnmVar, (byte) 22);
                ae1Var13.f = obj;
                return ae1Var13;
            case 23:
                ae1 ae1Var14 = new ae1((alg1) this.h, (km61) obj2, lnmVar, (byte) 23);
                ae1Var14.f = obj;
                return ae1Var14;
            case 24:
                ae1 ae1Var15 = new ae1((e8i1) this.h, (z7i1) obj2, lnmVar, (byte) 24);
                ae1Var15.f = obj;
                return ae1Var15;
            case 25:
                ae1 ae1Var16 = new ae1((zvi1) this.h, (yvi1) obj2, lnmVar, (byte) 25);
                ae1Var16.f = obj;
                return ae1Var16;
            case 26:
                return new ae1((Parcelable) this.f, (iu30) this.g, (xwa) this.h, (xwa) obj2, lnmVar, (byte) 26);
            case 27:
                ae1 ae1Var17 = new ae1((ContentResolver) this.d, (Uri) this.e, (p2a) this.g, (bbc) this.h, (Context) obj2, lnmVar);
                ae1Var17.f = obj;
                return ae1Var17;
            default:
                return new ae1((dkm1) this.c, (String) this.d, (String) this.e, (q1m) this.f, (iu30) this.g, (Function0) this.h, (vu30) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x06e5 -> B:312:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:322:0x06e9 -> B:312:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:326:0x0701 -> B:312:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:327:0x0703 -> B:312:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:333:0x072c -> B:334:0x072d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:336:0x0731 -> B:312:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:337:0x0733 -> B:312:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:422:0x09fa -> B:424:0x09fe). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ae1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae1(Parcelable parcelable, iu30 iu30Var, xwa xwaVar, xwa xwaVar2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = parcelable;
        this.g = iu30Var;
        this.h = xwaVar;
        this.i = xwaVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae1(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(d140 d140Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 9;
        this.i = d140Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(ContentResolver contentResolver, Uri uri, p2a p2aVar, bbc bbcVar, Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 27;
        this.d = contentResolver;
        this.e = uri;
        this.g = p2aVar;
        this.h = bbcVar;
        this.i = context;
    }
}
