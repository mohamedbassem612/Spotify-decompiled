package p;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class miv {
    public static final HashMap a;
    public static final HashMap b;

    static {
        liv livVar;
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        liv livVar2 = liv.d;
        map.put(1L, livVar2);
        map2.put(livVar2, Collections.singletonList(1L));
        map.put(2L, liv.e);
        map2.put((liv) map.get(2L), Collections.singletonList(2L));
        liv livVar3 = liv.f;
        map.put(4L, livVar3);
        map2.put(livVar3, Collections.singletonList(4L));
        liv livVar4 = liv.g;
        map.put(8L, livVar4);
        map2.put(livVar4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            livVar = liv.h;
            if (!zHasNext) {
                break;
            }
            a.put((Long) it.next(), livVar);
        }
        b.put(livVar, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            liv livVar5 = liv.i;
            if (!zHasNext2) {
                b.put(livVar5, listAsList2);
                return;
            } else {
                a.put((Long) it2.next(), livVar5);
            }
        }
    }

    public static Long a(liv livVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(livVar);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
