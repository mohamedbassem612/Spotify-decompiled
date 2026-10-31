package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gf0 implements ze0 {
    public final hyy0 a;
    public final p8h b;
    public final ae5 c;
    public final p85 d;
    public final a42 e;
    public final om40 f;
    public final q8n g;
    public final il00 h;
    public final ffe1 i;
    public final boolean j;

    public gf0(hyy0 hyy0Var, p8h p8hVar, ae5 ae5Var, p85 p85Var, a42 a42Var, om40 om40Var, q8n q8nVar, il00 il00Var, ffe1 ffe1Var, boolean z) {
        this.a = hyy0Var;
        this.b = p8hVar;
        this.c = ae5Var;
        this.d = p85Var;
        this.e = a42Var;
        this.f = om40Var;
        this.g = q8nVar;
        this.h = il00Var;
        this.i = ffe1Var;
        this.j = z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0169  */
    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:104:0x0177  */
    /* JADX WARN: Code duplicated, block: B:106:0x018a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0196  */
    /* JADX WARN: Code duplicated, block: B:113:0x019c  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:125:0x0204 A[LOOP:0: B:123:0x01fe->B:125:0x0204, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x0160  */
    public final Object a(String str, PlayerState playerState, b7g1 b7g1Var, String str2, String str3, iko ikoVar, String str4, t45 t45Var, boolean z, onm onmVar) {
        cf0 cf0Var;
        String str5;
        PlayerState playerState2;
        b7g1 b7g1Var2;
        String str6;
        String str7;
        iko ikoVar2;
        String str8;
        boolean z2;
        String str9;
        List list;
        String str10;
        boolean z3;
        ContextTrack contextTrack;
        boolean z4;
        boolean z5;
        WidgetState.PlayPauseState playPauseState;
        boolean zIsEmpty;
        ContextTrack contextTrack2;
        boolean zJ;
        p85 p85Var;
        ContextTrack contextTrack3;
        boolean zIsEmpty2;
        WidgetState.LeftButtonConfiguration.Save previous;
        WidgetState.ContentType contentType;
        ArrayList arrayList;
        if (onmVar instanceof cf0) {
            cf0Var = (cf0) onmVar;
            int i = cf0Var.X;
            if ((i & Integer.MIN_VALUE) != 0) {
                cf0Var.X = i - Integer.MIN_VALUE;
            } else {
                cf0Var = new cf0(this, onmVar);
            }
        } else {
            cf0Var = new cf0(this, onmVar);
        }
        Object objD = cf0Var.i;
        int i2 = cf0Var.X;
        ae5 ae5Var = this.c;
        if (i2 == 0) {
            hm5.M(objD);
            str5 = str;
            try {
                cf0Var.a = str5;
                playerState2 = playerState;
                try {
                    cf0Var.b = playerState2;
                    b7g1Var2 = b7g1Var;
                    try {
                        cf0Var.c = b7g1Var2;
                        str6 = str2;
                        try {
                            cf0Var.d = str6;
                            str7 = str3;
                            try {
                                cf0Var.e = str7;
                                ikoVar2 = ikoVar;
                                try {
                                    cf0Var.f = ikoVar2;
                                    str8 = str4;
                                    try {
                                        cf0Var.g = str8;
                                        z2 = z;
                                        try {
                                            cf0Var.h = z2;
                                            cf0Var.X = 1;
                                            objD = d(t45Var, cf0Var);
                                            d9n d9nVar = d9n.a;
                                            if (objD == d9nVar) {
                                                return d9nVar;
                                            }
                                            str9 = str5;
                                        } catch (Throwable th) {
                                            th = th;
                                            Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                                            ae5Var.e(str5, 1, th);
                                            list = z6x.a;
                                            str10 = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = z;
                                        Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                                        ae5Var.e(str5, 1, th);
                                        list = z6x.a;
                                        str10 = str5;
                                        String str11 = str8;
                                        z3 = z2;
                                        iko ikoVar3 = ikoVar2;
                                        if (list.isEmpty()) {
                                            ae5Var.d(1, str10);
                                        }
                                        contextTrack = (ContextTrack) playerState2.track().b();
                                        contextTrack.getClass();
                                        if (l4o1.P(contextTrack)) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (playerState2.isPlaying()) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        if (!z5) {
                                            if (!z5) {
                                                if (z5) {
                                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                                } else {
                                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                                }
                                            } else if (z5) {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            } else {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            }
                                        } else if (!z5) {
                                            if (z5) {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            } else {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            }
                                        } else if (z5) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                        if (z4) {
                                            zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                        } else {
                                            zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                                        }
                                        contextTrack2 = (ContextTrack) playerState2.track().h();
                                        if (contextTrack2 != null) {
                                            zJ = l4o1.J(contextTrack2);
                                        } else {
                                            zJ = false;
                                        }
                                        p85Var = this.d;
                                        if (p85Var.h()) {
                                            previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                                        } else {
                                            contextTrack3 = (ContextTrack) playerState2.track().b();
                                            contextTrack3.getClass();
                                            if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                                                zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                            } else {
                                                zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                            }
                                            previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                                        }
                                        if (l4o1.E(contextTrack)) {
                                            contentType = WidgetState.ContentType.AD;
                                        } else if (z4) {
                                            contentType = WidgetState.ContentType.TALK;
                                        } else {
                                            contentType = WidgetState.ContentType.MUSIC;
                                        }
                                        eey eeyVarJ = this.h.j(z3);
                                        List list2 = list;
                                        CurrentTrackMetadata currentTrackMetadataO = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                                        boolean z6 = !zIsEmpty;
                                        List<u011> list3 = list2;
                                        arrayList = new ArrayList(q7h.U(list3, 10));
                                        for (u011 u011Var : list3) {
                                            arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                                            z3 = z3;
                                        }
                                        return new WidgetState.ActiveSession(currentTrackMetadataO, arrayList, contentType, playPauseState, previous, ikoVar3, str10, z6, zJ, str11, eeyVarJ.b(), eeyVarJ.a(), z3, p85Var.e(), this.j);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str8 = str4;
                                    z2 = z;
                                    Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                                    ae5Var.e(str5, 1, th);
                                    list = z6x.a;
                                    str10 = str5;
                                    String str12 = str8;
                                    z3 = z2;
                                    iko ikoVar4 = ikoVar2;
                                    if (list.isEmpty()) {
                                        ae5Var.d(1, str10);
                                    }
                                    contextTrack = (ContextTrack) playerState2.track().b();
                                    contextTrack.getClass();
                                    if (l4o1.P(contextTrack)) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (playerState2.isPlaying()) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    if (!z5) {
                                        if (!z5) {
                                            if (z5) {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            } else {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            }
                                        } else if (z5) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                    } else if (!z5) {
                                        if (z5) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                    } else if (z5) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                    if (z4) {
                                        zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                    } else {
                                        zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                                    }
                                    contextTrack2 = (ContextTrack) playerState2.track().h();
                                    if (contextTrack2 != null) {
                                        zJ = l4o1.J(contextTrack2);
                                    } else {
                                        zJ = false;
                                    }
                                    p85Var = this.d;
                                    if (p85Var.h()) {
                                        previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                                    } else {
                                        contextTrack3 = (ContextTrack) playerState2.track().b();
                                        contextTrack3.getClass();
                                        if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                                            zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                        } else {
                                            zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                        }
                                        previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                                    }
                                    if (l4o1.E(contextTrack)) {
                                        contentType = WidgetState.ContentType.AD;
                                    } else if (z4) {
                                        contentType = WidgetState.ContentType.TALK;
                                    } else {
                                        contentType = WidgetState.ContentType.MUSIC;
                                    }
                                    eey eeyVarJ2 = this.h.j(z3);
                                    List list4 = list;
                                    CurrentTrackMetadata currentTrackMetadataO2 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                                    boolean z7 = !zIsEmpty;
                                    List<u011> list5 = list4;
                                    arrayList = new ArrayList(q7h.U(list5, 10));
                                    while (r3.hasNext()) {
                                        arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                                        z3 = z3;
                                    }
                                    return new WidgetState.ActiveSession(currentTrackMetadataO2, arrayList, contentType, playPauseState, previous, ikoVar4, str10, z7, zJ, str12, eeyVarJ2.b(), eeyVarJ2.a(), z3, p85Var.e(), this.j);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                ikoVar2 = ikoVar;
                                str8 = str4;
                                z2 = z;
                                Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                                ae5Var.e(str5, 1, th);
                                list = z6x.a;
                                str10 = str5;
                                String str13 = str8;
                                z3 = z2;
                                iko ikoVar5 = ikoVar2;
                                if (list.isEmpty()) {
                                    ae5Var.d(1, str10);
                                }
                                contextTrack = (ContextTrack) playerState2.track().b();
                                contextTrack.getClass();
                                if (l4o1.P(contextTrack)) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (playerState2.isPlaying()) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                if (!z5) {
                                    if (!z5) {
                                        if (z5) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                    } else if (z5) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                } else if (!z5) {
                                    if (z5) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                } else if (z5) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                                if (z4) {
                                    zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                } else {
                                    zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                                }
                                contextTrack2 = (ContextTrack) playerState2.track().h();
                                if (contextTrack2 != null) {
                                    zJ = l4o1.J(contextTrack2);
                                } else {
                                    zJ = false;
                                }
                                p85Var = this.d;
                                if (p85Var.h()) {
                                    previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                                } else {
                                    contextTrack3 = (ContextTrack) playerState2.track().b();
                                    contextTrack3.getClass();
                                    if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                                        zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                    } else {
                                        zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                    }
                                    previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                                }
                                if (l4o1.E(contextTrack)) {
                                    contentType = WidgetState.ContentType.AD;
                                } else if (z4) {
                                    contentType = WidgetState.ContentType.TALK;
                                } else {
                                    contentType = WidgetState.ContentType.MUSIC;
                                }
                                eey eeyVarJ3 = this.h.j(z3);
                                List list6 = list;
                                CurrentTrackMetadata currentTrackMetadataO3 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                                boolean z8 = !zIsEmpty;
                                List<u011> list7 = list6;
                                arrayList = new ArrayList(q7h.U(list7, 10));
                                while (r3.hasNext()) {
                                    arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                                    z3 = z3;
                                }
                                return new WidgetState.ActiveSession(currentTrackMetadataO3, arrayList, contentType, playPauseState, previous, ikoVar5, str10, z8, zJ, str13, eeyVarJ3.b(), eeyVarJ3.a(), z3, p85Var.e(), this.j);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str7 = str3;
                            ikoVar2 = ikoVar;
                            str8 = str4;
                            z2 = z;
                            Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                            ae5Var.e(str5, 1, th);
                            list = z6x.a;
                            str10 = str5;
                            String str14 = str8;
                            z3 = z2;
                            iko ikoVar6 = ikoVar2;
                            if (list.isEmpty()) {
                                ae5Var.d(1, str10);
                            }
                            contextTrack = (ContextTrack) playerState2.track().b();
                            contextTrack.getClass();
                            if (l4o1.P(contextTrack)) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (playerState2.isPlaying()) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (!z5) {
                                if (!z5) {
                                    if (z5) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                } else if (z5) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                            } else if (!z5) {
                                if (z5) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                            } else if (z5) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                            if (z4) {
                                zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                            } else {
                                zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                            }
                            contextTrack2 = (ContextTrack) playerState2.track().h();
                            if (contextTrack2 != null) {
                                zJ = l4o1.J(contextTrack2);
                            } else {
                                zJ = false;
                            }
                            p85Var = this.d;
                            if (p85Var.h()) {
                                previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                            } else {
                                contextTrack3 = (ContextTrack) playerState2.track().b();
                                contextTrack3.getClass();
                                if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                                    zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                } else {
                                    zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                }
                                previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                            }
                            if (l4o1.E(contextTrack)) {
                                contentType = WidgetState.ContentType.AD;
                            } else if (z4) {
                                contentType = WidgetState.ContentType.TALK;
                            } else {
                                contentType = WidgetState.ContentType.MUSIC;
                            }
                            eey eeyVarJ4 = this.h.j(z3);
                            List list8 = list;
                            CurrentTrackMetadata currentTrackMetadataO4 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                            boolean z9 = !zIsEmpty;
                            List<u011> list9 = list8;
                            arrayList = new ArrayList(q7h.U(list9, 10));
                            while (r3.hasNext()) {
                                arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                                z3 = z3;
                            }
                            return new WidgetState.ActiveSession(currentTrackMetadataO4, arrayList, contentType, playPauseState, previous, ikoVar6, str10, z9, zJ, str14, eeyVarJ4.b(), eeyVarJ4.a(), z3, p85Var.e(), this.j);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str6 = str2;
                        str7 = str3;
                        ikoVar2 = ikoVar;
                        str8 = str4;
                        z2 = z;
                        Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                        ae5Var.e(str5, 1, th);
                        list = z6x.a;
                        str10 = str5;
                        String str15 = str8;
                        z3 = z2;
                        iko ikoVar7 = ikoVar2;
                        if (list.isEmpty()) {
                            ae5Var.d(1, str10);
                        }
                        contextTrack = (ContextTrack) playerState2.track().b();
                        contextTrack.getClass();
                        if (l4o1.P(contextTrack)) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (playerState2.isPlaying()) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (!z5) {
                            if (!z5) {
                                if (z5) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                            } else if (z5) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                        } else if (!z5) {
                            if (z5) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                        } else if (z5) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                        if (z4) {
                            zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                        } else {
                            zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                        }
                        contextTrack2 = (ContextTrack) playerState2.track().h();
                        if (contextTrack2 != null) {
                            zJ = l4o1.J(contextTrack2);
                        } else {
                            zJ = false;
                        }
                        p85Var = this.d;
                        if (p85Var.h()) {
                            previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                        } else {
                            contextTrack3 = (ContextTrack) playerState2.track().b();
                            contextTrack3.getClass();
                            if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                                zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                            } else {
                                zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                            }
                            previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                        }
                        if (l4o1.E(contextTrack)) {
                            contentType = WidgetState.ContentType.AD;
                        } else if (z4) {
                            contentType = WidgetState.ContentType.TALK;
                        } else {
                            contentType = WidgetState.ContentType.MUSIC;
                        }
                        eey eeyVarJ5 = this.h.j(z3);
                        List list10 = list;
                        CurrentTrackMetadata currentTrackMetadataO5 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                        boolean z10 = !zIsEmpty;
                        List<u011> list11 = list10;
                        arrayList = new ArrayList(q7h.U(list11, 10));
                        while (r3.hasNext()) {
                            arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                            z3 = z3;
                        }
                        return new WidgetState.ActiveSession(currentTrackMetadataO5, arrayList, contentType, playPauseState, previous, ikoVar7, str10, z10, zJ, str15, eeyVarJ5.b(), eeyVarJ5.a(), z3, p85Var.e(), this.j);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    b7g1Var2 = b7g1Var;
                    str6 = str2;
                    str7 = str3;
                    ikoVar2 = ikoVar;
                    str8 = str4;
                    z2 = z;
                    Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                    ae5Var.e(str5, 1, th);
                    list = z6x.a;
                    str10 = str5;
                    String str16 = str8;
                    z3 = z2;
                    iko ikoVar8 = ikoVar2;
                    if (list.isEmpty()) {
                        ae5Var.d(1, str10);
                    }
                    contextTrack = (ContextTrack) playerState2.track().b();
                    contextTrack.getClass();
                    if (l4o1.P(contextTrack)) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (playerState2.isPlaying()) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        if (!z5) {
                            if (z5) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                        } else if (z5) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                    } else if (!z5) {
                        if (z5) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                    } else if (z5) {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    } else {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    }
                    if (z4) {
                        zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                    } else {
                        zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                    }
                    contextTrack2 = (ContextTrack) playerState2.track().h();
                    if (contextTrack2 != null) {
                        zJ = l4o1.J(contextTrack2);
                    } else {
                        zJ = false;
                    }
                    p85Var = this.d;
                    if (p85Var.h()) {
                        previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                    } else {
                        contextTrack3 = (ContextTrack) playerState2.track().b();
                        contextTrack3.getClass();
                        if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                            zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                        } else {
                            zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                        }
                        previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                    }
                    if (l4o1.E(contextTrack)) {
                        contentType = WidgetState.ContentType.AD;
                    } else if (z4) {
                        contentType = WidgetState.ContentType.TALK;
                    } else {
                        contentType = WidgetState.ContentType.MUSIC;
                    }
                    eey eeyVarJ6 = this.h.j(z3);
                    List list12 = list;
                    CurrentTrackMetadata currentTrackMetadataO6 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                    boolean z11 = !zIsEmpty;
                    List<u011> list13 = list12;
                    arrayList = new ArrayList(q7h.U(list13, 10));
                    while (r3.hasNext()) {
                        arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                        z3 = z3;
                    }
                    return new WidgetState.ActiveSession(currentTrackMetadataO6, arrayList, contentType, playPauseState, previous, ikoVar8, str10, z11, zJ, str16, eeyVarJ6.b(), eeyVarJ6.a(), z3, p85Var.e(), this.j);
                }
            } catch (Throwable th8) {
                th = th8;
                playerState2 = playerState;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z12 = cf0Var.h;
            String str17 = cf0Var.g;
            iko ikoVar9 = cf0Var.f;
            String str18 = cf0Var.e;
            String str19 = cf0Var.d;
            b7g1 b7g1Var3 = cf0Var.c;
            PlayerState playerState3 = cf0Var.b;
            str9 = cf0Var.a;
            try {
                hm5.M(objD);
                str8 = str17;
                playerState2 = playerState3;
                ikoVar2 = ikoVar9;
                b7g1Var2 = b7g1Var3;
                str7 = str18;
                str6 = str19;
                z2 = z12;
            } catch (Throwable th9) {
                th = th9;
                str8 = str17;
                playerState2 = playerState3;
                ikoVar2 = ikoVar9;
                b7g1Var2 = b7g1Var3;
                str7 = str18;
                str6 = str19;
                z2 = z12;
                str5 = str9;
                Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
                ae5Var.e(str5, 1, th);
                list = z6x.a;
                str10 = str5;
                String str110 = str8;
                z3 = z2;
                iko ikoVar10 = ikoVar2;
                if (list.isEmpty()) {
                    ae5Var.d(1, str10);
                }
                contextTrack = (ContextTrack) playerState2.track().b();
                contextTrack.getClass();
                if (l4o1.P(contextTrack)) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (playerState2.isPlaying()) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    if (!z5) {
                        if (z5) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                    } else if (z5) {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    } else {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    }
                } else if (!z5) {
                    if (z5) {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    } else {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    }
                } else if (z5) {
                    playPauseState = WidgetState.PlayPauseState.PLAY;
                } else {
                    playPauseState = WidgetState.PlayPauseState.PLAY;
                }
                if (z4) {
                    zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                } else {
                    zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                }
                contextTrack2 = (ContextTrack) playerState2.track().h();
                if (contextTrack2 != null) {
                    zJ = l4o1.J(contextTrack2);
                } else {
                    zJ = false;
                }
                p85Var = this.d;
                if (p85Var.h()) {
                    previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                } else {
                    contextTrack3 = (ContextTrack) playerState2.track().b();
                    contextTrack3.getClass();
                    if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                        zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                    } else {
                        zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                    }
                    previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                }
                if (l4o1.E(contextTrack)) {
                    contentType = WidgetState.ContentType.AD;
                } else if (z4) {
                    contentType = WidgetState.ContentType.TALK;
                } else {
                    contentType = WidgetState.ContentType.MUSIC;
                }
                eey eeyVarJ7 = this.h.j(z3);
                List list14 = list;
                CurrentTrackMetadata currentTrackMetadataO7 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
                boolean z13 = !zIsEmpty;
                List<u011> list15 = list14;
                arrayList = new ArrayList(q7h.U(list15, 10));
                while (r3.hasNext()) {
                    arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
                    z3 = z3;
                }
                return new WidgetState.ActiveSession(currentTrackMetadataO7, arrayList, contentType, playPauseState, previous, ikoVar10, str10, z13, zJ, str110, eeyVarJ7.b(), eeyVarJ7.a(), z3, p85Var.e(), this.j);
            }
        }
        try {
            list = (List) objD;
            str10 = str9;
        } catch (Throwable th10) {
            th = th10;
            str5 = str9;
            Logger.l(th, "The widget couldn't load recommendations", new Object[0]);
            ae5Var.e(str5, 1, th);
            list = z6x.a;
            str10 = str5;
        }
        String str111 = str8;
        z3 = z2;
        iko ikoVar11 = ikoVar2;
        if (list.isEmpty()) {
            ae5Var.d(1, str10);
        }
        contextTrack = (ContextTrack) playerState2.track().b();
        contextTrack.getClass();
        if (l4o1.P(contextTrack) || l4o1.G(contextTrack) || l4o1.Q(contextTrack)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (playerState2.isPlaying() || playerState2.isPaused()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && playerState2.restrictions().disallowPausingReasons().isEmpty()) {
            playPauseState = WidgetState.PlayPauseState.PAUSE;
        } else if (!z5 && !playerState2.restrictions().disallowPausingReasons().isEmpty()) {
            playPauseState = WidgetState.PlayPauseState.PAUSE_DISABLED;
        } else if (z5 || playerState2.restrictions().disallowResumingReasons().isEmpty()) {
            playPauseState = WidgetState.PlayPauseState.PLAY;
        } else {
            playPauseState = WidgetState.PlayPauseState.PLAY_DISABLED;
        }
        if (z4) {
            zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
        } else {
            zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
        }
        contextTrack2 = (ContextTrack) playerState2.track().h();
        if (contextTrack2 != null) {
            zJ = l4o1.J(contextTrack2);
        } else {
            zJ = false;
        }
        p85Var = this.d;
        if (p85Var.h()) {
            previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
        } else {
            contextTrack3 = (ContextTrack) playerState2.track().b();
            contextTrack3.getClass();
            if (!l4o1.P(contextTrack3) || l4o1.G(contextTrack3) || l4o1.Q(contextTrack3)) {
                zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
            } else {
                zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
            }
            previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
        }
        if (l4o1.E(contextTrack)) {
            contentType = WidgetState.ContentType.AD;
        } else if (z4) {
            contentType = WidgetState.ContentType.TALK;
        } else {
            contentType = WidgetState.ContentType.MUSIC;
        }
        eey eeyVarJ8 = this.h.j(z3);
        List list16 = list;
        CurrentTrackMetadata currentTrackMetadataO8 = this.i.o(contextTrack, b7g1Var2, str6, str7, playerState2.contextUri());
        boolean z14 = !zIsEmpty;
        List<u011> list17 = list16;
        arrayList = new ArrayList(q7h.U(list17, 10));
        while (r3.hasNext()) {
            arrayList.add(u011.a(u011Var, (String) null, this.e.h(u011Var.b()), 23));
            z3 = z3;
        }
        return new WidgetState.ActiveSession(currentTrackMetadataO8, arrayList, contentType, playPauseState, previous, ikoVar11, str10, z14, zJ, str111, eeyVarJ8.b(), eeyVarJ8.a(), z3, p85Var.e(), this.j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(ContextTrack contextTrack, t45 t45Var, onm onmVar) {
        df0 df0Var;
        if (onmVar instanceof df0) {
            df0Var = (df0) onmVar;
            int i = df0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                df0Var.d = i - Integer.MIN_VALUE;
            } else {
                df0Var = new df0(this, onmVar);
            }
        } else {
            df0Var = new df0(this, onmVar);
        }
        Object objA = df0Var.b;
        int i2 = df0Var.d;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objA);
                    t45Var.getClass();
                    t45Var.l("curation_state_fetch_active", null, (2 & 4) != 0);
                    om40 om40Var = this.f;
                    df0Var.a = t45Var;
                    df0Var.d = 1;
                    objA = om40Var.a(contextTrack, df0Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t45Var = df0Var.a;
                    hm5.M(objA);
                }
                iko ikoVar = (iko) objA;
                t45Var.g("curation_state_fetch_active");
                return ikoVar;
            } finally {
                t45Var.g("curation_state_fetch_active");
            }
        } catch (Throwable unused) {
            return iko.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ContextTrack contextTrack, String str2, String str3, t45 t45Var, onm onmVar) {
        ef0 ef0Var;
        if (onmVar instanceof ef0) {
            ef0Var = (ef0) onmVar;
            int i = ef0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef0Var.f = i - Integer.MIN_VALUE;
            } else {
                ef0Var = new ef0(this, onmVar);
            }
        } else {
            ef0Var = new ef0(this, onmVar);
        }
        Object objA = ef0Var.d;
        int i2 = ef0Var.f;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                t45Var.getClass();
                t45Var.l("color_extraction_active", null, (2 & 4) != 0);
                p8h p8hVar = this.b;
                String strUri = contextTrack.uri();
                ef0Var.a = str;
                ef0Var.b = str2;
                ef0Var.c = t45Var;
                ef0Var.f = 1;
                objA = p8hVar.a(str2, strUri, str3, ef0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t45Var = ef0Var.c;
                str2 = ef0Var.b;
                str = ef0Var.a;
                hm5.M(objA);
            }
            String str4 = (String) objA;
            t45Var.g("color_extraction_active");
            return str4;
        } catch (Throwable th) {
            try {
                this.c.a(str, str2, th);
                return "";
            } finally {
                t45Var.g("color_extraction_active");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(t45 t45Var, onm onmVar) {
        ff0 ff0Var;
        if (onmVar instanceof ff0) {
            ff0Var = (ff0) onmVar;
            int i = ff0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ff0Var.d = i - Integer.MIN_VALUE;
            } else {
                ff0Var = new ff0(this, onmVar);
            }
        } else {
            ff0Var = new ff0(this, onmVar);
        }
        Object objJ = ff0Var.b;
        int i2 = ff0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            t45Var.getClass();
            t45Var.l("recommendations_loading_active", null, (2 & 4) != 0);
            ff0Var.a = t45Var;
            ff0Var.d = 1;
            objJ = this.a.j(ff0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t45Var = ff0Var.a;
            hm5.M(objJ);
        }
        l111 l111Var = (l111) objJ;
        t45Var.a("recommendations_cached", z5c.b(l111Var.a()));
        t45Var.g("recommendations_loading_active");
        return l111Var.b();
    }
}
