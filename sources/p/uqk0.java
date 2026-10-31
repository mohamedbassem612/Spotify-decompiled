package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uqk0 implements w6h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;
    public final List d;

    public uqk0(r6h1 r6h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-song-dna-blend-header";
                x6h1VarI.f = "5.0.0";
                x6h1VarI.g = "22.0.0";
                this.c = x6h1VarI.a();
                this.d = p7h.M(new String[]{"blend-dna", "artists-dna"});
                break;
            case 4:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-your-library-liked-songs";
                x6h1VarI2.f = "9.2.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = null;
                this.c = x6h1VarI2.a();
                this.d = Collections.singletonList("collection/songs");
                break;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-album-entity-unlock-card-section";
                x6h1VarI3.f = "2.0.0";
                x6h1VarI3.g = "22.0.0";
                this.c = x6h1VarI3.a();
                this.d = Collections.singletonList("album");
                break;
        }
    }

    public w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.c, this.b, System.currentTimeMillis());
    }

    public final r6h1 b() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var.b);
            case 2:
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var.b);
            case 3:
                r6h1 r6h1Var5 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var.b);
            default:
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var.b);
        }
    }

    public w7h1 e(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 h(String str, String str2) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("playlist", str);
        if (str2 == null) {
            str2 = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("item_to_be_added", str2)})), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 i(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("create_radio", 1, Collections.singletonMap("based_on_item", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 j(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 k(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 l(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 m(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 n() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_something", 1, b7xVar), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 o(String str, String str2) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("item_to_be_removed_from_playlist", str);
        if (str2 == null) {
            str2 = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_item_from_playlist", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("playlist", str2)})), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 p(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 q() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("repeat_disable", 1, b7xVar), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 r() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("repeat_enable", 1, b7xVar), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 s() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("repeat_one_enable", 1, b7xVar), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 t(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 u() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("search", 1, b7xVar), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 v(Integer num) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 w(Integer num) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf)), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 x(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "linear";
        if (i == 1) {
            obj = "linear";
        } else if (i == 2) {
            obj = "shuffle";
        } else {
            if (i != 3) {
                throw null;
            }
            obj = "smart_shuffle";
        }
        mmr0 mmr0Var = new mmr0("previous_mode", obj);
        if (i2 != 1) {
            if (i2 == 2) {
                str = "shuffle";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str = "smart_shuffle";
            }
        }
        return new w7h1("", "", z7h1Var, new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("selected_mode", str)})), this.c, this.b, System.currentTimeMillis());
    }

    public w7h1 y(String str) {
        z7h1 z7h1Var = new z7h1("speech", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), this.c, this.b, System.currentTimeMillis());
    }

    public uqk0(String str, r6h1 r6h1Var) {
        this.a = (byte) 2;
        this.b = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-smart-shuffle-page-recs";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        this.c = x6h1VarI.a();
        this.d = Collections.singletonList("smartshuffle/npvrecommendations/fullscreen");
    }

    public uqk0() {
        this.a = (byte) 1;
        this.b = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-external-accessory";
        x6h1VarI.f = "11.2.0";
        x6h1VarI.g = "22.0.0";
        this.c = x6h1VarI.a();
        this.d = Collections.singletonList("any");
    }
}
