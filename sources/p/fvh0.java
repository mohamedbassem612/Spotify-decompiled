package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.comscore.streaming.ContentMediaFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fvh0 extends MediaRoute2ProviderService {
    public static final /* synthetic */ int e = 0;
    public final uvh0 b;
    public volatile jqd0 d;
    public final Object a = new Object();
    public final y36 c = new y36(0);

    static {
        Log.isLoggable("AxMR2ProvdrSrvcAdapter", 3);
    }

    public fvh0(uvh0 uvh0Var) {
        this.b = uvh0Var;
    }

    public static void a(String str, String str2, Set set, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((String) it.next())) {
                Locale locale = Locale.ROOT;
            }
        }
    }

    public static void b(Set set, RoutingSessionInfo routingSessionInfo) {
        String id = routingSessionInfo.getId();
        a(id, "selected", set, routingSessionInfo.getSelectedRoutes());
        a(id, "selectable", set, routingSessionInfo.getSelectableRoutes());
        a(id, "deselectable", set, routingSessionInfo.getDeselectableRoutes());
        a(id, "transferable", set, routingSessionInfo.getTransferableRoutes());
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final nvh0 c(String str) {
        ArrayList<evh0> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.c.values());
        }
        for (evh0 evh0Var : arrayList) {
            tvh0 tvh0Var = (tvh0) evh0Var.e.get();
            nvh0 nvh0Var = tvh0Var != null ? (nvh0) tvh0Var.i.get(str) : (nvh0) evh0Var.a.get(str);
            if (nvh0Var != null) {
                return nvh0Var;
            }
        }
        return null;
    }

    public final mvh0 d(String str) {
        mvh0 mvh0Var;
        synchronized (this.a) {
            evh0 evh0Var = (evh0) this.c.get(str);
            mvh0Var = evh0Var == null ? null : evh0Var.b;
        }
        return mvh0Var;
    }

    public final gvh0 e(String str) {
        zvh0 zvh0Var = (zvh0) ((mv2) this.b).c;
        if ((zvh0Var == null ? null : zvh0Var.d) != null && this.d != null) {
            for (gvh0 gvh0Var : (List) this.d.d) {
                if (TextUtils.equals(gvh0Var.g(), str)) {
                    return gvh0Var;
                }
            }
        }
        return null;
    }

    public final void f(Messenger messenger, int i, String str, Intent intent) {
        if (getSessionInfo(str) == null) {
            return;
        }
        mvh0 mvh0VarD = d(str);
        if (mvh0VarD == null) {
            notifyRequestFailed(i, 3);
        } else {
            mvh0VarD.d(intent, new cvh0(messenger, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0276  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e0  */
    public final void g(jqd0 jqd0Var) {
        ArrayList arrayList;
        MediaRoute2Info mediaRoute2Info;
        MediaRoute2Info mediaRoute2InfoBuild;
        Bundle bundle;
        this.d = jqd0Var;
        List<gvh0> list = jqd0Var == null ? Collections.EMPTY_LIST : (List) jqd0Var.d;
        y36 y36Var = new y36(0);
        for (gvh0 gvh0Var : list) {
            if (gvh0Var != null) {
                gvh0 gvh0Var2 = (gvh0) y36Var.get(gvh0Var.g());
                if (gvh0Var2 != null && Math.max(gvh0Var.i(), gvh0Var2.i()) <= Math.min(gvh0Var.h(), gvh0Var2.h())) {
                    Locale locale = Locale.ROOT;
                    gvh0Var2.g();
                    gvh0Var2.i();
                    gvh0Var2.h();
                    gvh0Var.i();
                    gvh0Var.h();
                }
                if (gvh0Var2 == null || gvh0Var.h() >= gvh0Var2.h()) {
                    y36Var.put(gvh0Var.g(), gvh0Var);
                }
            }
        }
        Set setKeySet = y36Var.keySet();
        synchronized (this.a) {
            arrayList = new ArrayList(this.c.values());
        }
        Iterator it = arrayList.iterator();
        while (true) {
            mediaRoute2Info = null;
            if (!it.hasNext()) {
                break;
            }
            evh0 evh0Var = (evh0) it.next();
            RoutingSessionInfo routingSessionInfo = evh0Var.h;
            if ((4 & evh0Var.d) == 0) {
                dvh0 dvh0Var = (dvh0) evh0Var.b;
                if (y36Var.containsKey(dvh0Var.f)) {
                    evh0Var.b((gvh0) y36Var.get(dvh0Var.f), null);
                } else {
                    Locale locale2 = Locale.ROOT;
                    if (routingSessionInfo != null) {
                        routingSessionInfo.getId();
                    }
                }
            } else if (routingSessionInfo != null) {
                b(setKeySet, routingSessionInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = y36Var.values().iterator();
        while (true) {
            t980 t980Var = (t980) it2;
            if (!t980Var.hasNext()) {
                notifyRoutes(arrayList2);
                return;
            }
            gvh0 gvh0Var3 = (gvh0) t980Var.next();
            if (gvh0Var3 == null) {
                mediaRoute2InfoBuild = mediaRoute2Info;
            } else if (TextUtils.isEmpty(gvh0Var3.g()) || TextUtils.isEmpty(gvh0Var3.j())) {
                mediaRoute2InfoBuild = null;
            } else {
                MediaRoute2Info.Builder volumeMax = new MediaRoute2Info.Builder(gvh0Var3.g(), gvh0Var3.j()).setDescription(gvh0Var3.a.getString("status")).setConnectionState(gvh0Var3.a.getInt("connectionState", 0)).setVolumeHandling(gvh0Var3.l()).setVolume(gvh0Var3.k()).setVolumeMax(gvh0Var3.m());
                ArrayList arrayListB = gvh0Var3.b();
                HashSet hashSet = new HashSet();
                Iterator it3 = arrayListB.iterator();
                while (true) {
                    int i = 3;
                    if (it3.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) it3.next();
                        int iCountCategories = intentFilter.countCategories();
                        for (int i2 = 0; i2 < iCountCategories; i2++) {
                            String category = intentFilter.getCategory(i2);
                            category.getClass();
                            switch (category) {
                                case "android.media.intent.category.REMOTE_PLAYBACK":
                                    category = "android.media.route.feature.REMOTE_PLAYBACK";
                                    break;
                                case "android.media.intent.category.LIVE_AUDIO":
                                    category = "android.media.route.feature.LIVE_AUDIO";
                                    break;
                                case "android.media.intent.category.LIVE_VIDEO":
                                    category = "android.media.route.feature.LIVE_VIDEO";
                                    break;
                                case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                                    category = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                                    break;
                                case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                                    category = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                                    break;
                            }
                            hashSet.add(category);
                        }
                    } else {
                        MediaRoute2Info.Builder iconUri = volumeMax.addFeatures(hashSet).setIconUri(gvh0Var3.f());
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 34) {
                            ArrayList<String> stringArrayList = gvh0Var3.a.getStringArrayList("deduplicationIds");
                            sf.K(iconUri, stringArrayList != null ? Collections.unmodifiableSet(new HashSet(stringArrayList)) : Collections.EMPTY_SET);
                            sf.e(iconUri, gvh0Var3);
                            int iC = gvh0Var3.c();
                            if (iC != 1000) {
                                switch (iC) {
                                    case 1:
                                        i = ContentMediaFormat.FULL_CONTENT_GENERIC;
                                        break;
                                    case 2:
                                        i = ContentMediaFormat.FULL_CONTENT_EPISODE;
                                        break;
                                    case 3:
                                        i = 8;
                                        break;
                                    case 4:
                                        i = ContentMediaFormat.FULL_CONTENT_MOVIE;
                                        break;
                                    case 5:
                                        i = ContentMediaFormat.PARTIAL_CONTENT_GENERIC;
                                        break;
                                    case 6:
                                        i = ContentMediaFormat.PARTIAL_CONTENT_EPISODE;
                                        break;
                                    case 7:
                                        i = ContentMediaFormat.PARTIAL_CONTENT_MOVIE;
                                        break;
                                    case 8:
                                        i = ContentMediaFormat.PREVIEW_GENERIC;
                                        break;
                                    case 9:
                                        i = ContentMediaFormat.PREVIEW_EPISODE;
                                        break;
                                    case 10:
                                        i = ContentMediaFormat.PREVIEW_MOVIE;
                                        break;
                                    case 11:
                                        i = ContentMediaFormat.EXTRA_GENERIC;
                                        break;
                                    case 12:
                                        i = 2;
                                        break;
                                    case 13:
                                        break;
                                    case 14:
                                        i = 4;
                                        break;
                                    default:
                                        switch (iC) {
                                            case 16:
                                                i = 9;
                                                break;
                                            case 17:
                                                i = 11;
                                                break;
                                            case 18:
                                                i = 12;
                                                break;
                                            case 19:
                                                i = 13;
                                                break;
                                            case 20:
                                                i = 22;
                                                break;
                                            case 21:
                                                i = 23;
                                                break;
                                            case 22:
                                                i = 26;
                                                break;
                                            case 23:
                                                i = 10;
                                                break;
                                            case 24:
                                                i = 29;
                                                break;
                                            default:
                                                i = 0;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                i = 2000;
                            }
                            sf.L(iconUri, i);
                        }
                        if (i3 >= 36 && ibc.a() >= 3600001) {
                            ig.b(iconUri, gvh0Var3);
                        }
                        int iC2 = gvh0Var3.c();
                        if (iC2 != 1) {
                            if (iC2 == 2) {
                            }
                            if (gvh0Var3.a.getBoolean("isDynamicGroupRoute", false)) {
                                iconUri.addFeature("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE");
                            }
                            bundle = new Bundle();
                            bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", gvh0Var3.d());
                            bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(gvh0Var3.b()));
                            bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", gvh0Var3.c());
                            bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", gvh0Var3.a.getInt("playbackType", 1));
                            bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", gvh0Var3.g());
                            if (!gvh0Var3.e().isEmpty()) {
                                iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
                                bundle.putStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS", new ArrayList<>(gvh0Var3.e()));
                            }
                            iconUri.setExtras(bundle);
                            if (gvh0Var3.b().isEmpty()) {
                                iconUri.addFeature("android.media.route.feature.EMPTY");
                            }
                            mediaRoute2InfoBuild = iconUri.build();
                        } else {
                            iconUri.addFeature("android.media.route.feature.REMOTE_VIDEO_PLAYBACK");
                        }
                        iconUri.addFeature("android.media.route.feature.REMOTE_AUDIO_PLAYBACK");
                        if (gvh0Var3.a.getBoolean("isDynamicGroupRoute", false)) {
                            iconUri.addFeature("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE");
                        }
                        bundle = new Bundle();
                        bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", gvh0Var3.d());
                        bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(gvh0Var3.b()));
                        bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", gvh0Var3.c());
                        bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", gvh0Var3.a.getInt("playbackType", 1));
                        bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", gvh0Var3.g());
                        if (!gvh0Var3.e().isEmpty()) {
                            iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
                            bundle.putStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS", new ArrayList<>(gvh0Var3.e()));
                        }
                        iconUri.setExtras(bundle);
                        if (gvh0Var3.b().isEmpty()) {
                            iconUri.addFeature("android.media.route.feature.EMPTY");
                        }
                        mediaRoute2InfoBuild = iconUri.build();
                    }
                }
            }
            if (mediaRoute2InfoBuild != null) {
                arrayList2.add(mediaRoute2InfoBuild);
            }
            mediaRoute2Info = null;
        }
    }

    public final void onCreateSession(long j, String str, String str2, Bundle bundle) {
        nvh0 dvh0Var;
        int i;
        String string;
        zvh0 zvh0Var = (zvh0) ((mv2) this.b).c;
        pvh0 pvh0Var = zvh0Var == null ? null : zvh0Var.d;
        gvh0 gvh0VarE = e(str2);
        if (gvh0VarE == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("controlHints", bundle);
        bundle2.putString("clientPackageName", str);
        new ovh0(bundle2);
        if (this.d.b) {
            nvh0 nvh0VarA = pvh0Var.a(str2);
            if (nvh0VarA == null) {
                notifyRequestFailed(j, 1);
                return;
            } else {
                dvh0Var = nvh0VarA;
                i = 7;
            }
        } else {
            j3e j3eVarC = pvh0Var.c(str2);
            if (j3eVarC == null) {
                notifyRequestFailed(j, 1);
                return;
            } else {
                int i2 = gvh0VarE.e().isEmpty() ? 1 : 3;
                dvh0Var = new dvh0(str2, j3eVarC);
                i = i2;
            }
        }
        dvh0Var.f();
        evh0 evh0Var = new evh0(this, dvh0Var, j, i);
        synchronized (this.a) {
            do {
                string = UUID.randomUUID().toString();
            } while (this.c.containsKey(string));
            evh0Var.i = string;
            this.c.put(string, evh0Var);
        }
        RoutingSessionInfo.Builder volumeMax = new RoutingSessionInfo.Builder(string, str).setName(gvh0VarE.j()).setVolumeHandling(gvh0VarE.l()).setVolume(gvh0VarE.k()).setVolumeMax(gvh0VarE.m());
        if (gvh0VarE.e().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator it = gvh0VarE.e().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute((String) it.next());
            }
        }
        RoutingSessionInfo routingSessionInfoBuild = volumeMax.build();
        if (evh0Var.h == null) {
            Messenger messenger = new Messenger(new lhh0(evh0Var.k, evh0Var.i));
            RoutingSessionInfo.Builder builderB = k34.b(routingSessionInfoBuild);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", messenger);
            bundle3.putString("androidx.mediarouter.media.KEY_SESSION_NAME", routingSessionInfoBuild.getName() != null ? routingSessionInfoBuild.getName().toString() : null);
            evh0Var.h = builderB.setControlHints(bundle3).build();
        }
        if ((i & 4) == 0) {
            if ((i & 2) != 0) {
                evh0Var.a(str2, null, routingSessionInfoBuild);
            } else {
                evh0Var.a.put(str2, evh0Var.b);
            }
        }
        uvh0 uvh0Var = this.b;
        dvh0Var.o(x74.N(((zvh0) ((mv2) uvh0Var).c).getApplicationContext()), uvh0Var.j);
    }

    public final void onDeselectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (e(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        mvh0 mvh0VarD = d(str);
        if (mvh0VarD == null) {
            notifyRequestFailed(j, 3);
        } else {
            mvh0VarD.m(str2);
        }
    }

    public final void onDiscoveryPreferenceChanged(RouteDiscoveryPreference routeDiscoveryPreference) {
        dwh0 dwh0Var;
        boolean zShouldPerformActiveScan = routeDiscoveryPreference.shouldPerformActiveScan();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : routeDiscoveryPreference.getPreferredFeatures()) {
            str.getClass();
            switch (str) {
                case "android.media.route.feature.REMOTE_AUDIO_PLAYBACK":
                    str = "android.media.intent.category.REMOTE_AUDIO_PLAYBACK";
                    break;
                case "android.media.route.feature.REMOTE_VIDEO_PLAYBACK":
                    str = "android.media.intent.category.REMOTE_VIDEO_PLAYBACK";
                    break;
                case "android.media.route.feature.REMOTE_PLAYBACK":
                    str = "android.media.intent.category.REMOTE_PLAYBACK";
                    break;
                case "android.media.route.feature.LIVE_AUDIO":
                    str = "android.media.intent.category.LIVE_AUDIO";
                    break;
                case "android.media.route.feature.LIVE_VIDEO":
                    str = "android.media.intent.category.LIVE_VIDEO";
                    break;
            }
            arrayList.add(str);
        }
        ArrayList<String> arrayList2 = null;
        if (!arrayList.isEmpty()) {
            for (String str2 : arrayList) {
                if (str2 == null) {
                    hhg1.n("category must not be null");
                    return;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<String> arrayList3 = arrayList2;
                if (!arrayList2.contains(str2)) {
                    arrayList3.add(str2);
                }
                arrayList2 = arrayList3;
            }
        }
        if (arrayList2 == null) {
            dwh0Var = dwh0.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList2);
            dwh0Var = new dwh0(bundle, arrayList2);
        }
        hvh0 hvh0Var = new hvh0(dwh0Var, routeDiscoveryPreference.shouldPerformActiveScan(), zShouldPerformActiveScan);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        uvh0 uvh0Var = this.b;
        if (!Objects.equals((hvh0) ((mv2) uvh0Var).f, hvh0Var) || hvh0Var.b()) {
            ((mv2) uvh0Var).f = hvh0Var;
            ((mv2) uvh0Var).b = jElapsedRealtime;
            uvh0Var.A();
        }
    }

    public final void onReleaseSession(long j, String str) {
        evh0 evh0Var;
        tvh0 tvh0Var;
        if (getSessionInfo(str) == null) {
            return;
        }
        synchronized (this.a) {
            evh0Var = (evh0) this.c.remove(str);
        }
        if (evh0Var == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        int i = evh0Var.d;
        j3e j3eVar = evh0Var.b;
        if (evh0Var.g) {
            return;
        }
        if ((i & 3) == 3) {
            RoutingSessionInfo routingSessionInfo = evh0Var.h;
            ovh0 ovh0Var = ovh0.b;
            evh0Var.a(null, routingSessionInfo, null);
        }
        j3eVar.i(2);
        j3eVar.e();
        if ((i & 1) == 0 && (tvh0Var = (tvh0) evh0Var.e.get()) != null) {
            if (j3eVar instanceof dvh0) {
                j3eVar = ((dvh0) j3eVar).g;
            }
            String str2 = evh0Var.j;
            SparseArray sparseArray = tvh0Var.f;
            int iIndexOfValue = sparseArray.indexOfValue(j3eVar);
            int iKeyAt = iIndexOfValue < 0 ? -1 : sparseArray.keyAt(iIndexOfValue);
            tvh0Var.e(iKeyAt);
            if (tvh0Var.b < 4) {
                tvh0Var.k.put(str2, Integer.valueOf(iKeyAt));
                tvh0Var.j.postDelayed(new ag20(tvh0Var, str2, (byte) 27), 5000L);
                jqd0 jqd0Var = ((rvh0) ((zvh0) ((mv2) tvh0Var.l).c).d).g;
                if (jqd0Var != null) {
                    zvh0.d(tvh0Var.a, 5, 0, 0, tvh0Var.a(jqd0Var), (Bundle) null);
                }
            } else if (iKeyAt >= 0) {
                zvh0.d(tvh0Var.a, 8, 0, iKeyAt, (Bundle) null, (Bundle) null);
            }
        }
        evh0Var.g = true;
        evh0Var.k.notifySessionReleased(evh0Var.i);
    }

    public final void onSelectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (e(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        mvh0 mvh0VarD = d(str);
        if (mvh0VarD == null) {
            notifyRequestFailed(j, 3);
        } else {
            mvh0VarD.l(str2);
        }
    }

    public final void onSetRouteVolume(long j, String str, int i) {
        nvh0 nvh0VarC = c(str);
        if (nvh0VarC == null) {
            notifyRequestFailed(j, 3);
        } else {
            nvh0VarC.g(i);
        }
    }

    public final void onSetSessionVolume(long j, String str, int i) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        mvh0 mvh0VarD = d(str);
        if (mvh0VarD == null) {
            notifyRequestFailed(j, 3);
        } else {
            mvh0VarD.g(i);
        }
    }

    public final void onTransferToRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (e(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        mvh0 mvh0VarD = d(str);
        if (mvh0VarD == null) {
            notifyRequestFailed(j, 3);
        } else {
            mvh0VarD.n(Collections.singletonList(str2));
        }
    }
}
