package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class v11 {
    public static final String a(l3f0 l3f0Var) {
        if (l3f0Var instanceof f3f0) {
            return "OneTimeToken";
        }
        if (l3f0Var instanceof h3f0) {
            return "Passkey";
        }
        if (l3f0Var instanceof k3f0) {
            return "UsernamePassword";
        }
        if (l3f0Var instanceof a3f0) {
            return "Facebook";
        }
        if (l3f0Var instanceof b3f0) {
            return "Google";
        }
        if (l3f0Var instanceof y2f0) {
            return "EmailSignup";
        }
        if (l3f0Var instanceof z2f0) {
            return "EmailSignupWithCredentials";
        }
        if (l3f0Var instanceof c3f0) {
            return "GraduationEmailSignup";
        }
        if (l3f0Var instanceof j3f0) {
            return "Samsung";
        }
        if (l3f0Var instanceof e3f0) {
            return "Naver";
        }
        if (l3f0Var instanceof i3f0) {
            return "PhoneNumber";
        }
        if (l3f0Var instanceof d3f0) {
            return "Identityless";
        }
        if (l3f0Var instanceof g3f0) {
            return "ParentChild";
        }
        if (l3f0Var instanceof x2f0) {
            return "EmailPassword";
        }
        if (l3f0Var instanceof v2f0) {
            return "EmailOtp";
        }
        if (l3f0Var instanceof w2f0) {
            return "EmailOtpSignup";
        }
        eg.o();
        return null;
    }
}
