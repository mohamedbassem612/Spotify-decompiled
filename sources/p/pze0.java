package p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class pze0 {
    public static final String a(int i) {
        return b(i);
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "facebook";
        }
        if (i == 2) {
            return "instagram";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "audio";
        }
        if (i == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "file";
        }
        if (i == 2) {
            return "application/x-mpegURL";
        }
        if (i == 3) {
            return "offline";
        }
        if (i == 4) {
            return "spotifyaudio";
        }
        if (i == 5) {
            return "spotifyadaptive";
        }
        throw null;
    }

    public static int e(int i, int i2, Integer num) {
        return (num.hashCode() + i) * i2;
    }

    public static int f(ez61 ez61Var, int i, int i2) {
        return (ez61Var.hashCode() + i) * i2;
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String h(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String i(String str, Object obj, Object obj2) {
        return obj + str + obj2;
    }

    public static /* synthetic */ Iterator j() {
        try {
            return Arrays.asList(new ud4()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ List k(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(MediaMetadataRetriever mediaMetadataRetriever) throws Exception {
        boolean zIsTerminated;
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
            return;
        }
        if (!(mediaMetadataRetriever instanceof ExecutorService)) {
            mediaMetadataRetriever.release();
            return;
        }
        ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void m(Object obj) {
        if (obj == null) {
            return;
        }
        bhn0.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(Stream stream) throws Exception {
        boolean zIsTerminated;
        if (stream instanceof AutoCloseable) {
            stream.close();
            return;
        }
        if (!(stream instanceof ExecutorService)) {
            if (stream instanceof TypedArray) {
                ((TypedArray) stream).recycle();
                return;
            }
            if (stream instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) stream).release();
                return;
            } else if (stream instanceof MediaDrm) {
                ((MediaDrm) stream).release();
                return;
            } else {
                bhn0.q();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) stream;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ALL";
        }
        throw null;
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "ACCESS_POINT";
        }
        if (i == 2) {
            return "LOGIN5";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "UNSYNCED";
        }
        if (i == 2) {
            return "LINE_SYNCED";
        }
        if (i == 3) {
            return "SYLLABLE_SYNCED";
        }
        throw null;
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "LEFT";
        }
        if (i == 2) {
            return "CENTER";
        }
        if (i == 3) {
            return "RIGHT";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "None";
        }
        if (i == 2) {
            return "WithTranslation";
        }
        if (i == 3) {
            return "TranslationOnly";
        }
        throw null;
    }

    public static /* synthetic */ int t(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("UNSYNCED")) {
            return 1;
        }
        if (str.equals("LINE_SYNCED")) {
            return 2;
        }
        if (str.equals("SYLLABLE_SYNCED")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.lyrics.data.model.Lyrics.SyncStatus.".concat(str));
        return 0;
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("LEFT")) {
            return 1;
        }
        if (str.equals("CENTER")) {
            return 2;
        }
        if (str.equals("RIGHT")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.lyrics.share.LyricsAlignment.".concat(str));
        return 0;
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("None")) {
            return 1;
        }
        if (str.equals("WithTranslation")) {
            return 2;
        }
        if (str.equals("TranslationOnly")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.lyrics.textelement.data.LyricsTextElementProps.DisplaySettings.TranslationDisplay.".concat(str));
        return 0;
    }
}
