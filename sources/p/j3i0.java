package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j3i0 extends u9 {
    public static final Parcelable.Creator<j3i0> CREATOR;
    public String N0;
    public JSONObject O0;
    public int P0;
    public boolean R0;
    public pi0 S0;
    public opj1 T0;
    public pqh0 U0;
    public puh0 V0;
    public boolean W0;
    public long[] X;
    public int Y;
    public int Z;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    public long h;
    public double i;
    public boolean t;
    public final ArrayList Q0 = new ArrayList();
    public final SparseArray X0 = new SparseArray();

    static {
        zod.p("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new jrn1((byte) 8);
    }

    public j3i0(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, pi0 pi0Var, opj1 opj1Var, pqh0 pqh0Var, puh0 puh0Var) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.t = z;
        this.X = jArr;
        this.Y = i4;
        this.Z = i5;
        this.N0 = str;
        if (str != null) {
            try {
                this.O0 = new JSONObject(this.N0);
            } catch (JSONException unused) {
                this.O0 = null;
                this.N0 = null;
            }
        } else {
            this.O0 = null;
        }
        this.P0 = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            F(arrayList);
        }
        this.R0 = z2;
        this.S0 = pi0Var;
        this.T0 = opj1Var;
        this.U0 = pqh0Var;
        this.V0 = puh0Var;
        boolean z3 = false;
        if (puh0Var != null && puh0Var.t) {
            z3 = true;
        }
        this.W0 = z3;
    }

    public final void F(List list) {
        ArrayList arrayList = this.Q0;
        arrayList.clear();
        SparseArray sparseArray = this.X0;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            quh0 quh0Var = (quh0) list.get(i);
            arrayList.add(quh0Var);
            sparseArray.put(quh0Var.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof j3i0) {
                j3i0 j3i0Var = (j3i0) obj;
                if ((this.O0 == null) == (j3i0Var.O0 == null) && this.b == j3i0Var.b && this.c == j3i0Var.c && this.d == j3i0Var.d && this.e == j3i0Var.e && this.f == j3i0Var.f && this.g == j3i0Var.g && this.i == j3i0Var.i && this.t == j3i0Var.t && this.Y == j3i0Var.Y && this.Z == j3i0Var.Z && this.P0 == j3i0Var.P0 && Arrays.equals(this.X, j3i0Var.X) && o4e.c(Long.valueOf(this.h), Long.valueOf(j3i0Var.h)) && o4e.c(this.Q0, j3i0Var.Q0) && o4e.c(this.a, j3i0Var.a) && (((jSONObject = this.O0) == null || (jSONObject2 = j3i0Var.O0) == null || oha0.a(jSONObject, jSONObject2)) && this.R0 == j3i0Var.R0 && o4e.c(this.S0, j3i0Var.S0) && o4e.c(this.T0, j3i0Var.T0) && o4e.c(this.U0, j3i0Var.U0) && k8p1.h(this.V0, j3i0Var.V0) && this.W0 == j3i0Var.W0)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.t), Integer.valueOf(Arrays.hashCode(this.X)), Integer.valueOf(this.Y), Integer.valueOf(this.Z), String.valueOf(this.O0), Integer.valueOf(this.P0), this.Q0, Boolean.valueOf(this.R0), this.S0, this.T0, this.U0, this.V0});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae A[EDGE_INSN: B:108:0x01ae->B:109:0x01b2 BREAK  A[LOOP:0: B:102:0x019c->B:106:0x01a9]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x024a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0250  */
    /* JADX WARN: Code duplicated, block: B:152:0x025a  */
    /* JADX WARN: Code duplicated, block: B:153:0x025d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0265  */
    /* JADX WARN: Code duplicated, block: B:157:0x0269  */
    /* JADX WARN: Code duplicated, block: B:160:0x0270  */
    /* JADX WARN: Code duplicated, block: B:162:0x0282 A[LOOP:3: B:161:0x0280->B:162:0x0282, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:178:0x0300  */
    /* JADX WARN: Code duplicated, block: B:182:0x0314  */
    /* JADX WARN: Code duplicated, block: B:183:0x0316  */
    /* JADX WARN: Code duplicated, block: B:185:0x031f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0325  */
    /* JADX WARN: Code duplicated, block: B:188:0x0328  */
    /* JADX WARN: Code duplicated, block: B:191:0x0339  */
    /* JADX WARN: Code duplicated, block: B:245:0x0415 A[Catch: JSONException -> 0x0431, TRY_ENTER, TryCatch #0 {JSONException -> 0x0431, blocks: (B:223:0x03cd, B:246:0x041f, B:245:0x0415), top: B:374:0x03cd }] */
    /* JADX WARN: Code duplicated, block: B:296:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:314:0x0543  */
    /* JADX WARN: Code duplicated, block: B:317:0x0551  */
    /* JADX WARN: Code duplicated, block: B:319:0x0559  */
    /* JADX WARN: Code duplicated, block: B:320:0x0568  */
    /* JADX WARN: Code duplicated, block: B:323:0x0572  */
    /* JADX WARN: Code duplicated, block: B:326:0x057e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0587  */
    /* JADX WARN: Code duplicated, block: B:355:0x062d  */
    /* JADX WARN: Code duplicated, block: B:357:0x0637  */
    /* JADX WARN: Code duplicated, block: B:367:0x0683  */
    /* JADX WARN: Code duplicated, block: B:369:0x0687  */
    /* JADX WARN: Code duplicated, block: B:394:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int j(JSONObject jSONObject, int i) {
        int i2;
        long[] jArr;
        boolean zJ;
        JSONArray jSONArray;
        int length;
        SparseArray sparseArray;
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z;
        Integer num;
        JSONObject jSONObject2;
        Integer num2;
        quh0 quh0Var;
        MediaInfo mediaInfo;
        Integer numW;
        int iIntValue;
        pi0 pi0Var;
        int i5;
        opj1 opj1Var;
        int i6;
        JSONObject jSONObjectOptJSONObject;
        pqh0 pqh0Var;
        String strA;
        int i7;
        String strA2;
        String str;
        ouh0 ouh0Var;
        int iIntValue2;
        ArrayList arrayList2;
        int iOptInt;
        long jOptDouble;
        boolean zOptBoolean;
        ArrayList arrayList3;
        String str2;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList4;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList5;
        int i8;
        JSONObject jSONObjectOptJSONObject2;
        MediaInfo mediaInfo2;
        int i9;
        int i10;
        int i11;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObjectOptJSONObject3 = jSONObject3.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject3 != null) {
            try {
                ArrayList arrayList6 = new ArrayList();
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    arrayList6.add(itKeys.next());
                }
                JSONObject jSONObject4 = new JSONObject(jSONObject3, (String[]) arrayList6.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject4.put(next, jSONObjectOptJSONObject3.get(next));
                }
                jSONObject4.remove("extendedStatus");
                jSONObject3 = jSONObject4;
            } catch (JSONException unused) {
            }
        }
        long j = jSONObject3.getLong("mediaSessionId");
        int i12 = 1;
        if (j != this.b) {
            this.b = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i13 = 2;
        if (jSONObject3.has("playerState")) {
            String string = jSONObject3.getString("playerState");
            if (string.equals("IDLE")) {
                i10 = 1;
            } else if (string.equals("PLAYING")) {
                i10 = 2;
            } else if (string.equals("PAUSED")) {
                i10 = 3;
            } else if (string.equals("BUFFERING")) {
                i10 = 4;
            } else {
                i10 = string.equals("LOADING") ? 5 : 0;
            }
            if (i10 != this.e) {
                this.e = i10;
                i2 |= 2;
            }
            if (i10 == 1 && jSONObject3.has("idleReason")) {
                String string2 = jSONObject3.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i11 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i11 = 3;
                } else if (string2.equals("FINISHED")) {
                    i11 = 1;
                } else {
                    i11 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i11 != this.f) {
                    this.f = i11;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject3.has("playbackRate")) {
            double d = jSONObject3.getDouble("playbackRate");
            if (this.d != d) {
                this.d = d;
                i2 |= 2;
            }
        }
        if (jSONObject3.has("currentTime")) {
            double d2 = jSONObject3.getDouble("currentTime");
            Pattern pattern = o4e.a;
            long j2 = (long) (d2 * 1000.0d);
            if (j2 != this.g) {
                this.g = j2;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject3.has("supportedMediaCommands")) {
            long j3 = jSONObject3.getLong("supportedMediaCommands");
            if (j3 != this.h) {
                this.h = j3;
                i2 |= 2;
            }
        }
        if (jSONObject3.has("volume") && i == 0) {
            JSONObject jSONObject5 = jSONObject3.getJSONObject("volume");
            double d3 = jSONObject5.getDouble("level");
            if (d3 != this.i) {
                this.i = d3;
                i2 |= 2;
            }
            boolean z2 = jSONObject5.getBoolean("muted");
            if (z2 != this.t) {
                this.t = z2;
                i2 |= 2;
            }
        }
        JSONArray jSONArray2 = jSONObject3.has("activeTrackIds") ? jSONObject3.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = o4e.a;
        if (jSONArray2 == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray2.length()];
            for (int i14 = 0; i14 < jSONArray2.length(); i14++) {
                jArr[i14] = jSONArray2.getLong(i14);
            }
        }
        long[] jArr2 = this.X;
        if (jArr != null) {
            if (jArr2 == null) {
                this.X = jArr;
                i2 |= 2;
                break;
            }
            if (jArr2.length != jArr.length) {
                this.X = jArr;
                i2 |= 2;
                break;
            }
            for (int i15 = 0; i15 < jArr.length; i15++) {
                if (this.X[i15] != jArr[i15]) {
                    this.X = jArr;
                    i2 |= 2;
                    break;
                }
            }
        } else if (jArr2 != null) {
            this.X = jArr;
            i2 |= 2;
            break;
        }
        if (jSONObject3.has("customData")) {
            this.O0 = jSONObject3.getJSONObject("customData");
            this.N0 = null;
            i2 |= 2;
        }
        if (jSONObject3.has("media")) {
            JSONObject jSONObject6 = jSONObject3.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject6);
            MediaInfo mediaInfo4 = this.a;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.a = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject6.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject3.has("currentItemId") && this.c != (i9 = jSONObject3.getInt("currentItemId"))) {
            this.c = i9;
            i2 |= 2;
        }
        int iOptInt2 = jSONObject3.optInt("preloadedItemId", 0);
        if (this.Z != iOptInt2) {
            this.Z = iOptInt2;
            i2 |= 16;
        }
        int iOptInt3 = jSONObject3.optInt("loadingItemId", 0);
        int i16 = this.Y;
        if (i16 != iOptInt3) {
            this.Y = iOptInt3;
            i2 |= 2;
        } else {
            iOptInt3 = i16;
        }
        MediaInfo mediaInfo5 = this.a;
        int i17 = mediaInfo5 == null ? -1 : mediaInfo5.b;
        int i18 = this.e;
        int i19 = this.f;
        ArrayList arrayList7 = this.Q0;
        SparseArray sparseArray2 = this.X0;
        if (i18 != 1) {
            if (jSONObject3.has("repeatMode")) {
                numW = ijo1.w(jSONObject3.getString("repeatMode"));
                if (numW == null) {
                    iIntValue = this.P0;
                } else {
                    iIntValue = numW.intValue();
                }
                if (this.P0 != iIntValue) {
                    this.P0 = iIntValue;
                    zJ = true;
                } else {
                    zJ = false;
                }
            } else {
                zJ = false;
            }
            if (jSONObject3.has("items")) {
                jSONArray = jSONObject3.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                i12 = 1;
                i3 = 0;
                while (i3 < length) {
                    sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                    i3++;
                    i13 = i13;
                }
                i13 = i13;
                arrayList = new ArrayList();
                for (i4 = 0; i4 < length; i4++) {
                    num = (Integer) sparseArray.get(i4);
                    jSONObject2 = jSONArray.getJSONObject(i4);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        quh0Var = null;
                    } else {
                        quh0Var = (quh0) arrayList7.get(num2.intValue());
                    }
                    if (quh0Var != null) {
                        zJ |= quh0Var.j(jSONObject2);
                        arrayList.add(quh0Var);
                        if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                    } else if (num.intValue() == this.c) {
                        arrayList.add(new quh0(jSONObject2));
                    } else {
                        arrayList.add(new quh0(jSONObject2));
                    }
                    zJ = true;
                }
                if (arrayList7.size() != length) {
                    z = false;
                } else {
                    z = true;
                }
                zJ |= !z;
                F(arrayList);
            } else {
                i12 = 1;
                i13 = 2;
            }
            if (zJ) {
                i2 |= 8;
            }
        } else if (i19 != 1) {
            if (i19 != 2) {
                if (i19 == 3) {
                    if (iOptInt3 != 0) {
                        if (jSONObject3.has("repeatMode")) {
                            zJ = false;
                        } else {
                            numW = ijo1.w(jSONObject3.getString("repeatMode"));
                            if (numW == null) {
                                iIntValue = this.P0;
                            } else {
                                iIntValue = numW.intValue();
                            }
                            if (this.P0 != iIntValue) {
                                this.P0 = iIntValue;
                                zJ = true;
                            } else {
                                zJ = false;
                            }
                        }
                        if (jSONObject3.has("items")) {
                            jSONArray = jSONObject3.getJSONArray("items");
                            length = jSONArray.length();
                            sparseArray = new SparseArray();
                            i12 = 1;
                            i3 = 0;
                            while (i3 < length) {
                                sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                                i3++;
                                i13 = i13;
                            }
                            i13 = i13;
                            arrayList = new ArrayList();
                            while (i4 < length) {
                                num = (Integer) sparseArray.get(i4);
                                jSONObject2 = jSONArray.getJSONObject(i4);
                                num2 = (Integer) sparseArray2.get(num.intValue());
                                if (num2 == null) {
                                    quh0Var = null;
                                } else {
                                    quh0Var = (quh0) arrayList7.get(num2.intValue());
                                }
                                if (quh0Var != null) {
                                    zJ |= quh0Var.j(jSONObject2);
                                    arrayList.add(quh0Var);
                                    if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                                    }
                                } else if (num.intValue() == this.c) {
                                    arrayList.add(new quh0(jSONObject2));
                                } else {
                                    arrayList.add(new quh0(jSONObject2));
                                }
                                zJ = true;
                            }
                            if (arrayList7.size() != length) {
                                z = false;
                            } else {
                                z = true;
                            }
                            zJ |= !z;
                            F(arrayList);
                        } else {
                            i12 = 1;
                            i13 = 2;
                        }
                        if (zJ) {
                            i2 |= 8;
                        }
                    }
                }
                this.c = r4;
                this.Y = r4;
                this.Z = r4;
                if (!arrayList7.isEmpty()) {
                    i2 |= 8;
                    this.P0 = 0;
                    arrayList7.clear();
                    sparseArray2.clear();
                }
            } else if (i17 == 2) {
                if (jSONObject3.has("repeatMode")) {
                    zJ = false;
                } else {
                    numW = ijo1.w(jSONObject3.getString("repeatMode"));
                    if (numW == null) {
                        iIntValue = this.P0;
                    } else {
                        iIntValue = numW.intValue();
                    }
                    if (this.P0 != iIntValue) {
                        this.P0 = iIntValue;
                        zJ = true;
                    } else {
                        zJ = false;
                    }
                }
                if (jSONObject3.has("items")) {
                    jSONArray = jSONObject3.getJSONArray("items");
                    length = jSONArray.length();
                    sparseArray = new SparseArray();
                    i12 = 1;
                    i3 = 0;
                    while (i3 < length) {
                        sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                        i3++;
                        i13 = i13;
                    }
                    i13 = i13;
                    arrayList = new ArrayList();
                    while (i4 < length) {
                        num = (Integer) sparseArray.get(i4);
                        jSONObject2 = jSONArray.getJSONObject(i4);
                        num2 = (Integer) sparseArray2.get(num.intValue());
                        if (num2 == null) {
                            quh0Var = null;
                        } else {
                            quh0Var = (quh0) arrayList7.get(num2.intValue());
                        }
                        if (quh0Var != null) {
                            zJ |= quh0Var.j(jSONObject2);
                            arrayList.add(quh0Var);
                            if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                            }
                        } else if (num.intValue() == this.c) {
                            arrayList.add(new quh0(jSONObject2));
                        } else {
                            arrayList.add(new quh0(jSONObject2));
                        }
                        zJ = true;
                    }
                    if (arrayList7.size() != length) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zJ |= !z;
                    F(arrayList);
                } else {
                    i12 = 1;
                    i13 = 2;
                }
                if (zJ) {
                    i2 |= 8;
                }
            }
            this.c = r4;
            this.Y = r4;
            this.Z = r4;
            if (!arrayList7.isEmpty()) {
                i2 |= 8;
                this.P0 = 0;
                arrayList7.clear();
                sparseArray2.clear();
            }
        } else if (iOptInt3 != 0) {
            if (jSONObject3.has("repeatMode")) {
                zJ = false;
            } else {
                numW = ijo1.w(jSONObject3.getString("repeatMode"));
                if (numW == null) {
                    iIntValue = this.P0;
                } else {
                    iIntValue = numW.intValue();
                }
                if (this.P0 != iIntValue) {
                    this.P0 = iIntValue;
                    zJ = true;
                } else {
                    zJ = false;
                }
            }
            if (jSONObject3.has("items")) {
                jSONArray = jSONObject3.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                i12 = 1;
                i3 = 0;
                while (i3 < length) {
                    sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                    i3++;
                    i13 = i13;
                }
                i13 = i13;
                arrayList = new ArrayList();
                while (i4 < length) {
                    num = (Integer) sparseArray.get(i4);
                    jSONObject2 = jSONArray.getJSONObject(i4);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        quh0Var = null;
                    } else {
                        quh0Var = (quh0) arrayList7.get(num2.intValue());
                    }
                    if (quh0Var != null) {
                        zJ |= quh0Var.j(jSONObject2);
                        arrayList.add(quh0Var);
                        if (i4 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                    } else if (num.intValue() == this.c || (mediaInfo = this.a) == null) {
                        arrayList.add(new quh0(jSONObject2));
                    } else {
                        quh0 quh0VarB = new ruc0(mediaInfo).b();
                        quh0VarB.j(jSONObject2);
                        arrayList.add(quh0VarB);
                    }
                    zJ = true;
                }
                if (arrayList7.size() != length) {
                    z = false;
                } else {
                    z = true;
                }
                zJ |= !z;
                F(arrayList);
            } else {
                i12 = 1;
                i13 = 2;
            }
            if (zJ) {
                i2 |= 8;
            }
        } else {
            this.c = r4;
            this.Y = r4;
            this.Z = r4;
            if (!arrayList7.isEmpty()) {
                i2 |= 8;
                this.P0 = 0;
                arrayList7.clear();
                sparseArray2.clear();
            }
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("breakStatus");
        Parcelable.Creator<pi0> creator = pi0.CREATOR;
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("currentBreakTime") && jSONObjectOptJSONObject4.has("currentBreakClipTime")) {
            try {
                long j4 = jSONObjectOptJSONObject4.getLong("currentBreakTime");
                Pattern pattern3 = o4e.a;
                long j5 = j4 * 1000;
                long j6 = jSONObjectOptJSONObject4.getLong("currentBreakClipTime") * 1000;
                String strA3 = o4e.a("breakId", jSONObjectOptJSONObject4);
                String strA4 = o4e.a("breakClipId", jSONObjectOptJSONObject4);
                long jOptLong = jSONObjectOptJSONObject4.optLong("whenSkippable", -1L);
                if (jOptLong != -1) {
                    jOptLong *= 1000;
                }
                pi0Var = new pi0(j5, j6, jOptLong, strA3, strA4);
            } catch (JSONException unused2) {
                pi0.f.c("Error while creating an AdBreakClipInfo from JSON", new Object[0]);
                pi0Var = null;
            }
        } else {
            pi0Var = null;
        }
        pi0 pi0Var2 = this.S0;
        if ((pi0Var2 == null && pi0Var != null) || (pi0Var2 != null && !pi0Var2.equals(pi0Var))) {
            this.R0 = (pi0Var == null || (pi0Var.c == null && pi0Var.d == null)) ? 0 : i12;
            this.S0 = pi0Var;
            i2 |= 32;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject3.optJSONObject("videoInfo");
        pue0 pue0Var = opj1.d;
        if (jSONObjectOptJSONObject5 == null) {
            opj1Var = null;
        } else {
            try {
                String string3 = jSONObjectOptJSONObject5.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode != 3218) {
                    if (iHashCode != 103158) {
                        if (iHashCode != 113729) {
                            if (iHashCode == 99136405 && string3.equals("hdr10")) {
                                i5 = i13;
                            } else {
                                pue0Var.a("Unknown HDR type: %s", new Object[]{string3});
                                i5 = 0;
                            }
                        } else if (string3.equals("sdr")) {
                            i5 = i12;
                        } else {
                            pue0Var.a("Unknown HDR type: %s", new Object[]{string3});
                            i5 = 0;
                        }
                    } else if (string3.equals("hdr")) {
                        i5 = 4;
                    } else {
                        pue0Var.a("Unknown HDR type: %s", new Object[]{string3});
                        i5 = 0;
                    }
                } else if (string3.equals("dv")) {
                    i5 = 3;
                } else {
                    pue0Var.a("Unknown HDR type: %s", new Object[]{string3});
                    i5 = 0;
                }
                opj1Var = new opj1(jSONObjectOptJSONObject5.getInt("width"), jSONObjectOptJSONObject5.getInt("height"), i5);
            } catch (JSONException unused3) {
                pue0Var.b("Error while creating a VideoInfo instance from JSON", new Object[0]);
                opj1Var = null;
            }
        }
        opj1 opj1Var2 = this.T0;
        if ((opj1Var2 == null && opj1Var != null) || (opj1Var2 != null && !opj1Var2.equals(opj1Var))) {
            this.T0 = opj1Var;
            i2 |= 64;
        }
        if (jSONObject3.has("breakInfo") && (mediaInfo2 = this.a) != null) {
            mediaInfo2.j(jSONObject3.getJSONObject("breakInfo"));
            i2 |= 2;
        }
        if (jSONObject3.has("queueData")) {
            JSONObject jSONObject7 = jSONObject3.getJSONObject("queueData");
            if (jSONObject7 == null) {
                i2 = i2;
                jOptDouble = -1;
                ouh0Var = null;
                zOptBoolean = false;
                iIntValue2 = 0;
                iOptInt = 0;
                str2 = null;
                arrayList3 = null;
                i7 = 0;
                strA2 = null;
                strA = null;
            } else {
                String strA5 = o4e.a("id", jSONObject7);
                strA = o4e.a("entity", jSONObject7);
                switch (jSONObject7.optString("queueType")) {
                    case "PODCAST_SERIES":
                        i7 = 5;
                        break;
                    case "RADIO_STATION":
                        i7 = 4;
                        break;
                    case "PLAYLIST":
                        i7 = i13;
                        break;
                    case "AUDIOBOOK":
                        i7 = 3;
                        break;
                    case "TV_SERIES":
                        i7 = 6;
                        break;
                    case "ALBUM":
                        i7 = i12;
                        break;
                    case "MOVIE":
                        i7 = 9;
                        break;
                    case "VIDEO_PLAYLIST":
                        i7 = 7;
                        break;
                    case "LIVE_TV":
                        i7 = 8;
                        break;
                    default:
                        i7 = 0;
                        break;
                }
                strA2 = o4e.a("name", jSONObject7);
                JSONObject jSONObjectOptJSONObject6 = jSONObject7.has("containerMetadata") ? jSONObject7.optJSONObject("containerMetadata") : null;
                if (jSONObjectOptJSONObject6 != null) {
                    String strOptString = jSONObjectOptJSONObject6.optString("containerType", "");
                    int iHashCode2 = strOptString.hashCode();
                    if (iHashCode2 == 6924225) {
                        int i20 = strOptString.equals("AUDIOBOOK_CONTAINER") ? i12 : 0;
                        String strA6 = o4e.a("title", jSONObjectOptJSONObject6);
                        jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("sections");
                        if (jSONArrayOptJSONArray != null) {
                            arrayList4 = new ArrayList();
                            i8 = 0;
                            while (i8 < jSONArrayOptJSONArray.length()) {
                                jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i8);
                                int i21 = i8;
                                if (jSONObjectOptJSONObject2 != null) {
                                    sqh0 sqh0Var = new sqh0(0);
                                    sqh0Var.F(jSONObjectOptJSONObject2);
                                    arrayList4.add(sqh0Var);
                                }
                                i8 = i21 + 1;
                                strA5 = strA5;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        str = strA5;
                        jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("containerImages");
                        if (jSONArrayOptJSONArray2 != null) {
                            arrayList5 = new ArrayList();
                            gbn1.a(arrayList5, jSONArrayOptJSONArray2);
                        } else {
                            arrayList5 = null;
                        }
                        double dOptDouble = jSONObjectOptJSONObject6.optDouble("containerDuration", 0.0d);
                        ouh0Var = new ouh0();
                        ouh0Var.a = i20;
                        ouh0Var.b = strA6;
                        ouh0Var.c = arrayList4;
                        ouh0Var.d = arrayList5;
                        ouh0Var.e = dOptDouble;
                    } else if (iHashCode2 == 828666841) {
                        strOptString.equals("GENERIC_CONTAINER");
                    }
                    String strA7 = o4e.a("title", jSONObjectOptJSONObject6);
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("sections");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList4 = new ArrayList();
                        i8 = 0;
                        while (i8 < jSONArrayOptJSONArray.length()) {
                            jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i8);
                            int i22 = i8;
                            if (jSONObjectOptJSONObject2 != null) {
                                sqh0 sqh0Var2 = new sqh0(0);
                                sqh0Var2.F(jSONObjectOptJSONObject2);
                                arrayList4.add(sqh0Var2);
                            }
                            i8 = i22 + 1;
                            strA5 = strA5;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    str = strA5;
                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray2 != null) {
                        arrayList5 = new ArrayList();
                        gbn1.a(arrayList5, jSONArrayOptJSONArray2);
                    } else {
                        arrayList5 = null;
                    }
                    double dOptDouble2 = jSONObjectOptJSONObject6.optDouble("containerDuration", 0.0d);
                    ouh0Var = new ouh0();
                    ouh0Var.a = i20;
                    ouh0Var.b = strA7;
                    ouh0Var.c = arrayList4;
                    ouh0Var.d = arrayList5;
                    ouh0Var.e = dOptDouble2;
                } else {
                    i2 = i2;
                    str = strA5;
                    ouh0Var = null;
                }
                Integer numW2 = ijo1.w(jSONObject7.optString("repeatMode"));
                iIntValue2 = numW2 != null ? numW2.intValue() : 0;
                JSONArray jSONArrayOptJSONArray3 = jSONObject7.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    arrayList2 = new ArrayList();
                    for (int i23 = 0; i23 < jSONArrayOptJSONArray3.length(); i23++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray3.optJSONObject(i23);
                        if (jSONObjectOptJSONObject7 != null) {
                            try {
                                arrayList2.add(new quh0(jSONObjectOptJSONObject7));
                            } catch (JSONException unused4) {
                            }
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                iOptInt = jSONObject7.optInt("startIndex", 0);
                jOptDouble = jSONObject7.has("startTime") ? (long) (jSONObject7.optDouble("startTime", -1L) * 1000.0d) : -1L;
                zOptBoolean = jSONObject7.optBoolean("shuffle");
                arrayList3 = arrayList2;
                str2 = str;
            }
            puh0 puh0Var = new puh0();
            puh0Var.a = str2;
            puh0Var.b = strA;
            puh0Var.c = i7;
            puh0Var.d = strA2;
            puh0Var.e = ouh0Var;
            puh0Var.f = iIntValue2;
            puh0Var.g = arrayList3;
            puh0Var.h = iOptInt;
            puh0Var.i = jOptDouble;
            puh0Var.t = zOptBoolean;
            this.V0 = puh0Var;
            if (this.W0 != zOptBoolean) {
                this.W0 = zOptBoolean;
                i6 = i2 | 8;
            }
            if (jSONObject3.has("liveSeekableRange")) {
                i6 |= 2;
                jSONObjectOptJSONObject = jSONObject3.optJSONObject("liveSeekableRange");
                Parcelable.Creator<pqh0> creator2 = pqh0.CREATOR;
                if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject.has("start") && jSONObjectOptJSONObject.has("end")) {
                    try {
                        double d4 = jSONObjectOptJSONObject.getDouble("start");
                        Pattern pattern4 = o4e.a;
                        pqh0Var = new pqh0((long) (d4 * 1000.0d), (long) (jSONObjectOptJSONObject.getDouble("end") * 1000.0d), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                    } catch (JSONException unused5) {
                        pqh0.e.c("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject.toString()), new Object[0]);
                        pqh0Var = null;
                    }
                } else {
                    pqh0Var = null;
                }
                this.U0 = pqh0Var;
            } else {
                if (this.U0 != null) {
                    i6 |= 2;
                }
                this.U0 = null;
            }
            return i6;
        }
        i2 = i2;
        i6 = i2;
        if (jSONObject3.has("liveSeekableRange")) {
            i6 |= 2;
            jSONObjectOptJSONObject = jSONObject3.optJSONObject("liveSeekableRange");
            Parcelable.Creator<pqh0> creator3 = pqh0.CREATOR;
            if (jSONObjectOptJSONObject == null) {
                pqh0Var = null;
            } else {
                double d5 = jSONObjectOptJSONObject.getDouble("start");
                Pattern pattern5 = o4e.a;
                pqh0Var = new pqh0((long) (d5 * 1000.0d), (long) (jSONObjectOptJSONObject.getDouble("end") * 1000.0d), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
            }
            this.U0 = pqh0Var;
        } else {
            if (this.U0 != null) {
                i6 |= 2;
            }
            this.U0 = null;
        }
        return i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.O0;
        this.N0 = jSONObject == null ? null : jSONObject.toString();
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        long j = this.b;
        j541.K(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        j541.K(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        j541.K(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        j541.K(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.g;
        j541.K(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.h;
        j541.K(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.i;
        j541.K(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.t;
        j541.K(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        j541.D(parcel, 12, this.X);
        int i5 = this.Y;
        j541.K(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.Z;
        j541.K(parcel, 14, 4);
        parcel.writeInt(i6);
        j541.F(parcel, 15, this.N0);
        int i7 = this.P0;
        j541.K(parcel, 16, 4);
        parcel.writeInt(i7);
        j541.J(parcel, 17, this.Q0);
        boolean z2 = this.R0;
        j541.K(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        j541.E(parcel, 19, this.S0, i);
        j541.E(parcel, 20, this.T0, i);
        j541.E(parcel, 21, this.U0, i);
        j541.E(parcel, 22, this.V0, i);
        j541.M(iL, parcel);
    }
}
