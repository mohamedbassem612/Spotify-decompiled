package p;

import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mpn1 {
    public static final AtomicReference a;

    static {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        a = new AtomicReference();
        sparseArray.put(-1, s6p1.FORMAT_UNKNOWN);
        sparseArray.put(1, s6p1.FORMAT_CODE_128);
        sparseArray.put(2, s6p1.FORMAT_CODE_39);
        sparseArray.put(4, s6p1.FORMAT_CODE_93);
        sparseArray.put(8, s6p1.FORMAT_CODABAR);
        sparseArray.put(16, s6p1.FORMAT_DATA_MATRIX);
        sparseArray.put(32, s6p1.FORMAT_EAN_13);
        sparseArray.put(64, s6p1.FORMAT_EAN_8);
        sparseArray.put(128, s6p1.FORMAT_ITF);
        sparseArray.put(256, s6p1.FORMAT_QR_CODE);
        sparseArray.put(512, s6p1.FORMAT_UPC_A);
        sparseArray.put(1024, s6p1.FORMAT_UPC_E);
        sparseArray.put(2048, s6p1.FORMAT_PDF417);
        sparseArray.put(4096, s6p1.FORMAT_AZTEC);
        sparseArray2.put(0, v6p1.TYPE_UNKNOWN);
        sparseArray2.put(1, v6p1.TYPE_CONTACT_INFO);
        sparseArray2.put(2, v6p1.TYPE_EMAIL);
        sparseArray2.put(3, v6p1.TYPE_ISBN);
        sparseArray2.put(4, v6p1.TYPE_PHONE);
        sparseArray2.put(5, v6p1.TYPE_PRODUCT);
        sparseArray2.put(6, v6p1.TYPE_SMS);
        sparseArray2.put(7, v6p1.TYPE_TEXT);
        sparseArray2.put(8, v6p1.TYPE_URL);
        sparseArray2.put(9, v6p1.TYPE_WIFI);
        sparseArray2.put(10, v6p1.TYPE_GEO);
        sparseArray2.put(11, v6p1.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, v6p1.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        map.put(1, zep1.CODE_128);
        map.put(2, zep1.CODE_39);
        map.put(4, zep1.CODE_93);
        map.put(8, zep1.CODABAR);
        map.put(16, zep1.DATA_MATRIX);
        map.put(32, zep1.EAN_13);
        map.put(64, zep1.EAN_8);
        map.put(128, zep1.ITF);
        map.put(256, zep1.QR_CODE);
        map.put(512, zep1.UPC_A);
        map.put(1024, zep1.UPC_E);
        map.put(2048, zep1.PDF417);
        map.put(4096, zep1.AZTEC);
    }

    public static boolean a() {
        AtomicReference atomicReference = a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextB = qok0.c().b();
        int i = kzo1.a;
        boolean z = gjv.a(contextB, "com.google.mlkit.dynamite.barcode") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
