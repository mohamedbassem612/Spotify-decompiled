package p;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.Image;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import com.spotify.android.permissionsimpl.PermissionsRequestActivity;
import com.spotify.connectivity.ConnectionType;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.scannables.scannables.view.ScannablesOnboardingActivity;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wh41 implements ird1, gc10, dvo1 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final Object d;
    public Object e;

    public wh41(mxa1 mxa1Var, boolean z) {
        this.a = (byte) 8;
        this.e = mxa1Var;
        this.d = new AtomicReference(null);
        this.b = z;
        this.c = new AtomicMarkableReference(new ava0(z ? 8192 : 1024), false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.mlkit.common.MlKitException */
    /* JADX WARN: Code duplicated, block: B:92:0x03ce  */
    public yzd1 a(mj80 mj80Var) throws MlKitException {
        Bitmap bitmapA;
        int iK;
        int i;
        String str;
        if (((yeo1) this.e) == null) {
            zzb();
        }
        if (((yeo1) this.e) == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int i2 = mj80Var.g;
        char c = 2;
        int i3 = 1;
        int i4 = 0;
        if (i2 == -1) {
            bitmapA = mj80Var.a;
            iK = x8p1.k(mj80Var.f);
        } else {
            if (i2 == -1) {
                Bitmap bitmap = mj80Var.a;
                zod.s(bitmap);
                bitmapA = j1p1.A(bitmap, mj80Var.f, mj80Var.d, mj80Var.e);
            } else if (i2 == 17) {
                ByteBuffer byteBuffer = mj80Var.b;
                zod.s(byteBuffer);
                bitmapA = j1p1.u(byteBuffer, mj80Var.d, mj80Var.e, mj80Var.f);
            } else if (i2 == 35) {
                Image.Plane[] planeArrC = mj80Var.c();
                zod.s(planeArrC);
                int i5 = mj80Var.d;
                int i6 = mj80Var.e;
                int i7 = i5 * i6;
                byte[] bArr = new byte[lqn1.s(i7, 4, i7)];
                ByteBuffer buffer = planeArrC[1].getBuffer();
                ByteBuffer buffer2 = planeArrC[2].getBuffer();
                int iPosition = buffer2.position();
                int iLimit = buffer.limit();
                buffer2.position(iPosition + 1);
                buffer.limit(iLimit - 1);
                int i8 = (i7 + i7) / 4;
                boolean z = buffer2.remaining() == i8 + (-2) && buffer2.compareTo(buffer) == 0;
                buffer2.position(iPosition);
                buffer.limit(iLimit);
                if (z) {
                    planeArrC[0].getBuffer().get(bArr, 0, i7);
                    ByteBuffer buffer3 = planeArrC[1].getBuffer();
                    planeArrC[2].getBuffer().get(bArr, i7, 1);
                    buffer3.get(bArr, i7 + 1, i8 - 1);
                } else {
                    j1p1.C(planeArrC[0], i5, i6, bArr, 0, 1);
                    j1p1.C(planeArrC[1], i5, i6, bArr, i7 + 1, 2);
                    j1p1.C(planeArrC[2], i5, i6, bArr, i7, 2);
                }
                bitmapA = j1p1.u(ByteBuffer.wrap(bArr), mj80Var.d, mj80Var.e, mj80Var.f);
            } else {
                if (i2 != 842094169) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                ByteBuffer byteBuffer2 = mj80Var.b;
                zod.s(byteBuffer2);
                int i9 = mj80Var.d;
                int i10 = mj80Var.e;
                int i11 = mj80Var.f;
                byteBuffer2.rewind();
                int iLimit2 = byteBuffer2.limit();
                int i12 = iLimit2 / 6;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit2);
                int i13 = 0;
                while (true) {
                    i = i12 * 4;
                    if (i13 >= i) {
                        break;
                    }
                    byteBufferAllocate.put(i13, byteBuffer2.get(i13));
                    i13++;
                }
                for (int i14 = 0; i14 < i12 + i12; i14++) {
                    byteBufferAllocate.put(i + i14, byteBuffer2.get((i14 / 2) + ((i14 % 2) * i12) + i));
                }
                byte[] bArrB = j1p1.B(i9, byteBufferAllocate.array(), i10);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
                bitmapA = j1p1.A(bitmapDecodeByteArray, i11, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
            }
            iK = 0;
        }
        IBinder qfp0Var = new qfp0(bitmapA);
        int i15 = mj80Var.d;
        int i16 = mj80Var.e;
        try {
            yeo1 yeo1Var = (yeo1) this.e;
            zod.s(yeo1Var);
            Parcel parcelA1 = yeo1Var.a1();
            int i17 = usn1.a;
            parcelA1.writeStrongBinder(qfp0Var);
            parcelA1.writeInt(1);
            int iL = j541.L(20293, parcelA1);
            j541.K(parcelA1, 2, 4);
            parcelA1.writeInt(i15);
            char c2 = 3;
            j541.K(parcelA1, 3, 4);
            parcelA1.writeInt(i16);
            j541.K(parcelA1, 4, 4);
            parcelA1.writeInt(0);
            j541.K(parcelA1, 5, 8);
            parcelA1.writeLong(0L);
            j541.K(parcelA1, 6, 4);
            parcelA1.writeInt(iK);
            j541.M(iL, parcelA1);
            Parcel parcelB1 = yeo1Var.b1(1, parcelA1);
            nso1[] nso1VarArr = (nso1[]) parcelB1.createTypedArray(nso1.CREATOR);
            parcelB1.recycle();
            SparseArray sparseArray = new SparseArray();
            for (nso1 nso1Var : nso1VarArr) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(nso1Var.t);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(nso1Var.t, sparseArray2);
                }
                sparseArray2.append(nso1Var.X, nso1Var);
            }
            int i18 = 4;
            Object[] objArrCopyOf = new Object[4];
            int i19 = 0;
            int i20 = 0;
            while (i19 < sparseArray.size()) {
                SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i19);
                Object[] objArrCopyOf2 = new Object[i18];
                int i21 = i4;
                int i22 = i21;
                while (i21 < sparseArray3.size()) {
                    nso1 nso1Var2 = (nso1) sparseArray3.valueAt(i21);
                    nso1Var2.getClass();
                    int i23 = i22 + 1;
                    int length = objArrCopyOf2.length;
                    if (length < i23) {
                        int i24 = length + (length >> 1) + i3;
                        if (i24 < i23) {
                            int iHighestOneBit = Integer.highestOneBit(i22);
                            i24 = iHighestOneBit + iHighestOneBit;
                        }
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i24 < 0 ? Integer.MAX_VALUE : i24);
                    }
                    objArrCopyOf2[i22] = nso1Var2;
                    i21++;
                    i22 = i23;
                }
                vtn1 vtn1VarQ = rqn1.q(i22, objArrCopyOf2);
                AbstractList abstractListI = l6o1.I(vtn1VarQ, new icn1());
                a7o1 a7o1Var = ((nso1) vtn1VarQ.get(i4)).b;
                nqn1 nqn1VarR = vtn1VarQ.r(i4);
                int iMax = Integer.MIN_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                while (nqn1VarR.hasNext()) {
                    char c3 = c2;
                    a7o1 a7o1Var2 = ((nso1) nqn1VarR.next()).b;
                    char c4 = c;
                    int i25 = a7o1Var.a;
                    int i26 = i3;
                    float f = a7o1Var.e;
                    int i27 = i4;
                    int i28 = -a7o1Var.b;
                    double d = f;
                    double dSin = Math.sin(Math.toRadians(d));
                    double dCos = Math.cos(Math.toRadians(d));
                    SparseArray sparseArray4 = sparseArray;
                    Point[] pointArr = new Point[4];
                    int i29 = a7o1Var2.a;
                    int i30 = i19;
                    int i31 = a7o1Var2.d;
                    int i32 = a7o1Var2.c;
                    Point point = new Point(i29, a7o1Var2.b);
                    pointArr[i27] = point;
                    point.offset(-i25, i28);
                    Point point2 = pointArr[i27];
                    int i33 = point2.x;
                    double d2 = point2.y;
                    int i34 = (int) ((((double) i33) * dCos) + (d2 * dSin));
                    point2.x = i34;
                    int i35 = (int) ((((double) (-i33)) * dSin) + (dCos * d2));
                    point2.y = i35;
                    int i36 = i34 + i32;
                    pointArr[i26] = new Point(i36, i35);
                    int i37 = i35 + i31;
                    pointArr[c4] = new Point(i36, i37);
                    pointArr[c3] = new Point(i34, i37);
                    iMin = iMin;
                    for (int i38 = i27; i38 < 4; i38++) {
                        Point point3 = pointArr[i38];
                        iMin = Math.min(iMin, point3.x);
                        iMax = Math.max(iMax, point3.x);
                        iMin2 = Math.min(iMin2, point3.y);
                        iMax2 = Math.max(iMax2, point3.y);
                    }
                    c2 = c3;
                    c = c4;
                    i3 = i26;
                    i4 = i27;
                    sparseArray = sparseArray4;
                    i19 = i30;
                }
                SparseArray sparseArray5 = sparseArray;
                char c5 = c2;
                int i39 = i19;
                char c6 = c;
                int i40 = i3;
                int i41 = i4;
                int i42 = iMin;
                int i43 = a7o1Var.a;
                float f2 = a7o1Var.e;
                int i44 = a7o1Var.b;
                double d3 = f2;
                double dSin2 = Math.sin(Math.toRadians(d3));
                double dCos2 = Math.cos(Math.toRadians(d3));
                Point[] pointArr2 = {new Point(i42, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(i42, iMax2)};
                int i45 = i41;
                while (i45 < 4) {
                    Point point4 = pointArr2[i45];
                    double d4 = point4.x;
                    double d5 = point4.y;
                    point4.x = (int) ((d4 * dCos2) - (d5 * dSin2));
                    point4.y = (int) ((d4 * dSin2) + (d5 * dCos2));
                    point4.offset(i43, i44);
                    i45++;
                    dCos2 = dCos2;
                    abstractListI = abstractListI;
                }
                AbstractList abstractList = abstractListI;
                List listAsList = Arrays.asList(pointArr2);
                String strE = loo1.E(l6o1.I(abstractList, new een1()));
                Rect rectO = l0o1.o(listAsList);
                HashMap map = new HashMap();
                Iterator it = abstractList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((o5) ((qzd1) it.next())).d;
                    map.put(str2, Integer.valueOf((map.containsKey(str2) ? ((Integer) map.get(str2)).intValue() : i41) + 1));
                }
                Set setEntrySet = map.entrySet();
                if (setEntrySet.isEmpty()) {
                    str = "und";
                } else {
                    str = (String) ((Map.Entry) Collections.max(setEntrySet, mqo1.a)).getKey();
                    if (upo1.K(str)) {
                        str = "und";
                    }
                }
                szd1 szd1Var = new szd1(strE, rectO, listAsList, str, abstractList);
                int i46 = i20 + 1;
                int length2 = objArrCopyOf.length;
                if (length2 < i46) {
                    int i47 = length2 + (length2 >> 1) + 1;
                    if (i47 < i46) {
                        int iHighestOneBit2 = Integer.highestOneBit(i20);
                        i47 = iHighestOneBit2 + iHighestOneBit2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i47 < 0 ? Integer.MAX_VALUE : i47);
                }
                objArrCopyOf[i20] = szd1Var;
                i19 = i39 + 1;
                c2 = c5;
                i20 = i46;
                c = c6;
                i3 = i40;
                i4 = i41;
                sparseArray = sparseArray5;
                i18 = 4;
            }
            vtn1 vtn1VarQ2 = rqn1.q(i20, objArrCopyOf);
            loo1.E(l6o1.I(vtn1VarQ2, new uan1()));
            return new yzd1(vtn1VarQ2);
        } catch (RemoteException e) {
            throw new MlKitException("Failed to run legacy text recognizer.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable b(String str, List list, onm onmVar) throws Throwable {
        v271 v271Var;
        Throwable th;
        ArrayList arrayList;
        List m231Var;
        if (onmVar instanceof v271) {
            v271Var = (v271) onmVar;
            int i = v271Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v271Var.e = i - Integer.MIN_VALUE;
            } else {
                v271Var = new v271(this, onmVar);
            }
        } else {
            v271Var = new v271(this, onmVar);
        }
        Object objO = v271Var.c;
        int i2 = v271Var.e;
        List list2 = null;
        if (i2 == 0) {
            hm5.M(objO);
            lvy lvyVar = (lvy) o7h.s0(list);
            if (lvyVar != null && lvyVar.b.b) {
                List<lvy> list3 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (lvy lvyVar2 : list3) {
                    arrayList2.add(new n5f0(lvyVar2.b.a, lvyVar2.c.a));
                }
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lvy lvyVar3 = (lvy) it.next();
                r7h.W(p7h.M(new Long[]{new Long(lvyVar3.b.a), new Long(lvyVar3.c.a)}), arrayList3);
            }
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                arrayList4.add(this.b ? new uve1(jLongValue) : new tve1(jLongValue));
            }
            try {
                n641 n641Var = new n641(this, str, arrayList4, list2, (byte) 26);
                try {
                    v271Var.a = list;
                    v271Var.b = arrayList4;
                    v271Var.e = 1;
                    objO = rc2.O(200L, n641Var, v271Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                    arrayList = arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    arrayList = arrayList4;
                    m231Var = new m231(th);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = v271Var.b;
            list = v271Var.a;
            try {
                hm5.M(objO);
            } catch (Throwable th4) {
                th = th4;
                m231Var = new m231(th);
            }
        }
        m231Var = (List) objO;
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        List list4 = m231Var instanceof m231 ? null : m231Var;
        if (list4 == null || list4.size() != arrayList.size()) {
            List<lvy> list5 = list;
            ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
            for (lvy lvyVar4 : list5) {
                arrayList5.add(new n5f0(lvyVar4.b.a, lvyVar4.c.a));
            }
            return arrayList5;
        }
        tr80 tr80VarK = p7h.K(list);
        ArrayList arrayList6 = new ArrayList(q7h.U(tr80VarK, 10));
        lr80 it3 = tr80VarK.iterator();
        while (((sr80) it3).c) {
            int iNextInt = it3.nextInt() * 2;
            arrayList6.add(new n5f0(((vve1) list4.get(iNextInt)).a, ((vve1) list4.get(iNextInt + 1)).a));
        }
        return arrayList6;
    }

    public void c(fn51 fn51Var) {
        ((gc10) this.c).c(fn51Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(lvy lvyVar, String str, onm onmVar) throws Throwable {
        w271 w271Var;
        if (onmVar instanceof w271) {
            w271Var = (w271) onmVar;
            int i = w271Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w271Var.c = i - Integer.MIN_VALUE;
            } else {
                w271Var = new w271(this, onmVar);
            }
        } else {
            w271Var = new w271(this, onmVar);
        }
        Object objB = w271Var.a;
        int i2 = w271Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            List listSingletonList = Collections.singletonList(lvyVar);
            w271Var.c = 1;
            objB = b(str, listSingletonList, w271Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return o7h.q0((List) objB);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [android.content.Context, com.spotify.scannables.scannables.view.ScannablesOnboardingActivity, java.lang.Object] */
    public void e(Activity activity) {
        ((bx4) this.d).getClass();
        if (x74.j(activity, "android.permission.CAMERA") == 0) {
            ((ScannablesOnboardingActivity) this.c).o0(-1);
            return;
        }
        boolean zC0 = ag0.C0(activity, "android.permission.CAMERA");
        boolean z = this.b;
        final byte b = 1;
        final byte b2 = 0;
        if (zC0) {
            if (z) {
                this.b = false;
                return;
            } else {
                int i = PermissionsRequestActivity.d;
                activity.startActivityForResult(cso1.B(activity, (String[]) Arrays.copyOf(new String[]{"android.permission.CAMERA"}, 1)), 4660);
                return;
            }
        }
        if (!z) {
            this.b = true;
            int i2 = PermissionsRequestActivity.d;
            activity.startActivityForResult(cso1.B(activity, (String[]) Arrays.copyOf(new String[]{"android.permission.CAMERA"}, 1)), 4660);
        } else {
            this.b = false;
            final ?? r6 = (ScannablesOnboardingActivity) this.c;
            r6.getClass();
            new AlertDialog.Builder(r6, 5).setTitle(2131961441).setMessage(2131961440).setPositiveButton(2131961439, new DialogInterface.OnClickListener() { // from class: p.vh41
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    byte b3 = b2;
                    b7x b7xVar = b7x.a;
                    ScannablesOnboardingActivity scannablesOnboardingActivity = r6;
                    switch (b3) {
                        case 0:
                            int i4 = ScannablesOnboardingActivity.g1;
                            wh41 wh41Var = scannablesOnboardingActivity.f1;
                            sh41 sh41Var = (sh41) wh41Var.e;
                            i8h1 i8h1Var = sh41Var.a;
                            opl0 opl0Var = sh41Var.b;
                            x6h1 x6h1VarC = opl0Var.c.c();
                            x6h1VarC.i.add(new a7h1("camera_disallowed_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            x6h1 x6h1VarC2 = x6h1VarC.a().c();
                            x6h1VarC2.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC2.a(), opl0Var.b, System.currentTimeMillis()), (xj61) null);
                            t3b1 t3b1Var = (ScannablesOnboardingActivity) wh41Var.c;
                            t3b1Var.getClass();
                            t3b1Var.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", t3b1Var.getPackageName(), null)));
                            break;
                        default:
                            int i5 = ScannablesOnboardingActivity.g1;
                            sh41 sh41Var2 = (sh41) scannablesOnboardingActivity.f1.e;
                            i8h1 i8h1Var2 = sh41Var2.a;
                            opl0 opl0Var2 = sh41Var2.b;
                            x6h1 x6h1VarC3 = opl0Var2.c.c();
                            x6h1VarC3.i.add(new a7h1("camera_disallowed_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                            x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), opl0Var2.b, System.currentTimeMillis()), (xj61) null);
                            break;
                    }
                }
            }).setNegativeButton(2131961438, new DialogInterface.OnClickListener() { // from class: p.vh41
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    byte b3 = b;
                    b7x b7xVar = b7x.a;
                    ScannablesOnboardingActivity scannablesOnboardingActivity = r6;
                    switch (b3) {
                        case 0:
                            int i4 = ScannablesOnboardingActivity.g1;
                            wh41 wh41Var = scannablesOnboardingActivity.f1;
                            sh41 sh41Var = (sh41) wh41Var.e;
                            i8h1 i8h1Var = sh41Var.a;
                            opl0 opl0Var = sh41Var.b;
                            x6h1 x6h1VarC = opl0Var.c.c();
                            x6h1VarC.i.add(new a7h1("camera_disallowed_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            x6h1 x6h1VarC2 = x6h1VarC.a().c();
                            x6h1VarC2.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC2.a(), opl0Var.b, System.currentTimeMillis()), (xj61) null);
                            t3b1 t3b1Var = (ScannablesOnboardingActivity) wh41Var.c;
                            t3b1Var.getClass();
                            t3b1Var.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", t3b1Var.getPackageName(), null)));
                            break;
                        default:
                            int i5 = ScannablesOnboardingActivity.g1;
                            sh41 sh41Var2 = (sh41) scannablesOnboardingActivity.f1.e;
                            i8h1 i8h1Var2 = sh41Var2.a;
                            opl0 opl0Var2 = sh41Var2.b;
                            x6h1 x6h1VarC3 = opl0Var2.c.c();
                            x6h1VarC3.i.add(new a7h1("camera_disallowed_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                            x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), opl0Var2.b, System.currentTimeMillis()), (xj61) null);
                            break;
                    }
                }
            }).show();
        }
    }

    public synchronized void f() {
        this.b = true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, String str2, onm onmVar) throws Throwable {
        x271 x271Var;
        dhe m231Var;
        Throwable thA;
        wh41 wh41Var;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        lvy lvyVar;
        dhe dheVar;
        jo70 jo70Var;
        Object objD;
        jo70 jo70Var2;
        if (onmVar instanceof x271) {
            x271Var = (x271) onmVar;
            int i2 = x271Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x271Var.g = i2 - Integer.MIN_VALUE;
            } else {
                x271Var = new x271(this, onmVar);
            }
        } else {
            x271Var = new x271(this, onmVar);
        }
        Object objO = x271Var.e;
        int i3 = x271Var.g;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(objO);
                wh41Var = this;
                n641 n641Var = new n641(wh41Var, str, str2, lnmVar, (byte) 27);
                x271Var.a = str;
                x271Var.b = str2;
                i = 0;
                x271Var.d = 0;
                x271Var.g = 1;
                objO = rc2.O(5000L, n641Var, x271Var);
                if (objO != d9nVar) {
                    str3 = str;
                    str4 = str2;
                }
                return d9nVar;
            }
            if (i3 == 1) {
                int i4 = x271Var.d;
                str4 = x271Var.b;
                String str7 = x271Var.a;
                hm5.M(objO);
                wh41Var = this;
                i = i4;
                str3 = str7;
            } else {
                if (i3 == 2) {
                    int i5 = x271Var.d;
                    lvyVar = (lvy) x271Var.c;
                    String str8 = x271Var.b;
                    str5 = x271Var.a;
                    hm5.M(objO);
                    wh41Var = this;
                    i = i5;
                    str6 = str8;
                    jo70Var = (jo70) objO;
                    x271Var.a = null;
                    x271Var.b = str6;
                    x271Var.c = jo70Var;
                    x271Var.d = i;
                    x271Var.g = 3;
                    objD = wh41Var.d(lvyVar, str5, x271Var);
                    if (objD != d9nVar) {
                        objO = objD;
                        jo70Var2 = jo70Var;
                    }
                    return d9nVar;
                }
                if (i3 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jo70Var2 = (jo70) x271Var.c;
                str6 = x271Var.b;
                hm5.M(objO);
            }
            String str9 = str6;
            n5f0 n5f0Var = (n5f0) objO;
            String str10 = jo70Var2.a;
            String str11 = jo70Var2.b;
            long j = n5f0Var.a;
            dheVar = new dhe(j, n5f0Var.b - j, str9, str10, str11);
            m231Var = dheVar;
            thA = e331.a(m231Var);
            if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                throw thA;
            }
            if (m231Var instanceof m231) {
                return null;
            }
            return m231Var;
            lvy lvyVar2 = (lvy) objO;
            if (lvyVar2 != null) {
                x2z x2zVar = (x2z) wh41Var.d;
                x271Var.a = str3;
                x271Var.b = str4;
                x271Var.c = lvyVar2;
                x271Var.d = i;
                x271Var.g = 2;
                Object objA = x2zVar.a(str4, x271Var);
                if (objA != d9nVar) {
                    str5 = str3;
                    str6 = str4;
                    lvyVar = lvyVar2;
                    objO = objA;
                    jo70Var = (jo70) objO;
                    x271Var.a = null;
                    x271Var.b = str6;
                    x271Var.c = jo70Var;
                    x271Var.d = i;
                    x271Var.g = 3;
                    objD = wh41Var.d(lvyVar, str5, x271Var);
                    if (objD != d9nVar) {
                        objO = objD;
                        jo70Var2 = jo70Var;
                        String str12 = str6;
                        n5f0 n5f0Var2 = (n5f0) objO;
                        String str13 = jo70Var2.a;
                        String str14 = jo70Var2.b;
                        long j2 = n5f0Var2.a;
                        dheVar = new dhe(j2, n5f0Var2.b - j2, str12, str13, str14);
                    }
                }
                return d9nVar;
            }
            dheVar = null;
            m231Var = dheVar;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        thA = e331.a(m231Var);
        if (thA == null) {
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:45:0x00c8, B:49:0x00e4, B:55:0x00fc, B:57:0x0102, B:59:0x0115, B:61:0x011f, B:62:0x0124, B:58:0x010c), top: B:84:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010c A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:45:0x00c8, B:49:0x00e4, B:55:0x00fc, B:57:0x0102, B:59:0x0115, B:61:0x011f, B:62:0x0124, B:58:0x010c), top: B:84:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011f A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:45:0x00c8, B:49:0x00e4, B:55:0x00fc, B:57:0x0102, B:59:0x0115, B:61:0x011f, B:62:0x0124, B:58:0x010c), top: B:84:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0181  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public Object h(long j, String str, onm onmVar) throws Throwable {
        y271 y271Var;
        Object obj;
        Throwable thA;
        long j2;
        Object obj2;
        int i;
        List list;
        int i2;
        long j3;
        List list2;
        n5f0 n5f0Var;
        n5f0 n5f0Var2;
        Iterator it;
        long j4;
        Serializable serializable;
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        lvy lvyVar;
        n5f0 n5f0Var3;
        lvy lvyVar2;
        n5f0 n5f0Var4;
        Object objA;
        Serializable serializable2;
        n5f0 n5f0Var5;
        lvy lvyVar3;
        n5f0 n5f0Var6;
        String str2 = str;
        if (onmVar instanceof y271) {
            y271Var = (y271) onmVar;
            int i3 = y271Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y271Var.i = i3 - Integer.MIN_VALUE;
            } else {
                y271Var = new y271(this, onmVar);
            }
        } else {
            y271Var = new y271(this, onmVar);
        }
        Object obj3 = y271Var.g;
        int i4 = y271Var.i;
        int i5 = 0;
        dhe m231Var = null;
        Serializable serializable3 = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(obj3);
                lm61 lm61Var = new lm61(this, str2, m231Var, (byte) 5);
                y271Var.a = str2;
                j2 = j;
                y271Var.e = j2;
                y271Var.f = 0;
                y271Var.i = 1;
                Object objO = rc2.O(5000L, lm61Var, y271Var);
                if (objO != serializable3) {
                    obj2 = objO;
                    i = 0;
                }
                return serializable3;
            }
            if (i4 == 1) {
                int i6 = y271Var.f;
                j2 = y271Var.e;
                String str3 = y271Var.a;
                hm5.M(obj3);
                i = i6;
                str2 = str3;
                obj2 = obj3;
            } else if (i4 == 2) {
                i2 = y271Var.f;
                j3 = y271Var.e;
                list = y271Var.b;
                hm5.M(obj3);
                list2 = (List) obj3;
                n5f0Var = (n5f0) o7h.q0(list2);
                n5f0Var2 = (n5f0) o7h.A0(list2);
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        j4 = j3;
                        serializable = serializable3;
                        mmr0Var = null;
                        break;
                    }
                    int i7 = i5 + 1;
                    try {
                        lvy lvyVar4 = (lvy) it.next();
                        n5f0Var6 = (n5f0) list2.get(i5);
                        j4 = j3;
                        long j5 = n5f0Var6.a;
                        serializable = serializable3;
                        if (j4 >= n5f0Var6.b && j5 <= j4) {
                            mmr0Var = new mmr0(lvyVar4, n5f0Var6);
                            break;
                        }
                        j3 = j4;
                        i5 = i7;
                        serializable3 = serializable;
                    } catch (Throwable th) {
                        th = th;
                        obj = null;
                        m231Var = new m231(th);
                    }
                }
                if (j4 >= n5f0Var2.b) {
                    mmr0Var2 = new mmr0(o7h.A0(list), n5f0Var2);
                } else {
                    mmr0Var2 = new mmr0(o7h.q0(list), n5f0Var);
                }
                lvyVar = (lvy) mmr0Var2.a;
                n5f0Var3 = (n5f0) mmr0Var2.b;
                if (mmr0Var == null) {
                    mmr0Var = new mmr0(lvyVar, n5f0Var3);
                }
                lvyVar2 = (lvy) mmr0Var.a;
                n5f0Var4 = (n5f0) mmr0Var.b;
                x2z x2zVar = (x2z) this.d;
                String str4 = lvyVar2.a;
                obj = null;
                try {
                    y271Var.a = null;
                    y271Var.b = null;
                    y271Var.c = lvyVar2;
                    y271Var.d = n5f0Var4;
                    y271Var.e = j4;
                    y271Var.f = i2;
                    y271Var.i = 3;
                    objA = x2zVar.a(str4, y271Var);
                    serializable2 = serializable;
                    if (objA == serializable2) {
                        return serializable2;
                    }
                    obj3 = objA;
                    n5f0Var5 = n5f0Var4;
                    lvyVar3 = lvyVar2;
                } catch (Throwable th2) {
                    th = th2;
                    m231Var = new m231(th);
                }
            } else {
                if (i4 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n5f0Var5 = y271Var.d;
                lvyVar3 = y271Var.c;
                List list3 = y271Var.b;
                hm5.M(obj3);
                obj = null;
            }
            jo70 jo70Var = (jo70) obj3;
            String str5 = lvyVar3.a;
            String str6 = jo70Var.a;
            String str7 = jo70Var.b;
            long j6 = n5f0Var5.a;
            m231Var = new dhe(j6, n5f0Var5.b - j6, str5, str6, str7);
            thA = e331.a(m231Var);
            if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                throw thA;
            }
            if (m231Var instanceof m231) {
                return obj;
            }
            return m231Var;
            list = (List) obj2;
            if (list == null || list.isEmpty()) {
                obj = null;
            } else {
                y271Var.a = null;
                y271Var.b = list;
                y271Var.e = j2;
                y271Var.f = i;
                y271Var.i = 2;
                Serializable serializableB = b(str2, list, y271Var);
                if (serializableB == serializable3) {
                    return serializable3;
                }
                int i8 = i;
                obj3 = serializableB;
                i2 = i8;
                j3 = j2;
                list2 = (List) obj3;
                n5f0Var = (n5f0) o7h.q0(list2);
                n5f0Var2 = (n5f0) o7h.A0(list2);
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        j4 = j3;
                        serializable = serializable3;
                        mmr0Var = null;
                        break;
                    }
                    int i9 = i5 + 1;
                    lvy lvyVar5 = (lvy) it.next();
                    n5f0Var6 = (n5f0) list2.get(i5);
                    j4 = j3;
                    long j7 = n5f0Var6.a;
                    serializable = serializable3;
                    if (j4 >= n5f0Var6.b) {
                    }
                    j3 = j4;
                    i5 = i9;
                    serializable3 = serializable;
                }
                if (j4 >= n5f0Var2.b) {
                    mmr0Var2 = new mmr0(o7h.A0(list), n5f0Var2);
                } else {
                    mmr0Var2 = new mmr0(o7h.q0(list), n5f0Var);
                }
                lvyVar = (lvy) mmr0Var2.a;
                n5f0Var3 = (n5f0) mmr0Var2.b;
                if (mmr0Var == null) {
                    mmr0Var = new mmr0(lvyVar, n5f0Var3);
                }
                lvyVar2 = (lvy) mmr0Var.a;
                n5f0Var4 = (n5f0) mmr0Var.b;
                x2z x2zVar2 = (x2z) this.d;
                String str8 = lvyVar2.a;
                obj = null;
                y271Var.a = null;
                y271Var.b = null;
                y271Var.c = lvyVar2;
                y271Var.d = n5f0Var4;
                y271Var.e = j4;
                y271Var.f = i2;
                y271Var.i = 3;
                objA = x2zVar2.a(str8, y271Var);
                serializable2 = serializable;
                if (objA == serializable2) {
                    return serializable2;
                }
                obj3 = objA;
                n5f0Var5 = n5f0Var4;
                lvyVar3 = lvyVar2;
                jo70 jo70Var2 = (jo70) obj3;
                String str9 = lvyVar3.a;
                String str10 = jo70Var2.a;
                String str11 = jo70Var2.b;
                long j8 = n5f0Var5.a;
                m231Var = new dhe(j8, n5f0Var5.b - j8, str9, str10, str11);
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
        thA = e331.a(m231Var);
        if (thA == null) {
        }
        if (m231Var instanceof m231) {
            return obj;
        }
        return m231Var;
    }

    public void i() {
        v241 v241Var = new v241(this, (byte) 18);
        AtomicReference atomicReference = (AtomicReference) this.d;
        while (!atomicReference.compareAndSet(null, v241Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        ((djn) ((uo5) ((mxa1) this.e).d).c).a(v241Var);
    }

    public synchronized void j(gbl gblVar) {
        if (this.b) {
            return;
        }
        NativeConnectivityManager nativeConnectivityManager = (NativeConnectivityManager) this.c;
        ebl eblVar = ConnectionType.Companion;
        int i = gblVar.a;
        eblVar.getClass();
        ConnectionType connectionType = (ConnectionType) ConnectionType.access$getBY_VALUE$cp().get(Integer.valueOf(i));
        if (connectionType == null) {
            connectionType = ConnectionType.UNKNOWN;
        }
        nativeConnectivityManager.setConnectionType(connectionType, ((TelephonyManager) this.d).isNetworkRoaming());
        gbl gblVar2 = (gbl) this.e;
        if (gblVar == gblVar2) {
            return;
        }
        this.e = gblVar;
        if (gblVar.c) {
            return;
        }
        if (!gblVar2.c) {
            boolean z = gblVar2.b;
            boolean z2 = gblVar.b;
        }
    }

    public boolean k(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ava0) ((AtomicMarkableReference) this.c).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.c;
                atomicMarkableReference.set((ava0) atomicMarkableReference.getReference(), true);
                i();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l() {
        ((fw61) this.c).b = null;
    }

    public void m(rzn1 rzn1Var) {
        lgy lgyVar;
        boolean z = this.b;
        ynb0 ynb0Var = (ynb0) this.e;
        if (rzn1Var instanceof rrg0) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962614});
            lgyVar = new lgy();
            Integer num = (Integer) lgyVar.d;
            n57.k(num == null || num.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num});
            lgyVar.d = 2131962614;
            lgyVar.a = false;
            lgyVar.b(2131962621);
            lgyVar.g = new lt91(this, (byte) 0);
            ((qrg0) ynb0Var.get()).b(1);
        } else {
            if (!(rzn1Var instanceof srg0)) {
                eg.o();
                return;
            }
            if (z) {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962619});
                lgyVar = new lgy();
                Integer num2 = (Integer) lgyVar.d;
                n57.k(num2 == null || num2.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num2});
                lgyVar.d = 2131962619;
                lgyVar.a = false;
                lgyVar.b(2131962621);
                lgyVar.g = new lt91(this, (byte) 1);
                ((qrg0) ynb0Var.get()).b(1);
            } else {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962619});
                lgy lgyVar2 = new lgy();
                Integer num3 = (Integer) lgyVar2.d;
                n57.k(num3 == null || num3.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num3});
                lgyVar2.d = 2131962619;
                lgyVar2.a = false;
                lgyVar2.b(2131962635);
                lgyVar2.g = new wa21((Object) this, (Object) rzn1Var, (byte) 14);
                ((qrg0) ynb0Var.get()).b(1);
                lgyVar = lgyVar2;
            }
        }
        ((kt91) this.d).k(lgyVar.c());
    }

    public void n() {
        if (this.b) {
            ((SensorManager) this.d).unregisterListener((SensorEventListener) this.c);
            this.b = false;
        }
    }

    public void o(Exception exc) {
        ((il00) this.c).o(exc);
    }

    public void onSuccess() {
        wab wabVar = (wab) this.d;
        if (!this.b) {
            this.b = true;
            ((t0i) this.e).a(wabVar.c);
        }
        ((il00) this.c).onSuccess();
    }

    public void p(Runnable runnable, Executor executor) {
        synchronized (this.c) {
            try {
                if (this.b) {
                    ((ArrayDeque) this.d).add(new udp1(runnable, executor));
                } else {
                    this.b = true;
                    q(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(new sjj1(this, runnable, (byte) 16));
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    public void s() {
        SparseArray sparseArray = (SparseArray) this.e;
        ((gc10) this.c).s();
        if (this.b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((frc1) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public gtf1 w(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.e;
        gc10 gc10Var = (gc10) this.c;
        if (i2 != 3 && i2 != 5) {
            this.b = true;
        }
        if (i2 != 3) {
            return gc10Var.w(i, i2);
        }
        frc1 frc1Var = (frc1) sparseArray.get(i);
        if (frc1Var != null) {
            return frc1Var;
        }
        frc1 frc1Var2 = new frc1(gc10Var.w(i, i2), (jqc1) this.d);
        sparseArray.put(i, frc1Var2);
        return frc1Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.mlkit.common.MlKitException */
    public void zzb() throws MlKitException {
        npo1 pio1Var;
        Context context = (Context) this.c;
        if (((yeo1) this.e) != null) {
            return;
        }
        try {
            IBinder iBinderB = gjv.c(context, gjv.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
            int i = vlo1.l;
            if (iBinderB == null) {
                pio1Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                pio1Var = iInterfaceQueryLocalInterface instanceof npo1 ? (npo1) iInterfaceQueryLocalInterface : new pio1(iBinderB, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", (byte) 4);
            }
            yeo1 yeo1VarG1 = ((pio1) pio1Var).g1(new qfp0(context), (e1p1) this.d);
            this.e = yeo1VarG1;
            if (yeo1VarG1 != null || this.b) {
                return;
            }
            vpq0.a(context);
            this.b = true;
        } catch (DynamiteModule.LoadingException e) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", e);
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to create legacy text recognizer.", e2);
        }
    }

    public void zzc() {
        switch (this.a) {
            case 7:
                synchronized (this.c) {
                    try {
                        if (((ArrayDeque) this.d).isEmpty()) {
                            this.b = false;
                            return;
                        }
                        udp1 udp1Var = (udp1) ((ArrayDeque) this.d).remove();
                        q(udp1Var.b, udp1Var.a);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                yeo1 yeo1Var = (yeo1) this.e;
                if (yeo1Var != null) {
                    try {
                        yeo1Var.c1(2, yeo1Var.a1());
                        break;
                    } catch (RemoteException unused) {
                    }
                    this.e = null;
                    return;
                }
                return;
        }
    }

    public wh41() {
        this.a = (byte) 7;
        this.c = new Object();
        this.d = new ArrayDeque();
        this.e = new AtomicReference();
    }

    public wh41(Context context) {
        this.a = (byte) 9;
        this.d = new e1p1((String) null);
        this.c = context;
    }

    public wh41(NativeConnectivityManager nativeConnectivityManager, Context context) {
        this.a = (byte) 1;
        this.c = nativeConnectivityManager;
        this.d = (TelephonyManager) context.getSystemService("phone");
        this.e = gbl.e;
    }

    public wh41(Application application, fw61 fw61Var) {
        this.a = (byte) 2;
        this.c = fw61Var;
        SensorManager sensorManager = (SensorManager) application.getSystemService("sensor");
        this.d = sensorManager;
        this.e = sensorManager.getDefaultSensor(1);
    }

    public wh41(sh41 sh41Var, bx4 bx4Var) {
        this.a = (byte) 0;
        this.d = bx4Var;
        this.e = sh41Var;
    }

    public wh41(gc10 gc10Var, jqc1 jqc1Var) {
        this.a = (byte) 6;
        this.c = gc10Var;
        this.d = jqc1Var;
        this.e = new SparseArray();
    }

    public wh41(il00 il00Var, wab wabVar, t0i t0iVar) {
        this.a = (byte) 5;
        this.c = il00Var;
        this.d = wabVar;
        this.e = t0iVar;
    }

    public /* synthetic */ wh41(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }
}
