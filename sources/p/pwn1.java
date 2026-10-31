package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pwn1 extends jan1 {
    public final /* synthetic */ iyy0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwn1(adm1 adm1Var, j8n1 j8n1Var, iyy0 iyy0Var) {
        super(j8n1Var, (byte) 1);
        this.n = iyy0Var;
        Objects.requireNonNull(adm1Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, p.dqo1, p.xaa] */
    @Override // p.jan1
    public final void l(px40 px40Var) throws Throwable {
        Throwable th;
        File fileR;
        ?? r14 = (dqo1) px40Var;
        r14.getClass();
        iyy0 iyy0Var = this.n;
        Map mapH = iyy0Var.h();
        Uri uri = iyy0Var.a;
        Iterator it = mapH.entrySet().iterator();
        while (it.hasNext()) {
            Asset asset = (Asset) ((Map.Entry) it.next()).getValue();
            if (asset.a == null && asset.b == null && asset.c == null && asset.d == null) {
                String strValueOf = String.valueOf(uri);
                String strValueOf2 = String.valueOf(asset);
                hhg1.n(rjx.o(new StringBuilder(strValueOf.length() + 33 + strValueOf2.length()), "Put for ", strValueOf, " contains invalid asset: ", strValueOf2));
                return;
            }
        }
        zno1.F(uri, "uri must not be null");
        iyy0 iyy0Var2 = new iyy0(uri, new Bundle(), (byte[]) null, 1800000L);
        iyy0Var2.c = iyy0Var.c;
        if (iyy0Var.d == 0) {
            iyy0Var2.d = 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : iyy0Var.h().entrySet()) {
            Asset asset2 = (Asset) entry.getValue();
            byte[] bArr = asset2.a;
            ParcelFileDescriptor parcelFileDescriptor = asset2.c;
            Uri uri2 = asset2.d;
            File file = null;
            if (bArr != null) {
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String strValueOf3 = String.valueOf(asset2);
                        new StringBuilder(String.valueOf(parcelFileDescriptorArrCreatePipe[0]).length() + strValueOf3.length() + 54 + 7 + String.valueOf(parcelFileDescriptorArrCreatePipe[1]).length());
                    }
                    String str = (String) entry.getKey();
                    ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[0];
                    parcelFileDescriptor2.getClass();
                    iyy0Var2.j(str, new Asset(null, null, parcelFileDescriptor2, null));
                    FutureTask futureTask = new FutureTask(new e71((dqo1) r14, parcelFileDescriptorArrCreatePipe[1], asset2.a));
                    arrayList.add(futureTask);
                    r14.B.submit(futureTask);
                } catch (IOException e) {
                    k220.p("Unable to create ParcelFileDescriptor for asset in request: ".concat(String.valueOf(iyy0Var)), e);
                    return;
                }
            } else if (uri2 != null) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = r14.c.getContentResolver().openFileDescriptor(uri2, "r");
                    parcelFileDescriptorOpenFileDescriptor.getClass();
                    iyy0Var2.j((String) entry.getKey(), new Asset(null, null, parcelFileDescriptorOpenFileDescriptor, null));
                } catch (FileNotFoundException unused) {
                    soo1 soo1Var = new soo1(this, arrayList);
                    soo1Var.i1(new kyn1(zko1.q(4005), null));
                    Iterator it2 = soo1Var.m.iterator();
                    while (it2.hasNext()) {
                        ((FutureTask) it2.next()).cancel(true);
                    }
                    "Couldn't resolve asset URI: ".concat(String.valueOf(uri2));
                    return;
                }
            } else if (parcelFileDescriptor != null) {
                try {
                    fileR = w0h1.R(parcelFileDescriptor, (File) r14.N.zza());
                    try {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileR, 268435456);
                            parcelFileDescriptorOpen.getClass();
                            iyy0Var2.j((String) entry.getKey(), new Asset(null, null, parcelFileDescriptorOpen, null));
                            if (fileR != null) {
                                fileR.delete();
                            }
                        } catch (IOException unused2) {
                            soo1 soo1Var2 = new soo1(this, arrayList);
                            soo1Var2.i1(new kyn1(zko1.q(4005), null));
                            Iterator it3 = soo1Var2.m.iterator();
                            while (it3.hasNext()) {
                                ((FutureTask) it3.next()).cancel(true);
                            }
                            new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 39);
                            if (fileR != null) {
                                fileR.delete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        file = fileR;
                        if (file != null) {
                            throw th;
                        }
                        file.delete();
                        throw th;
                    }
                } catch (IOException unused3) {
                    fileR = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (file != null) {
                        throw th;
                    }
                    file.delete();
                    throw th;
                }
            } else {
                iyy0Var2.j((String) entry.getKey(), asset2);
            }
        }
        xdo1 xdo1Var = (xdo1) r14.n();
        soo1 soo1Var3 = new soo1(this, arrayList);
        Parcel parcelA1 = xdo1Var.a1();
        zsn1.c(parcelA1, soo1Var3);
        zsn1.b(parcelA1, iyy0Var2);
        xdo1Var.Z0(6, parcelA1);
    }
}
