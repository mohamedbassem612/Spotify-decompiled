package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;
import p.hhg1;
import p.j541;
import p.u9;
import p.ynm1;
import p.zod;
import p.zxl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class DataHolder extends u9 implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new ynm1((byte) 28);
    public static final zxl1 X = new zxl1(new String[0]);
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    public boolean i;
    public final boolean t;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.data.zac */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public DataHolder(zxl1 zxl1Var, int i) throws zac {
        ?? r8;
        CursorWindow[] cursorWindowArr;
        boolean zPutDouble;
        CursorWindow cursorWindow;
        String[] strArrM = zxl1Var.m();
        boolean z = false;
        if (zxl1Var.m().length == 0) {
            cursorWindowArr = new CursorWindow[0];
        } else {
            ArrayList arrayListN = zxl1Var.n();
            int size = arrayListN.size();
            CursorWindow cursorWindow2 = new CursorWindow(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cursorWindow2);
            cursorWindow2.setNumColumns(zxl1Var.m().length);
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                try {
                    r8 = cursorWindow2;
                    boolean zAllocRow = r8.allocRow();
                    ?? r9 = r8;
                    if (!zAllocRow) {
                        new StringBuilder(String.valueOf(i2).length() + 61);
                        cursorWindow = new CursorWindow(z);
                        cursorWindow.setStartPosition(i2);
                        cursorWindow.setNumColumns(zxl1Var.m().length);
                        arrayList.add(cursorWindow);
                        if (!cursorWindow.allocRow()) {
                            r9 = cursorWindow;
                            arrayList.remove(cursorWindow);
                            cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                        }
                    }
                    r9 = cursorWindow;
                    Map map = (Map) arrayListN.get(i2);
                    boolean zPutNull = true;
                    ?? r13 = z;
                    while (true) {
                        if (r13 >= zxl1Var.m().length) {
                            z2 = zPutNull ? false : z2;
                            i2++;
                            z = false;
                            r8 = r9;
                        } else if (zPutNull) {
                            String str = zxl1Var.m()[r13];
                            Object obj = map.get(str);
                            if (obj == null) {
                                zPutNull = r9.putNull(i2, r13);
                            } else {
                                if (obj instanceof String) {
                                    zPutDouble = r9.putString((String) obj, i2, r13);
                                } else if (obj instanceof Long) {
                                    zPutDouble = r9.putLong(((Long) obj).longValue(), i2, r13);
                                } else if (obj instanceof Integer) {
                                    zPutDouble = r9.putLong(((Integer) obj).intValue(), i2, r13);
                                } else if (obj instanceof Boolean) {
                                    zPutDouble = r9.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i2, r13);
                                } else if (obj instanceof byte[]) {
                                    zPutDouble = r9.putBlob((byte[]) obj, i2, r13);
                                } else if (obj instanceof Double) {
                                    zPutDouble = r9.putDouble(((Double) obj).doubleValue(), i2, r13);
                                } else {
                                    if (!(obj instanceof Float)) {
                                        String string = obj.toString();
                                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + string.length());
                                        sb.append("Unsupported object for column ");
                                        sb.append(str);
                                        sb.append(": ");
                                        sb.append(string);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    zPutDouble = r9.putDouble(((Float) obj).floatValue(), i2, r13);
                                }
                                zPutNull = zPutDouble;
                            }
                            r13++;
                        }
                        if (z2) {
                            throw new zac();
                        }
                        new StringBuilder(String.valueOf(i2).length() + 63);
                        r9.freeLastRow();
                        CursorWindow cursorWindow3 = new CursorWindow(false);
                        cursorWindow3.setStartPosition(i2);
                        cursorWindow3.setNumColumns(zxl1Var.m().length);
                        arrayList.add(cursorWindow3);
                        i2--;
                        z2 = true;
                        r9 = cursorWindow3;
                        i2++;
                        z = false;
                        r8 = r9;
                    }
                } catch (RuntimeException e) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((CursorWindow) arrayList.get(i3)).close();
                    }
                    throw e;
                }
            }
            r8 = cursorWindow2;
            cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        }
        this.i = false;
        this.t = true;
        this.a = 1;
        this.b = strArrM;
        zod.s(cursorWindowArr);
        this.d = cursorWindowArr;
        this.e = i;
        this.f = null;
        F();
    }

    public final void F() {
        this.c = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.b;
            if (i >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.d;
        this.g = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i2 = 0; i2 < cursorWindowArr.length; i2++) {
            this.g[i2] = numRows;
            numRows += cursorWindowArr[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
        }
        this.h = numRows;
    }

    public final void a0(int i, String str) {
        boolean z;
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            hhg1.n("No such column: ".concat(String.valueOf(str)));
            return;
        }
        synchronized (this) {
            z = this.i;
        }
        if (z) {
            hhg1.n("Buffer is closed.");
        } else if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.i) {
                    this.i = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.d;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.t && this.d.length > 0) {
                synchronized (this) {
                    z = this.i;
                }
                if (!z) {
                    close();
                    new StringBuilder(String.valueOf(toString()).length() + 178);
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final int j(int i) {
        int length;
        int i2 = 0;
        zod.w(i >= 0 && i < this.h);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.G(parcel, 1, this.b);
        j541.I(parcel, 2, this.d, i);
        j541.z(parcel, 3, this.e);
        j541.u(parcel, 4, this.f);
        j541.z(parcel, 1000, this.a);
        j541.n(iJ, parcel);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.i = false;
        this.t = true;
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }
}
