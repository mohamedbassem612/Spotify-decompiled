package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.Context$Metadata;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gcb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ scb a;

    public gcb(scb scbVar) {
        this.a = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w7h1 w7h1Var;
        String str;
        d520 d520Var = this.a.a;
        og80 og80Var = ((qbb) obj).a;
        teb tebVar = (teb) d520Var.b;
        i8h1 i8h1Var = (i8h1) tebVar.f;
        ew80 ew80Var = ew80.c;
        String str2 = ((gp41) tebVar.d).a;
        ohv0 ohv0Var = (ohv0) tebVar.e;
        if (og80Var instanceof kg80) {
            kg80 kg80Var = (kg80) og80Var;
            md80 md80Var = kg80Var.b;
            dg80 dg80Var = kg80Var.c;
            mmr0 mmr0Var = new mmr0(md80Var, dg80Var);
            if (!u890.j(tebVar.g, mmr0Var)) {
                tebVar.g = mmr0Var;
                ohv0Var.a(new khv0(str2, "signup_intent_inline_form_rendered", sqg0.J(new mmr0[]{new mmr0("assigned_variant", sqe.s(kg80Var.a)), new mmr0("rendered_form", sqe.r(md80Var)), new mmr0("render_reason", dg80Var.a)})));
            }
        } else if (og80Var instanceof hg80) {
            hg80 hg80Var = (hg80) og80Var;
            int i = hg80Var.b;
            if (tebVar.c != i) {
                tebVar.c = i;
                mmr0 mmr0Var2 = new mmr0("assigned_variant", sqe.s(hg80Var.a));
                if (i == 1) {
                    str = "loading";
                } else if (i == 2) {
                    str = "success";
                } else {
                    if (i != 3) {
                        throw null;
                    }
                    str = "failure";
                }
                mmr0 mmr0Var3 = new mmr0("state", str);
                md80 md80Var2 = hg80Var.c;
                ohv0Var.a(new khv0(str2, "signup_intent_inline_form_market_configuration", sqg0.J(new mmr0[]{mmr0Var2, mmr0Var3, new mmr0("fallback_form", md80Var2 != null ? sqe.r(md80Var2) : Context$Metadata.SHUFFLE_ALGORITHM_NONE)})));
            }
        } else if (og80Var instanceof mg80) {
            mg80 mg80Var = (mg80) og80Var;
            mmr0 mmr0Var4 = new mmr0("assigned_variant", sqe.s(mg80Var.a));
            mmr0 mmr0Var5 = new mmr0("from_form", sqe.r(mg80Var.b));
            md80 md80Var3 = mg80Var.c;
            ohv0Var.a(new khv0(str2, "signup_intent_inline_form_switch", sqg0.J(new mmr0[]{mmr0Var4, mmr0Var5, new mmr0("to_form", sqe.r(md80Var3)), new mmr0("trigger", md80Var3 == md80.c ? "phone_number_button" : "email_button")})));
        } else if (og80Var instanceof lg80) {
            lg80 lg80Var = (lg80) og80Var;
            int i2 = lg80Var.c;
            if (i2 == 2) {
                tebVar.j("continue", ew80Var);
            }
            ohv0Var.a(new khv0(str2, "signup_intent_inline_form_submit", sqg0.J(new mmr0[]{new mmr0("assigned_variant", sqe.s(lg80Var.a)), new mmr0("rendered_form", sqe.r(lg80Var.b)), new mmr0("resolved_input_type", ab80.d(i2)), new mmr0("submit_source", lg80Var.d.a)})));
        } else {
            boolean z = og80Var instanceof gg80;
            b7x b7xVar = b7x.a;
            if (z) {
                gg80 gg80Var = (gg80) og80Var;
                LinkedHashSet linkedHashSet = (LinkedHashSet) tebVar.h;
                md80 md80Var4 = gg80Var.b;
                cg80 cg80Var = gg80Var.c;
                if (linkedHashSet.add(new mmr0(md80Var4, cg80Var))) {
                    ohv0Var.a(new khv0(str2, "signup_intent_inline_form_field_interaction", sqg0.J(new mmr0[]{new mmr0("assigned_variant", sqe.s(gg80Var.a)), new mmr0("rendered_form", sqe.r(md80Var4)), new mmr0("action", cg80Var.a)})));
                    if (md80Var4 == md80.c) {
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-login-and-sign-up-screen";
                        x6h1VarI.f = "1.0.0";
                        x6h1VarI.g = "22.0.0";
                        y6h1 y6h1VarA = x6h1VarI.a();
                        p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                        x6h1 x6h1VarC = y6h1VarA.c();
                        x6h1VarC.i.add(new a7h1("phone_number_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC.a();
                        int iOrdinal = cg80Var.ordinal();
                        if (iOrdinal == 0) {
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                        }
                        i8h1Var.j(w7h1Var);
                    }
                }
            } else if (og80Var instanceof ig80) {
                tebVar.j("choose_calling_code", ew80Var);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-login-and-sign-up-screen";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA3 = x6h1VarI2.a();
                p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                x6h1 x6h1VarC2 = y6h1VarA3.c();
                x6h1VarC2.i.add(new a7h1("country_code_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA4 = x6h1VarC2.a();
                w6b1 w6b1VarA = f7b1.a(blc0.sa);
                String str3 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 == null ? "" : str3)), y6h1VarA4, r6h1.c, System.currentTimeMillis()));
                tebVar.k(((ig80) og80Var).a, "opened");
            } else if (og80Var instanceof jg80) {
                tebVar.j("calling_code", ew80.b);
                tebVar.k(((jg80) og80Var).a, "selection");
            } else {
                String str4 = "email";
                if (og80Var instanceof ng80) {
                    ng80 ng80Var = (ng80) og80Var;
                    int iOrdinal2 = ng80Var.b.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        str4 = "phone_number";
                    }
                    ohv0Var.a(new jhv0(str2, "inline_form_local_validation", str4, gvg.h("assigned_variant=", sqe.s(ng80Var.a), ";error=", ab80.d(ng80Var.c))));
                } else {
                    if (!(og80Var instanceof fg80)) {
                        eg.o();
                        return null;
                    }
                    fg80 fg80Var = (fg80) og80Var;
                    int iOrdinal3 = fg80Var.b.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return null;
                        }
                        str4 = "phone_number";
                    }
                    ohv0Var.a(new jhv0(str2, "inline_form_backend_validation", str4, f4i1.f("assigned_variant=", sqe.s(fg80Var.a), ";error=invalid_phone_number")));
                }
            }
        }
        return rih1.a;
    }
}
