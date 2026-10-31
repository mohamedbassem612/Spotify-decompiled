package p;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.musicquizservice.v1.AnswerExplanation;
import com.spotify.musicquizservice.v1.CompleteQuizRequest;
import com.spotify.musicquizservice.v1.CompleteQuizResponse;
import com.spotify.musicquizservice.v1.GetQuizMetadataRequest;
import com.spotify.musicquizservice.v1.GetQuizMetadataResponse;
import com.spotify.musicquizservice.v1.GetRoundRequest;
import com.spotify.musicquizservice.v1.GetRoundResponse;
import com.spotify.musicquizservice.v1.ImageQuestion;
import com.spotify.musicquizservice.v1.LottieAnimation;
import com.spotify.musicquizservice.v1.MultipleChoiceAnswer;
import com.spotify.musicquizservice.v1.MusicIdentifierQuestion;
import com.spotify.musicquizservice.v1.Question;
import com.spotify.musicquizservice.v1.QuestionFeedback;
import com.spotify.musicquizservice.v1.RateQuestionRequest;
import com.spotify.musicquizservice.v1.RateQuestionResponse;
import com.spotify.musicquizservice.v1.ReportAnswer;
import com.spotify.musicquizservice.v1.RoundMetadata;
import com.spotify.musicquizservice.v1.Source;
import com.spotify.musicquizservice.v1.k;
import com.spotify.musicquizservice.v1.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i6n0 {
    public final q7n0 a;

    public i6n0(q7n0 q7n0Var) {
        this.a = q7n0Var;
    }

    public static ljz0 e(GetQuizMetadataResponse getQuizMetadataResponse) {
        h290<GetQuizMetadataResponse.RoundMetadata> h290VarR = getQuizMetadataResponse.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        for (GetQuizMetadataResponse.RoundMetadata roundMetadata : h290VarR) {
            roundMetadata.getClass();
            String imageUrl = roundMetadata.getImageUrl();
            String strN = roundMetadata.n();
            h290 h290VarO = roundMetadata.o();
            String strQ = roundMetadata.q();
            LottieAnimation lottieAnimationP = roundMetadata.p();
            arrayList.add(new xp31(imageUrl, strN, h290VarO, strQ, new pbf0(lottieAnimationP.p(), lottieAnimationP.o())));
        }
        LottieAnimation lottieAnimationO = getQuizMetadataResponse.o();
        return new ljz0(arrayList, new pbf0(lottieAnimationO.p(), lottieAnimationO.o()), getQuizMetadataResponse.n(), getQuizMetadataResponse.q(), getQuizMetadataResponse.p());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:104:0x0200  */
    /* JADX WARN: Code duplicated, block: B:106:0x020b  */
    /* JADX WARN: Code duplicated, block: B:108:0x020e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0214  */
    /* JADX WARN: Code duplicated, block: B:114:0x0218  */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:124:0x025b  */
    /* JADX WARN: Code duplicated, block: B:129:0x028c A[LOOP:2: B:127:0x0286->B:129:0x028c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:149:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:78:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d7  */
    public static vp31 f(RoundMetadata roundMetadata) {
        Long lValueOf;
        x3z0 u3z0Var;
        x3z0 t3z0Var;
        int iO;
        int i;
        String strP;
        AnswerExplanation answerExplanationN;
        int iU;
        int i2;
        String str;
        String str2;
        vkk1 vkk1Var;
        ArrayList arrayList;
        String strT;
        vkk1 tkk1Var;
        ArrayList arrayList2;
        int iN;
        int i3;
        h67 e67Var;
        AnswerExplanation.ImageAsset imageAssetO;
        int iO2;
        int i4;
        zz70 yz70Var;
        AnswerExplanation.VideoAsset videoAssetP;
        int iP;
        int i5;
        j2k1 h2k1Var;
        String strQ = roundMetadata.q();
        String title = roundMetadata.getTitle();
        String imageUrl = roundMetadata.hasImageUrl() ? roundMetadata.getImageUrl() : null;
        String description = roundMetadata.getDescription();
        h290 h290VarO = roundMetadata.o();
        int index = roundMetadata.getIndex();
        h290 h290VarP = roundMetadata.p();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarP, 10));
        Iterator it = h290VarP.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!zHasNext) {
                String str3 = imageUrl;
                String str4 = strQ;
                if (roundMetadata.hasUpdatedAt()) {
                    Timestamp updatedAt = roundMetadata.getUpdatedAt();
                    lValueOf = Long.valueOf((((long) updatedAt.p()) / 1000000) + timeUnit.toMillis(updatedAt.q()));
                } else {
                    lValueOf = null;
                }
                return new vp31(str4, title, str3, description, h290VarO, index, arrayList3, lValueOf);
            }
            Question question = (Question) it.next();
            question.getClass();
            int iV = question.v();
            int i6 = -1;
            int i7 = iV == 0 ? -1 : d6n0.a[l1d.C(iV)];
            if (i7 != -1) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        u3z0Var = new w3z0(question.y().o());
                    } else if (i7 == 3) {
                        ImageQuestion imageQuestionQ = question.q();
                        t3z0Var = new t3z0(imageQuestionQ.getImageUrl(), imageQuestionQ.p() ? imageQuestionQ.o() : null);
                    } else if (i7 == 4) {
                        t3z0Var = new v3z0(question.x().o());
                    } else if (i7 != 5) {
                        eg.o();
                        return null;
                    }
                    iO = question.o();
                    if (iO == 0) {
                        i = -1;
                    } else {
                        i = d6n0.b[l1d.C(iO)];
                    }
                    if (i == -1) {
                        if (i != 1) {
                            MultipleChoiceAnswer multipleChoiceAnswerR = question.r();
                            hh5 hh5Var = new hh5(multipleChoiceAnswerR.p(), multipleChoiceAnswerR.n());
                            String strU = question.u();
                            String strW = question.w();
                            Duration durationZ = question.z();
                            long jO = (((long) durationZ.o()) / 1000000) + timeUnit.toMillis(durationZ.p());
                            if (question.A()) {
                                strP = question.p();
                            } else {
                                strP = null;
                            }
                            answerExplanationN = question.n();
                            iU = answerExplanationN.u();
                            if (iU == 0) {
                                i2 = -1;
                            } else {
                                i2 = d6n0.c[l1d.C(iU)];
                            }
                            if (i2 == -1) {
                                str = imageUrl;
                                str2 = strQ;
                                vkk1Var = null;
                            } else {
                                if (i2 != 1) {
                                    str = imageUrl;
                                    str2 = strQ;
                                    tkk1Var = new tkk1(answerExplanationN.o().o());
                                } else if (i2 != 2) {
                                    if (i2 != 3) {
                                        eg.o();
                                        return null;
                                    }
                                    str = imageUrl;
                                    str2 = strQ;
                                    vkk1Var = null;
                                } else {
                                    h290<AnswerExplanation.VisualAsset> h290VarN = answerExplanationN.n().n();
                                    arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                                    for (AnswerExplanation.VisualAsset visualAsset : h290VarN) {
                                        visualAsset.getClass();
                                        iN = visualAsset.n();
                                        if (iN == 0) {
                                            i3 = i6;
                                        } else {
                                            i3 = d6n0.d[l1d.C(iN)];
                                        }
                                        if (i3 == i6) {
                                            if (i3 != 1) {
                                                imageUrl = imageUrl;
                                                imageAssetO = visualAsset.o();
                                                iO2 = imageAssetO.o();
                                                if (iO2 == 0) {
                                                    i4 = -1;
                                                } else {
                                                    i4 = d6n0.e[l1d.C(iO2)];
                                                }
                                                if (i4 == -1) {
                                                    if (i4 != 1) {
                                                        yz70Var = new yz70(imageAssetO.getUrl());
                                                    } else if (i4 != 2) {
                                                        yz70Var = new xz70(imageAssetO.p());
                                                    } else if (i4 != 3) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    e67Var = new e67(yz70Var);
                                                }
                                                hhg1.n("Unknown image source");
                                                return null;
                                            }
                                            if (i3 != 2) {
                                                videoAssetP = visualAsset.p();
                                                iP = videoAssetP.p();
                                                if (iP == 0) {
                                                    i5 = -1;
                                                } else {
                                                    i5 = d6n0.f[l1d.C(iP)];
                                                }
                                                if (i5 == -1) {
                                                    if (i5 != 1) {
                                                        h2k1Var = new h2k1(videoAssetP.o());
                                                    } else if (i5 != 2) {
                                                        h2k1Var = new g2k1(videoAssetP.getManifestId());
                                                    } else if (i5 != 3) {
                                                        h2k1Var = new i2k1(videoAssetP.q());
                                                    } else if (i5 != 4) {
                                                        eg.o();
                                                        return null;
                                                    }
                                                    e67Var = new g67(h2k1Var);
                                                }
                                                hhg1.n("Unknown video source");
                                                return null;
                                            }
                                            if (i3 != 3) {
                                                eg.o();
                                                return null;
                                            }
                                            arrayList2.add(new skk1(e67Var, visualAsset.getDescription()));
                                            imageUrl = imageUrl;
                                            strQ = strQ;
                                            i6 = -1;
                                        }
                                        hhg1.n("Unknown asset source");
                                        return null;
                                    }
                                    str = imageUrl;
                                    str2 = strQ;
                                    tkk1Var = new ukk1(arrayList2);
                                }
                                vkk1Var = tkk1Var;
                            }
                            String strS = answerExplanationN.s();
                            h290<Source> h290VarT = answerExplanationN.t();
                            arrayList = new ArrayList(q7h.U(h290VarT, 10));
                            for (Source source : h290VarT) {
                                source.getClass();
                                arrayList.add(new eka1(source.getTitle(), source.getUrl(), source.n()));
                            }
                            eh5 eh5Var = new eh5(strS, vkk1Var, arrayList, answerExplanationN.r(), answerExplanationN.q());
                            if (question.B()) {
                                strT = question.t();
                            } else {
                                strT = null;
                            }
                            arrayList3.add(new k1z0(strU, strW, t3z0Var, hh5Var, jO, strP, eh5Var, strT));
                            imageUrl = str;
                            strQ = str2;
                        } else if (i != 2) {
                            eg.o();
                            return null;
                        }
                    }
                    hhg1.n("Unknown answer type");
                    return null;
                }
                MusicIdentifierQuestion musicIdentifierQuestionS = question.s();
                u3z0Var = new u3z0(musicIdentifierQuestionS.o(), musicIdentifierQuestionS.q(), musicIdentifierQuestionS.n(), musicIdentifierQuestionS.r());
                t3z0Var = u3z0Var;
                iO = question.o();
                if (iO == 0) {
                    i = -1;
                } else {
                    i = d6n0.b[l1d.C(iO)];
                }
                if (i == -1) {
                    if (i != 1) {
                        MultipleChoiceAnswer multipleChoiceAnswerR2 = question.r();
                        hh5 hh5Var2 = new hh5(multipleChoiceAnswerR2.p(), multipleChoiceAnswerR2.n());
                        String strU2 = question.u();
                        String strW2 = question.w();
                        Duration durationZ2 = question.z();
                        long jO2 = (((long) durationZ2.o()) / 1000000) + timeUnit.toMillis(durationZ2.p());
                        if (question.A()) {
                            strP = question.p();
                        } else {
                            strP = null;
                        }
                        answerExplanationN = question.n();
                        iU = answerExplanationN.u();
                        if (iU == 0) {
                            i2 = -1;
                        } else {
                            i2 = d6n0.c[l1d.C(iU)];
                        }
                        if (i2 == -1) {
                            str = imageUrl;
                            str2 = strQ;
                            vkk1Var = null;
                        } else {
                            if (i2 != 1) {
                                str = imageUrl;
                                str2 = strQ;
                                tkk1Var = new tkk1(answerExplanationN.o().o());
                            } else if (i2 != 2) {
                                if (i2 != 3) {
                                    eg.o();
                                    return null;
                                }
                                str = imageUrl;
                                str2 = strQ;
                                vkk1Var = null;
                            } else {
                                h290<AnswerExplanation.VisualAsset> h290VarN2 = answerExplanationN.n().n();
                                arrayList2 = new ArrayList(q7h.U(h290VarN2, 10));
                                while (r11.hasNext()) {
                                    visualAsset.getClass();
                                    iN = visualAsset.n();
                                    if (iN == 0) {
                                        i3 = i6;
                                    } else {
                                        i3 = d6n0.d[l1d.C(iN)];
                                    }
                                    if (i3 == i6) {
                                        if (i3 != 1) {
                                            imageUrl = imageUrl;
                                            imageAssetO = visualAsset.o();
                                            iO2 = imageAssetO.o();
                                            if (iO2 == 0) {
                                                i4 = -1;
                                            } else {
                                                i4 = d6n0.e[l1d.C(iO2)];
                                            }
                                            if (i4 == -1) {
                                                if (i4 != 1) {
                                                    yz70Var = new yz70(imageAssetO.getUrl());
                                                } else if (i4 != 2) {
                                                    yz70Var = new xz70(imageAssetO.p());
                                                } else if (i4 != 3) {
                                                    eg.o();
                                                    return null;
                                                }
                                                e67Var = new e67(yz70Var);
                                            }
                                            hhg1.n("Unknown image source");
                                            return null;
                                        }
                                        if (i3 != 2) {
                                            videoAssetP = visualAsset.p();
                                            iP = videoAssetP.p();
                                            if (iP == 0) {
                                                i5 = -1;
                                            } else {
                                                i5 = d6n0.f[l1d.C(iP)];
                                            }
                                            if (i5 == -1) {
                                                if (i5 != 1) {
                                                    h2k1Var = new h2k1(videoAssetP.o());
                                                } else if (i5 != 2) {
                                                    h2k1Var = new g2k1(videoAssetP.getManifestId());
                                                } else if (i5 != 3) {
                                                    h2k1Var = new i2k1(videoAssetP.q());
                                                } else if (i5 != 4) {
                                                    eg.o();
                                                    return null;
                                                }
                                                e67Var = new g67(h2k1Var);
                                            }
                                            hhg1.n("Unknown video source");
                                            return null;
                                        }
                                        if (i3 != 3) {
                                            eg.o();
                                            return null;
                                        }
                                        arrayList2.add(new skk1(e67Var, visualAsset.getDescription()));
                                        imageUrl = imageUrl;
                                        strQ = strQ;
                                        i6 = -1;
                                    }
                                    hhg1.n("Unknown asset source");
                                    return null;
                                }
                                str = imageUrl;
                                str2 = strQ;
                                tkk1Var = new ukk1(arrayList2);
                            }
                            vkk1Var = tkk1Var;
                        }
                        String strS2 = answerExplanationN.s();
                        h290<Source> h290VarT2 = answerExplanationN.t();
                        arrayList = new ArrayList(q7h.U(h290VarT2, 10));
                        while (r0.hasNext()) {
                            source.getClass();
                            arrayList.add(new eka1(source.getTitle(), source.getUrl(), source.n()));
                        }
                        eh5 eh5Var2 = new eh5(strS2, vkk1Var, arrayList, answerExplanationN.r(), answerExplanationN.q());
                        if (question.B()) {
                            strT = question.t();
                        } else {
                            strT = null;
                        }
                        arrayList3.add(new k1z0(strU2, strW2, t3z0Var, hh5Var2, jO2, strP, eh5Var2, strT));
                        imageUrl = str;
                        strQ = str2;
                    } else if (i != 2) {
                        eg.o();
                        return null;
                    }
                }
                hhg1.n("Unknown answer type");
                return null;
            }
            hhg1.n("Unknown question type");
            return null;
        }
    }

    public static RateQuestionRequest g(oho1 oho1Var) {
        yrz0 yrz0VarN = RateQuestionRequest.n();
        yrz0VarN.r(oho1Var.v());
        yrz0VarN.s(oho1Var.w());
        if (oho1Var instanceof z1z0) {
            w1z0 w1z0VarO = QuestionFeedback.o();
            w1z0VarO.q(1);
            yrz0VarN.q(w1z0VarO);
            return (RateQuestionRequest) yrz0VarN.build();
        }
        if (!(oho1Var instanceof x1z0)) {
            if (!(oho1Var instanceof y1z0)) {
                eg.o();
                return null;
            }
            yrz0VarN.n();
            h hVarBuild = yrz0VarN.build();
            hVarBuild.getClass();
            return (RateQuestionRequest) hVarBuild;
        }
        w1z0 w1z0VarO2 = QuestionFeedback.o();
        w1z0VarO2.q(oho1Var instanceof z1z0 ? 1 : -1);
        x1z0 x1z0Var = (x1z0) oho1Var;
        w1z0VarO2.n(x1z0Var.f);
        String str = x1z0Var.e;
        if (str != null) {
            w1z0VarO2.r(str);
        }
        yrz0VarN.q(w1z0VarO2);
        h hVarBuild2 = yrz0VarN.build();
        hVarBuild2.getClass();
        return (RateQuestionRequest) hVarBuild2;
    }

    public static ReportAnswer h(om21 om21Var) {
        wj21 wj21Var;
        vj21 vj21VarN = ReportAnswer.n();
        vj21VarN.r(om21Var.a);
        int iC = l1d.C(om21Var.b);
        if (iC == 0) {
            wj21Var = wj21.ANSWER_STATE_UNSPECIFIED;
        } else if (iC == 1) {
            wj21Var = wj21.CORRECT;
        } else if (iC == 2) {
            wj21Var = wj21.WRONG;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            wj21Var = wj21.TIME_RAN_OUT;
        }
        vj21VarN.n(wj21Var);
        long j = om21Var.c;
        long j2 = j / 1000;
        int nanos = (int) TimeUnit.MILLISECONDS.toNanos(j - TimeUnit.SECONDS.toMillis(j2));
        ifv ifvVarQ = Duration.q();
        ifvVarQ.q(j2);
        ifvVarQ.n(nanos);
        vj21VarN.q((Duration) ifvVarQ.build());
        return (ReportAnswer) vj21VarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ArrayList arrayList, onm onmVar) {
        e6n0 e6n0Var;
        if (onmVar instanceof e6n0) {
            e6n0Var = (e6n0) onmVar;
            int i = e6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                e6n0Var = new e6n0(this, onmVar);
            }
        } else {
            e6n0Var = new e6n0(this, onmVar);
        }
        Object objC = e6n0Var.a;
        int i2 = e6n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(h((om21) it.next()));
                }
                hyh hyhVarO = CompleteQuizRequest.o();
                hyhVarO.r(str);
                hyhVarO.n(arrayList2);
                if (str2 != null) {
                    hyhVarO.q(str2);
                }
                CompleteQuizRequest completeQuizRequest = (CompleteQuizRequest) hyhVarO.build();
                q7n0 q7n0Var = this.a;
                completeQuizRequest.getClass();
                e6n0Var.c = 1;
                objC = q7n0Var.c(completeQuizRequest, e6n0Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            sy21 sy21Var = (sy21) objC;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return new hhz0(((CompleteQuizResponse) obj).n());
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to complete quiz: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(String str, onm onmVar) {
        f6n0 f6n0Var;
        if (onmVar instanceof f6n0) {
            f6n0Var = (f6n0) onmVar;
            int i = f6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                f6n0Var = new f6n0(this, onmVar);
            }
        } else {
            f6n0Var = new f6n0(this, onmVar);
        }
        Object objA = f6n0Var.a;
        int i2 = f6n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ep40 ep40VarN = GetQuizMetadataRequest.n();
                ep40VarN.n(str);
                GetQuizMetadataRequest getQuizMetadataRequest = (GetQuizMetadataRequest) ep40VarN.build();
                q7n0 q7n0Var = this.a;
                getQuizMetadataRequest.getClass();
                f6n0Var.c = 1;
                objA = q7n0Var.a(getQuizMetadataRequest, f6n0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            sy21 sy21Var = (sy21) objA;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return e((GetQuizMetadataResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get quiz metadata: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(int i, String str, onm onmVar) {
        g6n0 g6n0Var;
        if (onmVar instanceof g6n0) {
            g6n0Var = (g6n0) onmVar;
            int i2 = g6n0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g6n0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                g6n0Var = new g6n0(this, onmVar);
            }
        } else {
            g6n0Var = new g6n0(this, onmVar);
        }
        Object objD = g6n0Var.a;
        int i3 = g6n0Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objD);
                l lVarN = GetRoundRequest.QuizRoundIdentifier.n();
                lVarN.n(str);
                lVarN.q(i);
                GetRoundRequest.QuizRoundIdentifier quizRoundIdentifier = (GetRoundRequest.QuizRoundIdentifier) lVarN.build();
                k kVarN = GetRoundRequest.n();
                kVarN.n(quizRoundIdentifier);
                GetRoundRequest getRoundRequest = (GetRoundRequest) kVarN.build();
                q7n0 q7n0Var = this.a;
                getRoundRequest.getClass();
                g6n0Var.c = 1;
                objD = q7n0Var.d(getRoundRequest, g6n0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            sy21 sy21Var = (sy21) objD;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return f(((GetRoundResponse) obj).n());
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get round: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Serializable d(oho1 oho1Var, onm onmVar) {
        h6n0 h6n0Var;
        if (onmVar instanceof h6n0) {
            h6n0Var = (h6n0) onmVar;
            int i = h6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                h6n0Var = new h6n0(this, onmVar);
            }
        } else {
            h6n0Var = new h6n0(this, onmVar);
        }
        Object objE = h6n0Var.a;
        int i2 = h6n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                RateQuestionRequest rateQuestionRequestG = g(oho1Var);
                q7n0 q7n0Var = this.a;
                h6n0Var.c = 1;
                objE = q7n0Var.e(rateQuestionRequestG, h6n0Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            sy21 sy21Var = (sy21) objE;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return ((RateQuestionResponse) obj).n();
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("failed to rate question: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }
}
