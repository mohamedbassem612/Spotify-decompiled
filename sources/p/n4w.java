package p;

import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaItemInfo;
import android.os.SystemClock;
import android.util.Size;
import android.util.SparseIntArray;
import androidx.media3.transformer.ExportException;
import com.comscore.streaming.ContentMediaFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n4w {
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    public static final SparseIntArray h;
    public static final SparseIntArray i;
    public final long a = SystemClock.elapsedRealtime();
    public final boolean b;
    public final boolean c;
    public final String d;
    public final m4w e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        g = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        h = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        i = sparseIntArray4;
        sparseIntArray.put(1000, 1);
        sparseIntArray.put(ContentMediaFormat.FULL_CONTENT_GENERIC, 2);
        sparseIntArray.put(2000, 3);
        sparseIntArray.put(2001, 4);
        sparseIntArray.put(2002, 5);
        sparseIntArray.put(2003, 3);
        sparseIntArray.put(2004, 6);
        sparseIntArray.put(2005, 7);
        sparseIntArray.put(2006, 8);
        sparseIntArray.put(2007, 9);
        sparseIntArray.put(2008, 10);
        sparseIntArray.put(3001, 11);
        sparseIntArray.put(3002, 12);
        sparseIntArray.put(3003, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(5001, 17);
        sparseIntArray.put(6001, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, 131072);
        sparseIntArray2.put(1, 65536);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, 268435456);
        sparseIntArray3.put(1, 134217728);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, 8388608);
        sparseIntArray4.put(10, 16777216);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, 33554432);
    }

    public n4w(m4w m4wVar, String str, boolean z, boolean z2) {
        this.e = m4wVar;
        this.d = str;
        this.b = z;
        this.c = z2;
    }

    public static long b(String str) {
        long j = asj0.k(str) ? 4L : 0L;
        if (asj0.o(str)) {
            j |= 2;
        }
        return asj0.m(str) ? j | 1 : j;
    }

    public static ArrayList c(b380 b380Var) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b380Var.size(); i2++) {
            ct00 ct00Var = (ct00) b380Var.get(i2);
            MediaItemInfo.Builder builderA = l4w.a();
            builderA.setClipDurationMillis(zoi1.n0(ct00Var.a));
            String str = ct00Var.e;
            if (str != null) {
                builderA.addCodecName(str);
            }
            String str2 = ct00Var.d;
            if (str2 != null) {
                builderA.addCodecName(str2);
            }
            ie30 ie30Var = ct00Var.c;
            if (ie30Var != null) {
                String str3 = ie30Var.f66p;
                String str4 = ie30Var.o;
                if (str4 != null) {
                    builderA.setContainerMimeType(str4);
                }
                if (str3 != null) {
                    builderA.addSampleMimeType(str3);
                    builderA.addDataType(b(str3));
                }
                float f2 = ie30Var.B;
                if (f2 != -1.0f) {
                    builderA.setVideoFrameRate(f2);
                }
                int i3 = ie30Var.w;
                if (i3 == -1) {
                    i3 = -1;
                }
                int i4 = ie30Var.x;
                if (i4 == -1) {
                    i4 = -1;
                }
                builderA.setVideoSize(new Size(i3, i4));
                x8h x8hVar = ie30Var.H;
                if (x8hVar != null) {
                    builderA.setVideoDataSpace(DataSpace.pack(g.get(x8hVar.a, 0), i.get(x8hVar.c, 0), h.get(x8hVar.b, 0)));
                }
            }
            ie30 ie30Var2 = ct00Var.b;
            if (ie30Var2 != null) {
                String str5 = ie30Var2.f66p;
                if (str5 != null) {
                    builderA.addSampleMimeType(str5);
                    builderA.addDataType(b(str5));
                }
                int i5 = ie30Var2.J;
                if (i5 != -1) {
                    builderA.setAudioChannelCount(i5);
                }
                int i6 = ie30Var2.L;
                if (i6 != -1) {
                    builderA.setAudioSampleRateHz(i6);
                }
            }
            arrayList.add(builderA.build());
        }
        return arrayList;
    }

    public static MediaItemInfo d(dt00 dt00Var) {
        MediaItemInfo.Builder builderA = l4w.a();
        long j = dt00Var.a;
        String str = dt00Var.n;
        String str2 = dt00Var.g;
        if (j != -9223372036854775807L) {
            builderA.setDurationMillis(j);
        }
        if (str2 != null) {
            builderA.addSampleMimeType(str2);
            builderA.addDataType(b(str2));
        }
        if (str != null) {
            builderA.addSampleMimeType(str);
            builderA.addDataType(b(str));
        }
        int i2 = dt00Var.d;
        if (i2 != -1) {
            builderA.setAudioChannelCount(i2);
        }
        int i3 = dt00Var.e;
        if (i3 != -2147483647) {
            builderA.setAudioSampleRateHz(i3);
        }
        String str3 = dt00Var.f;
        if (str3 != null) {
            builderA.addCodecName(str3);
        }
        String str4 = dt00Var.m;
        if (str4 != null) {
            builderA.addCodecName(str4);
        }
        builderA.setVideoSampleCount(dt00Var.l);
        int i4 = dt00Var.k;
        if (i4 == -1) {
            i4 = -1;
        }
        int i5 = dt00Var.j;
        builderA.setVideoSize(new Size(i4, i5 != -1 ? i5 : -1));
        x8h x8hVar = dt00Var.i;
        if (x8hVar != null) {
            builderA.setVideoDataSpace(DataSpace.pack(g.get(x8hVar.a, 0), i.get(x8hVar.c, 0), h.get(x8hVar.b, 0)));
        }
        return builderA.build();
    }

    public final EditingEndedEvent.Builder a(int i2) {
        EditingEndedEvent.Builder exporterName = new EditingEndedEvent.Builder(i2).setTimeSinceCreatedMillis(SystemClock.elapsedRealtime() - this.a).setExporterName("androidx.media3:media3-transformer:1.11.0");
        String str = this.d;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public final void e(int i2) {
        EditingSession editingSession;
        EditingEndedEvent.Builder builderA = a(2);
        if (i2 != -1) {
            builderA.setFinalProgressPercent(i2);
        }
        if (this.b) {
            builderA.addOperationType(8L);
        }
        if (this.c) {
            builderA.addOperationType(4L);
        }
        EditingEndedEvent editingEndedEventBuild = builderA.build();
        m4w m4wVar = this.e;
        if (!m4wVar.b && (editingSession = m4wVar.a) != null) {
            editingSession.reportEditingEndedEvent(editingEndedEventBuild);
            m4wVar.b = true;
        }
        try {
            hrt.n(m4wVar);
        } catch (Exception e) {
            oon1.w("error while closing the metrics reporter", e);
        }
    }

    public final void f(int i2, ExportException exportException, dt00 dt00Var) {
        EditingSession editingSession;
        EditingEndedEvent.Builder errorCode = a(3).setErrorCode(f.get(exportException.a, 1));
        if (i2 != -1) {
            errorCode.setFinalProgressPercent(i2);
        }
        h(errorCode, dt00Var);
        ArrayList arrayListC = c(dt00Var.q);
        for (int i3 = 0; i3 < arrayListC.size(); i3++) {
            errorCode.addInputMediaItemInfo((MediaItemInfo) arrayListC.get(i3));
        }
        errorCode.setOutputMediaItemInfo(d(dt00Var));
        EditingEndedEvent editingEndedEventBuild = errorCode.build();
        m4w m4wVar = this.e;
        if (!m4wVar.b && (editingSession = m4wVar.a) != null) {
            editingSession.reportEditingEndedEvent(editingEndedEventBuild);
            m4wVar.b = true;
        }
        try {
            hrt.n(m4wVar);
        } catch (Exception e) {
            oon1.w("error while closing the metrics reporter", e);
        }
    }

    public final void g(dt00 dt00Var) {
        EditingSession editingSession;
        EditingEndedEvent.Builder finalProgressPercent = a(1).setFinalProgressPercent(100.0f);
        h(finalProgressPercent, dt00Var);
        ArrayList arrayListC = c(dt00Var.q);
        for (int i2 = 0; i2 < arrayListC.size(); i2++) {
            finalProgressPercent.addInputMediaItemInfo((MediaItemInfo) arrayListC.get(i2));
        }
        finalProgressPercent.setOutputMediaItemInfo(d(dt00Var));
        EditingEndedEvent editingEndedEventBuild = finalProgressPercent.build();
        m4w m4wVar = this.e;
        if (!m4wVar.b && (editingSession = m4wVar.a) != null) {
            editingSession.reportEditingEndedEvent(editingEndedEventBuild);
            m4wVar.b = true;
        }
        try {
            hrt.n(m4wVar);
        } catch (Exception e) {
            oon1.w("error while closing the metrics reporter", e);
        }
    }

    public final void h(EditingEndedEvent.Builder builder, dt00 dt00Var) {
        b380 b380Var = dt00Var.q;
        Iterator it = b380Var.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else {
                if (((ct00) it.next()).b != null) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        boolean z = i2 != -1;
        Iterator it2 = b380Var.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            } else {
                if (((ct00) it2.next()).c != null) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean z2 = i3 != -1;
        if (z) {
            if (dt00Var.f != null) {
                builder.addOperationType(2L);
            } else {
                builder.addOperationType(32L);
            }
        }
        if (z2) {
            if (dt00Var.m != null) {
                builder.addOperationType(1L);
            } else {
                builder.addOperationType(16L);
            }
        }
        if (this.b) {
            builder.addOperationType(8L);
        }
        if (this.c) {
            builder.addOperationType(4L);
        }
    }
}
