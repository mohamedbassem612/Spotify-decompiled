package p;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gvh0 {
    public final Bundle a;
    public final String b;
    public final List c;

    public gvh0(String str, Bundle bundle, List list) {
        this.a = bundle;
        this.b = str;
        this.c = pze0.k(list);
    }

    public final HashSet a() {
        ArrayList<String> stringArrayList = this.a.getStringArrayList("allowedPackages");
        return stringArrayList != null ? new HashSet(stringArrayList) : new HashSet();
    }

    public final ArrayList b() {
        ArrayList arrayListU = jhc1.u(this.a, "controlFilters", IntentFilter.class);
        return arrayListU != null ? new ArrayList(arrayListU) : new ArrayList();
    }

    public final int c() {
        return this.a.getInt("deviceType");
    }

    public final Bundle d() {
        return this.a.getBundle("extras");
    }

    public final ArrayList e() {
        ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
        return stringArrayList != null ? new ArrayList(stringArrayList) : new ArrayList();
    }

    public final Uri f() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String g() {
        return this.a.getString("id");
    }

    public final int h() {
        return this.a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    public final int i() {
        return this.a.getInt("minClientVersion", 1);
    }

    public final String j() {
        return this.a.getString("name");
    }

    public final int k() {
        return this.a.getInt("volume");
    }

    public final int l() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int m() {
        return this.a.getInt("volumeMax");
    }

    public final boolean n() {
        return (TextUtils.isEmpty(g()) || TextUtils.isEmpty(j()) || b().contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(g());
        sb.append(", groupMemberIds=");
        sb.append(e());
        sb.append(", name=");
        sb.append(j());
        sb.append(", descr  iption=");
        Bundle bundle = this.a;
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        sb.append(f());
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", isDynamicGroupRoute=");
        sb.append(bundle.getBoolean("isDynamicGroupRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(c());
        sb.append(", volume=");
        sb.append(k());
        sb.append(", volumeMax=");
        sb.append(m());
        sb.append(", volumeHandling=");
        sb.append(l());
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(d());
        sb.append(", isValid=");
        sb.append(n());
        sb.append(", minClientVersion=");
        sb.append(i());
        sb.append(", maxClientVersion=");
        sb.append(h());
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(", requiredPermissions=");
        sb.append(this.c);
        sb.append(", routingControllerId=");
        return l1d.n(this.b, " }", sb);
    }
}
