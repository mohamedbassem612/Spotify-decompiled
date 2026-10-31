package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class s4e {
    public static final w7h1 a(String str, tdl0 tdl0Var, String str2, boolean z) {
        y6h1 y6h1Var = tdl0Var.b;
        boolean zJ = u890.j(str, "notify-music-and-artist-recommendations");
        b7x b7xVar = b7x.a;
        if (zJ) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("music_and_artist_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-in-person-concerts-and-events")) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("in_person_concert_and_events_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-spotify-offers-and-bundles")) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("spotify_offers_and_bundles_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-spotify-experiences-made-for-you")) {
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("spotify_experiences_made_for_you_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-podcast-and-show-recommendations")) {
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("podcast_and_show_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-livestream-and-virtual-events")) {
            x6h1 x6h1VarC6 = y6h1Var.c();
            x6h1VarC6.i.add(new a7h1("livestreams_and_virtual_events_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-spotify-features-and-tips")) {
            x6h1 x6h1VarC7 = y6h1Var.c();
            x6h1VarC7.i.add(new a7h1("spotify_features_and_tips_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-surveys")) {
            x6h1 x6h1VarC8 = y6h1Var.c();
            x6h1VarC8.i.add(new a7h1("surveys_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-news-and-cultural-moments")) {
            x6h1 x6h1VarC9 = y6h1Var.c();
            x6h1VarC9.i.add(new a7h1("news_and_cultural_moments_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-artist-and-creator-merchandise")) {
            x6h1 x6h1VarC10 = y6h1Var.c();
            x6h1VarC10.i.add(new a7h1("artist_and_creator_merchandis_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-audiobooks")) {
            x6h1 x6h1VarC11 = y6h1Var.c();
            x6h1VarC11.i.add(new a7h1("audiobooks_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-prompted-experiences")) {
            x6h1 x6h1VarC12 = y6h1Var.c();
            x6h1VarC12.i.add(new a7h1("prompted_experience_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-comments-reactions")) {
            x6h1 x6h1VarC13 = y6h1Var.c();
            x6h1VarC13.i.add(new a7h1("comments_reactions_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-comments-replies")) {
            x6h1 x6h1VarC14 = y6h1Var.c();
            x6h1VarC14.i.add(new a7h1("comments_replies_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC14.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-comments")) {
            x6h1 x6h1VarC15 = y6h1Var.c();
            x6h1VarC15.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC15.j = false;
            x6h1 x6h1VarC16 = x6h1VarC15.a().c();
            x6h1VarC16.i.add(new a7h1("comments_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC16.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
        }
        if (u890.j(str, "notify-jam")) {
            if (z) {
                x6h1 x6h1VarC17 = y6h1Var.c();
                x6h1VarC17.i.add(new a7h1("jam_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
            }
            x6h1 x6h1VarC18 = y6h1Var.c();
            x6h1VarC18.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC18.j = false;
            x6h1 x6h1VarC19 = x6h1VarC18.a().c();
            x6h1VarC19.i.add(new a7h1("jam_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC19.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
        }
        if (!u890.j(str, "notify-messages")) {
            if (!u890.j(str, "notify-social")) {
                v8i0.j("Unknown category key ", str);
                return null;
            }
            x6h1 x6h1VarC20 = y6h1Var.c();
            x6h1VarC20.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC20.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
        }
        if (z) {
            x6h1 x6h1VarC21 = y6h1Var.c();
            x6h1VarC21.i.add(new a7h1("messages_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC21.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis());
        }
        x6h1 x6h1VarC22 = y6h1Var.c();
        x6h1VarC22.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC22.j = false;
        x6h1 x6h1VarC23 = x6h1VarC22.a().c();
        x6h1VarC23.i.add(new a7h1("messages_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC23.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC23.a(), r6h1.c, System.currentTimeMillis());
    }
}
