package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bj8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public bj8(tdl0 tdl0Var, boolean z, i8h1 i8h1Var) {
        this.a = (byte) 1;
        this.c = tdl0Var;
        this.b = z;
        this.d = i8h1Var;
    }

    public void a(p7e p7eVar) {
        w7h1 w7h1VarM;
        tdl0 tdl0Var = (tdl0) this.c;
        y6h1 y6h1Var = tdl0Var.b;
        kfe kfeVar = p7eVar.f;
        String str = p7eVar.e.b;
        boolean z = p7eVar.g;
        boolean z2 = this.b;
        b7x b7xVar = b7x.a;
        if (z) {
            String strName = kfeVar.name();
            if (u890.j(strName, "EMAIL")) {
                if (u890.j(str, "notify-music-and-artist-recommendations")) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("music_and_artist_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-in-person-concerts-and-events")) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("in_person_concert_and_events_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-spotify-offers-and-bundles")) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("spotify_offers_and_bundles_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-spotify-experiences-made-for-you")) {
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("spotify_experiences_made_for_you_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-podcast-and-show-recommendations")) {
                    x6h1 x6h1VarC9 = y6h1Var.c();
                    x6h1VarC9.i.add(new a7h1("podcast_and_show_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-livestream-and-virtual-events")) {
                    x6h1 x6h1VarC11 = y6h1Var.c();
                    x6h1VarC11.i.add(new a7h1("livestreams_and_virtual_events_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-spotify-features-and-tips")) {
                    x6h1 x6h1VarC13 = y6h1Var.c();
                    x6h1VarC13.i.add(new a7h1("spotify_features_and_tips_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-surveys")) {
                    x6h1 x6h1VarC15 = y6h1Var.c();
                    x6h1VarC15.i.add(new a7h1("surveys_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                    x6h1VarC16.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-news-and-cultural-moments")) {
                    x6h1 x6h1VarC17 = y6h1Var.c();
                    x6h1VarC17.i.add(new a7h1("news_and_cultural_moments_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-artist-and-creator-merchandise")) {
                    x6h1 x6h1VarC19 = y6h1Var.c();
                    x6h1VarC19.i.add(new a7h1("artist_and_creator_merchandis_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                    x6h1VarC20.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-audiobooks")) {
                    x6h1 x6h1VarC21 = y6h1Var.c();
                    x6h1VarC21.i.add(new a7h1("audiobooks_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                    x6h1VarC22.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-comments-reactions")) {
                    if (z2) {
                        x6h1 x6h1VarC23 = y6h1Var.c();
                        x6h1VarC23.i.add(new a7h1("comments_reactions_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                        x6h1VarC24.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC25 = y6h1Var.c();
                        x6h1VarC25.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                        x6h1VarC26.i.add(new a7h1("comments_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC26.j = false;
                        x6h1 x6h1VarC27 = x6h1VarC26.a().c();
                        x6h1VarC27.i.add(new a7h1("comments_reactions", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC27.j = false;
                        x6h1 x6h1VarC28 = x6h1VarC27.a().c();
                        x6h1VarC28.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC28.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (!u890.j(str, "notify-comments-replies")) {
                        v8i0.j("Unknown category key ", str);
                        return;
                    }
                    if (z2) {
                        x6h1 x6h1VarC29 = y6h1Var.c();
                        x6h1VarC29.i.add(new a7h1("comments_replies_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC29.j = false;
                        x6h1 x6h1VarC30 = x6h1VarC29.a().c();
                        x6h1VarC30.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC30.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC31 = y6h1Var.c();
                        x6h1VarC31.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC31.j = false;
                        x6h1 x6h1VarC32 = x6h1VarC31.a().c();
                        x6h1VarC32.i.add(new a7h1("comments_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC32.j = false;
                        x6h1 x6h1VarC33 = x6h1VarC32.a().c();
                        x6h1VarC33.i.add(new a7h1("comments_replies", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC33.j = false;
                        x6h1 x6h1VarC34 = x6h1VarC33.a().c();
                        x6h1VarC34.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC34.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC34.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
            } else {
                if (!u890.j(strName, "PUSH")) {
                    v8i0.j("Unknown channel type ", kfeVar.name());
                    return;
                }
                if (u890.j(str, "notify-music-and-artist-recommendations")) {
                    x6h1 x6h1VarC35 = y6h1Var.c();
                    x6h1VarC35.i.add(new a7h1("music_and_artist_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC35.j = false;
                    x6h1 x6h1VarC36 = x6h1VarC35.a().c();
                    x6h1VarC36.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC36.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC36.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-in-person-concerts-and-events")) {
                    x6h1 x6h1VarC37 = y6h1Var.c();
                    x6h1VarC37.i.add(new a7h1("in_person_concert_and_events_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC37.j = false;
                    x6h1 x6h1VarC38 = x6h1VarC37.a().c();
                    x6h1VarC38.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC38.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC38.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-spotify-offers-and-bundles")) {
                    x6h1 x6h1VarC39 = y6h1Var.c();
                    x6h1VarC39.i.add(new a7h1("spotify_offers_and_bundles_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC39.j = false;
                    x6h1 x6h1VarC40 = x6h1VarC39.a().c();
                    x6h1VarC40.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC40.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC40.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-spotify-experiences-made-for-you")) {
                    x6h1 x6h1VarC41 = y6h1Var.c();
                    x6h1VarC41.i.add(new a7h1("spotify_experiences_made_for_you_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC41.j = false;
                    x6h1 x6h1VarC42 = x6h1VarC41.a().c();
                    x6h1VarC42.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC42.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC42.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-podcast-and-show-recommendations")) {
                    x6h1 x6h1VarC43 = y6h1Var.c();
                    x6h1VarC43.i.add(new a7h1("podcast_and_show_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC43.j = false;
                    x6h1 x6h1VarC44 = x6h1VarC43.a().c();
                    x6h1VarC44.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC44.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC44.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-livestream-and-virtual-events")) {
                    x6h1 x6h1VarC45 = y6h1Var.c();
                    x6h1VarC45.i.add(new a7h1("livestreams_and_virtual_events_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC45.j = false;
                    x6h1 x6h1VarC46 = x6h1VarC45.a().c();
                    x6h1VarC46.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC46.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC46.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-spotify-features-and-tips")) {
                    x6h1 x6h1VarC47 = y6h1Var.c();
                    x6h1VarC47.i.add(new a7h1("spotify_features_and_tips_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC47.j = false;
                    x6h1 x6h1VarC48 = x6h1VarC47.a().c();
                    x6h1VarC48.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC48.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC48.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-surveys")) {
                    x6h1 x6h1VarC49 = y6h1Var.c();
                    x6h1VarC49.i.add(new a7h1("surveys_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC49.j = false;
                    x6h1 x6h1VarC50 = x6h1VarC49.a().c();
                    x6h1VarC50.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC50.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC50.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-news-and-cultural-moments")) {
                    x6h1 x6h1VarC51 = y6h1Var.c();
                    x6h1VarC51.i.add(new a7h1("news_and_cultural_moments_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC51.j = false;
                    x6h1 x6h1VarC52 = x6h1VarC51.a().c();
                    x6h1VarC52.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC52.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC52.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-artist-and-creator-merchandise")) {
                    x6h1 x6h1VarC53 = y6h1Var.c();
                    x6h1VarC53.i.add(new a7h1("artist_and_creator_merchandis_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC53.j = false;
                    x6h1 x6h1VarC54 = x6h1VarC53.a().c();
                    x6h1VarC54.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC54.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC54.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-audiobooks")) {
                    x6h1 x6h1VarC55 = y6h1Var.c();
                    x6h1VarC55.i.add(new a7h1("audiobooks_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC55.j = false;
                    x6h1 x6h1VarC56 = x6h1VarC55.a().c();
                    x6h1VarC56.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC56.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC56.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-comments-reactions")) {
                    if (z2) {
                        x6h1 x6h1VarC57 = y6h1Var.c();
                        x6h1VarC57.i.add(new a7h1("comments_reactions_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC57.j = false;
                        x6h1 x6h1VarC58 = x6h1VarC57.a().c();
                        x6h1VarC58.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC58.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC58.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC59 = y6h1Var.c();
                        x6h1VarC59.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC59.j = false;
                        x6h1 x6h1VarC60 = x6h1VarC59.a().c();
                        x6h1VarC60.i.add(new a7h1("comments_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC60.j = false;
                        x6h1 x6h1VarC61 = x6h1VarC60.a().c();
                        x6h1VarC61.i.add(new a7h1("comments_reactions", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC61.j = false;
                        x6h1 x6h1VarC62 = x6h1VarC61.a().c();
                        x6h1VarC62.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC62.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC62.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else if (u890.j(str, "notify-comments-replies")) {
                    if (z2) {
                        x6h1 x6h1VarC63 = y6h1Var.c();
                        x6h1VarC63.i.add(new a7h1("comments_replies_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC63.j = false;
                        x6h1 x6h1VarC64 = x6h1VarC63.a().c();
                        x6h1VarC64.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC64.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC64.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC65 = y6h1Var.c();
                        x6h1VarC65.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC65.j = false;
                        x6h1 x6h1VarC66 = x6h1VarC65.a().c();
                        x6h1VarC66.i.add(new a7h1("comments_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC66.j = false;
                        x6h1 x6h1VarC67 = x6h1VarC66.a().c();
                        x6h1VarC67.i.add(new a7h1("comments_replies", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC67.j = false;
                        x6h1 x6h1VarC68 = x6h1VarC67.a().c();
                        x6h1VarC68.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC68.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC68.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else if (u890.j(str, "notify-jam")) {
                    if (z2) {
                        x6h1 x6h1VarC69 = y6h1Var.c();
                        x6h1VarC69.i.add(new a7h1("jam_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC69.j = false;
                        x6h1 x6h1VarC70 = x6h1VarC69.a().c();
                        x6h1VarC70.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC70.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC70.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC71 = y6h1Var.c();
                        x6h1VarC71.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC71.j = false;
                        x6h1 x6h1VarC72 = x6h1VarC71.a().c();
                        x6h1VarC72.i.add(new a7h1("jam_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC72.j = false;
                        x6h1 x6h1VarC73 = x6h1VarC72.a().c();
                        x6h1VarC73.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC73.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC73.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else if (u890.j(str, "notify-messages")) {
                    if (z2) {
                        x6h1 x6h1VarC74 = y6h1Var.c();
                        x6h1VarC74.i.add(new a7h1("messages_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC74.j = false;
                        x6h1 x6h1VarC75 = x6h1VarC74.a().c();
                        x6h1VarC75.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC75.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC75.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC76 = y6h1Var.c();
                        x6h1VarC76.i.add(new a7h1("social_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC76.j = false;
                        x6h1 x6h1VarC77 = x6h1VarC76.a().c();
                        x6h1VarC77.i.add(new a7h1("messages_section", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC77.j = false;
                        x6h1 x6h1VarC78 = x6h1VarC77.a().c();
                        x6h1VarC78.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC78.j = false;
                        w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC78.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (!u890.j(str, "notify-prompted-experiences")) {
                        v8i0.j("Unknown category key ", str);
                        return;
                    }
                    x6h1 x6h1VarC79 = y6h1Var.c();
                    x6h1VarC79.i.add(new a7h1("prompted_experience_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC79.j = false;
                    x6h1 x6h1VarC80 = x6h1VarC79.a().c();
                    x6h1VarC80.i.add(new a7h1("push_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC80.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC80.a(), r6h1.c, System.currentTimeMillis());
                }
            }
        } else {
            if (z) {
                eg.o();
                return;
            }
            String strName2 = kfeVar.name();
            if (u890.j(strName2, "EMAIL")) {
                if (u890.j(str, "notify-music-and-artist-recommendations")) {
                    x6h1 x6h1VarC81 = y6h1Var.c();
                    x6h1VarC81.i.add(new a7h1("music_and_artist_recommendations_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC81.j = false;
                    x6h1 x6h1VarC82 = x6h1VarC81.a().c();
                    x6h1VarC82.i.add(new a7h1("email_notification", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC82.j = false;
                    w7h1VarM = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), x6h1VarC82.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(str, "notify-in-person-concerts-and-events")) {
                    w7h1VarM = new bal0(tdl0Var, (byte) 25, false).k().m();
                } else if (u890.j(str, "notify-spotify-offers-and-bundles")) {
                    w7h1VarM = new qgl0(tdl0Var, (byte) 3).j().n();
                } else if (u890.j(str, "notify-spotify-experiences-made-for-you")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 27).l().m();
                } else if (u890.j(str, "notify-podcast-and-show-recommendations")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 10).i().m();
                } else if (u890.j(str, "notify-livestream-and-virtual-events")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 0).e().m();
                } else if (u890.j(str, "notify-spotify-features-and-tips")) {
                    w7h1VarM = new qgl0(tdl0Var, (byte) 0).i().m();
                } else if (u890.j(str, "notify-surveys")) {
                    w7h1VarM = new qgl0(tdl0Var, (byte) 6).k().n();
                } else if (u890.j(str, "notify-news-and-cultural-moments")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 7).h().m();
                } else if (u890.j(str, "notify-artist-and-creator-merchandise")) {
                    w7h1VarM = new bal0(tdl0Var, (byte) 13, false).e().m();
                } else if (u890.j(str, "notify-audiobooks")) {
                    w7h1VarM = new bal0(tdl0Var, (byte) 16, false).h().m();
                } else if (u890.j(str, "notify-comments-reactions")) {
                    w7h1VarM = z2 ? new bal0(tdl0Var, (byte) 19, false).i().m() : new pgl0(new pgl0(tdl0Var.v(), (byte) 19, false, (byte) 0), (byte) 15, (short) 0).j().m();
                } else {
                    if (!u890.j(str, "notify-comments-replies")) {
                        v8i0.j("Unknown category key ", str);
                        return;
                    }
                    w7h1VarM = z2 ? new bal0(tdl0Var, (byte) 22, false).j().m() : new pgl0(new pgl0(tdl0Var.v(), (byte) 19, false, (byte) 0), (byte) 18, (short) 0).k().m();
                }
            } else {
                if (!u890.j(strName2, "PUSH")) {
                    v8i0.j("Unknown channel type ", kfeVar.name());
                    return;
                }
                if (u890.j(str, "notify-music-and-artist-recommendations")) {
                    w7h1VarM = tdl0Var.o().r().m();
                } else if (u890.j(str, "notify-in-person-concerts-and-events")) {
                    w7h1VarM = new bal0(tdl0Var, (byte) 25, false).t().m();
                } else if (u890.j(str, "notify-spotify-offers-and-bundles")) {
                    w7h1VarM = new qgl0(tdl0Var, (byte) 3).u().n();
                } else if (u890.j(str, "notify-spotify-experiences-made-for-you")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 27).z().m();
                } else if (u890.j(str, "notify-podcast-and-show-recommendations")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 10).t().m();
                } else if (u890.j(str, "notify-livestream-and-virtual-events")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 0).p().m();
                } else if (u890.j(str, "notify-spotify-features-and-tips")) {
                    w7h1VarM = new qgl0(tdl0Var, (byte) 0).t().m();
                } else if (u890.j(str, "notify-surveys")) {
                    w7h1VarM = new qgl0(tdl0Var, (byte) 6).v().n();
                } else if (u890.j(str, "notify-news-and-cultural-moments")) {
                    w7h1VarM = new pgl0(tdl0Var, (byte) 7).s().m();
                } else if (u890.j(str, "notify-artist-and-creator-merchandise")) {
                    w7h1VarM = new bal0(tdl0Var, (byte) 13, false).p().m();
                } else if (u890.j(str, "notify-audiobooks")) {
                    w7h1VarM = new bal0(tdl0Var, (byte) 16, false).q().m();
                } else if (u890.j(str, "notify-comments-reactions")) {
                    w7h1VarM = z2 ? new bal0(tdl0Var, (byte) 19, false).r().m() : new pgl0(new pgl0(tdl0Var.v(), (byte) 19, false, (byte) 0), (byte) 15, (short) 0).v().m();
                } else if (u890.j(str, "notify-comments-replies")) {
                    w7h1VarM = z2 ? new bal0(tdl0Var, (byte) 22, false).s().m() : new pgl0(new pgl0(tdl0Var.v(), (byte) 19, false, (byte) 0), (byte) 18, (short) 0).w().m();
                } else if (u890.j(str, "notify-jam")) {
                    w7h1VarM = z2 ? tdl0Var.m().u().m() : tdl0Var.v().n().x().m();
                } else if (u890.j(str, "notify-messages")) {
                    w7h1VarM = z2 ? tdl0Var.n().q().m() : tdl0Var.v().o().y().m();
                } else {
                    if (!u890.j(str, "notify-prompted-experiences")) {
                        v8i0.j("Unknown category key ", str);
                        return;
                    }
                    w7h1VarM = tdl0Var.u().u().m();
                }
            }
        }
        ((i8h1) this.d).g(w7h1VarM);
    }

    public final void accept(Object obj) {
        ou80 ou80Var;
        byte b = this.a;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                dj8 dj8Var = (dj8) obj2;
                n5o n5oVar = (n5o) obj3;
                if (((Boolean) obj).booleanValue() || z || n5oVar == null) {
                    dj8Var.Y0();
                    return;
                }
                q5o q5oVar = dj8Var.P1;
                if (q5oVar == null) {
                    u890.C("credentialsStore");
                    throw null;
                }
                fn31.T(q5oVar.e, (o8n) null, 0, new p5o(q5oVar, n5oVar.a, n5oVar.b, (lnm) null, (byte) 0), 3);
                return;
            case 1:
                a((p7e) obj);
                return;
            default:
                oxr oxrVar = (oxr) obj3;
                if ((((m331) obj) instanceof w231) && z) {
                    c6v0 c6v0Var = (e6v0) obj2;
                    if (c6v0Var instanceof c6v0) {
                        ou80Var = c6v0Var.c;
                    } else {
                        if (!(c6v0Var instanceof d6v0)) {
                            eg.o();
                            return;
                        }
                        ou80Var = ((d6v0) c6v0Var).d;
                    }
                    e7p0 e7p0Var = oxrVar.f;
                    if (ou80Var != null) {
                        e7p0.d(e7p0Var, ou80Var);
                        return;
                    } else {
                        e7p0Var.c();
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ bj8(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
