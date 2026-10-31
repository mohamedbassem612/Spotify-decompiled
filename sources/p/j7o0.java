package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.spotifyuserprofile.v0.CreateNoteResponse;
import com.spotify.spotifyuserprofile.v0.DeleteNoteResponse;
import com.spotify.spotifyuserprofile.v0.EditNoteResponse;
import com.spotify.spotifyuserprofile.v0.ErrorResponse;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j7o0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m7o0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7o0(m7o0 m7o0Var, byte b) {
        super(1);
        this.a = b;
        this.b = m7o0Var;
    }

    public final Object invoke(Object obj) {
        uz21 uz21Var;
        uz21 uz21Var2;
        uz21 uz21Var3;
        byte b = this.a;
        lgz lgzVar = lgz.POLICY_VIOLATION;
        m7o0 m7o0Var = this.b;
        switch (b) {
            case 0:
                HttpException httpException = (HttpException) obj;
                m7o0Var.getClass();
                try {
                    sy21 sy21Var = httpException.c;
                    if (sy21Var == null || (uz21Var = sy21Var.c) == null) {
                        return null;
                    }
                    CreateNoteResponse createNoteResponseS = CreateNoteResponse.s(uz21Var.a());
                    if (!createNoteResponseS.r()) {
                        return null;
                    }
                    ErrorResponse errorResponseN = createNoteResponseS.n();
                    if (errorResponseN.o() != lgzVar && errorResponseN.o() != lgz.MAX_NOTES_REACHED) {
                        return null;
                    }
                    String strP = errorResponseN.p();
                    strP.getClass();
                    if (strP.length() > 0) {
                        return strP;
                    }
                    return null;
                } catch (Exception e) {
                    Logger.l(e, "Failed to parse create note error body", new Object[0]);
                    return null;
                }
            case 1:
                HttpException httpException2 = (HttpException) obj;
                m7o0Var.getClass();
                try {
                    sy21 sy21Var2 = httpException2.c;
                    if (sy21Var2 == null || (uz21Var2 = sy21Var2.c) == null) {
                        return null;
                    }
                    DeleteNoteResponse deleteNoteResponseQ = DeleteNoteResponse.q(uz21Var2.a());
                    if (!deleteNoteResponseQ.p()) {
                        return null;
                    }
                    ErrorResponse errorResponseN2 = deleteNoteResponseQ.n();
                    if (errorResponseN2.o() != lgzVar) {
                        return null;
                    }
                    String strP2 = errorResponseN2.p();
                    strP2.getClass();
                    if (strP2.length() > 0) {
                        return strP2;
                    }
                    return null;
                } catch (Exception e2) {
                    Logger.l(e2, "Failed to parse delete note error body", new Object[0]);
                    return null;
                }
            default:
                HttpException httpException3 = (HttpException) obj;
                m7o0Var.getClass();
                try {
                    sy21 sy21Var3 = httpException3.c;
                    if (sy21Var3 == null || (uz21Var3 = sy21Var3.c) == null) {
                        return null;
                    }
                    EditNoteResponse editNoteResponseR = EditNoteResponse.r(uz21Var3.a());
                    if (!editNoteResponseR.q()) {
                        return null;
                    }
                    ErrorResponse errorResponseN3 = editNoteResponseR.n();
                    if (errorResponseN3.o() != lgzVar) {
                        return null;
                    }
                    String strP3 = errorResponseN3.p();
                    strP3.getClass();
                    if (strP3.length() > 0) {
                        return strP3;
                    }
                    return null;
                } catch (Exception e3) {
                    Logger.l(e3, "Failed to parse update note error body", new Object[0]);
                    return null;
                }
        }
    }
}
