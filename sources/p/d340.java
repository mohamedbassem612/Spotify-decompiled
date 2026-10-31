package p;

import com.spotify.gamesservice.musicguesser.v1.Game;
import com.spotify.gamesservice.musicguesser.v1.GameMetadata;
import com.spotify.gamesservice.musicguesser.v1.GamePageElements;
import com.spotify.gamesservice.musicguesser.v1.GetGameResponse;
import com.spotify.gamesservice.musicguesser.v1.Question;
import com.spotify.gamesservice.musicguesser.v1.ScoreThresholdMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d340 {
    public final yqg a;
    public final gw70 b;
    public final upa0 c;
    public final xmu0 d;
    public final cz30 e;
    public final h3n0 f;

    public d340(yqg yqgVar, gw70 gw70Var, upa0 upa0Var, xmu0 xmu0Var, cz30 cz30Var, h3n0 h3n0Var) {
        this.a = yqgVar;
        this.b = gw70Var;
        this.c = upa0Var;
        this.d = xmu0Var;
        this.e = cz30Var;
        this.f = h3n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x030a  */
    /* JADX WARN: Code duplicated, block: B:109:0x031f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0321  */
    /* JADX WARN: Code duplicated, block: B:111:0x0323  */
    /* JADX WARN: Code duplicated, block: B:112:0x0325  */
    /* JADX WARN: Code duplicated, block: B:113:0x0327  */
    /* JADX WARN: Code duplicated, block: B:114:0x0329  */
    /* JADX WARN: Code duplicated, block: B:118:0x0345  */
    /* JADX WARN: Code duplicated, block: B:119:0x0347  */
    /* JADX WARN: Code duplicated, block: B:122:0x0364  */
    /* JADX WARN: Code duplicated, block: B:125:0x0374  */
    /* JADX WARN: Code duplicated, block: B:130:0x0393  */
    /* JADX WARN: Code duplicated, block: B:132:0x0397  */
    /* JADX WARN: Code duplicated, block: B:142:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba A[LOOP:1: B:56:0x01b4->B:58:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0214  */
    /* JADX WARN: Code duplicated, block: B:65:0x0243  */
    /* JADX WARN: Code duplicated, block: B:69:0x025e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0260  */
    /* JADX WARN: Code duplicated, block: B:71:0x0262  */
    /* JADX WARN: Code duplicated, block: B:72:0x0264  */
    /* JADX WARN: Code duplicated, block: B:73:0x0266  */
    /* JADX WARN: Code duplicated, block: B:77:0x0288  */
    /* JADX WARN: Code duplicated, block: B:80:0x0298  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e5  */
    public final Object a(String str, onm onmVar) {
        c340 c340Var;
        String str2;
        String str3;
        GetGameResponse getGameResponse;
        Map map;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        ArrayList arrayList;
        boolean z;
        GetGameResponse getGameResponse2;
        Object obj;
        ArrayList arrayList2;
        Iterator it;
        boolean zHasNext;
        ko41 ko41Var;
        ko41 ko41Var2;
        ko41 ko41Var3;
        ko41 ko41Var4;
        ko41 ko41Var5;
        ko41 ko41Var6;
        boolean z2;
        GamePageElements gamePageElementsP;
        String str4;
        LinkedHashMap linkedHashMap;
        int iS;
        LinkedHashMap linkedHashMap2;
        n5r0 n5r0Var;
        int i;
        long jB;
        Iterator it2;
        int iN;
        int iN2;
        jo41 jo41VarN;
        ko41 ko41Var7;
        int iS2;
        jo41 jo41VarN2;
        ko41 ko41Var8;
        jo41 jo41VarP;
        ArrayList arrayList3;
        String str5 = str;
        if (onmVar instanceof c340) {
            c340Var = (c340) onmVar;
            int i2 = c340Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c340Var.f = i2 - Integer.MIN_VALUE;
            } else {
                c340Var = new c340(this, onmVar);
            }
        } else {
            c340Var = new c340(this, onmVar);
        }
        c340 c340Var2 = c340Var;
        Object objA = c340Var2.d;
        int i3 = c340Var2.f;
        Object obj2 = null;
        int i4 = 10;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objA);
            if (ihc1.y0(str5)) {
                hhg1.n("MusicGuesser:Gameplay: missing game ID");
                return null;
            }
            c340Var2.a = str5;
            c340Var2.f = 1;
            objA = this.f.a(str5, c340Var2);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            str5 = c340Var2.a;
            hm5.M(objA);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = c340Var2.c;
            getGameResponse = c340Var2.b;
            String str6 = c340Var2.a;
            hm5.M(objA);
            str2 = str6;
        }
        yvg1 yvg1Var = (yvg1) objA;
        map = (Map) yvg1Var.a;
        zBooleanValue = ((Boolean) yvg1Var.b).booleanValue();
        zBooleanValue2 = ((Boolean) yvg1Var.c).booleanValue();
        h290<Question> h290VarP = getGameResponse.n().p();
        arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (Question question : h290VarP) {
            String strO = ((GameMetadata.TrackMetadata) sqg0.G(question.p(), getGameResponse.o().p())).o();
            strO.getClass();
            String str7 = (String) sqg0.G(strO, map);
            h290<String> h290VarO = question.o();
            Object obj3 = obj2;
            arrayList3 = new ArrayList(q7h.U(h290VarO, i4));
            for (String str8 : h290VarO) {
                GameMetadata.ArtistMetadata artistMetadata = (GameMetadata.ArtistMetadata) sqg0.G(str8, getGameResponse.o().n());
                str8.getClass();
                arrayList3.add(new c5g(str8, artistMetadata.getDisplayName(), artistMetadata.getImageUrl()));
                zBooleanValue2 = zBooleanValue2;
                getGameResponse = getGameResponse;
            }
            arrayList.add(new l1z0(strO, str7, question.n(), arrayList3));
            zBooleanValue2 = zBooleanValue2;
            obj2 = obj3;
            getGameResponse = getGameResponse;
            i4 = 10;
        }
        z = zBooleanValue2;
        getGameResponse2 = getGameResponse;
        obj = obj2;
        if (!arrayList.isEmpty()) {
            eg.m("No questions found in game data");
            return obj;
        }
        h290 h290VarO2 = getGameResponse2.n().n().o();
        arrayList2 = new ArrayList(q7h.U(h290VarO2, 10));
        it = h290VarO2.iterator();
        while (true) {
            zHasNext = it.hasNext();
            ko41Var = ko41.a;
            ko41Var2 = ko41.c;
            ko41Var3 = ko41.d;
            ko41Var4 = ko41.e;
            ko41Var5 = ko41.f;
            ko41Var6 = ko41.b;
            if (zHasNext) {
                z2 = zBooleanValue;
                gamePageElementsP = getGameResponse2.p();
                str4 = (String) map.get(str3);
                if (str4 == null) {
                    str4 = "";
                }
                String str9 = str4;
                String strO2 = gamePageElementsP.o();
                String strN = gamePageElementsP.n();
                if (z2) {
                    h290<ScoreThresholdMap> h290VarS = gamePageElementsP.s();
                    iS2 = zno1.s(q7h.U(h290VarS, 10));
                    if (iS2 < 16) {
                        iS2 = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iS2);
                    for (ScoreThresholdMap scoreThresholdMap : h290VarS) {
                        jo41VarN2 = scoreThresholdMap.n();
                        switch (jo41VarN2.ordinal()) {
                            case 1:
                                ko41Var8 = ko41Var;
                                break;
                            case 2:
                                ko41Var8 = ko41Var2;
                                break;
                            case 3:
                                ko41Var8 = ko41Var3;
                                break;
                            case 4:
                                ko41Var8 = ko41Var4;
                                break;
                            case 5:
                                ko41Var8 = ko41Var5;
                                break;
                            case 6:
                                ko41Var8 = ko41Var6;
                                break;
                            default:
                                hhg1.o(jo41VarN2, "Unrecognized score threshold: ");
                                return obj;
                        }
                        linkedHashMap.put(ko41Var8, scoreThresholdMap.getValue());
                    }
                } else {
                    linkedHashMap = b7x.a;
                }
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                h290<ScoreThresholdMap> h290VarT = gamePageElementsP.t();
                iS = zno1.s(q7h.U(h290VarT, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap2 = new LinkedHashMap(iS);
                for (ScoreThresholdMap scoreThresholdMap2 : h290VarT) {
                    jo41VarN = scoreThresholdMap2.n();
                    switch (jo41VarN.ordinal()) {
                        case 1:
                            ko41Var7 = ko41Var;
                            break;
                        case 2:
                            ko41Var7 = ko41Var2;
                            break;
                        case 3:
                            ko41Var7 = ko41Var3;
                            break;
                        case 4:
                            ko41Var7 = ko41Var4;
                            break;
                        case 5:
                            ko41Var7 = ko41Var5;
                            break;
                        case 6:
                            ko41Var7 = ko41Var6;
                            break;
                        default:
                            hhg1.o(jo41VarN, "Unrecognized score threshold: ");
                            return obj;
                    }
                    linkedHashMap2.put(ko41Var7, scoreThresholdMap2.getValue());
                }
                n5r0Var = new n5r0(strO2, strN, linkedHashMap3, linkedHashMap2, gamePageElementsP.p(), gamePageElementsP.u(), str9);
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                jB = this.a.b();
                it2 = getGameResponse2.n().n().o().iterator();
                if (it2.hasNext()) {
                    hhg1.k();
                    return obj;
                }
                iN = ((Game.Config.ScoreCriteria) it2.next()).n();
                while (it2.hasNext()) {
                    iN2 = ((Game.Config.ScoreCriteria) it2.next()).n();
                    if (iN < iN2) {
                        iN = iN2;
                    }
                }
                return new e340(str2, arrayList, arrayList2, 0, i, jB, n5r0Var, iN, z6x.a);
            }
            Game.Config.ScoreCriteria scoreCriteria = (Game.Config.ScoreCriteria) it.next();
            Iterator it3 = it;
            boolean z3 = zBooleanValue;
            jo41VarP = scoreCriteria.p();
            switch (jo41VarP.ordinal()) {
                case 1:
                    break;
                case 2:
                    ko41Var = ko41Var2;
                    break;
                case 3:
                    ko41Var = ko41Var3;
                    break;
                case 4:
                    ko41Var = ko41Var4;
                    break;
                case 5:
                    ko41Var = ko41Var5;
                    break;
                case 6:
                    ko41Var = ko41Var6;
                    break;
                default:
                    hhg1.o(jo41VarP, "Unrecognized score threshold: ");
                    return obj;
            }
            arrayList2.add(new mo41(ko41Var, scoreCriteria.o(), scoreCriteria.n()));
            it = it3;
            zBooleanValue = z3;
        }
        str2 = str5;
        sy21 sy21Var = (sy21) objA;
        ry21 ry21Var = sy21Var.a;
        if (!ry21Var.Q0) {
            throw new IllegalStateException(("Failed to load game state: " + ry21Var.d).toString());
        }
        GetGameResponse getGameResponse3 = (GetGameResponse) sy21Var.b;
        if (getGameResponse3 == null) {
            eg.m("Empty response body");
            return null;
        }
        h290 h290VarP2 = getGameResponse3.n().p();
        ArrayList arrayList4 = new ArrayList(q7h.U(h290VarP2, 10));
        Iterator it4 = h290VarP2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((GameMetadata.TrackMetadata) sqg0.G(((Question) it4.next()).p(), getGameResponse3.o().p())).o());
        }
        h290 h290VarS2 = getGameResponse3.p().s();
        ArrayList arrayList5 = new ArrayList(q7h.U(h290VarS2, 10));
        Iterator it5 = h290VarS2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((ScoreThresholdMap) it5.next()).getValue());
        }
        h290 h290VarP3 = getGameResponse3.n().p();
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = h290VarP3.iterator();
        while (it6.hasNext()) {
            r7h.W(((Question) it6.next()).o(), arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            GameMetadata.ArtistMetadata artistMetadata2 = (GameMetadata.ArtistMetadata) getGameResponse3.o().n().get((String) it7.next());
            String imageUrl = artistMetadata2 != null ? artistMetadata2.getImageUrl() : null;
            if (imageUrl != null) {
                arrayList7.add(imageUrl);
            }
        }
        String strQ = getGameResponse3.p().q();
        ie6 ie6Var = new ie6(strQ, arrayList4, this, arrayList5, getGameResponse3, arrayList7, (lnm) null);
        c340Var2.a = str2;
        c340Var2.b = getGameResponse3;
        c340Var2.c = strQ;
        c340Var2.f = 2;
        Object objS = smo1.s(ie6Var, c340Var2);
        if (objS != d9nVar) {
            objA = objS;
            str3 = strQ;
            getGameResponse = getGameResponse3;
            yvg1 yvg1Var2 = (yvg1) objA;
            map = (Map) yvg1Var2.a;
            zBooleanValue = ((Boolean) yvg1Var2.b).booleanValue();
            zBooleanValue2 = ((Boolean) yvg1Var2.c).booleanValue();
            h290<Question> h290VarP4 = getGameResponse.n().p();
            arrayList = new ArrayList(q7h.U(h290VarP4, 10));
            while (r6.hasNext()) {
                String strO3 = ((GameMetadata.TrackMetadata) sqg0.G(question.p(), getGameResponse.o().p())).o();
                strO3.getClass();
                String str10 = (String) sqg0.G(strO3, map);
                h290<String> h290VarO3 = question.o();
                Object obj4 = obj2;
                arrayList3 = new ArrayList(q7h.U(h290VarO3, i4));
                while (r9.hasNext()) {
                    GameMetadata.ArtistMetadata artistMetadata3 = (GameMetadata.ArtistMetadata) sqg0.G(str8, getGameResponse.o().n());
                    str8.getClass();
                    arrayList3.add(new c5g(str8, artistMetadata3.getDisplayName(), artistMetadata3.getImageUrl()));
                    zBooleanValue2 = zBooleanValue2;
                    getGameResponse = getGameResponse;
                }
                arrayList.add(new l1z0(strO3, str10, question.n(), arrayList3));
                zBooleanValue2 = zBooleanValue2;
                obj2 = obj4;
                getGameResponse = getGameResponse;
                i4 = 10;
            }
            z = zBooleanValue2;
            getGameResponse2 = getGameResponse;
            obj = obj2;
            if (!arrayList.isEmpty()) {
                eg.m("No questions found in game data");
                return obj;
            }
            h290 h290VarO4 = getGameResponse2.n().n().o();
            arrayList2 = new ArrayList(q7h.U(h290VarO4, 10));
            it = h290VarO4.iterator();
            while (true) {
                zHasNext = it.hasNext();
                ko41Var = ko41.a;
                ko41Var2 = ko41.c;
                ko41Var3 = ko41.d;
                ko41Var4 = ko41.e;
                ko41Var5 = ko41.f;
                ko41Var6 = ko41.b;
                if (zHasNext) {
                    z2 = zBooleanValue;
                    gamePageElementsP = getGameResponse2.p();
                    str4 = (String) map.get(str3);
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str11 = str4;
                    String strO4 = gamePageElementsP.o();
                    String strN2 = gamePageElementsP.n();
                    if (z2) {
                        h290<ScoreThresholdMap> h290VarS3 = gamePageElementsP.s();
                        iS2 = zno1.s(q7h.U(h290VarS3, 10));
                        if (iS2 < 16) {
                            iS2 = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iS2);
                        while (r4.hasNext()) {
                            jo41VarN2 = scoreThresholdMap.n();
                            switch (jo41VarN2.ordinal()) {
                                case 1:
                                    ko41Var8 = ko41Var;
                                    break;
                                case 2:
                                    ko41Var8 = ko41Var2;
                                    break;
                                case 3:
                                    ko41Var8 = ko41Var3;
                                    break;
                                case 4:
                                    ko41Var8 = ko41Var4;
                                    break;
                                case 5:
                                    ko41Var8 = ko41Var5;
                                    break;
                                case 6:
                                    ko41Var8 = ko41Var6;
                                    break;
                                default:
                                    hhg1.o(jo41VarN2, "Unrecognized score threshold: ");
                                    return obj;
                            }
                            linkedHashMap.put(ko41Var8, scoreThresholdMap.getValue());
                        }
                    } else {
                        linkedHashMap = b7x.a;
                    }
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    h290<ScoreThresholdMap> h290VarT2 = gamePageElementsP.t();
                    iS = zno1.s(q7h.U(h290VarT2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(iS);
                    while (r0.hasNext()) {
                        jo41VarN = scoreThresholdMap2.n();
                        switch (jo41VarN.ordinal()) {
                            case 1:
                                ko41Var7 = ko41Var;
                                break;
                            case 2:
                                ko41Var7 = ko41Var2;
                                break;
                            case 3:
                                ko41Var7 = ko41Var3;
                                break;
                            case 4:
                                ko41Var7 = ko41Var4;
                                break;
                            case 5:
                                ko41Var7 = ko41Var5;
                                break;
                            case 6:
                                ko41Var7 = ko41Var6;
                                break;
                            default:
                                hhg1.o(jo41VarN, "Unrecognized score threshold: ");
                                return obj;
                        }
                        linkedHashMap2.put(ko41Var7, scoreThresholdMap2.getValue());
                    }
                    n5r0Var = new n5r0(strO4, strN2, linkedHashMap4, linkedHashMap2, gamePageElementsP.p(), gamePageElementsP.u(), str11);
                    if (z) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jB = this.a.b();
                    it2 = getGameResponse2.n().n().o().iterator();
                    if (it2.hasNext()) {
                        hhg1.k();
                        return obj;
                    }
                    iN = ((Game.Config.ScoreCriteria) it2.next()).n();
                    while (it2.hasNext()) {
                        iN2 = ((Game.Config.ScoreCriteria) it2.next()).n();
                        if (iN < iN2) {
                            iN = iN2;
                        }
                    }
                    return new e340(str2, arrayList, arrayList2, 0, i, jB, n5r0Var, iN, z6x.a);
                }
                Game.Config.ScoreCriteria scoreCriteria2 = (Game.Config.ScoreCriteria) it.next();
                Iterator it8 = it;
                boolean z4 = zBooleanValue;
                jo41VarP = scoreCriteria2.p();
                switch (jo41VarP.ordinal()) {
                    case 1:
                        break;
                    case 2:
                        ko41Var = ko41Var2;
                        break;
                    case 3:
                        ko41Var = ko41Var3;
                        break;
                    case 4:
                        ko41Var = ko41Var4;
                        break;
                    case 5:
                        ko41Var = ko41Var5;
                        break;
                    case 6:
                        ko41Var = ko41Var6;
                        break;
                    default:
                        hhg1.o(jo41VarP, "Unrecognized score threshold: ");
                        return obj;
                }
                arrayList2.add(new mo41(ko41Var, scoreCriteria2.o(), scoreCriteria2.n()));
                it = it8;
                zBooleanValue = z4;
            }
        }
        return d9nVar;
    }

    public final o6e0 b(String str) {
        return new o6e0(new fpo(this, str, (lnm) null, (byte) 10), f46.I(new p6e0[0]));
    }
}
