package p;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xe70 {
    public static final se11 a = new se11("^Using [\\w-]+:\\s*(.+?)\\.{0,3}$");
    public static final we70 b;
    public static final List c;
    public static final Map d;

    static {
        we70 we70Var = new we70(2131953257, 2131953260);
        we70 we70Var2 = new we70(2131953139, 2131953140);
        we70 we70Var3 = new we70(2131953157, 2131953158);
        we70 we70Var4 = new we70(2131953249, 2131953250);
        we70 we70Var5 = new we70(2131953229, 2131953230);
        we70 we70Var6 = new we70(2131953147, 2131953148);
        we70 we70Var7 = new we70(2131953165, 2131953166);
        we70 we70Var8 = new we70(2131953145, 2131953146);
        we70 we70Var9 = new we70(2131953273, 2131953274);
        b = new we70(2131953167, 2131953168);
        c = p7h.M(new mmr0[]{new mmr0("search", we70Var), new mmr0("library list", we70Var2), new mmr0("library recent", we70Var2), new mmr0("library contains", we70Var3), new mmr0("library add", we70Var4), new mmr0("library remove", we70Var5), new mmr0("library", we70Var3), new mmr0("chat list", we70Var6), new mmr0("chat", we70Var6), new mmr0("history", new we70(2131953197, 2131953198)), new mmr0("lookup", new we70(2131953205, 2131953206)), new mmr0("ask", new we70(2131953269, 2131953270)), new mmr0("pause", new we70(2131953217, 2131953218)), new mmr0("resume", new we70(2131953239, 2131953240)), new mmr0("skip", new we70(2131953265, 2131953266)), new mmr0("next", new we70(2131953265, 2131953266)), new mmr0("previous", new we70(2131953221, 2131953222)), new mmr0("prev", new we70(2131953221, 2131953222)), new mmr0("play", new we70(2131953219, 2131953220)), new mmr0("seek", new we70(2131953263, 2131953264)), new mmr0("speed", new we70(2131953131, 2131953132)), new mmr0("volume", new we70(2131953133, 2131953134)), new mmr0("shuffle", new we70(2131953271, 2131953272)), new mmr0("repeat", new we70(2131953143, 2131953144)), new mmr0("playlist add", new we70(2131953125, 2131953126)), new mmr0("playlist create", new we70(2131953171, 2131953172)), new mmr0("playlist remove", new we70(2131953231, 2131953232)), new mmr0("playlist delete", new we70(2131953231, 2131953232)), new mmr0("playlist list", new we70(2131953141, 2131953142)), new mmr0("playlist get", new we70(2131953193, 2131953194)), new mmr0("playlist update", new we70(2131953277, 2131953278)), new mmr0("playlist", new we70(2131953213, 2131953214)), new mmr0("queue add", new we70(2131953127, 2131953128)), new mmr0("queue remove", new we70(2131953233, 2131953234)), new mmr0("queue move", new we70(2131953237, 2131953238)), new mmr0("queue", new we70(2131953163, 2131953164)), new mmr0("folder create", new we70(2131953169, 2131953170)), new mmr0("folder rename", new we70(2131953235, 2131953236)), new mmr0("folder move", new we70(2131953215, 2131953216)), new mmr0("folder remove", new we70(2131953225, 2131953226)), new mmr0("folder list", new we70(2131953137, 2131953138)), new mmr0("folder", new we70(2131953209, 2131953210)), new mmr0("unfollow", new we70(2131953275, 2131953276)), new mmr0("follow", new we70(2131953187, 2131953188)), new mmr0("unsave", we70Var5), new mmr0("unlike", we70Var5), new mmr0("save", we70Var4), new mmr0("like", we70Var4), new mmr0("now-playing", we70Var7), new mmr0("now_playing", we70Var7), new mmr0("status", we70Var7), new mmr0("recommend", new we70(2131953183, 2131953184)), new mmr0("suggest", new we70(2131953183, 2131953184)), new mmr0("top", new we70(2131953199, 2131953200)), new mmr0("taste", new we70(2131953135, 2131953136)), new mmr0("album", new we70(2131953201, 2131953202)), new mmr0("artist", new we70(2131953203, 2131953204)), new mmr0("track", new we70(2131953207, 2131953208)), new mmr0("devices list", we70Var8), new mmr0("devices transfer", we70Var9), new mmr0("devices volume", new we70(2131953129, 2131953130)), new mmr0("devices info", new we70(2131953149, 2131953150)), new mmr0("devices", we70Var8), new mmr0("device", we70Var8), new mmr0("connect", we70Var8), new mmr0("transfer", we70Var9), new mmr0("jam create", new we70(2131953267, 2131953268)), new mmr0("jam leave", new we70(2131953189, 2131953190)), new mmr0("jam end", new we70(2131953179, 2131953180)), new mmr0("jam members", new we70(2131953151, 2131953152)), new mmr0("jam kick", new we70(2131953227, 2131953228)), new mmr0("jam permissions", new we70(2131953153, 2131953154)), new mmr0("jam status", new we70(2131953155, 2131953156)), new mmr0("jam", new we70(2131953211, 2131953212)), new mmr0("me", new we70(2131953161, 2131953162))});
        d = sqg0.J(new mmr0[]{new mmr0("create_scheduled_routine", new we70(2131953173, 2131953174)), new mmr0("update_routine", new we70(2131953279, 2131953280)), new mmr0("delete_routine", new we70(2131953175, 2131953176)), new mmr0("list_routines", new we70(2131953191, 2131953192)), new mmr0("run_routine", new we70(2131953241, 2131953242)), new mmr0("memory_write", new we70(2131953251, 2131953252)), new mmr0("memory_read", new we70(2131953258, 2131953259)), new mmr0("list_models", new we70(2131953159, 2131953160)), new mmr0("find_and_install_skill", new we70(2131953185, 2131953186)), new mmr0("read_file", new we70(2131953223, 2131953224)), new mmr0("write_file", new we70(2131953285, 2131953286)), new mmr0("text_editor", new we70(2131953177, 2131953178)), new mmr0("str_replace_editor", new we70(2131953177, 2131953178)), new mmr0("list_directory", new we70(2131953195, 2131953196)), new mmr0("ls", new we70(2131953195, 2131953196)), new mmr0("web_search", new we70(2131953261, 2131953262)), new mmr0("search", new we70(2131953261, 2131953262)), new mmr0("web_fetch", new we70(2131953181, 2131953182)), new mmr0("fetch", new we70(2131953181, 2131953182)), new mmr0("computer", new we70(2131953281, 2131953282))});
    }

    public static String a(String str) {
        mbh0 mbh0VarA;
        String str2;
        if (str.length() == 0 || (mbh0VarA = se11.a(a, str)) == null || (str2 = (String) mbh0VarA.a().get(1)) == null) {
            return null;
        }
        return ihc1.e1(str2).toString();
    }

    public static ve70 b(Context context, String str, xkg0 xkg0Var, String str2, String str3, String str4) {
        CharSequence charSequence;
        Object next;
        ve70 ve70VarA;
        String str5;
        if (str.equals("bash") && str3 != null) {
            Iterator it = c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                str5 = (String) ((mmr0) next).a;
                if (str3.equals(str5)) {
                    break;
                }
            } while (!nhc1.Y(str3, str5 + " ", false));
            mmr0 mmr0Var = (mmr0) next;
            if (mmr0Var == null) {
                ve70VarA = null;
            } else {
                ve70VarA = (!u890.j((String) mmr0Var.a, "search") || str4 == null || str4.length() == 0) ? ((we70) mmr0Var.b).a(context, str4) : new ve70(context.getString(2131953255, str4), context.getString(2131953256, str4));
            }
            if (ve70VarA != null) {
                return ve70VarA;
            }
        }
        if (str.equals("bash") || str.equals("sh")) {
            String strA = (String) xkg0Var.get("command");
            if (strA == null && (strA = a(str2)) == null) {
                strA = "";
            }
            String strC1 = ihc1.c1(60, strA);
            return strC1.length() == 0 ? new ve70(context.getString(2131953243), context.getString(2131953244)) : new ve70(context.getString(2131953245, strC1), context.getString(2131953246, strC1));
        }
        if (str.equals("mcp") || nhc1.Y(str, "mcp_", false)) {
            return b.a(context, null);
        }
        if ((str.equals("web_search") || str.equals("search")) && (charSequence = (CharSequence) xkg0Var.get("query")) != null && charSequence.length() != 0) {
            String str6 = (String) sqg0.G("query", xkg0Var);
            return new ve70(context.getString(2131953253, str6), context.getString(2131953254, str6));
        }
        String strA2 = a(str2);
        we70 we70Var = (we70) d.get(str);
        if (we70Var != null) {
            return we70Var.a(context, strA2);
        }
        String strReplace = str.replace('_', ' ').replace('-', ' ');
        return new ve70(c(context, context.getString(2131953247, strReplace), strA2).concat("..."), c(context, context.getString(2131953248, strReplace), strA2));
    }

    public static String c(Context context, String str, String str2) {
        return (str2 == null || str2.length() == 0) ? str : context.getString(2131953283, str, str2);
    }
}
