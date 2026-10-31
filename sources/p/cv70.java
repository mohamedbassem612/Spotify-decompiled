package p;

import android.media.MediaCodec;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentdelivery.mediaprocessing.CreateProcessorResult;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import com.spotify.contentdelivery.mediaprocessing.ProcessingMode;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cv70 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public cv70(ua91 ua91Var, int i, o5n o5nVar, oco ocoVar) {
        this.a = (byte) 1;
        this.c = ua91Var;
        this.b = i;
        this.d = o5nVar;
        this.e = ocoVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:51:0x013e  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f A[PHI: r3
      0x017f: PHI (r3v26 java.lang.Object) = (r3v13 java.lang.Object), (r3v12 java.lang.Object) binds: [B:116:0x017f, B:59:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0192  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd A[LOOP:2: B:72:0x01a3->B:78:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    @Override // java.lang.Runnable
    public final void run() {
        Object ypt0Var;
        NativeMediaProcessor nativeMediaProcessor;
        boolean zBooleanValue;
        Object obj;
        int i;
        int i2;
        boolean z;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int i5;
        int i6;
        Object obj2;
        int i7;
        boolean z2;
        Object ypt0Var2;
        int i8;
        int i9;
        ByteBuffer byteBufferSlice;
        int i10;
        int i11;
        int[] iArr3;
        int[] iArr4;
        boolean z3;
        int i12;
        int i13;
        int iProcessSample;
        ProcessingMode processingMode;
        byte b = this.a;
        int i14 = this.b;
        Object obj3 = this.c;
        boolean z4 = true;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                if (u890.j(((dv70) obj3).d, (String) obj5)) {
                    ((RecyclerView) obj4).y0(i14);
                    return;
                }
                return;
            case 1:
                ua91 ua91Var = (ua91) obj3;
                ByteBuffer byteBufferI = ((yjh0) ua91Var.b).i(i14);
                if (byteBufferI == null) {
                    throw new MediaCodec.CryptoException(6, "error 16-92");
                }
                o5n o5nVar = (o5n) obj5;
                xpt0 xpt0Var = (xpt0) ua91Var.d;
                oco ocoVar = (oco) obj4;
                String str = (String) ua91Var.e;
                o5nVar.getClass();
                byte[] bArr = ocoVar.b;
                if (bArr == null) {
                    ypt0Var = new ypt0(1);
                } else {
                    int[] iArr5 = a860.a;
                    int i15 = 0;
                    Integer num = (Integer) ((ConcurrentHashMap) o5nVar.b.b).get(new rpt0(a860.k(bArr, d860.d).substring(0, 32)));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        g541 g541Var = o5nVar.a;
                        byte[] bArr2 = ocoVar.a;
                        if (bArr2 == null) {
                            ypt0Var = new ypt0(3);
                        } else {
                            f541 f541Var = new f541(iIntValue, str);
                            ConcurrentHashMap concurrentHashMap = g541Var.c;
                            Object obj6 = concurrentHashMap.get(f541Var);
                            wpt0 wpt0Var = wpt0.a;
                            vpt0 vpt0Var = vpt0.a;
                            upt0 upt0Var = upt0.a;
                            if (obj6 != null) {
                                nativeMediaProcessor = (NativeMediaProcessor) obj6;
                                zBooleanValue = ((Boolean) g541Var.b.invoke()).booleanValue();
                                obj = zpt0.a;
                                if (zBooleanValue) {
                                    nativeMediaProcessor.getClass();
                                    iArr3 = ocoVar.d;
                                    if (iArr3 == null) {
                                        ypt0Var = new ypt0(5);
                                    } else {
                                        iArr4 = ocoVar.e;
                                        if (iArr4 == null) {
                                            ypt0Var = new ypt0(6);
                                        } else {
                                            int i16 = ocoVar.f;
                                            int i17 = ocoVar.g;
                                            int i18 = ocoVar.h;
                                            boolean zEquals = xpt0Var.equals(upt0Var);
                                            if (!xpt0Var.equals(vpt0Var) || xpt0Var.equals(wpt0Var)) {
                                                z3 = true;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                z3 = false;
                                            }
                                            i13 = i12;
                                            iProcessSample = nativeMediaProcessor.processSample(byteBufferI, 0, i16, iArr3, iArr4, i17, i18, bArr2, zEquals, z3);
                                            if (iProcessSample != 0) {
                                                Logger.k(f4i1.c(iProcessSample, "NativeMediaProcessor failed to process sample: "), new Object[i13]);
                                                ypt0Var = new ypt0(iProcessSample);
                                            } else {
                                                ypt0Var = obj;
                                            }
                                        }
                                    }
                                } else {
                                    nativeMediaProcessor.setContext(bArr2);
                                    i = ocoVar.f;
                                    i2 = 0;
                                    while (true) {
                                        if (i15 < i) {
                                            z = z4;
                                            iArr = ocoVar.d;
                                            if (iArr != null) {
                                                i3 = iArr[i15];
                                                iArr2 = ocoVar.e;
                                                if (iArr2 != null) {
                                                    i4 = iArr2[i15] + i3;
                                                    i5 = i4 + i2;
                                                    i6 = i3 + i2;
                                                    while (true) {
                                                        if (i6 + 16 <= i5) {
                                                            i8 = 0;
                                                            while (true) {
                                                                byteBufferI.position(i6);
                                                                i9 = i5;
                                                                byteBufferSlice = byteBufferI.slice();
                                                                byteBufferSlice.getClass();
                                                                i10 = i8;
                                                                obj2 = obj;
                                                                if (nativeMediaProcessor.process(byteBufferSlice, 0, 16)) {
                                                                    i6 += 16;
                                                                    i11 = i10 + 1;
                                                                    if (i11 >= ocoVar.g) {
                                                                        i6 += ocoVar.h * 16;
                                                                        i5 = i9;
                                                                        obj = obj2;
                                                                    } else {
                                                                        i8 = i11;
                                                                        i5 = i9;
                                                                        obj = obj2;
                                                                    }
                                                                } else {
                                                                    Logger.k("NativeMediaProcessor failed to process", new Object[0]);
                                                                    ypt0Var2 = new ypt0(7);
                                                                    z2 = false;
                                                                }
                                                            }
                                                        } else {
                                                            obj2 = obj;
                                                            i7 = i5 - i6;
                                                            if (i7 > 0 || !(xpt0Var.equals(vpt0Var) || xpt0Var.equals(wpt0Var))) {
                                                                z2 = false;
                                                            } else {
                                                                byteBufferI.position(i6);
                                                                ByteBuffer byteBufferSlice2 = byteBufferI.slice();
                                                                byteBufferSlice2.getClass();
                                                                z2 = false;
                                                                if (!nativeMediaProcessor.process(byteBufferSlice2, 0, i7)) {
                                                                    Logger.k("NativeMediaProcessor failed to process remaining bytes", new Object[0]);
                                                                    ypt0Var2 = new ypt0(8);
                                                                }
                                                            }
                                                            ypt0Var2 = obj2;
                                                        }
                                                    }
                                                    if (ypt0Var2 instanceof ypt0) {
                                                        ypt0Var = ypt0Var2;
                                                    } else {
                                                        i2 += i4;
                                                        if (xpt0Var.equals(upt0Var)) {
                                                            nativeMediaProcessor.setContext(bArr2);
                                                        }
                                                        i15++;
                                                        z4 = z;
                                                        obj = obj2;
                                                    }
                                                } else {
                                                    ypt0Var = new ypt0(6);
                                                }
                                            } else {
                                                ypt0Var = new ypt0(5);
                                            }
                                        } else {
                                            ypt0Var = obj;
                                        }
                                    }
                                }
                            } else {
                                if (xpt0Var.equals(tpt0.a) || xpt0Var.equals(upt0Var)) {
                                    processingMode = ProcessingMode.BLOCK;
                                } else {
                                    if (!xpt0Var.equals(vpt0Var) && !xpt0Var.equals(wpt0Var)) {
                                        eg.o();
                                        return;
                                    }
                                    processingMode = ProcessingMode.STREAM;
                                }
                                CreateProcessorResult createProcessorResultCreateProcessor = g541Var.a.createProcessor(iIntValue, processingMode);
                                if (createProcessorResultCreateProcessor instanceof CreateProcessorResult.Success) {
                                    NativeMediaProcessor processor = ((CreateProcessorResult.Success) createProcessorResultCreateProcessor).getProcessor();
                                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(f541Var, processor);
                                    obj6 = objPutIfAbsent == null ? processor : objPutIfAbsent;
                                    nativeMediaProcessor = (NativeMediaProcessor) obj6;
                                    zBooleanValue = ((Boolean) g541Var.b.invoke()).booleanValue();
                                    obj = zpt0.a;
                                    if (zBooleanValue) {
                                        nativeMediaProcessor.getClass();
                                        iArr3 = ocoVar.d;
                                        if (iArr3 == null) {
                                            ypt0Var = new ypt0(5);
                                        } else {
                                            iArr4 = ocoVar.e;
                                            if (iArr4 == null) {
                                                ypt0Var = new ypt0(6);
                                            } else {
                                                int i19 = ocoVar.f;
                                                int i110 = ocoVar.g;
                                                int i111 = ocoVar.h;
                                                boolean zEquals2 = xpt0Var.equals(upt0Var);
                                                if (xpt0Var.equals(vpt0Var)) {
                                                    z3 = true;
                                                    i12 = 0;
                                                } else {
                                                    z3 = true;
                                                    i12 = 0;
                                                }
                                                i13 = i12;
                                                iProcessSample = nativeMediaProcessor.processSample(byteBufferI, 0, i19, iArr3, iArr4, i110, i111, bArr2, zEquals2, z3);
                                                if (iProcessSample != 0) {
                                                    Logger.k(f4i1.c(iProcessSample, "NativeMediaProcessor failed to process sample: "), new Object[i13]);
                                                    ypt0Var = new ypt0(iProcessSample);
                                                } else {
                                                    ypt0Var = obj;
                                                }
                                            }
                                        }
                                    } else {
                                        nativeMediaProcessor.setContext(bArr2);
                                        i = ocoVar.f;
                                        i2 = 0;
                                        while (true) {
                                            if (i15 < i) {
                                                z = z4;
                                                iArr = ocoVar.d;
                                                if (iArr != null) {
                                                    i3 = iArr[i15];
                                                    iArr2 = ocoVar.e;
                                                    if (iArr2 != null) {
                                                        i4 = iArr2[i15] + i3;
                                                        i5 = i4 + i2;
                                                        i6 = i3 + i2;
                                                        while (true) {
                                                            if (i6 + 16 <= i5) {
                                                                i8 = 0;
                                                                while (true) {
                                                                    byteBufferI.position(i6);
                                                                    i9 = i5;
                                                                    byteBufferSlice = byteBufferI.slice();
                                                                    byteBufferSlice.getClass();
                                                                    i10 = i8;
                                                                    obj2 = obj;
                                                                    if (nativeMediaProcessor.process(byteBufferSlice, 0, 16)) {
                                                                        Logger.k("NativeMediaProcessor failed to process", new Object[0]);
                                                                        ypt0Var2 = new ypt0(7);
                                                                        z2 = false;
                                                                    } else {
                                                                        i6 += 16;
                                                                        i11 = i10 + 1;
                                                                        if (i11 >= ocoVar.g) {
                                                                            i6 += ocoVar.h * 16;
                                                                            i5 = i9;
                                                                            obj = obj2;
                                                                        } else {
                                                                            i8 = i11;
                                                                            i5 = i9;
                                                                            obj = obj2;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                obj2 = obj;
                                                                i7 = i5 - i6;
                                                                if (i7 > 0) {
                                                                    z2 = false;
                                                                    ypt0Var2 = obj2;
                                                                } else {
                                                                    z2 = false;
                                                                    ypt0Var2 = obj2;
                                                                }
                                                            }
                                                        }
                                                        if (ypt0Var2 instanceof ypt0) {
                                                            ypt0Var = ypt0Var2;
                                                        } else {
                                                            i2 += i4;
                                                            if (xpt0Var.equals(upt0Var)) {
                                                                nativeMediaProcessor.setContext(bArr2);
                                                            }
                                                            i15++;
                                                            z4 = z;
                                                            obj = obj2;
                                                        }
                                                    } else {
                                                        ypt0Var = new ypt0(6);
                                                    }
                                                } else {
                                                    ypt0Var = new ypt0(5);
                                                }
                                            } else {
                                                ypt0Var = obj;
                                            }
                                        }
                                    }
                                } else {
                                    if (!(createProcessorResultCreateProcessor instanceof CreateProcessorResult.Fail)) {
                                        eg.o();
                                        return;
                                    }
                                    ypt0Var = new ypt0(((CreateProcessorResult.Fail) createProcessorResultCreateProcessor).getCode() + 400);
                                }
                            }
                        }
                    } else {
                        ypt0Var = new ypt0(2);
                    }
                }
                if (ypt0Var instanceof ypt0) {
                    throw new MediaCodec.CryptoException(6, f4i1.c(((ypt0) ypt0Var).a, "error 13-92-"));
                }
                return;
            default:
                a6c1 a6c1Var = (a6c1) obj5;
                a6c1Var.start();
                v9c1 v9c1Var = (v9c1) obj4;
                if (v9c1Var.i) {
                    return;
                }
                v9c1Var.i = true;
                v9c1Var.b.invoke(new o7c1(this.b, a6c1Var.getDuration(), a6c1Var.f(), a6c1Var.h(), !u890.j(a6c1Var.c(), dy61.a), a6c1Var.b(), false));
                return;
        }
    }

    public /* synthetic */ cv70(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
