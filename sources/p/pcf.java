package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pcf {
    public static final Set a = f46.S0(new String[]{"party", "party-dev", "party-staging"});

    public static final void a(lzn0 lzn0Var, String str, tv80 tv80Var, Bundle bundle) {
        Bundle bundleH;
        Bundle bundleH2 = bundle;
        if (tv80Var != null) {
            if (bundleH2 != null) {
                bundleH2.putBoolean("campfire_navigation", true);
            } else {
                bundleH2 = mno1.h(new mmr0[]{new mmr0("campfire_navigation", Boolean.TRUE)});
            }
            lzn0Var.a(str, tv80Var, bundleH2);
            return;
        }
        dwn0 dwn0Var = new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
        if (bundleH2 != null) {
            bundleH2.putBoolean("campfire_navigation", true);
            bundleH = bundleH2;
        } else {
            bundleH = mno1.h(new mmr0[]{new mmr0("campfire_navigation", Boolean.TRUE)});
        }
        lzn0Var.i(dwn0Var, bundleH);
    }

    public static final String b(s4b1 s4b1Var) {
        List<String> pathSegments;
        switch (s4b1Var.c.ordinal()) {
            case 129:
            case 135:
            case 140:
            case 143:
            case 144:
            case 145:
            case 147:
            case 148:
            case 149:
            case 151:
            case 152:
                return s4b1Var.j();
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 137:
            case 138:
            case 139:
            case 142:
            case 146:
            case 150:
            default:
                return null;
            case 136:
            case 141:
                Uri uri = s4b1Var.a;
                if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
                    return null;
                }
                return pathSegments.get(1);
        }
    }

    public static final String c(String str, String str2, String str3) {
        Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath("spotify:chat:".concat(str));
        if (str2 != null) {
            builderEncodedPath.appendQueryParameter("originalContentUri", str2);
        }
        if (str3 != null) {
            builderEncodedPath.appendQueryParameter("contributionId", str3);
        }
        return builderEncodedPath.build().toString();
    }

    public static /* synthetic */ String d(int i, String str, String str2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return c(str, null, str2);
    }

    public static final String e(s4b1 s4b1Var) {
        return "spotify:chat-share-create-group:" + ((Object) Uri.encode(s4b1Var.D()));
    }

    public static final String f(s4b1 s4b1Var) {
        return "spotify:chat-share:" + ((Object) Uri.encode(s4b1Var.D()));
    }

    public static final String g(String str) {
        return l1d.m("spotify:create-chat:", Uri.encode(str));
    }

    public static final String h(s4b1 s4b1Var) {
        if (s4b1Var.c != blc0.ee) {
            return null;
        }
        Uri uri = s4b1Var.a;
        String query = uri != null ? uri.getQuery() : null;
        Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath(s4b1Var.z());
        if (query != null) {
            builderEncodedPath.encodedQuery(query);
        }
        builderEncodedPath.appendQueryParameter("new_message_invite", "true");
        return builderEncodedPath.build().toString();
    }

    public static final String i(String str) {
        return l1d.m("spotify:chat-interceptor:", Uri.encode(str));
    }

    public static final String j(String str) {
        return l1d.m("spotify:user:", Uri.encode(str));
    }

    public static final String k(String str, List list, String str2) {
        if (list.size() < 2) {
            hhg1.n("At least two usernames are required to create a group chat");
            return null;
        }
        if (str == null || ihc1.y0(str) || str2 == null || ihc1.y0(str2)) {
            Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath("spotify:create-group-chat");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builderEncodedPath.appendQueryParameter("username", (String) it.next());
            }
            String string = builderEncodedPath.build().toString();
            string.getClass();
            return string;
        }
        Uri.Builder builderEncodedPath2 = new Uri.Builder().encodedPath("spotify:chat:".concat(str));
        builderEncodedPath2.appendQueryParameter("createGroupChatToken", str2);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            builderEncodedPath2.appendQueryParameter("username", (String) it2.next());
        }
        String string2 = builderEncodedPath2.build().toString();
        string2.getClass();
        return string2;
    }

    public static final String l(String str) {
        return f4i1.f("spotify:chat:", str, ":edit");
    }

    public static final List m(s4b1 s4b1Var) {
        int iOrdinal = s4b1Var.c.ordinal();
        if (iOrdinal != 129) {
            if (iOrdinal == 133) {
                return Collections.singletonList(s4b1Var.j());
            }
            if (iOrdinal != 134) {
                return null;
            }
        }
        Uri uri = s4b1Var.a;
        if (uri != null) {
            return uri.getQueryParameters("username");
        }
        return null;
    }

    public static final boolean n(s4b1 s4b1Var) {
        Uri uri = s4b1Var.a;
        return u890.j(uri != null ? uri.getQueryParameter("feature") : null, "campfire_invite");
    }

    public static final boolean o(s4b1 s4b1Var) {
        if (!(s4b1Var.d instanceof aji1) && s4b1Var.c != blc0.ee) {
            return false;
        }
        Uri uri = s4b1Var.a;
        return u890.j(uri != null ? uri.getQueryParameter("new_message_invite") : null, "true");
    }
}
