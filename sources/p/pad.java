package p;

import com.spotify.campfire.datasource.impl.proto.AddMembersRequest;
import com.spotify.campfire.datasource.impl.proto.AddMembersResponse;
import com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequest;
import com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponse;
import com.spotify.campfire.datasource.impl.proto.ClaimInviteRequest;
import com.spotify.campfire.datasource.impl.proto.ClaimInviteResponse;
import com.spotify.campfire.datasource.impl.proto.ClientNodeRequest;
import com.spotify.campfire.datasource.impl.proto.ClientNodeResponse;
import com.spotify.campfire.datasource.impl.proto.CreateGroupRequest;
import com.spotify.campfire.datasource.impl.proto.CreateGroupResponse;
import com.spotify.campfire.datasource.impl.proto.CreateInviteRequest;
import com.spotify.campfire.datasource.impl.proto.CreateInviteResponse;
import com.spotify.campfire.datasource.impl.proto.DeleteChatForMeRequest;
import com.spotify.campfire.datasource.impl.proto.DeleteChatForMeResponse;
import com.spotify.campfire.datasource.impl.proto.DeleteInviteRequest;
import com.spotify.campfire.datasource.impl.proto.DeleteInviteResponse;
import com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsRequest;
import com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse;
import com.spotify.campfire.datasource.impl.proto.InviteLinkOpenRequest;
import com.spotify.campfire.datasource.impl.proto.InviteLinkOpenResponse;
import com.spotify.campfire.datasource.impl.proto.LeaveGroupRequest;
import com.spotify.campfire.datasource.impl.proto.LeaveGroupResponse;
import com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequest;
import com.spotify.campfire.datasource.impl.proto.OffplatformOpenRequest;
import com.spotify.campfire.datasource.impl.proto.OffplatformOpenResponse;
import com.spotify.campfire.datasource.impl.proto.RemoveMemberRequest;
import com.spotify.campfire.datasource.impl.proto.RemoveMemberResponse;
import com.spotify.campfire.datasource.impl.proto.RenameGroupRequest;
import com.spotify.campfire.datasource.impl.proto.RenameGroupResponse;
import com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponse;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeResponse;
import com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequest;
import com.spotify.campfire.datasource.impl.proto.UnmuteHierarchyRequest;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0003\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\b\u0001\u0010\u0003\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020+2\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b.\u0010-J\u001a\u00101\u001a\u0002002\b\b\u0001\u0010\u0003\u001a\u00020/H§@¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\b\u0001\u0010\u0003\u001a\u000203H§@¢\u0006\u0004\b5\u00106J \u00109\u001a\b\u0012\u0004\u0012\u0002080\t2\b\b\u0001\u0010\u0003\u001a\u000207H§@¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020;H§@¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020>H§@¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020B2\b\b\u0001\u0010\u0003\u001a\u00020AH§@¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020EH§@¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020I2\b\b\u0001\u0010\u0003\u001a\u00020HH§@¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u00020M2\b\b\u0001\u0010\u0003\u001a\u00020LH§@¢\u0006\u0004\bN\u0010OJ\u001a\u0010R\u001a\u00020Q2\b\b\u0001\u0010\u0003\u001a\u00020PH§@¢\u0006\u0004\bR\u0010Sø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006TÀ\u0006\u0001"}, d2 = {"Lp/pad;", "", "Lcom/spotify/campfire/datasource/impl/proto/RetrieveNodeRequest;", "request", "Lcom/spotify/campfire/datasource/impl/proto/RetrieveNodeResponse;", "o", "(Lcom/spotify/campfire/datasource/impl/proto/RetrieveNodeRequest;Lp/lnm;)Ljava/lang/Object;", "s", "Lcom/spotify/campfire/datasource/impl/proto/RetrieveLatestNodeRequest;", "Lp/sy21;", "Lcom/spotify/campfire/datasource/impl/proto/RetrieveLatestNodeResponse;", "v", "(Lcom/spotify/campfire/datasource/impl/proto/RetrieveLatestNodeRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/ClientNodeRequest;", "Lcom/spotify/campfire/datasource/impl/proto/ClientNodeResponse;", "r", "(Lcom/spotify/campfire/datasource/impl/proto/ClientNodeRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/OffplatformOpenRequest;", "Lcom/spotify/campfire/datasource/impl/proto/OffplatformOpenResponse;", "n", "(Lcom/spotify/campfire/datasource/impl/proto/OffplatformOpenRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/InviteLinkOpenRequest;", "Lcom/spotify/campfire/datasource/impl/proto/InviteLinkOpenResponse;", "q", "(Lcom/spotify/campfire/datasource/impl/proto/InviteLinkOpenRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/AddMembersRequest;", "Lcom/spotify/campfire/datasource/impl/proto/AddMembersResponse;", "d", "(Lcom/spotify/campfire/datasource/impl/proto/AddMembersRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/RenameGroupRequest;", "Lcom/spotify/campfire/datasource/impl/proto/RenameGroupResponse;", "i", "(Lcom/spotify/campfire/datasource/impl/proto/RenameGroupRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/RemoveMemberRequest;", "Lcom/spotify/campfire/datasource/impl/proto/RemoveMemberResponse;", "c", "(Lcom/spotify/campfire/datasource/impl/proto/RemoveMemberRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/CreateGroupRequest;", "Lcom/spotify/campfire/datasource/impl/proto/CreateGroupResponse;", "a", "(Lcom/spotify/campfire/datasource/impl/proto/CreateGroupRequest;Lp/lnm;)Ljava/lang/Object;", "", "username", "Lp/rih1;", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "e", "Lcom/spotify/campfire/datasource/impl/proto/CreateInviteRequest;", "Lcom/spotify/campfire/datasource/impl/proto/CreateInviteResponse;", "m", "(Lcom/spotify/campfire/datasource/impl/proto/CreateInviteRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/DeleteInviteRequest;", "Lcom/spotify/campfire/datasource/impl/proto/DeleteInviteResponse;", "t", "(Lcom/spotify/campfire/datasource/impl/proto/DeleteInviteRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/ClaimInviteRequest;", "Lcom/spotify/campfire/datasource/impl/proto/ClaimInviteResponse;", "g", "(Lcom/spotify/campfire/datasource/impl/proto/ClaimInviteRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/MuteHierarchyRequest;", "l", "(Lcom/spotify/campfire/datasource/impl/proto/MuteHierarchyRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/UnmuteHierarchyRequest;", "h", "(Lcom/spotify/campfire/datasource/impl/proto/UnmuteHierarchyRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/GetHierarchySettingsRequest;", "Lcom/spotify/campfire/datasource/impl/proto/GetHierarchySettingsResponse;", "p", "(Lcom/spotify/campfire/datasource/impl/proto/GetHierarchySettingsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/SetReceiptPreferenceRequest;", "f", "(Lcom/spotify/campfire/datasource/impl/proto/SetReceiptPreferenceRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/DeleteChatForMeRequest;", "Lcom/spotify/campfire/datasource/impl/proto/DeleteChatForMeResponse;", "u", "(Lcom/spotify/campfire/datasource/impl/proto/DeleteChatForMeRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/LeaveGroupRequest;", "Lcom/spotify/campfire/datasource/impl/proto/LeaveGroupResponse;", "j", "(Lcom/spotify/campfire/datasource/impl/proto/LeaveGroupRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/datasource/impl/proto/CanMessageUsersRequest;", "Lcom/spotify/campfire/datasource/impl/proto/CanMessageUsersResponse;", "k", "(Lcom/spotify/campfire/datasource/impl/proto/CanMessageUsersRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_campfire_datasource_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface pad {
    @wyq0("speechless/v1/group/create")
    Object a(@elb CreateGroupRequest createGroupRequest, lnm<? super CreateGroupResponse> lnmVar);

    @wyq0("trusted-circles/v1/hide/{username}")
    Object b(@t8s0("username") String str, lnm<? super rih1> lnmVar);

    @wyq0("speechless/v1/group/remove-member")
    Object c(@elb RemoveMemberRequest removeMemberRequest, lnm<? super RemoveMemberResponse> lnmVar);

    @wyq0("speechless/v1/group/add-members")
    Object d(@elb AddMembersRequest addMembersRequest, lnm<? super sy21<AddMembersResponse>> lnmVar);

    @wyq0("trusted-circles/v1/restore/{username}")
    Object e(@t8s0("username") String str, lnm<? super rih1> lnmVar);

    @wyq0("speechless/v1/hierarchy/settings/receipts")
    Object f(@elb SetReceiptPreferenceRequest setReceiptPreferenceRequest, lnm<? super rih1> lnmVar);

    @wyq0("speechless/v1/invite/claim")
    Object g(@elb ClaimInviteRequest claimInviteRequest, lnm<? super sy21<ClaimInviteResponse>> lnmVar);

    @wyq0("speechless/v1/hierarchy/settings/unmute")
    Object h(@elb UnmuteHierarchyRequest unmuteHierarchyRequest, lnm<? super rih1> lnmVar);

    @wyq0("speechless/v1/group/rename")
    Object i(@elb RenameGroupRequest renameGroupRequest, lnm<? super RenameGroupResponse> lnmVar);

    @wyq0("speechless/v1/group/leave")
    Object j(@elb LeaveGroupRequest leaveGroupRequest, lnm<? super LeaveGroupResponse> lnmVar);

    @wyq0("speechless/v1/can-message-users")
    Object k(@elb CanMessageUsersRequest canMessageUsersRequest, lnm<? super CanMessageUsersResponse> lnmVar);

    @wyq0("speechless/v1/hierarchy/settings/mute")
    Object l(@elb MuteHierarchyRequest muteHierarchyRequest, lnm<? super rih1> lnmVar);

    @wyq0("speechless/v1/invite/create")
    Object m(@elb CreateInviteRequest createInviteRequest, lnm<? super CreateInviteResponse> lnmVar);

    @wyq0("speechless-sharing/v1/opshare-open")
    Object n(@elb OffplatformOpenRequest offplatformOpenRequest, lnm<? super sy21<OffplatformOpenResponse>> lnmVar);

    @wyq0("speechless/v1/retrieve/hierarchy")
    Object o(@elb RetrieveNodeRequest retrieveNodeRequest, lnm<? super RetrieveNodeResponse> lnmVar);

    @wyq0("speechless/v1/hierarchy/settings")
    Object p(@elb GetHierarchySettingsRequest getHierarchySettingsRequest, lnm<? super GetHierarchySettingsResponse> lnmVar);

    @wyq0("speechless-sharing/v1/invite-link")
    Object q(@elb InviteLinkOpenRequest inviteLinkOpenRequest, lnm<? super sy21<InviteLinkOpenResponse>> lnmVar);

    @wyq0("speechless/v1/submit/request")
    Object r(@elb ClientNodeRequest clientNodeRequest, lnm<? super ClientNodeResponse> lnmVar);

    @wyq0("speechless/v1/retrieve/hierarchy/shares")
    Object s(@elb RetrieveNodeRequest retrieveNodeRequest, lnm<? super RetrieveNodeResponse> lnmVar);

    @wyq0("speechless/v1/invite/delete")
    Object t(@elb DeleteInviteRequest deleteInviteRequest, lnm<? super DeleteInviteResponse> lnmVar);

    @wyq0("speechless/v1/hierarchy/delete")
    Object u(@elb DeleteChatForMeRequest deleteChatForMeRequest, lnm<? super DeleteChatForMeResponse> lnmVar);

    @wyq0("speechless/v1/retrieve/chats-share-set/latest")
    Object v(@elb RetrieveLatestNodeRequest retrieveLatestNodeRequest, lnm<? super sy21<RetrieveLatestNodeResponse>> lnmVar);
}
