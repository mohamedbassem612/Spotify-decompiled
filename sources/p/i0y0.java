package p;

import android.util.Base64;
import com.comscore.streaming.State;
import com.spotify.promptablesection.feedback.v1.PromptedContentFeedbackEvent;
import com.spotify.songdna.feedback.v1.SubmitFeedbackRequest;
import j$.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i0y0 implements r8m {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ i0y0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static PromptedContentFeedbackEvent a(j0y0 j0y0Var, boolean z, int i, String str) {
        p1y0 p1y0VarO = PromptedContentFeedbackEvent.o();
        p1y0VarO.t(j0y0Var.a);
        p1y0VarO.w(j0y0Var.b);
        p1y0VarO.v(j0y0Var.c);
        p1y0VarO.r(j0y0Var.d);
        p1y0VarO.n(j0y0Var.e);
        p1y0VarO.s(z);
        p1y0VarO.q(i);
        p1y0VarO.u(str);
        return p1y0VarO.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(String str, String str2, String str3, String str4, onm onmVar) {
        s4y0 s4y0Var;
        t4y0 m231Var;
        if (onmVar instanceof s4y0) {
            s4y0Var = (s4y0) onmVar;
            int i = s4y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4y0Var.c = i - Integer.MIN_VALUE;
            } else {
                s4y0Var = new s4y0(this, onmVar);
            }
        } else {
            s4y0Var = new s4y0(this, onmVar);
        }
        Object objA = s4y0Var.a;
        int i2 = s4y0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            try {
                List<String> listQ0 = ihc1.Q0(new String(Base64.decode(str, 2), nne.a), new String[]{"&"}, 0, 6);
                int iS = zno1.s(q7h.U(listQ0, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (String str5 : listQ0) {
                    int iV0 = ihc1.v0(str5, '=', 0, 6);
                    if (iV0 < 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    linkedHashMap.put(str5.substring(0, iV0), URLDecoder.decode(str5.substring(iV0 + 1), "UTF-8"));
                }
                String str6 = (String) linkedHashMap.get("requestId");
                String str7 = str6 == null ? "" : str6;
                if (str7.length() <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String str8 = (String) linkedHashMap.get("itemsInResponse");
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = (String) linkedHashMap.get("messageId");
                String str10 = str9 == null ? "" : str9;
                String str11 = (String) linkedHashMap.get("userPrompt");
                String str12 = str11 == null ? "" : str11;
                String str13 = (String) linkedHashMap.get("title");
                String str14 = str13 == null ? "" : str13;
                String str15 = (String) linkedHashMap.get("contentDescription");
                m231Var = new t4y0(str7, str10, str12, str14, str15 == null ? "" : str15, str8.length() == 0 ? z6x.a : ihc1.P0(str8, new char[]{','}, 6));
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                t4y0 t4y0Var = m231Var;
                if (t4y0Var != null) {
                    String str16 = t4y0Var.a;
                    String str17 = t4y0Var.b;
                    if (!ihc1.y0(str16) && !ihc1.y0(str17)) {
                        kmc1 kmc1Var = new kmc1(str17, str2, str3, str4);
                        iyc0 iyc0Var = (iyc0) this.b;
                        ayc0 ayc0Var = new ayc0("SUBMIT_FEEDBACK", null, phc.i(nfa0.d.b(kmc1.Companion.serializer(), kmc1Var)), false, null, 18);
                        s4y0Var.c = 1;
                        objA = iyc0.a(iyc0Var, str16, ayc0Var, s4y0Var);
                        d9n d9nVar = d9n.a;
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return new o8m(new IllegalArgumentException("Invalid prompted playlist metadata"));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ly21 ly21Var = (py21) objA;
        ly21Var.getClass();
        if (ly21Var instanceof ly21) {
            return new o8m(new IllegalStateException(ly21Var.a.b()));
        }
        if (ly21Var instanceof oy21) {
            return p8m.a;
        }
        eg.o();
        return null;
    }

    public final Object f(String str, lnm lnmVar) {
        byte b = this.a;
        p8m p8mVar = p8m.a;
        switch (b) {
            case 0:
                j0y0 j0y0VarC0 = nyn1.c0(str);
                if (j0y0VarC0 == null) {
                    return new o8m(new IllegalArgumentException("Invalid metadata"));
                }
                ((t2j0) this.b).a(a(j0y0VarC0, true, 0, ""));
                return p8mVar;
            case 1:
                return b(str, "POSITIVE", "", "", (onm) lnmVar);
            default:
                return p8mVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final Object j(o5o0 o5o0Var, lnm lnmVar) {
        int i;
        String str;
        raa1 raa1Var;
        tr10 tr10Var;
        d9n d9nVar;
        sy21 sy21Var;
        byte b = this.a;
        p8m p8mVar = p8m.a;
        Object obj = this.b;
        int i2 = 1;
        switch (b) {
            case 0:
                j0y0 j0y0VarC0 = nyn1.c0(o5o0Var.a);
                if (j0y0VarC0 == null) {
                    return new o8m(new IllegalArgumentException("Invalid metadata"));
                }
                String str2 = o5o0Var.b;
                String strC1 = str2 != null ? ihc1.c1(2000, str2) : "";
                n5o0 n5o0Var = o5o0Var.c;
                i = n5o0Var != null ? h0y0.a[n5o0Var.ordinal()] : -1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        i2 = 3;
                        if (i != 3) {
                            i2 = 4;
                            if (i != 4) {
                                i2 = 5;
                                if (i != 5) {
                                    i2 = 0;
                                }
                            }
                        }
                    }
                }
                ((t2j0) obj).a(a(j0y0VarC0, false, i2, strC1));
                return p8mVar;
            case 1:
                String str3 = o5o0Var.a;
                n5o0 n5o0Var2 = o5o0Var.c;
                i = n5o0Var2 != null ? r4y0.a[n5o0Var2.ordinal()] : -1;
                String str4 = "offensive";
                switch (i) {
                    case 1:
                        str4 = "incorrect";
                        str = str4;
                        break;
                    case 2:
                    case 10:
                        str = str4;
                        break;
                    case 3:
                        str4 = "not_interesting";
                        str = str4;
                        break;
                    case 4:
                        str4 = "out_of_date";
                        str = str4;
                        break;
                    case 5:
                        str4 = "other";
                        str = str4;
                        break;
                    case 6:
                        str4 = "untrue_or_inaccurate";
                        str = str4;
                        break;
                    case 7:
                        str4 = "taste_mismatch";
                        str = str4;
                        break;
                    case 8:
                        str4 = "repetitive_or_boring";
                        str = str4;
                        break;
                    case 9:
                        str4 = "inaccurate_text";
                        str = str4;
                        break;
                    default:
                        str = "";
                        break;
                }
                String str5 = o5o0Var.b;
                return b(str3, "NEGATIVE", str, str5 == null ? "" : str5, (onm) lnmVar);
            default:
                if (lnmVar instanceof raa1) {
                    raa1Var = (raa1) lnmVar;
                    int i3 = raa1Var.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        raa1Var.d = i3 - Integer.MIN_VALUE;
                    } else {
                        raa1Var = new raa1(this, (onm) lnmVar);
                    }
                } else {
                    raa1Var = new raa1(this, (onm) lnmVar);
                }
                Object objA = raa1Var.b;
                int i4 = raa1Var.d;
                if (i4 != 0) {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = raa1Var.a;
                    hm5.M(objA);
                    sy21Var = (sy21) objA;
                    this.getClass();
                    if (sy21Var.a.Q0) {
                        return p8mVar;
                    }
                    return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                }
                hm5.M(objA);
                taa1 taa1Var = (taa1) obj;
                String str6 = o5o0Var.b;
                lmc1 lmc1VarN = SubmitFeedbackRequest.n();
                lmc1VarN.r(o5o0Var.a);
                n5o0 n5o0Var3 = o5o0Var.c;
                switch (n5o0Var3 == null ? -1 : saa1.a[n5o0Var3.ordinal()]) {
                    case State.UNDEFINED /* -1 */:
                        tr10Var = tr10.CATEGORY_SOMETHING_ELSE;
                        lmc1VarN.q(tr10Var);
                        switch (n5o0Var3 != null ? saa1.a[n5o0Var3.ordinal()] : -1) {
                            case State.UNDEFINED /* -1 */:
                                if (str6 != null && str6.length() != 0) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 0:
                            default:
                                hhg1.g(n5o0Var3, "Unexpected FeedbackOption for SongDNA: ");
                                return null;
                            case 1:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_MISSING_CREDIT);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest2 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest2, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 2:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_EXTRA_OR_DUPLICATE);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest3 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest3, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 3:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_INCORRECT_ROLE);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest4 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest4, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 4:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_MISSPELT);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest5 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest5, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 5:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_OTHER);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest6 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest6, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 6:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_MISSING_SAMPLE_OR_INTERPOLATION);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest7 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest7, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 7:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_INCORRECT_SAMPLE_OR_INTERPOLATION);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest8 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest8, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 8:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_MISSING_ORIGINAL_SONG);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest9 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest9, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 9:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_INCORRECT_ORIGINAL_SONG);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest10 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest10, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 10:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_OTHER);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest11 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest11, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                        }
                    case 0:
                    default:
                        hhg1.g(n5o0Var3, "Unexpected FeedbackOption for SongDNA: ");
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        tr10Var = tr10.CATEGORY_SONG_CREDITS;
                        lmc1VarN.q(tr10Var);
                        switch (n5o0Var3 != null ? saa1.a[n5o0Var3.ordinal()] : -1) {
                            case State.UNDEFINED /* -1 */:
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest12 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest12, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 0:
                            default:
                                hhg1.g(n5o0Var3, "Unexpected FeedbackOption for SongDNA: ");
                                return null;
                            case 1:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_MISSING_CREDIT);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest13 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest13, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 2:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_EXTRA_OR_DUPLICATE);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest14 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest14, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 3:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_INCORRECT_ROLE);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest15 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest15, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 4:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_MISSPELT);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest16 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest16, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 5:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_OTHER);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest17 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest17, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 6:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_MISSING_SAMPLE_OR_INTERPOLATION);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest18 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest18, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 7:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_INCORRECT_SAMPLE_OR_INTERPOLATION);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest19 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest19, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 8:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_MISSING_ORIGINAL_SONG);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest110 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest110, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 9:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_INCORRECT_ORIGINAL_SONG);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest111 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest111, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 10:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_OTHER);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest112 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest112, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                        }
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        tr10Var = tr10.CATEGORY_SAMPLES_OR_COVERS;
                        lmc1VarN.q(tr10Var);
                        switch (n5o0Var3 != null ? saa1.a[n5o0Var3.ordinal()] : -1) {
                            case State.UNDEFINED /* -1 */:
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest113 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest113, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 0:
                            default:
                                hhg1.g(n5o0Var3, "Unexpected FeedbackOption for SongDNA: ");
                                return null;
                            case 1:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_MISSING_CREDIT);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest114 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest114, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 2:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_EXTRA_OR_DUPLICATE);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest115 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest115, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 3:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_INCORRECT_ROLE);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest116 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest116, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 4:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_MISSPELT);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest117 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest117, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 5:
                                lmc1VarN.t(y6a1.SONG_CREDITS_ISSUE_OTHER);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest118 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest118, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 6:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_MISSING_SAMPLE_OR_INTERPOLATION);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest119 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest119, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 7:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_INCORRECT_SAMPLE_OR_INTERPOLATION);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest1110 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest1110, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 8:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_MISSING_ORIGINAL_SONG);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest1111 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest1111, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 9:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_INCORRECT_ORIGINAL_SONG);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest1112 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest1112, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                            case 10:
                                lmc1VarN.s(r641.SAMPLES_OR_COVERS_ISSUE_OTHER);
                                if (str6 != null) {
                                    lmc1VarN.n(str6);
                                }
                                SubmitFeedbackRequest submitFeedbackRequest1113 = (SubmitFeedbackRequest) lmc1VarN.build();
                                raa1Var.a = this;
                                raa1Var.d = 1;
                                objA = taa1Var.a(submitFeedbackRequest1113, raa1Var);
                                d9nVar = d9n.a;
                                if (objA == d9nVar) {
                                    return d9nVar;
                                }
                                sy21Var = (sy21) objA;
                                this.getClass();
                                if (sy21Var.a.Q0) {
                                    return p8mVar;
                                }
                                return new o8m(new Exception(f4i1.c(sy21Var.a.d, "Failed to submit feedback, status: ")));
                        }
                }
        }
    }
}
