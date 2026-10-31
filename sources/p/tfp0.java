package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import com.spotify.base.java.logging.Logger;
import com.spotify.playback_esperanto.proto.PlaybackEsperanto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tfp0 {
    public short a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public tfp0(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = (short) 12544;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            hhg1.n("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(smr0.e);
        this.c = bitmap;
        this.b = null;
        arrayList.add(grd1.d);
        arrayList.add(grd1.e);
        arrayList.add(grd1.f);
        arrayList.add(grd1.g);
        arrayList.add(grd1.h);
        arrayList.add(grd1.i);
    }

    public smr0 a() {
        char c;
        rmr0 rmr0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        k8h k8hVar;
        int i;
        int i2;
        ArrayList arrayList3 = (ArrayList) this.e;
        Bitmap bitmap = (Bitmap) this.c;
        int i3 = 1;
        int i4 = 0;
        if (bitmap != null) {
            double dSqrt = -1.0d;
            if (this.a > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                short s = this.a;
                if (height > s) {
                    dSqrt = Math.sqrt(((double) s) / ((double) height));
                }
            }
            Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
            int width = bitmapCreateScaledBitmap.getWidth();
            int height2 = bitmapCreateScaledBitmap.getHeight();
            int[] iArr = new int[width * height2];
            bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
            yqi1[] yqi1VarArr = arrayList3.isEmpty() ? null : (yqi1[]) arrayList3.toArray(new yqi1[arrayList3.size()]);
            zwg zwgVar = new zwg();
            zwgVar.e = new float[3];
            zwgVar.d = yqi1VarArr;
            int[] iArr2 = new int[32768];
            zwgVar.b = iArr2;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr[i5];
                int iX = (zwg.x(Color.green(i6), 8, 5) << 5) | (zwg.x(Color.red(i6), 8, 5) << 10) | zwg.x(Color.blue(i6), 8, 5);
                iArr[i5] = iX;
                iArr2[iX] = iArr2[iX] + 1;
            }
            c = 2;
            int i7 = 0;
            int i8 = 0;
            while (i7 < 32768) {
                if (iArr2[i7] > 0) {
                    int iRgb = Color.rgb(zwg.x((i7 >> 10) & 31, 5, 8), zwg.x((i7 >> 5) & 31, 5, 8), zwg.x(i7 & 31, 5, 8));
                    float[] fArr = (float[]) zwgVar.e;
                    uah.h(iRgb, fArr);
                    yqi1[] yqi1VarArr2 = (yqi1[]) zwgVar.d;
                    if (yqi1VarArr2 == null || yqi1VarArr2.length <= 0) {
                        i = i3;
                        i2 = i4;
                    } else {
                        int length = yqi1VarArr2.length;
                        i = i3;
                        int i9 = i4;
                        while (true) {
                            i2 = i4;
                            if (i9 >= length) {
                                break;
                            }
                            if (!yqi1VarArr2[i9].a(iRgb, fArr)) {
                                iArr2[i7] = i2;
                                break;
                            }
                            i9++;
                            i4 = i2;
                        }
                    }
                } else {
                    i = i3;
                    i2 = i4;
                }
                if (iArr2[i7] > 0) {
                    i8++;
                }
                i7++;
                i3 = i;
                i4 = i2;
            }
            int i10 = i3;
            int i11 = i4;
            rmr0Var = null;
            int[] iArr3 = new int[i8];
            zwgVar.a = iArr3;
            int i12 = i11;
            int i13 = i12;
            while (i12 < 32768) {
                if (iArr2[i12] > 0) {
                    iArr3[i13] = i12;
                    i13++;
                }
                i12++;
            }
            int i14 = 16;
            if (i8 <= 16) {
                zwgVar.c = new ArrayList();
                for (int i15 = i11; i15 < i8; i15++) {
                    int i16 = iArr3[i15];
                    ((ArrayList) zwgVar.c).add(new rmr0(Color.rgb(zwg.x((i16 >> 10) & 31, 5, 8), zwg.x((i16 >> 5) & 31, 5, 8), zwg.x(i16 & 31, 5, 8)), iArr2[i16]));
                }
            } else {
                PriorityQueue<k8h> priorityQueue = new PriorityQueue(16, zwg.h);
                priorityQueue.offer(new k8h(zwgVar, i11, ((int[]) zwgVar.a).length - 1));
                while (priorityQueue.size() < i14 && (k8hVar = (k8h) priorityQueue.poll()) != null) {
                    int i17 = k8hVar.b;
                    int iMin = k8hVar.a;
                    int i18 = i10;
                    if ((i17 + 1) - iMin <= i18) {
                        break;
                    }
                    zwg zwgVar2 = k8hVar.j;
                    if ((i17 + 1) - iMin <= i18) {
                        eg.m("Can not split a box with only 1 color");
                        throw null;
                    }
                    int i19 = k8hVar.e - k8hVar.d;
                    int i20 = k8hVar.g - k8hVar.f;
                    int i21 = k8hVar.i - k8hVar.h;
                    int i22 = (i19 < i20 || i19 < i21) ? (i20 < i19 || i20 < i21) ? -1 : -2 : -3;
                    int[] iArr4 = (int[]) zwgVar2.a;
                    int[] iArr5 = (int[]) zwgVar2.b;
                    zwg.w(i22, iMin, i17, iArr4);
                    Arrays.sort(iArr4, iMin, k8hVar.b + 1);
                    zwg.w(i22, iMin, k8hVar.b, iArr4);
                    int i23 = k8hVar.c / 2;
                    int i24 = iMin;
                    int i25 = 0;
                    while (true) {
                        int i26 = k8hVar.b;
                        if (i24 > i26) {
                            break;
                        }
                        i25 += iArr5[iArr4[i24]];
                        if (i25 >= i23) {
                            iMin = Math.min(i26 - 1, i24);
                            break;
                        }
                        i24++;
                    }
                    k8h k8hVar2 = new k8h(zwgVar2, iMin + 1, k8hVar.b);
                    k8hVar.b = iMin;
                    k8hVar.a();
                    priorityQueue.offer(k8hVar2);
                    priorityQueue.offer(k8hVar);
                    i14 = 16;
                    i10 = 1;
                }
                ArrayList arrayList4 = new ArrayList(priorityQueue.size());
                for (k8h k8hVar3 : priorityQueue) {
                    zwg zwgVar3 = k8hVar3.j;
                    int[] iArr6 = (int[]) zwgVar3.a;
                    int[] iArr7 = (int[]) zwgVar3.b;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    for (int i31 = k8hVar3.a; i31 <= k8hVar3.b; i31++) {
                        int i32 = iArr6[i31];
                        int i33 = iArr7[i32];
                        i28 += i33;
                        i27 = (((i32 >> 10) & 31) * i33) + i27;
                        i29 = (((i32 >> 5) & 31) * i33) + i29;
                        i30 = (i33 * (i32 & 31)) + i30;
                    }
                    float f = i28;
                    rmr0 rmr0Var2 = new rmr0(Color.rgb(zwg.x(Math.round(i27 / f), 5, 8), zwg.x(Math.round(i29 / f), 5, 8), zwg.x(Math.round(i30 / f), 5, 8)), i28);
                    float[] fArrB = rmr0Var2.b();
                    yqi1[] yqi1VarArr3 = (yqi1[]) zwgVar.d;
                    if (yqi1VarArr3 == null || yqi1VarArr3.length <= 0) {
                        arrayList4.add(rmr0Var2);
                        break;
                    }
                    int length2 = yqi1VarArr3.length;
                    int i34 = 0;
                    while (true) {
                        if (i34 >= length2) {
                            arrayList4.add(rmr0Var2);
                            break;
                            break;
                        }
                        if (!yqi1VarArr3[i34].a(rmr0Var2.d, fArrB)) {
                            break;
                        }
                        i34++;
                    }
                }
                zwgVar.c = arrayList4;
            }
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmapCreateScaledBitmap.recycle();
            }
            arrayList = (ArrayList) zwgVar.c;
        } else {
            c = 2;
            rmr0Var = null;
            arrayList = (ArrayList) this.b;
            if (arrayList == null) {
                hhg1.c();
                return null;
            }
        }
        ArrayList arrayList5 = (ArrayList) this.d;
        smr0 smr0Var = new smr0(arrayList5, arrayList);
        int size = arrayList5.size();
        int i35 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = smr0Var.c;
            if (i35 >= size) {
                sparseBooleanArray.clear();
                return smr0Var;
            }
            grd1 grd1Var = (grd1) arrayList5.get(i35);
            float[] fArr2 = grd1Var.c;
            float[] fArr3 = grd1Var.a;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (float f4 : fArr2) {
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length3 = fArr2.length;
                for (int i36 = 0; i36 < length3; i36++) {
                    float f5 = fArr2[i36];
                    if (f5 > 0.0f) {
                        fArr2[i36] = f5 / f3;
                    }
                }
            }
            List list = smr0Var.a;
            int size2 = list.size();
            float f6 = 0.0f;
            rmr0 rmr0Var3 = rmr0Var;
            int i37 = 0;
            while (i37 < size2) {
                rmr0 rmr0Var4 = (rmr0) list.get(i37);
                float[] fArrB2 = rmr0Var4.b();
                float f7 = fArrB2[1];
                float f8 = f2;
                float[] fArr4 = grd1Var.b;
                if (f7 < fArr3[0] || f7 > fArr3[c]) {
                    arrayList2 = arrayList5;
                } else {
                    float f9 = fArrB2[c];
                    if (f9 < fArr4[0] || f9 > fArr4[c] || sparseBooleanArray.get(rmr0Var4.d)) {
                        arrayList2 = arrayList5;
                    } else {
                        float[] fArrB3 = rmr0Var4.b();
                        rmr0 rmr0Var5 = smr0Var.d;
                        int i38 = rmr0Var5 != null ? rmr0Var5.e : 1;
                        arrayList2 = arrayList5;
                        float[] fArr5 = grd1Var.c;
                        float f10 = fArr5[0];
                        float fAbs = f10 > f8 ? (1.0f - Math.abs(fArrB3[1] - fArr3[1])) * f10 : f8;
                        float f11 = fArr5[1];
                        float fAbs2 = f11 > f8 ? (1.0f - Math.abs(fArrB3[c] - fArr4[1])) * f11 : f8;
                        float f12 = fArr5[c];
                        float f13 = fAbs + fAbs2 + (f12 > f8 ? (rmr0Var4.e / i38) * f12 : f8);
                        if (rmr0Var3 == null || f13 > f6) {
                            rmr0Var3 = rmr0Var4;
                            f6 = f13;
                        }
                    }
                }
                i37++;
                f2 = f8;
                arrayList5 = arrayList2;
            }
            ArrayList arrayList6 = arrayList5;
            if (rmr0Var3 != null) {
                sparseBooleanArray.append(rmr0Var3.d, true);
            }
            smr0Var.b.put(grd1Var, rmr0Var3);
            i35++;
            arrayList5 = arrayList6;
        }
    }

    public void b(qmr0 qmr0Var) {
        new pmr0(this, qmr0Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Bitmap) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(kev kevVar, onm onmVar) {
        sfp0 sfp0Var;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (onmVar instanceof sfp0) {
            sfp0Var = (sfp0) onmVar;
            int i = sfp0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfp0Var.d = i - Integer.MIN_VALUE;
            } else {
                sfp0Var = new sfp0(this, onmVar);
            }
        } else {
            sfp0Var = new sfp0(this, onmVar);
        }
        Object objM = sfp0Var.b;
        int i2 = sfp0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                Float f = kevVar.b;
                vt7 vt7Var = kevVar.a;
                if (f == null) {
                    linkedHashMap.remove(vt7Var);
                } else {
                    linkedHashMap.put(vt7Var, f);
                }
                Float fH0 = o7h.H0(linkedHashMap.values());
                long jLongValue = ((Number) ((Function0) this.b).invoke()).longValue();
                rfp0 rfp0Var = (rfp0) this.e;
                if (rfp0Var == null || !u890.i(rfp0Var.a, fH0) || rfp0Var.b <= jLongValue) {
                    rfp0Var = null;
                }
                int i3 = rfp0Var != null ? (int) (rfp0Var.b - jLongValue) : kevVar.c;
                if (rfp0Var == null) {
                    rfp0Var = new rfp0(fH0, jLongValue + ((long) yoi1.p(i3, 100, 30000)));
                }
                this.e = rfp0Var;
                czt0 czt0VarN = PlaybackEsperanto.DuckRequest.n();
                czt0VarN.n(fH0 == null ? bzt0.c : bzt0.b);
                czt0VarN.q(i3);
                if (fH0 != null) {
                    czt0VarN.r(fH0.floatValue());
                }
                PlaybackEsperanto.DuckRequest duckRequestBuild = czt0VarN.build();
                duckRequestBuild.getClass();
                new Integer(i3);
                long j = this.a;
                cto0 cto0Var = new cto0(kevVar, duckRequestBuild, (lnm) null, (byte) 5);
                sfp0Var.a = kevVar;
                sfp0Var.d = 1;
                objM = rc2.M(j, cto0Var, sfp0Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kevVar = sfp0Var.a;
                hm5.M(objM);
            }
            kevVar.getClass();
        } catch (Exception e) {
            kevVar.getClass();
            Logger.d("AudioDucking", new Object[]{"Failed to process ducking request", e});
        }
        return rih1.a;
    }

    public tfp0() {
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, b3s.c));
        wso0 wso0Var = wso0.N0;
        this.a = (short) 5000;
        this.b = wso0Var;
        this.c = new LinkedHashMap();
        this.d = mno1.a(Integer.MAX_VALUE, 0, 6);
        fn31.T(llmVarE, (o8n) null, 0, new ian0(this, (lnm) null, (byte) 5), 3);
    }

    public tfp0(ArrayList arrayList) {
        this.d = new ArrayList();
        this.a = (short) 12544;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        if (!arrayList.isEmpty()) {
            arrayList2.add(smr0.e);
            this.b = arrayList;
            this.c = null;
            return;
        }
        hhg1.n("List of Swatches is not valid");
        throw null;
    }
}
